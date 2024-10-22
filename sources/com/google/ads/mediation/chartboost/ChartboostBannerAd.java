package com.google.ads.mediation.chartboost;

import android.view.View;
import android.widget.FrameLayout;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public class ChartboostBannerAd implements MediationBannerAd, BannerCallback {

    /* renamed from: a, reason: collision with root package name */
    public FrameLayout f1420a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationBannerAdConfiguration f1421b;
    public final MediationAdLoadCallback c;
    public MediationBannerAdCallback d;

    public ChartboostBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f1421b = mediationBannerAdConfiguration;
        this.c = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f1420a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadAd() {
        /*
            r13 = this;
            com.google.android.gms.ads.mediation.MediationBannerAdConfiguration r0 = r13.f1421b
            android.content.Context r1 = r0.getContext()
            android.os.Bundle r2 = r0.getServerParameters()
            com.google.ads.mediation.chartboost.ChartboostParams r2 = com.google.ads.mediation.chartboost.a.a(r2)
            boolean r3 = com.google.ads.mediation.chartboost.a.c(r2)
            com.google.android.gms.ads.mediation.MediationAdLoadCallback r4 = r13.c
            if (r3 != 0) goto L2b
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r1 = "Failed to load banner ad from Chartboost. Missing or invalid server parameters."
            com.google.android.gms.ads.AdError r0 = com.google.ads.mediation.chartboost.ChartboostConstants.createAdapterError(r0, r1)
            java.lang.String r1 = com.google.ads.mediation.chartboost.ChartboostMediationAdapter.TAG
            java.lang.String r2 = r0.toString()
            android.util.Log.e(r1, r2)
            r4.onFailure(r0)
            return
        L2b:
            com.google.android.gms.ads.AdSize r3 = r0.getAdSize()
            com.google.android.gms.ads.AdSize r5 = new com.google.android.gms.ads.AdSize
            com.chartboost.sdk.ads.Banner$BannerSize r6 = com.chartboost.sdk.ads.Banner.BannerSize.STANDARD
            int r7 = r6.getWidth()
            int r8 = r6.getHeight()
            r5.<init>(r7, r8)
            com.google.android.gms.ads.AdSize r7 = new com.google.android.gms.ads.AdSize
            com.chartboost.sdk.ads.Banner$BannerSize r8 = com.chartboost.sdk.ads.Banner.BannerSize.MEDIUM
            int r9 = r8.getWidth()
            int r10 = r8.getHeight()
            r7.<init>(r9, r10)
            com.google.android.gms.ads.AdSize r9 = new com.google.android.gms.ads.AdSize
            com.chartboost.sdk.ads.Banner$BannerSize r10 = com.chartboost.sdk.ads.Banner.BannerSize.LEADERBOARD
            int r11 = r10.getWidth()
            int r12 = r10.getHeight()
            r9.<init>(r11, r12)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r5)
            r11.add(r7)
            r11.add(r9)
            com.google.android.gms.ads.AdSize r11 = com.google.android.gms.ads.MediationUtils.findClosestSize(r1, r3, r11)
            r12 = 0
            if (r11 != 0) goto L73
        L71:
            r6 = r12
            goto L89
        L73:
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L7a
            goto L89
        L7a:
            boolean r5 = r11.equals(r7)
            if (r5 == 0) goto L82
            r6 = r8
            goto L89
        L82:
            boolean r5 = r11.equals(r9)
            if (r5 == 0) goto L71
            r6 = r10
        L89:
            if (r6 != 0) goto Laa
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r1 = "The requested banner size: %s is not supported by Chartboost SDK."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r1 = 101(0x65, float:1.42E-43)
            com.google.android.gms.ads.AdError r0 = com.google.ads.mediation.chartboost.ChartboostConstants.createAdapterError(r1, r0)
            java.lang.String r1 = com.google.ads.mediation.chartboost.ChartboostMediationAdapter.TAG
            java.lang.String r2 = r0.toString()
            android.util.Log.e(r1, r2)
            r4.onFailure(r0)
            return
        Laa:
            java.lang.String r3 = r2.getLocation()
            int r0 = r0.taggedForChildDirectedTreatment()
            com.google.ads.mediation.chartboost.a.d(r1, r0)
            com.google.ads.mediation.chartboost.ChartboostInitializer r0 = com.google.ads.mediation.chartboost.ChartboostInitializer.getInstance()
            fx r4 = new fx
            r4.<init>(r13, r1, r3, r6)
            r0.initialize(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.chartboost.ChartboostBannerAd.loadAd():void");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
        if (clickError != null) {
            ChartboostConstants.b(clickError).toString();
            return;
        }
        MediationBannerAdCallback mediationBannerAdCallback = this.d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        MediationAdLoadCallback mediationAdLoadCallback = this.c;
        if (cacheError != null) {
            AdError a2 = ChartboostConstants.a(cacheError);
            a2.toString();
            mediationAdLoadCallback.onFailure(a2);
        } else {
            this.d = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
            cacheEvent.getAd().show();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdRequestedToShow(ShowEvent showEvent) {
        String str = ChartboostMediationAdapter.TAG;
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdShown(ShowEvent showEvent, ShowError showError) {
        if (showError != null) {
            ChartboostConstants.c(showError).toString();
            return;
        }
        MediationBannerAdCallback mediationBannerAdCallback = this.d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent impressionEvent) {
        MediationBannerAdCallback mediationBannerAdCallback = this.d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
