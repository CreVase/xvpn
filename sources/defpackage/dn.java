package defpackage;

import a.bx;
import a.du;
import a.wcyybbcujkCs;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.view.a;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class dn extends lt3 implements pt3, f83, aa0 {
    public final /* synthetic */ z80 h = pd0.e();
    public final a83 i = new a83();
    public boolean j;

    public void C(String str) {
        boolean z;
        if (str != null && !this.j && h50.f2368b && !i23.b1(str) && !isFinishing() && !m20.L(str, "3np35e9gyq cancelled")) {
            final int i = 0;
            final int i2 = 1;
            if (!i23.R0(str, "NoVpnConnectPermission", false) && !i23.R0(str, "permission denied", false)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                h50.d(this, 2, "");
                return;
            }
            if (!fl.I()) {
                h50.d(this, 4, "");
                return;
            }
            if (bx3.F(str)) {
                h50.d(this, 0, str);
                return;
            }
            if (i23.R0(str, "You Have No Data Transfer", false)) {
                if (m20.A0()) {
                    r9 g0 = ya0.g0(this, 1);
                    g0.z(new e50(this, 0));
                    h50.a(this, g0);
                    return;
                } else {
                    if (!ew3.U()) {
                        du.d(333, null);
                        r9 u0 = t9.u0(this, new g50(this, i2));
                        u0.z(new e50(this, 1));
                        h50.a(this, u0);
                        return;
                    }
                    return;
                }
            }
            if (i23.R0(str, "For policy reasons", false)) {
                h50.d(this, 3, "");
                return;
            }
            if (bx3.D(str)) {
                h50.d(this, 1, "");
                return;
            }
            if (i23.R0(str, "AccountV5AuthFailed", false)) {
                if (ew3.o()) {
                    ew3.b0(new d9(13));
                }
                ew3.d0(new Runnable(this) { // from class: f50

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ dn f2042b;

                    {
                        this.f2042b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        dn dnVar = this.f2042b;
                        switch (i3) {
                            case 0:
                                r9 v0 = t9.v0(dnVar, "PasswordExpireDialog", new g50(dnVar, 0));
                                v0.z(new e50(dnVar, 6));
                                h50.a(dnVar, v0);
                                if (m20.A0()) {
                                    r9 g02 = ya0.g0(dnVar, 2);
                                    g02.z(new e50(dnVar, 8));
                                    h50.a(dnVar, g02);
                                    return;
                                }
                                return;
                            default:
                                if (!dnVar.isFinishing()) {
                                    if (dnVar instanceof MainActivity) {
                                        ((MainActivity) dnVar).c0();
                                    } else {
                                        sm1.a(dnVar).c(new Intent("RefreshUserInfoAction"));
                                    }
                                    ed2 ed2Var = new ed2(dnVar, R.layout.dialog_purchase_bind_another);
                                    ed2Var.m = 3;
                                    ed2Var.setOnDismissListener(new e50(dnVar, 7));
                                    h50.a(dnVar, ed2Var);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            }
            if (m20.L(str, "ssec5h739r")) {
                h50.b(this);
                m20.C0(this, 6);
                return;
            }
            bx j = hx2.j(str, 206);
            boolean q = j.q();
            boolean q2 = j.q();
            j.h();
            if (q2) {
                h50.d(this, 7, str);
                return;
            }
            if (q) {
                h50.b(this);
                m20.C0(this, 26);
                return;
            }
            if (i23.R0(str, "65k5rzn59u", false)) {
                if (!ew3.o()) {
                    ew3.d0(new Runnable(this) { // from class: f50

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ dn f2042b;

                        {
                            this.f2042b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            dn dnVar = this.f2042b;
                            switch (i3) {
                                case 0:
                                    r9 v0 = t9.v0(dnVar, "PasswordExpireDialog", new g50(dnVar, 0));
                                    v0.z(new e50(dnVar, 6));
                                    h50.a(dnVar, v0);
                                    if (m20.A0()) {
                                        r9 g02 = ya0.g0(dnVar, 2);
                                        g02.z(new e50(dnVar, 8));
                                        h50.a(dnVar, g02);
                                        return;
                                    }
                                    return;
                                default:
                                    if (!dnVar.isFinishing()) {
                                        if (dnVar instanceof MainActivity) {
                                            ((MainActivity) dnVar).c0();
                                        } else {
                                            sm1.a(dnVar).c(new Intent("RefreshUserInfoAction"));
                                        }
                                        ed2 ed2Var = new ed2(dnVar, R.layout.dialog_purchase_bind_another);
                                        ed2Var.m = 3;
                                        ed2Var.setOnDismissListener(new e50(dnVar, 7));
                                        h50.a(dnVar, ed2Var);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                } else {
                    h50.b(this);
                    m20.C0(this, 30);
                }
                rt3.e().m();
                return;
            }
            wcyybbcujkCs wcyybbcujkcs = wcyybbcujkCs.f4a;
            if ("kshpqn53ps".equals(str)) {
                a m = a.m(this, 5, str);
                m.setOnDismissListener(new e50(this, 2));
                m.show();
                h50.a(this, m);
                return;
            }
            if (i23.R0(str, "d69dc6nup5", false)) {
                try {
                    JSONArray jSONArray = new JSONArray(i23.k1(str, "d69dc6nup5_", "", false));
                    if (jSONArray.length() >= 2) {
                        r9 u02 = t9.u0(this, new q90(10, jSONArray.getString(0), jSONArray.getString(1)));
                        u02.z(new e50(this, 3));
                        h50.a(this, u02);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            if (!i23.R0(str, "jsghx6r6kj", false) && !i23.R0(str, "ptu4xnmgsf", false)) {
                i2 = 0;
            }
            if (i2 != 0) {
                a m2 = a.m(this, 8, str);
                m2.show();
                m2.setOnDismissListener(new e50(this, 4));
                h50.a(this, m2);
                return;
            }
            h50.d(this, 0, str);
        }
    }

    public final void W() {
        int i = 1792;
        if (v73.l()) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && P()) {
            i = 9984;
        }
        if (i2 >= 26 && O()) {
            i |= 16;
        }
        getWindow().getDecorView().setSystemUiVisibility(i);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (i2 >= 23) {
            getWindow().setStatusBarColor(0);
        } else {
            getWindow().setStatusBarColor(1879048192);
        }
        if (i2 >= 26) {
            getWindow().setNavigationBarColor(0);
        } else {
            getWindow().setNavigationBarColor(1879048192);
        }
    }

    public boolean X() {
        return this instanceof SplashActivity;
    }

    public int Y() {
        return 1000003;
    }

    @Override // defpackage.f83
    public void addThemeInvalidateListener(View view) {
        bindInvalidate(view);
    }

    @Override // defpackage.lt3, defpackage.ic, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.f83
    public void bindInvalidate(View view) {
        fl.j(view, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.c(int):void");
    }

    @Override // defpackage.lt3, android.app.Activity
    public void finish() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            pe0.E(currentFocus);
        }
        super.finish();
    }

    @Override // defpackage.f83
    public final a83 getThemeListeners() {
        return this.i;
    }

    @Override // defpackage.w73
    public final boolean h() {
        return !this.f;
    }

    @Override // defpackage.f83
    public final void j(TextView textView, int i) {
        fl.n(this, textView, i);
    }

    @Override // defpackage.f83
    public final void k(pn0 pn0Var) {
        fl.i(this, pn0Var, true);
    }

    @Override // defpackage.lt3, defpackage.ic, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        if (!oj1.a()) {
            super.onConfigurationChanged(configuration);
            return;
        }
        String e = tf3.e();
        if (!m20.L(e, "") && !m20.L(e, "Auto")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i = getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i != 16) {
                if (i == 32) {
                    d83.b(2, true);
                }
            } else {
                d83.b(1, true);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public void onCreate(Bundle bundle) {
        W();
        super.onCreate(bundle);
        d83.a(this);
        fl.g(this, getWindow().getDecorView(), Y());
        this.j = getIntent().getBooleanExtra("isFromConnectionDialog", false);
    }

    @Override // defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d83.d(this);
        pd0.l(this);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ji1, v31] */
    @Override // defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!oj1.a()) {
            return;
        }
        x8 x8Var = x8.f5127a;
        if (!(zf3.G() instanceof SplashActivity)) {
            ?? r0 = x8.f;
            x8.f = null;
            if (r0 != 0) {
                r0.invoke();
            }
        }
        if (!X()) {
            rt3.e().a(this);
        }
    }

    @Override // defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onStop() {
        super.onStop();
        if (!X()) {
            rt3.e().j(this);
        }
    }

    public void p(boolean z) {
        this.i.b(z);
        if (!z) {
            W();
        }
    }

    @Override // defpackage.f83
    public final void q(ke1 ke1Var) {
        fl.k(this, ke1Var);
    }

    @Override // defpackage.f83
    public final void r(View view, boolean z) {
        fl.i(this, view, z);
    }

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    public t90 w() {
        return this.h.f5442a;
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }
}
