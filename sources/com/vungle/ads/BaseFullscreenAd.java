package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public abstract class BaseFullscreenAd extends BaseAd implements FullscreenAd {
    public BaseFullscreenAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
    }

    @Override // com.vungle.ads.FullscreenAd
    public void play() {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        disableExpirationTimer$vungle_ads_release();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric$vungle_ads_release().markStart();
        getAdInternal().play(new BaseFullscreenAd$play$1(this));
    }
}
