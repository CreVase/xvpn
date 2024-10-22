package com.vungle.ads;

import android.content.Context;
import defpackage.ng0;

/* loaded from: classes2.dex */
public final class RewardedAd extends BaseFullscreenAd {
    public /* synthetic */ RewardedAd(Context context, String str, AdConfig adConfig, int i, ng0 ng0Var) {
        this(context, str, (i & 4) != 0 ? new AdConfig() : adConfig);
    }

    private final RewardedAdInternal getRewardedAdInternal() {
        return (RewardedAdInternal) getAdInternal();
    }

    public final void setAlertBodyText(String str) {
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(str);
    }

    public final void setAlertCloseButtonText(String str) {
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(str);
    }

    public final void setAlertContinueButtonText(String str) {
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(str);
    }

    public final void setAlertTitleText(String str) {
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(str);
    }

    public final void setUserId(String str) {
        getRewardedAdInternal().setUserId$vungle_ads_release(str);
    }

    public RewardedAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
    }

    @Override // com.vungle.ads.BaseAd
    public RewardedAdInternal constructAdInternal$vungle_ads_release(Context context) {
        return new RewardedAdInternal(context);
    }
}
