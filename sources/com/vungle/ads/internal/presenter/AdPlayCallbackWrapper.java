package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;

/* loaded from: classes2.dex */
public class AdPlayCallbackWrapper implements AdPlayCallback {
    private final AdPlayCallback adPlayCallback;

    public AdPlayCallbackWrapper(AdPlayCallback adPlayCallback) {
        this.adPlayCallback = adPlayCallback;
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(String str) {
        this.adPlayCallback.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(String str) {
        this.adPlayCallback.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(String str) {
        this.adPlayCallback.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(String str) {
        this.adPlayCallback.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(String str) {
        this.adPlayCallback.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(String str) {
        this.adPlayCallback.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(VungleError vungleError) {
        this.adPlayCallback.onFailure(vungleError);
    }
}
