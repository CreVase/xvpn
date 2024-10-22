package com.google.ads.mediation.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class FacebookRewardedAd implements MediationRewardedAd, RewardedVideoAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f1432a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f1433b;
    public RewardedVideoAd c;
    public MediationRewardedAdCallback e;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean f = new AtomicBoolean();

    public FacebookRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f1432a = mediationRewardedAdConfiguration;
        this.f1433b = mediationAdLoadCallback;
    }

    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        MediationAdLoadCallback mediationAdLoadCallback = this.f1433b;
        if (mediationAdLoadCallback != null) {
            this.e = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.d.get()) {
            adError2.getMessage();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            adError2.getMessage();
            MediationAdLoadCallback mediationAdLoadCallback = this.f1433b;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.c.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f.getAndSet(true) && (mediationRewardedAdCallback = this.e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f.getAndSet(true) && (mediationRewardedAdCallback = this.e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.e.onVideoComplete();
        this.e.onUserEarnedReward(new FacebookReward());
    }

    public void render() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f1432a;
        Context context = mediationRewardedAdConfiguration.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(mediationRewardedAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f1433b.onFailure(adError);
        } else {
            FacebookMediationAdapter.setMixedAudience(mediationRewardedAdConfiguration);
            this.c = new RewardedVideoAd(context, placementID);
            if (!TextUtils.isEmpty(mediationRewardedAdConfiguration.getWatermark())) {
                this.c.setExtraHints(new ExtraHints.Builder().mediationData(mediationRewardedAdConfiguration.getWatermark()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.c;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(mediationRewardedAdConfiguration.getBidResponse()).withAdExperience(a()).build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.d.set(true);
        if (!this.c.show()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present rewarded ad.", "com.google.ads.mediation.facebook");
            adError.getMessage();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
            }
            this.c.destroy();
            return;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.e;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onVideoStart();
            this.e.onAdOpened();
        }
    }
}
