package com.vungle.ads;

import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.util.ThreadUtil;
import defpackage.an;
import defpackage.bn;

/* loaded from: classes2.dex */
public final class BannerAd$adPlayCallback$1 implements AdPlayCallback {
    final /* synthetic */ String $placementId;
    final /* synthetic */ BannerAd this$0;

    public BannerAd$adPlayCallback$1(BannerAd bannerAd, String str) {
        this.this$0 = bannerAd;
        this.$placementId = str;
    }

    /* renamed from: onAdClick$lambda-3 */
    public static final void m14onAdClick$lambda3(BannerAd bannerAd) {
        BaseAdListener adListener = bannerAd.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(bannerAd);
        }
    }

    /* renamed from: onAdEnd$lambda-2 */
    public static final void m15onAdEnd$lambda2(BannerAd bannerAd) {
        BaseAdListener adListener = bannerAd.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(bannerAd);
        }
    }

    /* renamed from: onAdImpression$lambda-1 */
    public static final void m16onAdImpression$lambda1(BannerAd bannerAd) {
        BaseAdListener adListener = bannerAd.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(bannerAd);
        }
    }

    /* renamed from: onAdLeftApplication$lambda-4 */
    public static final void m17onAdLeftApplication$lambda4(BannerAd bannerAd) {
        BaseAdListener adListener = bannerAd.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(bannerAd);
        }
    }

    /* renamed from: onAdStart$lambda-0 */
    public static final void m18onAdStart$lambda0(BannerAd bannerAd) {
        BaseAdListener adListener = bannerAd.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(bannerAd);
        }
    }

    /* renamed from: onFailure$lambda-5 */
    public static final void m19onFailure$lambda5(BannerAd bannerAd, VungleError vungleError) {
        BaseAdListener adListener = bannerAd.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(bannerAd, vungleError);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new bn(this.this$0, 0));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.$placementId, (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(String str) {
        ImpressionTracker impressionTracker;
        impressionTracker = this.this$0.getImpressionTracker();
        impressionTracker.destroy();
        ThreadUtil.INSTANCE.runOnUiThread(new bn(this.this$0, 2));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new bn(this.this$0, 3));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.$placementId, this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new bn(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new bn(this.this$0, 4));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(VungleError vungleError) {
        ThreadUtil.INSTANCE.runOnUiThread(new an(this.this$0, vungleError, 1));
    }
}
