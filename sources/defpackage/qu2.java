package defpackage;

import a.du;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.AccountManagerActivity;

/* loaded from: classes2.dex */
public class qu2 extends sn implements x33 {
    public static String h;
    public static String i;
    public static String j;
    public g21 d;
    public x30 e;
    public boolean f;
    public boolean g = false;

    public static void z(qu2 qu2Var, Bundle bundle) {
        qu2Var.getClass();
        rt3.e().i(true, ew3.X());
        if (qu2Var.getActivity() != null && !((lt3) qu2Var.getActivity()).d) {
            if (qu2Var.f) {
                du.d(264, null);
            }
            du.d(261, null);
            qu2Var.d.o("");
            qu2Var.getActivity().setResult(-1);
            if (qu2Var.g && ew3.X()) {
                ya0.I(qu2Var.getActivity(), MainActivity.class);
            } else {
                ot3 ot3Var = ot3.c;
                if (!ot3Var.f3728b && ew3.X()) {
                    ya0.I(qu2Var.getActivity(), MainActivity.class);
                } else {
                    ot3Var.a(qu2Var.getActivity());
                }
                qu2Var.getActivity().finish();
            }
            Intent intent = new Intent("LoginSuccessAction");
            intent.putExtras(bundle);
            sm1.a(qu2Var.getActivity()).c(intent);
        }
    }

    @Override // defpackage.x33
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.x33
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // defpackage.x33
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.x33
    public final /* synthetic */ void o() {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = g21.B;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        g21 g21Var = (g21) tl3.i(layoutInflater, R.layout.fragment_sign_up, viewGroup, null);
        this.d = g21Var;
        this.e = x30.a(g21Var.e);
        return this.d.e;
    }

    @Override // defpackage.sn, androidx.fragment.app.Fragment
    public final void onDestroy() {
        h = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            y33.B().E(this);
            return;
        }
        g21 g21Var = this.d;
        if (g21Var != null) {
            g21Var.e.post(new nu2(this, 1));
        }
        y33.B().i(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.d.e.post(new nu2(this, 0));
    }

    @Override // defpackage.sn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        final int i2 = 0;
        this.g = getActivity().getIntent().getBooleanExtra("isFromGuide", false);
        if (getArguments() != null) {
            this.f = getArguments().getBoolean("IS_FROM_PURCHASE", false);
        }
        SpannableString spannableString = new SpannableString(pd0.y(R.string.SignUpPrivacyPolicy));
        j73 k = bx3.k(false);
        j73 l = bx3.l(false);
        final int i3 = 1;
        bx3.i(spannableString, k.f2717a, k.f2718b);
        bx3.i(spannableString, l.f2717a, l.f2718b);
        this.d.y.setText(spannableString);
        this.d.y.setMovementMethod(LinkMovementMethod.getInstance());
        this.d.p.addTextChangedListener(new pu2(this, 0));
        m20.J(this.d.p);
        this.d.q.setOnFocusChangeListener(new t00(this, 5));
        this.d.q.addTextChangedListener(new pu2(this, 1));
        this.d.q.c();
        this.d.v.setOnClickListener(new View.OnClickListener(this) { // from class: ou2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qu2 f3734b;

            {
                this.f3734b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i2;
                qu2 qu2Var = this.f3734b;
                switch (i4) {
                    case 0:
                        String str = qu2.h;
                        ((AccountManagerActivity) qu2Var.getActivity()).q.callOnClick();
                        return;
                    default:
                        qu2Var.d.o("");
                        qu2Var.d.p("");
                        qu2.h = null;
                        String replaceAll = qu2Var.d.p.getText().toString().replaceAll("\\s+", "");
                        String obj = qu2Var.d.q.getText().toString();
                        qu2.i = replaceAll;
                        qu2.j = obj;
                        ac2 r = ew3.r(replaceAll, obj, true);
                        if (!r.f55a) {
                            if (!r.f56b.isEmpty()) {
                                qu2Var.d.o(pd0.A(r.f56b));
                                uo.f(qu2Var.getActivity()).i(pd0.A(r.f56b));
                            }
                            if (r.c.contains("must contain:")) {
                                String j2 = pd0.j(r.c);
                                qu2Var.d.p(j2);
                                uo.f(qu2Var.getActivity()).i(j2);
                                return;
                            } else {
                                if (!r.c.isEmpty()) {
                                    qu2Var.d.p(pd0.A(r.c));
                                    uo.f(qu2Var.getActivity()).i(pd0.A(r.c));
                                    return;
                                }
                                return;
                            }
                        }
                        if (qu2Var.getActivity() != null && !((lt3) qu2Var.getActivity()).d) {
                            ((lt3) qu2Var.getActivity()).T();
                            ew3.b0(new ku(14, qu2Var, replaceAll, obj));
                            return;
                        }
                        return;
                }
            }
        });
        this.d.o.setOnClickListener(new View.OnClickListener(this) { // from class: ou2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qu2 f3734b;

            {
                this.f3734b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                qu2 qu2Var = this.f3734b;
                switch (i4) {
                    case 0:
                        String str = qu2.h;
                        ((AccountManagerActivity) qu2Var.getActivity()).q.callOnClick();
                        return;
                    default:
                        qu2Var.d.o("");
                        qu2Var.d.p("");
                        qu2.h = null;
                        String replaceAll = qu2Var.d.p.getText().toString().replaceAll("\\s+", "");
                        String obj = qu2Var.d.q.getText().toString();
                        qu2.i = replaceAll;
                        qu2.j = obj;
                        ac2 r = ew3.r(replaceAll, obj, true);
                        if (!r.f55a) {
                            if (!r.f56b.isEmpty()) {
                                qu2Var.d.o(pd0.A(r.f56b));
                                uo.f(qu2Var.getActivity()).i(pd0.A(r.f56b));
                            }
                            if (r.c.contains("must contain:")) {
                                String j2 = pd0.j(r.c);
                                qu2Var.d.p(j2);
                                uo.f(qu2Var.getActivity()).i(j2);
                                return;
                            } else {
                                if (!r.c.isEmpty()) {
                                    qu2Var.d.p(pd0.A(r.c));
                                    uo.f(qu2Var.getActivity()).i(pd0.A(r.c));
                                    return;
                                }
                                return;
                            }
                        }
                        if (qu2Var.getActivity() != null && !((lt3) qu2Var.getActivity()).d) {
                            ((lt3) qu2Var.getActivity()).T();
                            ew3.b0(new ku(14, qu2Var, replaceAll, obj));
                            return;
                        }
                        return;
                }
            }
        });
        fl.n(this, this.d.p, 1000013);
        fl.n(this, this.d.q, 1000013);
        fl.n(this, this.d.u, 1000014);
        fl.n(this, this.d.y, 1000015);
        fl.m(this, this.d.y, 1000015);
        Drawable L0 = t9.L0(getResources().getDrawable(R.drawable.ic_signup_passworld));
        this.d.q.setCompoundDrawablesRelativeWithIntrinsicBounds(L0, (Drawable) null, this.d.q.getCompoundDrawablesRelative()[2], (Drawable) null);
        fl.o(this, L0, 1000026);
        fl.n(this, this.d.o, 1000117);
        fl.n(this, (AppCompatTextView) this.e.d, 1000015);
        fl.n(this, (AppCompatTextView) this.e.e, 1000015);
        if (zf3.R()) {
            this.d.p.setGravity(21);
            this.d.q.setGravity(21);
        }
    }
}
