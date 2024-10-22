package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ThreadUtil;
import defpackage.an;
import defpackage.k43;
import defpackage.ui1;
import defpackage.ut0;

/* loaded from: classes2.dex */
public final class BannerAd extends BaseAd {
    private final AdPlayCallbackWrapper adPlayCallback;
    private BannerAdSize adSize;
    private BannerView bannerView;
    private final ui1 impressionTracker$delegate;

    private BannerAd(Context context, String str, BannerAdSize bannerAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adSize = bannerAdSize;
        this.impressionTracker$delegate = new k43(new BannerAd$impressionTracker$2(context));
        this.adPlayCallback = ((BannerAdInternal) getAdInternal()).wrapCallback$vungle_ads_release(new BannerAd$adPlayCallback$1(this, str));
    }

    /* renamed from: getBannerView$lambda-0 */
    public static final void m12getBannerView$lambda0(BannerAd bannerAd, VungleError vungleError) {
        BaseAdListener adListener = bannerAd.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(bannerAd, vungleError);
        }
    }

    public final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker$delegate.getValue();
    }

    public final void finishAd() {
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            bannerView.finishAdInternal(true);
        }
    }

    public final BannerView getBannerView() {
        AdPayload advertisement;
        Placement placement;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            return bannerView;
        }
        VungleError canPlayAd = getAdInternal().canPlayAd(true);
        if (canPlayAd != null) {
            if (getAdInternal().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal().setAdState(AdInternal.AdState.ERROR);
            }
            ThreadUtil.INSTANCE.runOnUiThread(new an(this, canPlayAd, 0));
            return null;
        }
        advertisement = getAdInternal().getAdvertisement();
        if (advertisement == null || (placement = getAdInternal().getPlacement()) == null) {
            return null;
        }
        getAdInternal().cancelDownload$vungle_ads_release();
        disableExpirationTimer$vungle_ads_release();
        this.bannerView = new BannerView(getContext(), placement, advertisement, this.adSize, getAdConfig(), this.adPlayCallback, getAdInternal().getBidPayload());
        getResponseToShowMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric$vungle_ads_release().markStart();
        BannerView bannerView2 = this.bannerView;
        if (bannerView2 != null) {
            getImpressionTracker().addView(bannerView2, new ut0(bannerView2, 14));
        }
        return this.bannerView;
    }

    @Override // com.vungle.ads.BaseAd
    public BannerAdInternal constructAdInternal$vungle_ads_release(Context context) {
        return new BannerAdInternal(context, this.adSize);
    }

    public BannerAd(Context context, String str, BannerAdSize bannerAdSize) {
        this(context, str, bannerAdSize, new AdConfig());
    }
}
