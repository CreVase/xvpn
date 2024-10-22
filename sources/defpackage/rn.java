package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.a;
import androidx.fragment.app.p;

/* loaded from: classes2.dex */
public abstract class rn extends md implements f83, aa0 {

    /* renamed from: a, reason: collision with root package name */
    public gf1 f4182a;

    /* renamed from: b, reason: collision with root package name */
    public final a83 f4183b = new a83();
    public v31 c;

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
        return this.f4183b;
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

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        d83.a(this);
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        v31 v31Var = this.c;
        if (v31Var != null) {
            v31Var.invoke();
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4182a = new gf1(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        gf1 gf1Var = this.f4182a;
        if (gf1Var == null) {
            gf1Var = null;
        }
        gf1Var.c(null);
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        d83.d(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        s(view, bundle);
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

    public abstract void s(View view, Bundle bundle);

    @Override // androidx.fragment.app.f
    public final void show(p pVar, String str) {
        if (pVar.M()) {
            try {
                super.show(pVar, str);
                return;
            } catch (Exception unused) {
                a aVar = new a(pVar);
                aVar.d(0, this, str, 1);
                if (!aVar.g) {
                    aVar.h = false;
                    aVar.q.y(aVar, true);
                    return;
                }
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        super.show(pVar, str);
    }

    @Override // androidx.fragment.app.f
    public final void showNow(p pVar, String str) {
        if (pVar.M()) {
            try {
                super.showNow(pVar, str);
                return;
            } catch (Exception unused) {
                a aVar = new a(pVar);
                aVar.d(0, this, str, 1);
                if (!aVar.g) {
                    aVar.h = false;
                    aVar.q.y(aVar, true);
                    return;
                }
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        super.showNow(pVar, str);
    }

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    @Override // defpackage.aa0
    public final t90 w() {
        gf1 gf1Var = this.f4182a;
        if (gf1Var == null) {
            gf1Var = null;
        }
        qi0 qi0Var = vl0.f4854a;
        yo1 yo1Var = zo1.f5522a;
        gf1Var.getClass();
        return fl.V(gf1Var, yo1Var);
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }
}
