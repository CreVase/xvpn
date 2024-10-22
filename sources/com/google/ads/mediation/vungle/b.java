package com.google.ads.mediation.vungle;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.vungle.ads.AdConfig;
import com.vungle.ads.RewardedAd;

/* loaded from: classes.dex */
public final class b implements VungleInitializer.VungleInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1446b;
    public final /* synthetic */ VungleMediationAdapter c;

    public b(VungleMediationAdapter vungleMediationAdapter, Context context, String str) {
        this.c = vungleMediationAdapter;
        this.f1445a = context;
        this.f1446b = str;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        adError.toString();
        mediationAdLoadCallback = this.c.mediationAdLoadCallback;
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        AdConfig adConfig;
        RewardedAd rewardedAd;
        String str;
        RewardedAd rewardedAd2;
        RewardedAd rewardedAd3;
        String str2;
        String str3 = this.f1446b;
        VungleMediationAdapter vungleMediationAdapter = this.c;
        adConfig = vungleMediationAdapter.adConfig;
        vungleMediationAdapter.rewardedAd = new RewardedAd(this.f1445a, str3, adConfig);
        rewardedAd = vungleMediationAdapter.rewardedAd;
        rewardedAd.setAdListener(vungleMediationAdapter);
        str = vungleMediationAdapter.userId;
        if (!TextUtils.isEmpty(str)) {
            rewardedAd3 = vungleMediationAdapter.rewardedAd;
            str2 = vungleMediationAdapter.userId;
            rewardedAd3.setUserId(str2);
        }
        rewardedAd2 = vungleMediationAdapter.rewardedAd;
        rewardedAd2.load(null);
    }
}
