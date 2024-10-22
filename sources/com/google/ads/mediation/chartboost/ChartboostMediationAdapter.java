package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import defpackage.ix;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ChartboostMediationAdapter extends Adapter {
    static final String TAG = "ChartboostMediationAdapter";
    private static String preferredAppID;
    private static String preferredAppSignature;
    private ChartboostBannerAd bannerAd;
    private ChartboostInterstitialAd interstitialAd;
    private ChartboostRewardedAd rewardedAd;

    public static void setAppParams(String str, String str2) {
        preferredAppID = str;
        preferredAppSignature = str2;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sDKVersion = Chartboost.getSDKVersion();
        String[] split = sDKVersion.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", BuildConfig.ADAPTER_VERSION);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        ChartboostParams a2;
        int i = 2;
        if (!TextUtils.isEmpty(preferredAppID) && !TextUtils.isEmpty(preferredAppSignature)) {
            String.format("Preferred parameters have been set. Initializing Chartboost SDK with App ID: '%s', App Signature: '%s'", preferredAppID, preferredAppSignature);
            a2 = new ChartboostParams();
            a2.setAppId(preferredAppID);
            a2.setAppSignature(preferredAppSignature);
        } else {
            HashMap hashMap = new HashMap();
            Iterator<MediationConfiguration> it = list.iterator();
            while (it.hasNext()) {
                Bundle serverParameters = it.next().getServerParameters();
                String string = serverParameters.getString("appId");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(string, serverParameters);
                }
            }
            int size = hashMap.size();
            if (size <= 0) {
                AdError createAdapterError = ChartboostConstants.createAdapterError(103, "Missing or invalid App ID.");
                initializationCompleteCallback.onInitializationFailed(createAdapterError.toString());
                Log.e(TAG, createAdapterError.toString());
                return;
            }
            String str = (String) hashMap.keySet().iterator().next();
            Bundle bundle = (Bundle) hashMap.get(str);
            if (size > 1) {
                String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Chartboost SDK.", "appId", hashMap.keySet(), str);
            }
            if (bundle == null) {
                AdError createAdapterError2 = ChartboostConstants.createAdapterError(103, "Invalid server parameters.");
                initializationCompleteCallback.onInitializationFailed(createAdapterError2.toString());
                Log.e(TAG, createAdapterError2.toString());
                return;
            }
            a2 = a.a(bundle);
        }
        if (!a.c(a2)) {
            AdError createAdapterError3 = ChartboostConstants.createAdapterError(103, "Invalid server parameters.");
            initializationCompleteCallback.onInitializationFailed(createAdapterError3.toString());
            Log.e(TAG, createAdapterError3.toString());
            return;
        }
        ChartboostInitializer.getInstance().initialize(context, a2, new ix(i, this, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        ChartboostBannerAd chartboostBannerAd = new ChartboostBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.bannerAd = chartboostBannerAd;
        chartboostBannerAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        ChartboostInterstitialAd chartboostInterstitialAd = new ChartboostInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.interstitialAd = chartboostInterstitialAd;
        chartboostInterstitialAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        ChartboostRewardedAd chartboostRewardedAd = new ChartboostRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedAd = chartboostRewardedAd;
        chartboostRewardedAd.loadAd();
    }
}
