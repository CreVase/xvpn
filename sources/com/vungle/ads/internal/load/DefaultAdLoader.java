package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.InternalError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.util.PathProvider;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public final class DefaultAdLoader extends BaseAdLoader {
    public DefaultAdLoader(Context context, VungleApiClient vungleApiClient, Executors executors, OMInjector oMInjector, Downloader downloader, PathProvider pathProvider) {
        super(context, vungleApiClient, executors, oMInjector, downloader, pathProvider);
    }

    private final void fetchAdMetadata(String str, Placement placement) {
        int i = 2;
        String str2 = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (getVungleApiClient().checkIsRetryAfterActive()) {
            getAdLoaderCallback().onFailure(new InternalError(VungleError.SERVER_RETRY_ERROR, str2, i, b4 == true ? 1 : 0));
            return;
        }
        Call<AdPayload> requestAd = getVungleApiClient().requestAd(placement.getReferenceId(), str, placement.getHeaderBidding());
        if (requestAd == null) {
            onAdLoadFailed(new InternalError(VungleError.AD_FAILED_TO_DOWNLOAD, b3 == true ? 1 : 0, i, b2 == true ? 1 : 0));
        } else {
            requestAd.enqueue(new DefaultAdLoader$fetchAdMetadata$1(this, placement));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VungleError retrofitToVungleError(Throwable th) {
        boolean z = th instanceof UnknownHostException;
        int i = VungleError.AD_FAILED_TO_DOWNLOAD;
        int i2 = 2;
        String str = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        if (z) {
            return new InternalError(i, str, i2, b8 == true ? 1 : 0);
        }
        if (th instanceof SocketTimeoutException) {
            return new InternalError(VungleError.NETWORK_TIMEOUT, b7 == true ? 1 : 0, i2, b6 == true ? 1 : 0);
        }
        if (th instanceof IOException) {
            return new InternalError(VungleError.NETWORK_ERROR, b5 == true ? 1 : 0, i2, b4 == true ? 1 : 0);
        }
        return new InternalError(i, b3 == true ? 1 : 0, i2, b2 == true ? 1 : 0);
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() {
        fetchAdMetadata(getAdSize(), getAdRequest().getPlacement());
    }
}
