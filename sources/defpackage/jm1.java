package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class jm1 extends ey1 implements cm1 {
    public final int l;
    public final gm1 n;
    public bk1 o;
    public km1 p;
    public final Bundle m = null;
    public gm1 q = null;

    public jm1(int i, gm1 gm1Var) {
        this.l = i;
        this.n = gm1Var;
        gm1Var.registerListener(i, this);
    }

    @Override // androidx.lifecycle.b
    public final void f() {
        this.n.startLoading();
    }

    @Override // androidx.lifecycle.b
    public final void g() {
        this.n.stopLoading();
    }

    @Override // androidx.lifecycle.b
    public final void h(a22 a22Var) {
        super.h(a22Var);
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.ey1, androidx.lifecycle.b
    public final void i(Object obj) {
        super.i(obj);
        gm1 gm1Var = this.q;
        if (gm1Var != null) {
            gm1Var.reset();
            this.q = null;
        }
    }

    public final void k() {
        gm1 gm1Var = this.n;
        gm1Var.cancelLoad();
        gm1Var.abandon();
        km1 km1Var = this.p;
        if (km1Var != null) {
            h(km1Var);
            if (km1Var.c) {
                km1Var.f2974b.onLoaderReset(km1Var.f2973a);
            }
        }
        gm1Var.unregisterListener(this);
        if (km1Var != null) {
            boolean z = km1Var.c;
        }
        gm1Var.reset();
    }

    public final void l() {
        bk1 bk1Var = this.o;
        km1 km1Var = this.p;
        if (bk1Var != null && km1Var != null) {
            super.h(km1Var);
            d(bk1Var, km1Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.l);
        sb.append(" : ");
        pe0.g(sb, this.n);
        sb.append("}}");
        return sb.toString();
    }
}
