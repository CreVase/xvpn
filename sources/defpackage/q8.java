package defpackage;

import android.view.ViewGroup;
import com.chartboost.sdk.ads.Banner;

/* loaded from: classes2.dex */
public final class q8 extends kn {
    public Banner e;

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
        Banner banner = this.e;
        ch3 ch3Var = ch3.f636a;
        if (banner == null) {
            c(y82Var, "no ad");
            return ch3Var;
        }
        if (((ViewGroup) this.c.get()) == null) {
            a("no parent");
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
        Banner banner = this.e;
        if (banner == null) {
            banner = new Banner(zf3.z(), this.f2978a, Banner.BannerSize.STANDARD, new p8(this), null, 16, null);
            banner.setLayoutParams(new ViewGroup.LayoutParams(tf3.H, tf3.K(80)));
            int i = tf3.H;
            banner.measure(i, i);
        }
        this.e = banner;
        banner.cache();
        return ch3.f636a;
    }
}
