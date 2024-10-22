package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;

/* loaded from: classes2.dex */
public abstract class sn extends Fragment implements aa0, f83 {

    /* renamed from: a, reason: collision with root package name */
    public df1 f4375a;

    /* renamed from: b, reason: collision with root package name */
    public View f4376b;
    public final a83 c;

    public sn() {
        this(0);
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
        return this.c;
    }

    @Override // defpackage.w73
    public final boolean h() {
        dn dnVar;
        l activity = getActivity();
        if (activity instanceof dn) {
            dnVar = (dn) activity;
        } else {
            dnVar = null;
        }
        boolean z = false;
        if (dnVar != null && dnVar.e) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.f83
    public final void j(TextView textView, int i) {
        fl.n(this, textView, i);
    }

    @Override // defpackage.f83
    public final void k(pn0 pn0Var) {
        fl.i(this, pn0Var, true);
    }

    public boolean m() {
        return !(this instanceof k02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        d83.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4375a = new gf1(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        df1 df1Var = this.f4375a;
        if (df1Var == null) {
            df1Var = null;
        }
        df1Var.c(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        d83.d(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f4376b = view;
        if (m()) {
            fl.g(this, view, 1000003);
        }
        t(view, bundle);
    }

    public void p(boolean z) {
        this.c.b(z);
    }

    @Override // defpackage.f83
    public final void q(ke1 ke1Var) {
        fl.k(this, ke1Var);
    }

    @Override // defpackage.f83
    public final void r(View view, boolean z) {
        fl.i(this, view, z);
    }

    public final View s(int i) {
        View view;
        if (i == -1 || (view = this.f4376b) == null) {
            return null;
        }
        return view.findViewById(i);
    }

    public abstract void t(View view, Bundle bundle);

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    @Override // defpackage.aa0
    public final t90 w() {
        df1 df1Var = this.f4375a;
        if (df1Var == null) {
            df1Var = null;
        }
        qi0 qi0Var = vl0.f4854a;
        yo1 yo1Var = zo1.f5522a;
        nf1 nf1Var = (nf1) df1Var;
        nf1Var.getClass();
        return fl.V(nf1Var, yo1Var);
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }

    public sn(int i) {
        super(0);
        this.c = new a83();
    }
}
