package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import defpackage.ix;
import defpackage.jx;

/* loaded from: classes.dex */
public class ChartboostRewardedAd implements MediationRewardedAd, RewardedCallback {

    /* renamed from: a, reason: collision with root package name */
    public Rewarded f1428a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f1429b;
    public final MediationAdLoadCallback c;
    public MediationRewardedAdCallback d;

    public ChartboostRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f1429b = mediationRewardedAdConfiguration;
        this.c = mediationAdLoadCallback;
    }

    public void loadAd() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f1429b;
        Context context = mediationRewardedAdConfiguration.getContext();
        ChartboostParams a2 = a.a(mediationRewardedAdConfiguration.getServerParameters());
        if (!a.c(a2)) {
            AdError createAdapterError = ChartboostConstants.createAdapterError(103, "Failed to load rewarded ad from Chartboost. Missing or invalid server parameters.");
            Log.e(ChartboostMediationAdapter.TAG, createAdapterError.toString());
            this.c.onFailure(createAdapterError);
        } else {
            String location = a2.getLocation();
            a.d(context, mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
            ChartboostInitializer.getInstance().initialize(context, a2, new ix(1, this, location));
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
        if (clickError == null) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.reportAdClicked();
                return;
            }
            return;
        }
        ChartboostConstants.b(clickError).toString();
    }

    @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
    public void onAdDismiss(DismissEvent dismissEvent) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        MediationAdLoadCallback mediationAdLoadCallback = this.c;
        if (cacheError == null) {
            if (mediationAdLoadCallback != null) {
                this.d = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
            }
        } else {
            AdError a2 = ChartboostConstants.a(cacheError);
            a2.toString();
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(a2);
            }
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdRequestedToShow(ShowEvent showEvent) {
        String str = ChartboostMediationAdapter.TAG;
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdShown(ShowEvent showEvent, ShowError showError) {
        if (showError == null) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdOpened();
                this.d.onVideoStart();
                return;
            }
            return;
        }
        AdError c = ChartboostConstants.c(showError);
        c.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.d;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onAdFailedToShow(c);
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent impressionEvent) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.chartboost.sdk.callbacks.RewardedCallback
    public void onRewardEarned(RewardEvent rewardEvent) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.d.onUserEarnedReward(new jx(rewardEvent));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Rewarded rewarded = this.f1428a;
        if (rewarded != null && rewarded.isCached()) {
            this.f1428a.show();
        } else {
            ChartboostConstants.createAdapterError(104, "Chartboost rewarded ad is not yet ready to be shown.").toString();
        }
    }
}
