package defpackage;

import com.facebook.ads.InterstitialAd;

/* loaded from: classes2.dex */
public final class s8 extends kn {
    public InterstitialAd e;
    public ep2 f;

    @Override // defpackage.kn
    public final void e() {
        InterstitialAd interstitialAd = this.e;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.kn
    public final ch3 g(y82 y82Var) {
        InterstitialAd interstitialAd = this.e;
        ch3 ch3Var = ch3.f636a;
        if (interstitialAd == null) {
            c(y82Var, "no ad");
            return ch3Var;
        }
        this.f = y82Var;
        interstitialAd.show();
        return ch3Var;
    }

    @Override // defpackage.kn
    public final ch3 h() {
        InterstitialAd interstitialAd = new InterstitialAd(zf3.z(), this.f2978a);
        this.e = interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new r8(this)).build());
        return ch3.f636a;
    }
}
