package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.SuspendableTimer;
import com.vungle.ads.internal.util.ThreadUtil;
import defpackage.en;
import defpackage.k43;
import defpackage.ui1;

/* loaded from: classes2.dex */
public abstract class BaseAd implements Ad {
    private final AdConfig adConfig;
    private BaseAdListener adListener;
    private final Context context;
    private String creativeId;
    private String eventId;
    private SuspendableTimer expirationMetricTimer;
    private final String placementId;
    private final ui1 adInternal$delegate = new k43(new BaseAd$adInternal$2(this));
    private final TimeIntervalMetric requestToResponseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
    private final TimeIntervalMetric responseToShowMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
    private final TimeIntervalMetric showToDisplayMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_DISPLAY_DURATION_MS);
    private final OneShotTimeIntervalMetric displayToClickMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);

    public BaseAd(Context context, String str, AdConfig adConfig) {
        this.context = context;
        this.placementId = str;
        this.adConfig = adConfig;
    }

    public static /* synthetic */ void getExpirationMetricTimer$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }

    /* renamed from: onAdLoaded$lambda-0 */
    public static final void m22onAdLoaded$lambda0(BaseAd baseAd) {
        SuspendableTimer suspendableTimer = baseAd.expirationMetricTimer;
        if (suspendableTimer != null) {
            suspendableTimer.start();
        }
    }

    private final void onLoadEnd() {
        this.requestToResponseMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.placementId, this.creativeId, this.eventId, (String) null, 16, (Object) null);
        this.responseToShowMetric.markStart();
    }

    /* renamed from: onLoadFailure$lambda-2 */
    public static final void m23onLoadFailure$lambda2(BaseAd baseAd, VungleError vungleError) {
        BaseAdListener baseAdListener = baseAd.adListener;
        if (baseAdListener != null) {
            baseAdListener.onAdFailedToLoad(baseAd, vungleError);
        }
    }

    /* renamed from: onLoadSuccess$lambda-1 */
    public static final void m24onLoadSuccess$lambda1(BaseAd baseAd) {
        BaseAdListener baseAdListener = baseAd.adListener;
        if (baseAdListener != null) {
            baseAdListener.onAdLoaded(baseAd);
        }
    }

    @Override // com.vungle.ads.Ad
    public Boolean canPlayAd() {
        boolean z = false;
        if (AdInternal.canPlayAd$default(getAdInternal(), false, 1, null) == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public abstract AdInternal constructAdInternal$vungle_ads_release(Context context);

    public final void disableExpirationTimer$vungle_ads_release() {
        SuspendableTimer suspendableTimer = this.expirationMetricTimer;
        if (suspendableTimer != null) {
            suspendableTimer.cancel();
        }
        this.expirationMetricTimer = null;
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final AdInternal getAdInternal() {
        return (AdInternal) this.adInternal$delegate.getValue();
    }

    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final OneShotTimeIntervalMetric getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final SuspendableTimer getExpirationMetricTimer$vungle_ads_release() {
        return this.expirationMetricTimer;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final TimeIntervalMetric getRequestToResponseMetric$vungle_ads_release() {
        return this.requestToResponseMetric;
    }

    public final TimeIntervalMetric getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    public final TimeIntervalMetric getShowToDisplayMetric$vungle_ads_release() {
        return this.showToDisplayMetric;
    }

    @Override // com.vungle.ads.Ad
    public void load(final String str) {
        this.requestToResponseMetric.markStart();
        getAdInternal().loadAd(this.placementId, str, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd$load$1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError vungleError) {
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, vungleError);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload adPayload) {
                BaseAd.this.onAdLoaded$vungle_ads_release(adPayload);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, str);
            }
        });
    }

    public void onAdLoaded$vungle_ads_release(AdPayload adPayload) {
        adPayload.setAdConfig(this.adConfig);
        this.creativeId = adPayload.getCreativeId();
        this.eventId = adPayload.eventId();
        this.expirationMetricTimer = new SuspendableTimer(adPayload.getExpiry() - (System.currentTimeMillis() / 1000), false, null, new BaseAd$onAdLoaded$1(this), 4, null);
        ThreadUtil.INSTANCE.runOnUiThread(new en(this, 0));
    }

    public void onLoadFailure$vungle_ads_release(BaseAd baseAd, VungleError vungleError) {
        ThreadUtil.INSTANCE.runOnUiThread(new a(1, this, vungleError));
        onLoadEnd();
    }

    public void onLoadSuccess$vungle_ads_release(BaseAd baseAd, String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new en(this, 1));
        onLoadEnd();
    }

    public final void setAdListener(BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    public final void setExpirationMetricTimer$vungle_ads_release(SuspendableTimer suspendableTimer) {
        this.expirationMetricTimer = suspendableTimer;
    }
}
