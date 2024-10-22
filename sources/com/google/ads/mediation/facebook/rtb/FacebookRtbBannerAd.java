package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public class FacebookRtbBannerAd implements MediationBannerAd, AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationBannerAdConfiguration f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f1435b;
    public AdView c;
    public FrameLayout d;
    public MediationBannerAdCallback e;

    public FacebookRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f1434a = mediationBannerAdConfiguration;
        this.f1435b = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.d;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.e.onAdOpened();
            this.e.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        this.e = (MediationBannerAdCallback) this.f1435b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        this.f1435b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public void render() {
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.f1434a;
        String placementID = FacebookMediationAdapter.getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        boolean isEmpty = TextUtils.isEmpty(placementID);
        MediationAdLoadCallback mediationAdLoadCallback = this.f1435b;
        if (isEmpty) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationBannerAdConfiguration);
        try {
            this.c = new AdView(mediationBannerAdConfiguration.getContext(), placementID, mediationBannerAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                this.c.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context), -2);
            this.d = new FrameLayout(context);
            this.c.setLayoutParams(layoutParams);
            this.d.addView(this.c);
            AdView adView = this.c;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(111, "Failed to create banner ad: " + e.getMessage(), "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        }
    }
}
