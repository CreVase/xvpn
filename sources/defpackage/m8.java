package defpackage;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* loaded from: classes2.dex */
public final class m8 extends kn {
    public AdView e;

    @Override // defpackage.kn
    public final void f() {
        ViewGroup viewGroup;
        boolean z;
        if (this.e == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.c.get();
        boolean z2 = false;
        if (viewGroup2 != null) {
            if (viewGroup2.indexOfChild(this.e) != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2 && (viewGroup = (ViewGroup) this.c.get()) != null) {
            viewGroup.addView(tf3.a0(this.e));
        }
    }

    @Override // defpackage.kn
    public final ch3 g(y82 y82Var) {
        AdView adView = this.e;
        ch3 ch3Var = ch3.f636a;
        if (adView == null) {
            c(y82Var, "no ad");
            return ch3Var;
        }
        ViewGroup viewGroup = (ViewGroup) this.c.get();
        if (viewGroup != null) {
            viewGroup.addView(tf3.a0(this.e));
        }
        d(y82Var);
        return ch3Var;
    }

    @Override // defpackage.kn
    public final ch3 h() {
        tf3.a0(this.e);
        AdView adView = this.e;
        if (adView != null) {
            adView.destroy();
        }
        this.e = null;
        AdView adView2 = new AdView(zf3.f5472a);
        adView2.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(adView2.getContext(), t9.h0(tf3.H / tf3.F)));
        adView2.setAdUnitId(this.f2978a);
        int i = tf3.H;
        adView2.measure(i, i);
        this.e = adView2;
        adView2.setAdListener(new l8(this));
        this.e.loadAd(new AdRequest.Builder().build());
        return ch3.f636a;
    }
}
