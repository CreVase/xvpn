package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* loaded from: classes2.dex */
public final class o8 extends kn {
    public InterstitialAd e;

    @Override // defpackage.kn
    public final void e() {
        InterstitialAd interstitialAd = this.e;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(null);
        }
        this.e = null;
    }

    @Override // defpackage.kn
    public final ch3 g(y82 y82Var) {
        ic G = zf3.G();
        ch3 ch3Var = ch3.f636a;
        if (G == null) {
            c(y82Var, "no context");
            return ch3Var;
        }
        InterstitialAd interstitialAd = this.e;
        if (interstitialAd == null) {
            c(y82Var, "no ad");
            return ch3Var;
        }
        interstitialAd.setFullScreenContentCallback(new nx3(this, y82Var, 2));
        this.e.show(G);
        return ch3Var;
    }

    @Override // defpackage.kn
    public final ch3 h() {
        Context z = zf3.z();
        ch3 ch3Var = ch3.f636a;
        if (z == null) {
            a("no context");
            return ch3Var;
        }
        InterstitialAd.load(z, this.f2978a, new AdRequest.Builder().build(), new n8(this));
        return ch3Var;
    }
}
