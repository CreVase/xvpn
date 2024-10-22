package defpackage;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes2.dex */
public final class k8 extends kn {
    public AppOpenAd e;

    @Override // defpackage.kn
    public final void e() {
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
        AppOpenAd appOpenAd = this.e;
        if (appOpenAd == null) {
            c(y82Var, "no ad");
            return ch3Var;
        }
        appOpenAd.setFullScreenContentCallback(new nx3(this, y82Var, 1));
        this.e.show(G);
        return ch3Var;
    }

    @Override // defpackage.kn
    public final ch3 h() {
        AppOpenAd.load(zf3.f5472a, this.f2978a, new AdRequest.Builder().build(), 1, new j8(this));
        return ch3.f636a;
    }
}
