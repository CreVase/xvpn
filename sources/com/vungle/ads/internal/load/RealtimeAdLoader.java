package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.util.PathProvider;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class RealtimeAdLoader extends BaseAdLoader {
    public RealtimeAdLoader(Context context, VungleApiClient vungleApiClient, Executors executors, OMInjector oMInjector, Downloader downloader, PathProvider pathProvider) {
        super(context, vungleApiClient, executors, oMInjector, downloader, pathProvider);
    }

    private final void sendWinNotification(List<String> list) {
        String str;
        boolean z = false;
        if (list != null && list.isEmpty()) {
            z = true;
        }
        if (z) {
            return;
        }
        VungleApiClient vungleApiClient = getVungleApiClient();
        String referenceId = getAdRequest().getPlacement().getReferenceId();
        AdPayload advertisement = getAdvertisement();
        String str2 = null;
        if (advertisement != null) {
            str = advertisement.getCreativeId();
        } else {
            str = null;
        }
        AdPayload advertisement2 = getAdvertisement();
        if (advertisement2 != null) {
            str2 = advertisement2.eventId();
        }
        TpatSender tpatSender = new TpatSender(vungleApiClient, referenceId, str, str2);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                tpatSender.sendWinNotification((String) it.next(), getSdkExecutors().getJobExecutor());
            }
        }
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
        List<String> list;
        AdPayload advertisement = getAdvertisement();
        if (advertisement != null) {
            list = advertisement.getWinNotifications();
        } else {
            list = null;
        }
        sendWinNotification(list);
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() {
        BidPayload adMarkup = getAdRequest().getAdMarkup();
        int i = VungleError.AD_MARKUP_INVALID;
        int i2 = 2;
        String str = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (adMarkup == null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(208, "Unable to create data object from payload string.", (r13 & 4) != 0 ? null : getAdRequest().getPlacement().getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            onAdLoadFailed(new InternalError(i, str, i2, b4 == true ? 1 : 0));
            return;
        }
        AdPayload adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || adPayload == null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(213, "The ad response did not contain valid ad markup.", (r13 & 4) != 0 ? null : getAdRequest().getPlacement().getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : adMarkup.getEventId());
            onAdLoadFailed(new InternalError(i, b3 == true ? 1 : 0, i2, b2 == true ? 1 : 0));
        } else {
            handleAdMetaData(adPayload);
        }
    }
}
