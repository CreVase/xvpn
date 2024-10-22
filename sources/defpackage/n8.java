package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes2.dex */
public final class n8 extends InterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o8 f3409a;

    public n8(o8 o8Var) {
        this.f3409a = o8Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f3409a.a(loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        o8 o8Var = this.f3409a;
        o8Var.e = interstitialAd;
        o8Var.b();
    }
}
