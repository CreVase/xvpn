package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;

/* loaded from: classes2.dex */
public interface AdPlayCallback {
    void onAdClick(String str);

    void onAdEnd(String str);

    void onAdImpression(String str);

    void onAdLeftApplication(String str);

    void onAdRewarded(String str);

    void onAdStart(String str);

    void onFailure(VungleError vungleError);
}
