package com.security.xvpn.z35kb.account;

import a.bx;
import a.du;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import com.security.xvpn.z35kb.widget.XEditText;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fd;
import defpackage.fl;
import defpackage.hw;
import defpackage.md0;
import defpackage.o5;
import defpackage.ot3;
import defpackage.p5;
import defpackage.sm1;
import defpackage.t9;
import defpackage.tf3;
import defpackage.tl3;
import defpackage.v3;
import defpackage.v73;
import defpackage.x30;
import defpackage.zf3;

/* loaded from: classes2.dex */
public class ChangePasswordActivity extends dn {
    public static final /* synthetic */ int q = 0;
    public o5 k;
    public x30 l;
    public boolean m;
    public String n = "";
    public String o = "";
    public final fd p = new fd(this, 10);

    @Override // defpackage.lt3
    public final String M() {
        return "ChangePasswordPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = o5.H;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        o5 o5Var = (o5) tl3.i(layoutInflater, R.layout.activity_change_password, null, null);
        this.k = o5Var;
        this.l = x30.a(o5Var.e);
        setContentView(this.k.e);
        if (zf3.R()) {
            this.k.t.setGravity(21);
            this.k.r.setGravity(21);
            this.k.s.setGravity(21);
        }
        final int i2 = 0;
        this.k.t.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: cw

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f1689b;

            {
                this.f1689b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i3 = i2;
                ChangePasswordActivity changePasswordActivity = this.f1689b;
                switch (i3) {
                    case 0:
                        if (z) {
                            changePasswordActivity.k.q("");
                            return;
                        } else {
                            int i4 = ChangePasswordActivity.q;
                            changePasswordActivity.getClass();
                            return;
                        }
                    default:
                        if (z) {
                            if (!"".equals(ew3.d(changePasswordActivity.k.r.getText().toString()).f5311a)) {
                                changePasswordActivity.k.p(pd0.y(R.string.PasswordTipsNotSupportCharacter));
                                return;
                            } else {
                                changePasswordActivity.k.p("");
                                return;
                            }
                        }
                        int i5 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        return;
                }
            }
        });
        final int i3 = 1;
        this.k.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: cw

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f1689b;

            {
                this.f1689b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i32 = i3;
                ChangePasswordActivity changePasswordActivity = this.f1689b;
                switch (i32) {
                    case 0:
                        if (z) {
                            changePasswordActivity.k.q("");
                            return;
                        } else {
                            int i4 = ChangePasswordActivity.q;
                            changePasswordActivity.getClass();
                            return;
                        }
                    default:
                        if (z) {
                            if (!"".equals(ew3.d(changePasswordActivity.k.r.getText().toString()).f5311a)) {
                                changePasswordActivity.k.p(pd0.y(R.string.PasswordTipsNotSupportCharacter));
                                return;
                            } else {
                                changePasswordActivity.k.p("");
                                return;
                            }
                        }
                        int i5 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        return;
                }
            }
        });
        this.k.r.addTextChangedListener(new hw(this, i2));
        this.k.s.addTextChangedListener(new hw(this, i3));
        this.k.t.c();
        this.k.r.c();
        this.k.s.c();
        this.k.v.setOnClickListener(new View.OnClickListener(this) { // from class: dw

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f1847b;

            {
                this.f1847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                String obj2;
                int i4 = i2;
                char c = 65535;
                ChangePasswordActivity changePasswordActivity = this.f1847b;
                switch (i4) {
                    case 0:
                        changePasswordActivity.k.p("");
                        changePasswordActivity.k.q("");
                        changePasswordActivity.k.o("");
                        String obj3 = changePasswordActivity.k.r.getText().toString();
                        if (changePasswordActivity.m) {
                            obj = changePasswordActivity.o;
                        } else {
                            obj = changePasswordActivity.k.t.getText().toString();
                        }
                        if (changePasswordActivity.m) {
                            obj2 = obj3;
                        } else {
                            obj2 = changePasswordActivity.k.s.getText().toString();
                        }
                        bx bxVar = new bx();
                        bxVar.z(obj);
                        bxVar.z(obj3);
                        bxVar.z(obj2);
                        du.d(115, bxVar);
                        String u = bxVar.u();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!u2.isEmpty()) {
                            String A = pd0.A(u2);
                            u.getClass();
                            switch (u.hashCode()) {
                                case 112:
                                    if (u.equals("p")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 3522:
                                    if (u.equals("np")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 113076:
                                    if (u.equals("rnp")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    changePasswordActivity.k.q(A);
                                    break;
                                case 1:
                                    if (u2.contains("must contain:")) {
                                        A = pd0.j(u2);
                                    }
                                    changePasswordActivity.k.p(A);
                                    break;
                                case 2:
                                    changePasswordActivity.k.o(A);
                                    break;
                            }
                            uo.f(changePasswordActivity.c).i(A);
                            return;
                        }
                        changePasswordActivity.T();
                        ew3.b0(new cq0(16, changePasswordActivity, obj, obj3));
                        return;
                    case 1:
                        o5 o5Var2 = changePasswordActivity.k;
                        if (o5Var2.G) {
                            o5Var2.p.callOnClick();
                            return;
                        } else {
                            changePasswordActivity.onBackPressed();
                            return;
                        }
                    case 2:
                        int i5 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        boolean X = ew3.X();
                        ot3 ot3Var = ot3.c;
                        if (X) {
                            ot3Var.f3727a = MainActivity.class;
                        }
                        ot3Var.a(changePasswordActivity.c);
                        changePasswordActivity.setResult(-1);
                        changePasswordActivity.finish();
                        return;
                    default:
                        int i6 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        ya0.H(changePasswordActivity, ForgetPasswordActivity.class);
                        return;
                }
            }
        });
        this.k.o.setOnClickListener(new View.OnClickListener(this) { // from class: dw

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f1847b;

            {
                this.f1847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                String obj2;
                int i4 = i3;
                char c = 65535;
                ChangePasswordActivity changePasswordActivity = this.f1847b;
                switch (i4) {
                    case 0:
                        changePasswordActivity.k.p("");
                        changePasswordActivity.k.q("");
                        changePasswordActivity.k.o("");
                        String obj3 = changePasswordActivity.k.r.getText().toString();
                        if (changePasswordActivity.m) {
                            obj = changePasswordActivity.o;
                        } else {
                            obj = changePasswordActivity.k.t.getText().toString();
                        }
                        if (changePasswordActivity.m) {
                            obj2 = obj3;
                        } else {
                            obj2 = changePasswordActivity.k.s.getText().toString();
                        }
                        bx bxVar = new bx();
                        bxVar.z(obj);
                        bxVar.z(obj3);
                        bxVar.z(obj2);
                        du.d(115, bxVar);
                        String u = bxVar.u();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!u2.isEmpty()) {
                            String A = pd0.A(u2);
                            u.getClass();
                            switch (u.hashCode()) {
                                case 112:
                                    if (u.equals("p")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 3522:
                                    if (u.equals("np")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 113076:
                                    if (u.equals("rnp")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    changePasswordActivity.k.q(A);
                                    break;
                                case 1:
                                    if (u2.contains("must contain:")) {
                                        A = pd0.j(u2);
                                    }
                                    changePasswordActivity.k.p(A);
                                    break;
                                case 2:
                                    changePasswordActivity.k.o(A);
                                    break;
                            }
                            uo.f(changePasswordActivity.c).i(A);
                            return;
                        }
                        changePasswordActivity.T();
                        ew3.b0(new cq0(16, changePasswordActivity, obj, obj3));
                        return;
                    case 1:
                        o5 o5Var2 = changePasswordActivity.k;
                        if (o5Var2.G) {
                            o5Var2.p.callOnClick();
                            return;
                        } else {
                            changePasswordActivity.onBackPressed();
                            return;
                        }
                    case 2:
                        int i5 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        boolean X = ew3.X();
                        ot3 ot3Var = ot3.c;
                        if (X) {
                            ot3Var.f3727a = MainActivity.class;
                        }
                        ot3Var.a(changePasswordActivity.c);
                        changePasswordActivity.setResult(-1);
                        changePasswordActivity.finish();
                        return;
                    default:
                        int i6 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        ya0.H(changePasswordActivity, ForgetPasswordActivity.class);
                        return;
                }
            }
        });
        final int i4 = 2;
        this.k.p.setOnClickListener(new View.OnClickListener(this) { // from class: dw

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f1847b;

            {
                this.f1847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                String obj2;
                int i42 = i4;
                char c = 65535;
                ChangePasswordActivity changePasswordActivity = this.f1847b;
                switch (i42) {
                    case 0:
                        changePasswordActivity.k.p("");
                        changePasswordActivity.k.q("");
                        changePasswordActivity.k.o("");
                        String obj3 = changePasswordActivity.k.r.getText().toString();
                        if (changePasswordActivity.m) {
                            obj = changePasswordActivity.o;
                        } else {
                            obj = changePasswordActivity.k.t.getText().toString();
                        }
                        if (changePasswordActivity.m) {
                            obj2 = obj3;
                        } else {
                            obj2 = changePasswordActivity.k.s.getText().toString();
                        }
                        bx bxVar = new bx();
                        bxVar.z(obj);
                        bxVar.z(obj3);
                        bxVar.z(obj2);
                        du.d(115, bxVar);
                        String u = bxVar.u();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!u2.isEmpty()) {
                            String A = pd0.A(u2);
                            u.getClass();
                            switch (u.hashCode()) {
                                case 112:
                                    if (u.equals("p")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 3522:
                                    if (u.equals("np")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 113076:
                                    if (u.equals("rnp")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    changePasswordActivity.k.q(A);
                                    break;
                                case 1:
                                    if (u2.contains("must contain:")) {
                                        A = pd0.j(u2);
                                    }
                                    changePasswordActivity.k.p(A);
                                    break;
                                case 2:
                                    changePasswordActivity.k.o(A);
                                    break;
                            }
                            uo.f(changePasswordActivity.c).i(A);
                            return;
                        }
                        changePasswordActivity.T();
                        ew3.b0(new cq0(16, changePasswordActivity, obj, obj3));
                        return;
                    case 1:
                        o5 o5Var2 = changePasswordActivity.k;
                        if (o5Var2.G) {
                            o5Var2.p.callOnClick();
                            return;
                        } else {
                            changePasswordActivity.onBackPressed();
                            return;
                        }
                    case 2:
                        int i5 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        boolean X = ew3.X();
                        ot3 ot3Var = ot3.c;
                        if (X) {
                            ot3Var.f3727a = MainActivity.class;
                        }
                        ot3Var.a(changePasswordActivity.c);
                        changePasswordActivity.setResult(-1);
                        changePasswordActivity.finish();
                        return;
                    default:
                        int i6 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        ya0.H(changePasswordActivity, ForgetPasswordActivity.class);
                        return;
                }
            }
        });
        boolean booleanExtra = getIntent().getBooleanExtra("INTENT_WITH_PASSWORD", false);
        this.m = booleanExtra;
        if (booleanExtra) {
            this.n = getIntent().getStringExtra("PARAMS_EMAIL");
            this.o = getIntent().getStringExtra("PARAMS_PASSWORD");
            p5 p5Var = (p5) this.k;
            p5Var.C = Boolean.TRUE;
            synchronized (p5Var) {
                p5Var.K |= 8;
            }
            p5Var.e(9);
            p5Var.m();
        } else {
            this.n = ew3.k().f4307a;
        }
        this.k.q.setBackground(new v3());
        bindInvalidate(this.k.q);
        Drawable L0 = t9.L0(getResources().getDrawable(R.drawable.ic_signin_passworld));
        XEditText xEditText = this.k.t;
        xEditText.setCompoundDrawablesRelativeWithIntrinsicBounds(L0, (Drawable) null, xEditText.getCompoundDrawablesRelative()[2], (Drawable) null);
        Drawable L02 = t9.L0(getResources().getDrawable(R.drawable.ic_new_pass));
        XEditText xEditText2 = this.k.r;
        xEditText2.setCompoundDrawablesRelativeWithIntrinsicBounds(L02, (Drawable) null, xEditText2.getCompoundDrawablesRelative()[2], (Drawable) null);
        XEditText xEditText3 = this.k.s;
        xEditText3.setCompoundDrawablesRelativeWithIntrinsicBounds(L02, (Drawable) null, xEditText3.getCompoundDrawablesRelative()[2], (Drawable) null);
        fl.o(this, L0, 1000136);
        fl.o(this, L02, 1000136);
        fl.n(this, this.k.t, 1000013);
        fl.n(this, this.k.r, 1000013);
        fl.n(this, this.k.s, 1000013);
        fl.n(this, this.k.B, 1000013);
        fl.n(this, this.k.x, 1000014);
        fl.n(this, (AppCompatTextView) this.l.d, 1000015);
        fl.n(this, (AppCompatTextView) this.l.e, 1000015);
        fl.n(this, this.k.v, 1000117);
        this.k.x.getPaint().setUnderlineText(true);
        final int i5 = 3;
        this.k.x.setOnClickListener(new View.OnClickListener(this) { // from class: dw

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f1847b;

            {
                this.f1847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                String obj2;
                int i42 = i5;
                char c = 65535;
                ChangePasswordActivity changePasswordActivity = this.f1847b;
                switch (i42) {
                    case 0:
                        changePasswordActivity.k.p("");
                        changePasswordActivity.k.q("");
                        changePasswordActivity.k.o("");
                        String obj3 = changePasswordActivity.k.r.getText().toString();
                        if (changePasswordActivity.m) {
                            obj = changePasswordActivity.o;
                        } else {
                            obj = changePasswordActivity.k.t.getText().toString();
                        }
                        if (changePasswordActivity.m) {
                            obj2 = obj3;
                        } else {
                            obj2 = changePasswordActivity.k.s.getText().toString();
                        }
                        bx bxVar = new bx();
                        bxVar.z(obj);
                        bxVar.z(obj3);
                        bxVar.z(obj2);
                        du.d(115, bxVar);
                        String u = bxVar.u();
                        String u2 = bxVar.u();
                        bxVar.h();
                        if (!u2.isEmpty()) {
                            String A = pd0.A(u2);
                            u.getClass();
                            switch (u.hashCode()) {
                                case 112:
                                    if (u.equals("p")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 3522:
                                    if (u.equals("np")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 113076:
                                    if (u.equals("rnp")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    changePasswordActivity.k.q(A);
                                    break;
                                case 1:
                                    if (u2.contains("must contain:")) {
                                        A = pd0.j(u2);
                                    }
                                    changePasswordActivity.k.p(A);
                                    break;
                                case 2:
                                    changePasswordActivity.k.o(A);
                                    break;
                            }
                            uo.f(changePasswordActivity.c).i(A);
                            return;
                        }
                        changePasswordActivity.T();
                        ew3.b0(new cq0(16, changePasswordActivity, obj, obj3));
                        return;
                    case 1:
                        o5 o5Var2 = changePasswordActivity.k;
                        if (o5Var2.G) {
                            o5Var2.p.callOnClick();
                            return;
                        } else {
                            changePasswordActivity.onBackPressed();
                            return;
                        }
                    case 2:
                        int i52 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        boolean X = ew3.X();
                        ot3 ot3Var = ot3.c;
                        if (X) {
                            ot3Var.f3727a = MainActivity.class;
                        }
                        ot3Var.a(changePasswordActivity.c);
                        changePasswordActivity.setResult(-1);
                        changePasswordActivity.finish();
                        return;
                    default:
                        int i6 = ChangePasswordActivity.q;
                        changePasswordActivity.getClass();
                        ya0.H(changePasswordActivity, ForgetPasswordActivity.class);
                        return;
                }
            }
        });
        this.k.p.setBackground(v73.v(24 * tf3.F, 1000116, 2));
        fl.n(this, this.k.p, 1000117);
        bindInvalidate(this.k.p);
        sm1.a(this).b(this.p, new IntentFilter("LoginSuccessAction"));
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.k.G) {
            ot3 ot3Var = ot3.c;
            ot3Var.f3727a = MainActivity.class;
            ot3Var.a(this.c);
            setResult(-1);
            finish();
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        sm1.a(this).d(this.p);
        super.onDestroy();
    }

    @Override // defpackage.dn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
    }
}
