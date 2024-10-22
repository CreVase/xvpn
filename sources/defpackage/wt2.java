package defpackage;

import a.du;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.AccountManagerActivity;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;

/* loaded from: classes2.dex */
public class wt2 extends sn implements x33 {
    public static final /* synthetic */ int f = 0;
    public e21 d;
    public boolean e = false;

    public static void z(wt2 wt2Var, Bundle bundle) {
        if (wt2Var.getActivity() != null && !((lt3) wt2Var.getActivity()).d) {
            wt2Var.d.o("");
            wt2Var.getActivity().setResult(-1);
            if (wt2Var.e && ew3.X()) {
                ya0.I(wt2Var.getActivity(), MainActivity.class);
            } else {
                ot3 ot3Var = ot3.c;
                if (!ot3Var.f3728b && ew3.X()) {
                    ya0.I(wt2Var.getActivity(), MainActivity.class);
                } else {
                    ot3Var.a(wt2Var.getActivity());
                }
                wt2Var.getActivity().finish();
            }
            Intent intent = new Intent("LoginSuccessAction");
            intent.putExtras(bundle);
            sm1.a(wt2Var.getActivity()).c(intent);
            if (wt2Var.getArguments() != null && wt2Var.getArguments().getBoolean("isFromGuide", false) && ew3.X()) {
                du.d(647, null);
            }
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
        int i = e21.z;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        e21 e21Var = (e21) tl3.i(layoutInflater, R.layout.fragment_sign_in, viewGroup, null);
        this.d = e21Var;
        return e21Var.e;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            y33.B().E(this);
            return;
        }
        e21 e21Var = this.d;
        if (e21Var != null) {
            e21Var.e.post(new rt2(this, 0));
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
        this.d.e.post(new rt2(this, 1));
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        final int i = 0;
        this.e = getActivity().getIntent().getBooleanExtra("isFromGuide", false);
        final int i2 = 1;
        this.d.p.addTextChangedListener(new u01(this, 1));
        m20.J(this.d.p);
        this.d.q.setOnFocusChangeListener(new t00(this, 4));
        this.d.o.setOnClickListener(new View.OnClickListener(this) { // from class: st2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wt2 f4411b;

            {
                this.f4411b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                wt2 wt2Var = this.f4411b;
                switch (i3) {
                    case 0:
                        wt2Var.d.o("");
                        wt2Var.d.p("");
                        String replaceAll = wt2Var.d.p.getText().toString().replaceAll("\\s+", "");
                        String obj = wt2Var.d.q.getText().toString();
                        ac2 r = ew3.r(replaceAll, obj, false);
                        if (!r.f55a) {
                            if (!r.f56b.isEmpty()) {
                                wt2Var.d.o(pd0.A(r.f56b));
                                uo.f(wt2Var.getActivity()).i(pd0.A(r.f56b));
                            }
                            if (!r.c.isEmpty()) {
                                wt2Var.d.p(pd0.A(r.c));
                                uo.f(wt2Var.getActivity()).i(pd0.A(r.c));
                                return;
                            }
                            return;
                        }
                        if (wt2Var.getActivity() != null && !((lt3) wt2Var.getActivity()).d) {
                            ((lt3) wt2Var.getActivity()).T();
                            ew3.b0(new ku(13, wt2Var, replaceAll, obj));
                            return;
                        }
                        return;
                    case 1:
                        int i4 = wt2.f;
                        ya0.H(wt2Var.getActivity(), ForgetPasswordActivity.class);
                        return;
                    default:
                        int i5 = wt2.f;
                        ((AccountManagerActivity) wt2Var.getActivity()).p.callOnClick();
                        return;
                }
            }
        });
        this.d.v.setOnClickListener(new View.OnClickListener(this) { // from class: st2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wt2 f4411b;

            {
                this.f4411b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                wt2 wt2Var = this.f4411b;
                switch (i3) {
                    case 0:
                        wt2Var.d.o("");
                        wt2Var.d.p("");
                        String replaceAll = wt2Var.d.p.getText().toString().replaceAll("\\s+", "");
                        String obj = wt2Var.d.q.getText().toString();
                        ac2 r = ew3.r(replaceAll, obj, false);
                        if (!r.f55a) {
                            if (!r.f56b.isEmpty()) {
                                wt2Var.d.o(pd0.A(r.f56b));
                                uo.f(wt2Var.getActivity()).i(pd0.A(r.f56b));
                            }
                            if (!r.c.isEmpty()) {
                                wt2Var.d.p(pd0.A(r.c));
                                uo.f(wt2Var.getActivity()).i(pd0.A(r.c));
                                return;
                            }
                            return;
                        }
                        if (wt2Var.getActivity() != null && !((lt3) wt2Var.getActivity()).d) {
                            ((lt3) wt2Var.getActivity()).T();
                            ew3.b0(new ku(13, wt2Var, replaceAll, obj));
                            return;
                        }
                        return;
                    case 1:
                        int i4 = wt2.f;
                        ya0.H(wt2Var.getActivity(), ForgetPasswordActivity.class);
                        return;
                    default:
                        int i5 = wt2.f;
                        ((AccountManagerActivity) wt2Var.getActivity()).p.callOnClick();
                        return;
                }
            }
        });
        final int i3 = 2;
        this.d.t.setOnClickListener(new View.OnClickListener(this) { // from class: st2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wt2 f4411b;

            {
                this.f4411b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i3;
                wt2 wt2Var = this.f4411b;
                switch (i32) {
                    case 0:
                        wt2Var.d.o("");
                        wt2Var.d.p("");
                        String replaceAll = wt2Var.d.p.getText().toString().replaceAll("\\s+", "");
                        String obj = wt2Var.d.q.getText().toString();
                        ac2 r = ew3.r(replaceAll, obj, false);
                        if (!r.f55a) {
                            if (!r.f56b.isEmpty()) {
                                wt2Var.d.o(pd0.A(r.f56b));
                                uo.f(wt2Var.getActivity()).i(pd0.A(r.f56b));
                            }
                            if (!r.c.isEmpty()) {
                                wt2Var.d.p(pd0.A(r.c));
                                uo.f(wt2Var.getActivity()).i(pd0.A(r.c));
                                return;
                            }
                            return;
                        }
                        if (wt2Var.getActivity() != null && !((lt3) wt2Var.getActivity()).d) {
                            ((lt3) wt2Var.getActivity()).T();
                            ew3.b0(new ku(13, wt2Var, replaceAll, obj));
                            return;
                        }
                        return;
                    case 1:
                        int i4 = wt2.f;
                        ya0.H(wt2Var.getActivity(), ForgetPasswordActivity.class);
                        return;
                    default:
                        int i5 = wt2.f;
                        ((AccountManagerActivity) wt2Var.getActivity()).p.callOnClick();
                        return;
                }
            }
        });
        fl.n(this, this.d.p, 1000013);
        fl.n(this, this.d.q, 1000013);
        Drawable L0 = t9.L0(getResources().getDrawable(R.drawable.ic_account_email));
        this.d.p.setCompoundDrawablesRelativeWithIntrinsicBounds(L0, (Drawable) null, (Drawable) null, (Drawable) null);
        fl.o(this, L0, 1000026);
        Drawable L02 = t9.L0(getResources().getDrawable(R.drawable.ic_signin_passworld));
        this.d.q.setCompoundDrawablesRelativeWithIntrinsicBounds(L02, (Drawable) null, (Drawable) null, (Drawable) null);
        fl.o(this, L02, 1000026);
        this.d.v.setBackground(v73.u(1000008));
        this.d.t.setBackground(v73.u(1000008));
        fl.j(this.d.v, this);
        fl.j(this.d.t, this);
        this.d.o.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
        fl.n(this, this.d.o, 1000117);
        if (zf3.R()) {
            this.d.p.setGravity(21);
            this.d.q.setGravity(21);
        }
    }
}
