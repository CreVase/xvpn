package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class wp3 extends h5 implements hu1 {
    public final Context c;
    public final ju1 d;
    public g5 e;
    public WeakReference f;
    public final /* synthetic */ xp3 g;

    public wp3(xp3 xp3Var, Context context, xc xcVar) {
        this.g = xp3Var;
        this.c = context;
        this.e = xcVar;
        ju1 ju1Var = new ju1(context);
        ju1Var.l = 1;
        this.d = ju1Var;
        ju1Var.e = this;
    }

    @Override // defpackage.h5
    public final void a() {
        xp3 xp3Var = this.g;
        if (xp3Var.i != this) {
            return;
        }
        if (!(!xp3Var.p)) {
            xp3Var.j = this;
            xp3Var.k = this.e;
        } else {
            this.e.g(this);
        }
        this.e = null;
        xp3Var.t(false);
        ActionBarContextView actionBarContextView = xp3Var.f;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        xp3Var.c.setHideOnContentScrollEnabled(xp3Var.u);
        xp3Var.i = null;
    }

    @Override // defpackage.h5
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.hu1
    public final boolean c(ju1 ju1Var, MenuItem menuItem) {
        g5 g5Var = this.e;
        if (g5Var != null) {
            return g5Var.c(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.h5
    public final ju1 d() {
        return this.d;
    }

    @Override // defpackage.h5
    public final MenuInflater e() {
        return new p33(this.c);
    }

    @Override // defpackage.h5
    public final CharSequence f() {
        return this.g.f.getSubtitle();
    }

    @Override // defpackage.h5
    public final CharSequence g() {
        return this.g.f.getTitle();
    }

    @Override // defpackage.h5
    public final void h() {
        if (this.g.i != this) {
            return;
        }
        ju1 ju1Var = this.d;
        ju1Var.w();
        try {
            this.e.l(this, ju1Var);
        } finally {
            ju1Var.v();
        }
    }

    @Override // defpackage.h5
    public final boolean i() {
        return this.g.f.s;
    }

    @Override // defpackage.h5
    public final void j(View view) {
        this.g.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.h5
    public final void k(int i) {
        l(this.g.f5202a.getResources().getString(i));
    }

    @Override // defpackage.h5
    public final void l(CharSequence charSequence) {
        this.g.f.setSubtitle(charSequence);
    }

    @Override // defpackage.h5
    public final void m(int i) {
        n(this.g.f5202a.getResources().getString(i));
    }

    @Override // defpackage.h5
    public final void n(CharSequence charSequence) {
        this.g.f.setTitle(charSequence);
    }

    @Override // defpackage.h5
    public final void o(boolean z) {
        this.f2366b = z;
        this.g.f.setTitleOptional(z);
    }

    @Override // defpackage.hu1
    public final void u(ju1 ju1Var) {
        if (this.e == null) {
            return;
        }
        h();
        b5 b5Var = this.g.f.d;
        if (b5Var != null) {
            b5Var.l();
        }
    }
}
