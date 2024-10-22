package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.mediation.BuildConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, RewardedAdListener {
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_VUNGLE_BANNER_NULL = 106;
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private AdConfig adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private RewardedAd rewardedAd;
    private VungleRtbBannerAd rtbBannerAd;
    private VungleRtbInterstitialAd rtbInterstitialAd;
    private VungleRtbNativeAd rtbNativeAd;
    private VungleRtbRewardedAd rtbRewardedAd;
    private VungleRtbRewardedAd rtbRewardedInterstitialAd;
    private String userId;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    /* loaded from: classes.dex */
    public static class VungleReward implements RewardItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f1442a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1443b;

        public VungleReward(String str, int i) {
            this.f1442a = str;
            this.f1443b = i;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public int getAmount() {
            return this.f1443b;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public String getType() {
            return this.f1442a;
        }
    }

    public static AdError getAdError(VungleError vungleError) {
        return new AdError(vungleError.getCode(), vungleError.getErrorMessage(), "com.vungle.ads");
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        String biddingToken = VungleAds.getBiddingToken(rtbSignalData.getContext());
        if (TextUtils.isEmpty(biddingToken)) {
            AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", ERROR_DOMAIN);
            adError.toString();
            signalCallbacks.onFailure(adError);
            return;
        }
        signalCallbacks.onSuccess(biddingToken);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = VungleAds.getSdkVersion();
        String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion);
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
        if (VungleAds.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString(VungleConstants.KEY_APP_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            if (initializationCompleteCallback != null) {
                AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
                adError.toString();
                initializationCompleteCallback.onInitializationFailed(adError.toString());
                return;
            }
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", VungleConstants.KEY_APP_ID, hashSet, str);
        }
        VungleInitializer.getInstance().initialize(str, context, new a(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationNativeAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString(VungleConstants.KEY_USER_ID);
        }
        String string = serverParameters.getString(VungleConstants.KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.adConfig = new AdConfig();
        if (mediationExtras != null && mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            this.adConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        Context context = mediationRewardedAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string, context, new b(this, context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationBannerAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbBannerAd vungleRtbBannerAd = new VungleRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.rtbBannerAd = vungleRtbBannerAd;
        vungleRtbBannerAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbInterstitialAd vungleRtbInterstitialAd = new VungleRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.rtbInterstitialAd = vungleRtbInterstitialAd;
        vungleRtbInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationNativeAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rtbRewardedAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rtbRewardedInterstitialAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        adError.toString();
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward(new VungleReward(PathProvider.VUNGLE_FOLDER, 1));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.play();
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            adError.toString();
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
