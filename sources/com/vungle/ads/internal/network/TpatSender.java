package com.vungle.ads.internal.network;

import android.util.Log;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ng0;
import defpackage.oa3;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class TpatSender {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "TpatSender";
    private final String creativeId;
    private final String eventId;
    private final String placementId;
    private final VungleApiClient vungleApiClient;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public TpatSender(VungleApiClient vungleApiClient, String str, String str2, String str3) {
        this.vungleApiClient = vungleApiClient;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
    }

    /* renamed from: sendTpat$lambda-1 */
    public static final void m74sendTpat$lambda1(TpatSender tpatSender, String str) {
        BaseAdLoader.ErrorInfo pingTPAT = tpatSender.vungleApiClient.pingTPAT(str);
        if (pingTPAT != null) {
            Log.e(TAG, "TPAT failed with " + pingTPAT.getDescription() + ", url:" + str);
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.TPAT_ERROR, "Fail to send " + str + ", error: " + pingTPAT.getDescription(), tpatSender.placementId, tpatSender.creativeId, tpatSender.eventId);
        }
    }

    /* renamed from: sendWinNotification$lambda-0 */
    public static final void m75sendWinNotification$lambda0(TpatSender tpatSender, String str) {
        BaseAdLoader.ErrorInfo pingTPAT = tpatSender.vungleApiClient.pingTPAT(str);
        if (pingTPAT != null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR, "Fail to send " + str + ", error: " + pingTPAT.getDescription(), tpatSender.placementId, tpatSender.creativeId, tpatSender.eventId);
        }
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void sendTpat(String str, Executor executor) {
        executor.execute(new oa3(this, str, 1));
    }

    public final void sendWinNotification(String str, VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        vungleThreadPoolExecutor.execute(new oa3(this, str, 0));
    }
}
