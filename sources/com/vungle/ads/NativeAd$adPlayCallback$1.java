package com.vungle.ads;

import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.util.ThreadUtil;
import defpackage.uy1;

/* loaded from: classes2.dex */
public final class NativeAd$adPlayCallback$1 implements AdPlayCallback {
    final /* synthetic */ String $placementId;
    final /* synthetic */ NativeAd this$0;

    public NativeAd$adPlayCallback$1(NativeAd nativeAd, String str) {
        this.this$0 = nativeAd;
        this.$placementId = str;
    }

    /* renamed from: onAdClick$lambda-3 */
    public static final void m36onAdClick$lambda3(NativeAd nativeAd) {
        BaseAdListener adListener = nativeAd.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(nativeAd);
        }
    }

    /* renamed from: onAdEnd$lambda-2 */
    public static final void m37onAdEnd$lambda2(NativeAd nativeAd) {
        BaseAdListener adListener = nativeAd.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(nativeAd);
        }
    }

    /* renamed from: onAdImpression$lambda-1 */
    public static final void m38onAdImpression$lambda1(NativeAd nativeAd) {
        BaseAdListener adListener = nativeAd.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(nativeAd);
        }
    }

    /* renamed from: onAdLeftApplication$lambda-4 */
    public static final void m39onAdLeftApplication$lambda4(NativeAd nativeAd) {
        BaseAdListener adListener = nativeAd.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(nativeAd);
        }
    }

    /* renamed from: onAdStart$lambda-0 */
    public static final void m40onAdStart$lambda0(NativeAd nativeAd) {
        BaseAdListener adListener = nativeAd.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(nativeAd);
        }
    }

    /* renamed from: onFailure$lambda-5 */
    public static final void m41onFailure$lambda5(NativeAd nativeAd, VungleError vungleError) {
        BaseAdListener adListener = nativeAd.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(nativeAd, vungleError);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new uy1(this.this$0, 0));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.$placementId, (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(String str) {
        this.this$0.getAdInternal().setAdState(AdInternal.AdState.FINISHED);
        ThreadUtil.INSTANCE.runOnUiThread(new uy1(this.this$0, 3));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new uy1(this.this$0, 4));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.$placementId, this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new uy1(this.this$0, 2));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(String str) {
        this.this$0.getAdInternal().setAdState(AdInternal.AdState.PLAYING);
        ThreadUtil.INSTANCE.runOnUiThread(new uy1(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(VungleError vungleError) {
        this.this$0.getAdInternal().setAdState(AdInternal.AdState.ERROR);
        ThreadUtil.INSTANCE.runOnUiThread(new a(3, this.this$0, vungleError));
    }
}
