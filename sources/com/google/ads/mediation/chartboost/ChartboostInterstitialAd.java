package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import defpackage.ix;

/* loaded from: classes.dex */
public class ChartboostInterstitialAd implements MediationInterstitialAd, InterstitialCallback {

    /* renamed from: a, reason: collision with root package name */
    public Interstitial f1424a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f1425b;
    public final MediationAdLoadCallback c;
    public MediationInterstitialAdCallback d;

    public ChartboostInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f1425b = mediationInterstitialAdConfiguration;
        this.c = mediationAdLoadCallback;
    }

    public void loadAd() {
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.f1425b;
        Context context = mediationInterstitialAdConfiguration.getContext();
        ChartboostParams a2 = a.a(mediationInterstitialAdConfiguration.getServerParameters());
        if (!a.c(a2)) {
            AdError createAdapterError = ChartboostConstants.createAdapterError(103, "Failed to load interstitial ad from Chartboost. Missing or invalid server parameters.");
            Log.e(ChartboostMediationAdapter.TAG, createAdapterError.toString());
            this.c.onFailure(createAdapterError);
        } else {
            String location = a2.getLocation();
            a.d(context, mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
            ChartboostInitializer.getInstance().initialize(context, a2, new ix(0, this, location));
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
        if (clickError == null) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.reportAdClicked();
                return;
            }
            return;
        }
        ChartboostConstants.b(clickError).toString();
    }

    @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
    public void onAdDismiss(DismissEvent dismissEvent) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        MediationAdLoadCallback mediationAdLoadCallback = this.c;
        if (cacheError == null) {
            if (mediationAdLoadCallback != null) {
                this.d = (MediationInterstitialAdCallback) mediationAdLoadCallback.onSuccess(this);
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
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdOpened();
                return;
            }
            return;
        }
        AdError c = ChartboostConstants.c(showError);
        c.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.d;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.onAdFailedToShow(c);
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent impressionEvent) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        Interstitial interstitial = this.f1424a;
        if (interstitial != null && interstitial.isCached()) {
            this.f1424a.show();
        } else {
            ChartboostConstants.createAdapterError(104, "Chartboost interstitial ad is not yet ready to be shown.").toString();
        }
    }
}
