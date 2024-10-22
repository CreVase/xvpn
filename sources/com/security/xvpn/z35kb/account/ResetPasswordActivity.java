package com.security.xvpn.z35kb.account;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.gms.common.Scopes;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ResetPasswordActivity;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fl;
import defpackage.m20;
import defpackage.md0;
import defpackage.ot3;
import defpackage.sm1;
import defpackage.t6;
import defpackage.t9;
import defpackage.tf3;
import defpackage.tl3;
import defpackage.v3;
import defpackage.v73;
import defpackage.x30;
import defpackage.xn2;
import defpackage.ya0;
import defpackage.zf3;

/* loaded from: classes2.dex */
public final class ResetPasswordActivity extends dn {
    public static final /* synthetic */ int o = 0;
    public t6 k;
    public x30 l;
    public String m = "";
    public String n = "";

    @Override // defpackage.lt3
    public final String M() {
        return "ResetPasswordPage";
    }

    @Override // defpackage.lt3
    public final void N() {
        if (!this.d && !isFinishing()) {
            super.N();
        }
    }

    @Override // defpackage.lt3
    public final void R() {
        String stringExtra = getIntent().getStringExtra(Scopes.EMAIL);
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.n = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("code");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.m = str;
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = t6.C;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        this.k = (t6) tl3.i(layoutInflater, R.layout.activity_reset_password, null, null);
        this.l = x30.a(a0().e);
        setContentView(a0().e);
        if (!ew3.o()) {
            m20.Y0(a0().z);
        }
        final int i2 = 0;
        a0().q.setOnClickListener(new View.OnClickListener(this) { // from class: tj2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetPasswordActivity f4517b;

            {
                this.f4517b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ResetPasswordActivity resetPasswordActivity = this.f4517b;
                switch (i3) {
                    case 0:
                        int i4 = ResetPasswordActivity.o;
                        bx3.G(resetPasswordActivity.c, true, null);
                        return;
                    case 1:
                        int i5 = ResetPasswordActivity.o;
                        resetPasswordActivity.Z();
                        return;
                    case 2:
                        int i6 = ResetPasswordActivity.o;
                        resetPasswordActivity.onBackPressed();
                        return;
                    default:
                        int i7 = ResetPasswordActivity.o;
                        ei2 ei2Var = new ei2();
                        ei2Var.f1938a = String.valueOf(resetPasswordActivity.a0().s.getText());
                        resetPasswordActivity.a0().o("");
                        y51 y51Var = y51.f5272a;
                        qi0 qi0Var = vl0.f4854a;
                        zf3.T(y51Var, zo1.f5522a, new vj2(resetPasswordActivity, ei2Var, null), 2);
                        return;
                }
            }
        });
        final int i3 = 1;
        a0().p.setOnClickListener(new View.OnClickListener(this) { // from class: tj2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetPasswordActivity f4517b;

            {
                this.f4517b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                ResetPasswordActivity resetPasswordActivity = this.f4517b;
                switch (i32) {
                    case 0:
                        int i4 = ResetPasswordActivity.o;
                        bx3.G(resetPasswordActivity.c, true, null);
                        return;
                    case 1:
                        int i5 = ResetPasswordActivity.o;
                        resetPasswordActivity.Z();
                        return;
                    case 2:
                        int i6 = ResetPasswordActivity.o;
                        resetPasswordActivity.onBackPressed();
                        return;
                    default:
                        int i7 = ResetPasswordActivity.o;
                        ei2 ei2Var = new ei2();
                        ei2Var.f1938a = String.valueOf(resetPasswordActivity.a0().s.getText());
                        resetPasswordActivity.a0().o("");
                        y51 y51Var = y51.f5272a;
                        qi0 qi0Var = vl0.f4854a;
                        zf3.T(y51Var, zo1.f5522a, new vj2(resetPasswordActivity, ei2Var, null), 2);
                        return;
                }
            }
        });
        final int i4 = 2;
        a0().o.setOnClickListener(new View.OnClickListener(this) { // from class: tj2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetPasswordActivity f4517b;

            {
                this.f4517b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                ResetPasswordActivity resetPasswordActivity = this.f4517b;
                switch (i32) {
                    case 0:
                        int i42 = ResetPasswordActivity.o;
                        bx3.G(resetPasswordActivity.c, true, null);
                        return;
                    case 1:
                        int i5 = ResetPasswordActivity.o;
                        resetPasswordActivity.Z();
                        return;
                    case 2:
                        int i6 = ResetPasswordActivity.o;
                        resetPasswordActivity.onBackPressed();
                        return;
                    default:
                        int i7 = ResetPasswordActivity.o;
                        ei2 ei2Var = new ei2();
                        ei2Var.f1938a = String.valueOf(resetPasswordActivity.a0().s.getText());
                        resetPasswordActivity.a0().o("");
                        y51 y51Var = y51.f5272a;
                        qi0 qi0Var = vl0.f4854a;
                        zf3.T(y51Var, zo1.f5522a, new vj2(resetPasswordActivity, ei2Var, null), 2);
                        return;
                }
            }
        });
        final int i5 = 3;
        a0().u.setOnClickListener(new View.OnClickListener(this) { // from class: tj2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetPasswordActivity f4517b;

            {
                this.f4517b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i5;
                ResetPasswordActivity resetPasswordActivity = this.f4517b;
                switch (i32) {
                    case 0:
                        int i42 = ResetPasswordActivity.o;
                        bx3.G(resetPasswordActivity.c, true, null);
                        return;
                    case 1:
                        int i52 = ResetPasswordActivity.o;
                        resetPasswordActivity.Z();
                        return;
                    case 2:
                        int i6 = ResetPasswordActivity.o;
                        resetPasswordActivity.onBackPressed();
                        return;
                    default:
                        int i7 = ResetPasswordActivity.o;
                        ei2 ei2Var = new ei2();
                        ei2Var.f1938a = String.valueOf(resetPasswordActivity.a0().s.getText());
                        resetPasswordActivity.a0().o("");
                        y51 y51Var = y51.f5272a;
                        qi0 qi0Var = vl0.f4854a;
                        zf3.T(y51Var, zo1.f5522a, new vj2(resetPasswordActivity, ei2Var, null), 2);
                        return;
                }
            }
        });
        a0().s.addTextChangedListener(new xn2(this, i4));
        if (zf3.R()) {
            a0().s.setGravity(21);
        }
        a0().s.c();
        a0().r.setBackground(new v3());
        bindInvalidate(a0().r);
        fl.n(this, a0().x, 1000015);
        fl.n(this, a0().s, 1000013);
        fl.n(this, a0().y, 1000013);
        Drawable L0 = t9.L0(getResources().getDrawable(R.drawable.ic_signin_passworld));
        a0().s.setCompoundDrawablesRelativeWithIntrinsicBounds(L0, (Drawable) null, a0().s.getCompoundDrawablesRelative()[2], (Drawable) null);
        fl.o(this, L0, 1000026);
        fl.n(this, (AppCompatTextView) b0().d, 1000015);
        fl.n(this, (AppCompatTextView) b0().e, 1000015);
        fl.n(this, a0().u, 1000117);
        a0().p.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
        fl.n(this, a0().p, 1000117);
    }

    @Override // defpackage.lt3
    public final void T() {
        if (!this.d && !isFinishing()) {
            super.T();
        }
    }

    public final void Z() {
        if (ew3.X() || ot3.c.f3728b) {
            sm1.a(this).c(new Intent("LoginSuccessAction"));
            ya0.I(this.c, MainActivity.class);
        }
        finish();
    }

    public final t6 a0() {
        t6 t6Var = this.k;
        if (t6Var != null) {
            return t6Var;
        }
        return null;
    }

    public final x30 b0() {
        x30 x30Var = this.l;
        if (x30Var != null) {
            return x30Var;
        }
        return null;
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (a0().B) {
            Z();
        } else {
            super.onBackPressed();
        }
    }
}
