package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.ao3;

/* loaded from: classes.dex */
public class VungleRtbRewardedAd implements MediationRewardedAd, RewardedAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f1453a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f1454b;
    public MediationRewardedAdCallback c;
    public RewardedAd d;

    public VungleRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f1453a = mediationRewardedAdConfiguration;
        this.f1454b = mediationAdLoadCallback;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.toString();
        this.f1454b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.c.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        this.c = (MediationRewardedAdCallback) this.f1454b.onSuccess(this);
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.c.onUserEarnedReward(new VungleMediationAdapter.VungleReward(PathProvider.VUNGLE_FOLDER, 1));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    public void render() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f1453a;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString(VungleConstants.KEY_USER_ID);
        String string2 = serverParameters.getString(VungleConstants.KEY_APP_ID);
        boolean isEmpty = TextUtils.isEmpty(string2);
        MediationAdLoadCallback mediationAdLoadCallback = this.f1454b;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdConfig adConfig = new AdConfig();
        if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            adConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfig.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string2, context, new ao3(this, context, string3, adConfig, string, bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        RewardedAd rewardedAd = this.d;
        if (rewardedAd != null) {
            rewardedAd.play();
        } else if (this.c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            this.c.onAdFailedToShow(adError);
        }
    }
}
