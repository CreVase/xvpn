package com.security.xvpn.z35kb.account;

import a.bx;
import a.du;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.account.AccountManagerActivity;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fd;
import defpackage.fl;
import defpackage.g6;
import defpackage.md0;
import defpackage.sm1;
import defpackage.t00;
import defpackage.t9;
import defpackage.tf3;
import defpackage.tl3;
import defpackage.u01;
import defpackage.v01;
import defpackage.v3;
import defpackage.v73;
import defpackage.zf3;

/* loaded from: classes2.dex */
public class ForgetPasswordActivity extends dn {
    public static final /* synthetic */ int q = 0;
    public EditText k;
    public View l;
    public View m;
    public v01 n;
    public g6 o;
    public final fd p = new fd(this, 11);

    @Override // defpackage.lt3
    public final String M() {
        return "ChangePasswordPage";
    }

    @Override // defpackage.lt3
    public final void N() {
        if (!this.d && !isFinishing()) {
            super.N();
        }
    }

    @Override // defpackage.lt3
    public final void R() {
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = g6.A;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        g6 g6Var = (g6) tl3.i(layoutInflater, R.layout.activity_forget_password, null, null);
        this.o = g6Var;
        setContentView(g6Var.e);
        this.l = findViewById(R.id.submit_btn);
        this.m = findViewById(R.id.click_to_sign_in);
        this.k = (EditText) findViewById(R.id.etEmail);
        final int i2 = 0;
        if (ew3.o()) {
            this.o.x.setVisibility(8);
            this.k.setText(ew3.k().f4307a);
            this.k.setFocusable(false);
            this.k.setFocusableInTouchMode(false);
        }
        this.k.addTextChangedListener(new u01(this, 0));
        this.m.setOnClickListener(new View.OnClickListener(this) { // from class: t01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgetPasswordActivity f4436b;

            {
                this.f4436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ForgetPasswordActivity forgetPasswordActivity = this.f4436b;
                switch (i3) {
                    case 0:
                        int i4 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.getClass();
                        Intent intent = new Intent(forgetPasswordActivity, (Class<?>) AccountManagerActivity.class);
                        intent.setFlags(69206016);
                        intent.putExtra("isSignIn", true);
                        forgetPasswordActivity.startActivity(intent);
                        return;
                    case 1:
                        forgetPasswordActivity.o.p("");
                        forgetPasswordActivity.o.o("");
                        String replaceAll = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        String replaceAll2 = forgetPasswordActivity.o.r.getText().toString().replaceAll("\\s+", "");
                        bx bxVar = new bx();
                        bxVar.z(replaceAll);
                        bxVar.z(replaceAll2);
                        du.d(103, bxVar);
                        boolean q2 = bxVar.q();
                        String u = bxVar.u();
                        bxVar.u();
                        bxVar.t();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!q2) {
                            if (!u.isEmpty()) {
                                forgetPasswordActivity.o.p(pd0.A(u));
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u));
                            }
                            if (!u2.isEmpty()) {
                                forgetPasswordActivity.o.o(pd0.A(u2));
                                forgetPasswordActivity.o.v.setTextColor(-52378);
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u2));
                                return;
                            }
                            return;
                        }
                        forgetPasswordActivity.T();
                        ew3.b0(new ku(12, forgetPasswordActivity, replaceAll, replaceAll2));
                        return;
                    case 2:
                        forgetPasswordActivity.o.p("");
                        String replaceAll3 = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        if (replaceAll3.isEmpty()) {
                            forgetPasswordActivity.o.p(pd0.y(R.string.AccountErrorInputEmail));
                            uo.f(forgetPasswordActivity.c).i(pd0.y(R.string.AccountErrorInputEmail));
                            return;
                        }
                        forgetPasswordActivity.o.w.setEnabled(false);
                        v01 v01Var = forgetPasswordActivity.n;
                        if (v01Var != null) {
                            v01Var.cancel();
                            forgetPasswordActivity.n = null;
                        }
                        v01 v01Var2 = new v01(forgetPasswordActivity, 60000);
                        forgetPasswordActivity.n = v01Var2;
                        v01Var2.start();
                        forgetPasswordActivity.U(pd0.y(R.string.LoadingMailSend));
                        forgetPasswordActivity.o.v.setTextColor(-13982994);
                        ew3.b0(new to1(5, forgetPasswordActivity, replaceAll3));
                        return;
                    default:
                        int i5 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.onBackPressed();
                        return;
                }
            }
        });
        final int i3 = 1;
        this.l.setOnClickListener(new View.OnClickListener(this) { // from class: t01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgetPasswordActivity f4436b;

            {
                this.f4436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                ForgetPasswordActivity forgetPasswordActivity = this.f4436b;
                switch (i32) {
                    case 0:
                        int i4 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.getClass();
                        Intent intent = new Intent(forgetPasswordActivity, (Class<?>) AccountManagerActivity.class);
                        intent.setFlags(69206016);
                        intent.putExtra("isSignIn", true);
                        forgetPasswordActivity.startActivity(intent);
                        return;
                    case 1:
                        forgetPasswordActivity.o.p("");
                        forgetPasswordActivity.o.o("");
                        String replaceAll = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        String replaceAll2 = forgetPasswordActivity.o.r.getText().toString().replaceAll("\\s+", "");
                        bx bxVar = new bx();
                        bxVar.z(replaceAll);
                        bxVar.z(replaceAll2);
                        du.d(103, bxVar);
                        boolean q2 = bxVar.q();
                        String u = bxVar.u();
                        bxVar.u();
                        bxVar.t();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!q2) {
                            if (!u.isEmpty()) {
                                forgetPasswordActivity.o.p(pd0.A(u));
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u));
                            }
                            if (!u2.isEmpty()) {
                                forgetPasswordActivity.o.o(pd0.A(u2));
                                forgetPasswordActivity.o.v.setTextColor(-52378);
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u2));
                                return;
                            }
                            return;
                        }
                        forgetPasswordActivity.T();
                        ew3.b0(new ku(12, forgetPasswordActivity, replaceAll, replaceAll2));
                        return;
                    case 2:
                        forgetPasswordActivity.o.p("");
                        String replaceAll3 = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        if (replaceAll3.isEmpty()) {
                            forgetPasswordActivity.o.p(pd0.y(R.string.AccountErrorInputEmail));
                            uo.f(forgetPasswordActivity.c).i(pd0.y(R.string.AccountErrorInputEmail));
                            return;
                        }
                        forgetPasswordActivity.o.w.setEnabled(false);
                        v01 v01Var = forgetPasswordActivity.n;
                        if (v01Var != null) {
                            v01Var.cancel();
                            forgetPasswordActivity.n = null;
                        }
                        v01 v01Var2 = new v01(forgetPasswordActivity, 60000);
                        forgetPasswordActivity.n = v01Var2;
                        v01Var2.start();
                        forgetPasswordActivity.U(pd0.y(R.string.LoadingMailSend));
                        forgetPasswordActivity.o.v.setTextColor(-13982994);
                        ew3.b0(new to1(5, forgetPasswordActivity, replaceAll3));
                        return;
                    default:
                        int i5 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.onBackPressed();
                        return;
                }
            }
        });
        if (XApplication.c) {
            this.o.q.setBackgroundResource(R.drawable.bg_sign_edittext_selector);
        }
        final int i4 = 3;
        this.o.r.setOnFocusChangeListener(new t00(this, i4));
        final int i5 = 2;
        this.o.w.setOnClickListener(new View.OnClickListener(this) { // from class: t01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgetPasswordActivity f4436b;

            {
                this.f4436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i5;
                ForgetPasswordActivity forgetPasswordActivity = this.f4436b;
                switch (i32) {
                    case 0:
                        int i42 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.getClass();
                        Intent intent = new Intent(forgetPasswordActivity, (Class<?>) AccountManagerActivity.class);
                        intent.setFlags(69206016);
                        intent.putExtra("isSignIn", true);
                        forgetPasswordActivity.startActivity(intent);
                        return;
                    case 1:
                        forgetPasswordActivity.o.p("");
                        forgetPasswordActivity.o.o("");
                        String replaceAll = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        String replaceAll2 = forgetPasswordActivity.o.r.getText().toString().replaceAll("\\s+", "");
                        bx bxVar = new bx();
                        bxVar.z(replaceAll);
                        bxVar.z(replaceAll2);
                        du.d(103, bxVar);
                        boolean q2 = bxVar.q();
                        String u = bxVar.u();
                        bxVar.u();
                        bxVar.t();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!q2) {
                            if (!u.isEmpty()) {
                                forgetPasswordActivity.o.p(pd0.A(u));
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u));
                            }
                            if (!u2.isEmpty()) {
                                forgetPasswordActivity.o.o(pd0.A(u2));
                                forgetPasswordActivity.o.v.setTextColor(-52378);
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u2));
                                return;
                            }
                            return;
                        }
                        forgetPasswordActivity.T();
                        ew3.b0(new ku(12, forgetPasswordActivity, replaceAll, replaceAll2));
                        return;
                    case 2:
                        forgetPasswordActivity.o.p("");
                        String replaceAll3 = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        if (replaceAll3.isEmpty()) {
                            forgetPasswordActivity.o.p(pd0.y(R.string.AccountErrorInputEmail));
                            uo.f(forgetPasswordActivity.c).i(pd0.y(R.string.AccountErrorInputEmail));
                            return;
                        }
                        forgetPasswordActivity.o.w.setEnabled(false);
                        v01 v01Var = forgetPasswordActivity.n;
                        if (v01Var != null) {
                            v01Var.cancel();
                            forgetPasswordActivity.n = null;
                        }
                        v01 v01Var2 = new v01(forgetPasswordActivity, 60000);
                        forgetPasswordActivity.n = v01Var2;
                        v01Var2.start();
                        forgetPasswordActivity.U(pd0.y(R.string.LoadingMailSend));
                        forgetPasswordActivity.o.v.setTextColor(-13982994);
                        ew3.b0(new to1(5, forgetPasswordActivity, replaceAll3));
                        return;
                    default:
                        int i52 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.onBackPressed();
                        return;
                }
            }
        });
        this.o.v.setTextColor(-52378);
        this.o.o.setOnClickListener(new View.OnClickListener(this) { // from class: t01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgetPasswordActivity f4436b;

            {
                this.f4436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                ForgetPasswordActivity forgetPasswordActivity = this.f4436b;
                switch (i32) {
                    case 0:
                        int i42 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.getClass();
                        Intent intent = new Intent(forgetPasswordActivity, (Class<?>) AccountManagerActivity.class);
                        intent.setFlags(69206016);
                        intent.putExtra("isSignIn", true);
                        forgetPasswordActivity.startActivity(intent);
                        return;
                    case 1:
                        forgetPasswordActivity.o.p("");
                        forgetPasswordActivity.o.o("");
                        String replaceAll = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        String replaceAll2 = forgetPasswordActivity.o.r.getText().toString().replaceAll("\\s+", "");
                        bx bxVar = new bx();
                        bxVar.z(replaceAll);
                        bxVar.z(replaceAll2);
                        du.d(103, bxVar);
                        boolean q2 = bxVar.q();
                        String u = bxVar.u();
                        bxVar.u();
                        bxVar.t();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!q2) {
                            if (!u.isEmpty()) {
                                forgetPasswordActivity.o.p(pd0.A(u));
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u));
                            }
                            if (!u2.isEmpty()) {
                                forgetPasswordActivity.o.o(pd0.A(u2));
                                forgetPasswordActivity.o.v.setTextColor(-52378);
                                uo.f(forgetPasswordActivity.c).i(pd0.A(u2));
                                return;
                            }
                            return;
                        }
                        forgetPasswordActivity.T();
                        ew3.b0(new ku(12, forgetPasswordActivity, replaceAll, replaceAll2));
                        return;
                    case 2:
                        forgetPasswordActivity.o.p("");
                        String replaceAll3 = forgetPasswordActivity.k.getText().toString().replaceAll("\\s+", "");
                        if (replaceAll3.isEmpty()) {
                            forgetPasswordActivity.o.p(pd0.y(R.string.AccountErrorInputEmail));
                            uo.f(forgetPasswordActivity.c).i(pd0.y(R.string.AccountErrorInputEmail));
                            return;
                        }
                        forgetPasswordActivity.o.w.setEnabled(false);
                        v01 v01Var = forgetPasswordActivity.n;
                        if (v01Var != null) {
                            v01Var.cancel();
                            forgetPasswordActivity.n = null;
                        }
                        v01 v01Var2 = new v01(forgetPasswordActivity, 60000);
                        forgetPasswordActivity.n = v01Var2;
                        v01Var2.start();
                        forgetPasswordActivity.U(pd0.y(R.string.LoadingMailSend));
                        forgetPasswordActivity.o.v.setTextColor(-13982994);
                        ew3.b0(new to1(5, forgetPasswordActivity, replaceAll3));
                        return;
                    default:
                        int i52 = ForgetPasswordActivity.q;
                        forgetPasswordActivity.onBackPressed();
                        return;
                }
            }
        });
        this.o.p.setBackground(new v3());
        bindInvalidate(this.o.p);
        fl.n(this, this.o.q, 1000013);
        fl.n(this, this.o.r, 1000013);
        Drawable L0 = t9.L0(getResources().getDrawable(R.drawable.ic_account_email));
        this.o.q.setCompoundDrawablesRelativeWithIntrinsicBounds(L0, (Drawable) null, (Drawable) null, (Drawable) null);
        fl.o(this, L0, 1000026);
        Drawable L02 = t9.L0(getResources().getDrawable(R.drawable.ic_account_verification_code));
        this.o.r.setCompoundDrawablesRelativeWithIntrinsicBounds(L02, (Drawable) null, (Drawable) null, (Drawable) null);
        fl.o(this, L02, 1000026);
        this.o.t.setBackground(v73.v(24 * tf3.F, 1000116, 2));
        fl.n(this, this.o.t, 1000117);
        bindInvalidate(this.o.t);
        if (zf3.R()) {
            this.o.q.setGravity(21);
            this.o.r.setGravity(21);
        }
        sm1.a(this).b(this.p, new IntentFilter("LoginSuccessAction"));
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        sm1.a(this).d(this.p);
        super.onDestroy();
        v01 v01Var = this.n;
        if (v01Var != null) {
            v01Var.cancel();
            this.n = null;
        }
    }
}
