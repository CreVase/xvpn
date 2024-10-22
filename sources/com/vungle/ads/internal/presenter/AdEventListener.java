package com.vungle.ads.internal.presenter;

import android.util.Log;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.Placement;
import defpackage.m20;
import defpackage.ng0;

/* loaded from: classes2.dex */
public class AdEventListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private Placement placement;
    private final AdPlayCallback playAdCallback;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public AdEventListener(AdPlayCallback adPlayCallback, Placement placement) {
        this.playAdCallback = adPlayCallback;
        this.placement = placement;
    }

    public final void onError(VungleError vungleError, String str) {
        AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(vungleError);
            Log.e(TAG, "AdEventListener#PlayAdCallback " + str, vungleError);
        }
    }

    public final void onNext(String str, String str2, String str3) {
        AdPlayCallback adPlayCallback;
        AdPlayCallback adPlayCallback2;
        AdPlayCallback adPlayCallback3;
        AdPlayCallback adPlayCallback4;
        switch (str.hashCode()) {
            case -1912374177:
                if (str.equals(MRAIDPresenter.SUCCESSFUL_VIEW)) {
                    Placement placement = this.placement;
                    boolean z = false;
                    if (placement != null && placement.isIncentivized()) {
                        z = true;
                    }
                    if (z && !this.adRewarded) {
                        this.adRewarded = true;
                        AdPlayCallback adPlayCallback5 = this.playAdCallback;
                        if (adPlayCallback5 != null) {
                            adPlayCallback5.onAdRewarded(str3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case -1627831289:
                if (str.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(str3);
                    return;
                }
                return;
            case 100571:
                if (str.equals("end") && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(str3);
                    return;
                }
                return;
            case 3417674:
                if (str.equals(MRAIDPresenter.OPEN)) {
                    if (m20.L(str2, "adClick")) {
                        AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(str3);
                            return;
                        }
                        return;
                    }
                    if (m20.L(str2, "adLeftApplication") && (adPlayCallback3 = this.playAdCallback) != null) {
                        adPlayCallback3.onAdLeftApplication(str3);
                        return;
                    }
                    return;
                }
                return;
            case 109757538:
                if (str.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(str3);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
