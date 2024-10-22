package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import b.ContentWrapper;

/* loaded from: classes2.dex */
public abstract class qn extends ld implements f83 {
    public final k43 f;
    public boolean g;
    public boolean h;
    public final a83 i;

    public qn(Context context, int i) {
        super(context, i);
        this.f = new k43(new yy2(context, 7));
        this.i = new a83();
    }

    @Override // defpackage.f83
    public final void addThemeInvalidateListener(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final void bindInvalidate(View view) {
        fl.j(view, this);
    }

    public abstract String f();

    public boolean g() {
        return this.g;
    }

    @Override // defpackage.f83
    public final a83 getThemeListeners() {
        return this.i;
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

    @Override // defpackage.ld, defpackage.t30, android.app.Dialog
    public void onCreate(Bundle bundle) {
        s71 xq3Var;
        super.onCreate(bundle);
        Window window = getWindow();
        v51 v51Var = new v51(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            xq3Var = new ar3(window, v51Var);
        } else if (i >= 26) {
            xq3Var = new zq3(window, v51Var);
        } else if (i >= 23) {
            xq3Var = new yq3(window, v51Var);
        } else {
            xq3Var = new xq3(window, v51Var);
        }
        xq3Var.n(g());
        xq3Var.m(this.h);
        xq3Var.r(7);
        Window window2 = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            up3.a(window2, false);
        } else {
            tp3.a(window2, false);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.addFlags(Integer.MIN_VALUE);
            window3.setStatusBarColor(0);
            window3.setNavigationBarColor(0);
        }
    }

    @Override // defpackage.t30, android.app.Dialog
    public void onStart() {
        super.onStart();
        ew3.L0("UiOpenPage", f());
        d83.a(this);
    }

    @Override // defpackage.ld, defpackage.t30, android.app.Dialog
    public void onStop() {
        super.onStop();
        d83.d(this);
    }

    public void p(boolean z) {
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

    @Override // defpackage.ld, defpackage.t30, android.app.Dialog
    public final void setContentView(View view) {
        k43 k43Var = this.f;
        ((ContentWrapper) k43Var.getValue()).removeAllViews();
        ((ContentWrapper) k43Var.getValue()).addView(view);
        super.setContentView((ContentWrapper) k43Var.getValue());
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
