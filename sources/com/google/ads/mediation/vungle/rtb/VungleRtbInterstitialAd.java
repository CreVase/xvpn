package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import defpackage.xn3;

/* loaded from: classes.dex */
public class VungleRtbInterstitialAd implements MediationInterstitialAd, InterstitialAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f1449a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f1450b;
    public MediationInterstitialAdCallback c;
    public InterstitialAd d;

    public VungleRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f1449a = mediationInterstitialAdConfiguration;
        this.f1450b = mediationAdLoadCallback;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.toString();
        this.f1450b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        this.c = (MediationInterstitialAdCallback) this.f1450b.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    public void render() {
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.f1449a;
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(VungleConstants.KEY_APP_ID);
        boolean isEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.f1450b;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdConfig adConfig = new AdConfig();
        if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            adConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfig.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string, context, new xn3(this, context, string2, adConfig, bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        InterstitialAd interstitialAd = this.d;
        if (interstitialAd != null) {
            interstitialAd.play();
        } else if (this.c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            this.c.onAdFailedToShow(adError);
        }
    }
}
