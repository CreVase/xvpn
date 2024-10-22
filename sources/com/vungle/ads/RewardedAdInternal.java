package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.ui.AdActivity;

/* loaded from: classes2.dex */
public final class RewardedAdInternal extends FullscreenAdInternal implements PresenterDelegate {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    public RewardedAdInternal(Context context) {
        super(context);
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        return placement.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void renderAd$vungle_ads_release(AdPlayCallback adPlayCallback, Placement placement, AdPayload adPayload) {
        AdActivity.Companion.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(adPlayCallback, placement, adPayload);
    }

    public final void setAlertBodyText$vungle_ads_release(String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }
}
