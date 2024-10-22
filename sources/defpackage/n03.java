package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n03 extends h5 implements hu1 {
    public final Context c;
    public final ActionBarContextView d;
    public final g5 e;
    public WeakReference f;
    public boolean g;
    public final ju1 h;

    public n03(Context context, ActionBarContextView actionBarContextView, g5 g5Var) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = g5Var;
        ju1 ju1Var = new ju1(actionBarContextView.getContext());
        ju1Var.l = 1;
        this.h = ju1Var;
        ju1Var.e = this;
    }

    @Override // defpackage.h5
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.g(this);
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
        return this.e.c(this, menuItem);
    }

    @Override // defpackage.h5
    public final ju1 d() {
        return this.h;
    }

    @Override // defpackage.h5
    public final MenuInflater e() {
        return new p33(this.d.getContext());
    }

    @Override // defpackage.h5
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.h5
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override // defpackage.h5
    public final void h() {
        this.e.l(this, this.h);
    }

    @Override // defpackage.h5
    public final boolean i() {
        return this.d.s;
    }

    @Override // defpackage.h5
    public final void j(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f = weakReference;
    }

    @Override // defpackage.h5
    public final void k(int i) {
        l(this.c.getString(i));
    }

    @Override // defpackage.h5
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.h5
    public final void m(int i) {
        n(this.c.getString(i));
    }

    @Override // defpackage.h5
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.h5
    public final void o(boolean z) {
        this.f2366b = z;
        this.d.setTitleOptional(z);
    }

    @Override // defpackage.hu1
    public final void u(ju1 ju1Var) {
        h();
        b5 b5Var = this.d.d;
        if (b5Var != null) {
            b5Var.l();
        }
    }
}
