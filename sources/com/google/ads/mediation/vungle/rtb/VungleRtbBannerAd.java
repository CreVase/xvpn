package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.mediation.VungleInterstitialAdapter;
import defpackage.wn3;

/* loaded from: classes.dex */
public class VungleRtbBannerAd implements MediationBannerAd, BannerAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationBannerAdConfiguration f1447a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f1448b;
    public MediationBannerAdCallback c;
    public BannerAd d;
    public RelativeLayout e;

    public VungleRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f1447a = mediationBannerAdConfiguration;
        this.f1448b = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.e;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.toString();
        this.f1448b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        VungleMediationAdapter.getAdError(vungleError).toString();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        View bannerView = this.d.getBannerView();
        MediationAdLoadCallback mediationAdLoadCallback = this.f1448b;
        if (bannerView == null) {
            AdError adError = new AdError(106, "Vungle SDK returned a successful load callback, but getBannerView() returned null.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14, -1);
            layoutParams.addRule(15, -1);
            bannerView.setLayoutParams(layoutParams);
            this.e.addView(bannerView);
            this.c = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
    }

    public void render() {
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.f1447a;
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString(VungleConstants.KEY_APP_ID);
        boolean isEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.f1448b;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        BannerAdSize vungleBannerAdSizeFromGoogleAdSize = VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(context, adSize);
        if (vungleBannerAdSizeFromGoogleAdSize == null) {
            AdError adError3 = new AdError(102, String.format("The requested banner size: %s is not supported by Vungle SDK.", adSize), VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError3.getMessage());
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        VungleInitializer.getInstance().initialize(string, context, new wn3(this, context, string2, adSize, vungleBannerAdSizeFromGoogleAdSize, mediationBannerAdConfiguration.getBidResponse(), mediationBannerAdConfiguration.getWatermark()));
    }
}
