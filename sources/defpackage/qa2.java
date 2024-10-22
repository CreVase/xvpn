package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.h;

/* loaded from: classes2.dex */
public final class qa2 extends h implements f83, ke1 {
    public final se1 u;
    public final f83 v;

    public qa2(se1 se1Var, f83 f83Var) {
        super((LinearLayout) se1Var.c);
        this.u = se1Var;
        this.v = f83Var;
        se1Var.f4327b.setTextColor(v73.p());
        se1Var.d.setBackgroundColor(v73.j(1000010));
        fl.k(this, this);
    }

    @Override // defpackage.ke1
    public final void a() {
        se1 se1Var = this.u;
        se1Var.f4327b.setTextColor(v73.p());
        se1Var.d.setBackgroundColor(v73.j(1000010));
    }

    @Override // defpackage.f83
    public final void addThemeInvalidateListener(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final void bindInvalidate(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final a83 getThemeListeners() {
        return this.v.getThemeListeners();
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.f83
    public final void j(TextView textView, int i) {
        fl.n(this, textView, i);
    }

    @Override // defpackage.f83
    public final void k(pn0 pn0Var) {
        fl.i(this, pn0Var, true);
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        getThemeListeners().b(z);
    }

    @Override // defpackage.f83
    public final void q(ke1 ke1Var) {
        fl.k(this, ke1Var);
    }

    @Override // defpackage.f83
    public final void r(View view, boolean z) {
        fl.i(this, view, z);
    }

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }
}
