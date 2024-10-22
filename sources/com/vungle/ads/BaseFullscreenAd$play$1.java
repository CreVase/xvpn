package com.vungle.ads;

import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.util.ThreadUtil;
import defpackage.tn;

/* loaded from: classes2.dex */
public final class BaseFullscreenAd$play$1 implements AdPlayCallback {
    final /* synthetic */ BaseFullscreenAd this$0;

    public BaseFullscreenAd$play$1(BaseFullscreenAd baseFullscreenAd) {
        this.this$0 = baseFullscreenAd;
    }

    /* renamed from: onAdClick$lambda-3 */
    public static final void m26onAdClick$lambda3(BaseFullscreenAd baseFullscreenAd) {
        BaseAdListener adListener = baseFullscreenAd.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(baseFullscreenAd);
        }
    }

    /* renamed from: onAdEnd$lambda-2 */
    public static final void m27onAdEnd$lambda2(BaseFullscreenAd baseFullscreenAd) {
        BaseAdListener adListener = baseFullscreenAd.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(baseFullscreenAd);
        }
    }

    /* renamed from: onAdImpression$lambda-1 */
    public static final void m28onAdImpression$lambda1(BaseFullscreenAd baseFullscreenAd) {
        BaseAdListener adListener = baseFullscreenAd.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(baseFullscreenAd);
        }
    }

    /* renamed from: onAdLeftApplication$lambda-5 */
    public static final void m29onAdLeftApplication$lambda5(BaseFullscreenAd baseFullscreenAd) {
        BaseAdListener adListener = baseFullscreenAd.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(baseFullscreenAd);
        }
    }

    /* renamed from: onAdRewarded$lambda-4 */
    public static final void m30onAdRewarded$lambda4(BaseFullscreenAd baseFullscreenAd) {
        RewardedAdListener rewardedAdListener;
        BaseAdListener adListener = baseFullscreenAd.getAdListener();
        if (adListener instanceof RewardedAdListener) {
            rewardedAdListener = (RewardedAdListener) adListener;
        } else {
            rewardedAdListener = null;
        }
        if (rewardedAdListener != null) {
            rewardedAdListener.onAdRewarded(baseFullscreenAd);
        }
    }

    /* renamed from: onAdStart$lambda-0 */
    public static final void m31onAdStart$lambda0(BaseFullscreenAd baseFullscreenAd) {
        BaseAdListener adListener = baseFullscreenAd.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(baseFullscreenAd);
        }
    }

    /* renamed from: onFailure$lambda-6 */
    public static final void m32onFailure$lambda6(BaseFullscreenAd baseFullscreenAd, VungleError vungleError) {
        BaseAdListener adListener = baseFullscreenAd.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(baseFullscreenAd, vungleError);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new tn(this.this$0, 2));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.this$0.getPlacementId(), (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new tn(this.this$0, 4));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new tn(this.this$0, 3));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.this$0.getPlacementId(), this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new tn(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new tn(this.this$0, 5));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new tn(this.this$0, 0));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(VungleError vungleError) {
        ThreadUtil.INSTANCE.runOnUiThread(new a(2, this.this$0, vungleError));
    }
}
