package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public abstract class nd3 extends ic implements x33, aa0 {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f3444a = pd0.e();

    /* renamed from: b, reason: collision with root package name */
    public re3 f3445b;
    public boolean c;
    public rn d;

    public static void P(HomeActivity homeActivity) {
        homeActivity.getClass();
        homeActivity.O(pd0.y(R.string.LoadingNormalText), null);
    }

    public void A() {
        int i;
        g();
        if (ew3.X()) {
            i = R.string.SupportServerRetryPremium;
        } else {
            i = R.string.SupportServerRetry;
        }
        Q(pd0.y(i), true);
    }

    public abstract String M();

    public final void N() {
        re3 re3Var = this.f3445b;
        if (re3Var != null) {
            re3Var.dismiss();
            this.f3445b = null;
        }
    }

    public final void O(String str, v31 v31Var) {
        if (isDestroyed()) {
            return;
        }
        re3 re3Var = this.f3445b;
        AppCompatTextView appCompatTextView = null;
        if (re3Var != null && re3Var.isShowing()) {
            re3 re3Var2 = this.f3445b;
            if (re3Var2 != null) {
                AppCompatTextView appCompatTextView2 = re3Var2.f;
                if (appCompatTextView2 != null) {
                    appCompatTextView = appCompatTextView2;
                }
                appCompatTextView.setText(str);
                return;
            }
            return;
        }
        re3 re3Var3 = new re3(this);
        this.f3445b = re3Var3;
        AppCompatTextView appCompatTextView3 = re3Var3.f;
        if (appCompatTextView3 != null) {
            appCompatTextView = appCompatTextView3;
        }
        appCompatTextView.setText(str);
        re3 re3Var4 = this.f3445b;
        if (re3Var4 != null) {
            re3Var4.g = e.z;
        }
        if (re3Var4 != null) {
            re3Var4.show();
        }
        re3 re3Var5 = this.f3445b;
        if (re3Var5 != null) {
            re3Var5.setOnDismissListener(new cd3(v31Var, 0));
        }
    }

    public final void Q(String str, boolean z) {
        N();
        g();
        p supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.x(true);
        supportFragmentManager.D();
        m20.Z0(getSupportFragmentManager(), "SupportLoadingDialog", new jd3(0, str, z));
    }

    @Override // defpackage.ic, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!oj1.a()) {
            super.attachBaseContext(context);
            return;
        }
        applyOverrideConfiguration(ly1.b(context));
        ly1.b(context.getApplicationContext());
        super.attachBaseContext(context);
    }

    @Override // defpackage.x33
    public final void g() {
        uq uqVar;
        Fragment C = getSupportFragmentManager().C("SupportLoadingDialog");
        if (C instanceof uq) {
            uqVar = (uq) C;
        } else {
            uqVar = null;
        }
        if (uqVar != null) {
            uqVar.dismissAllowingStateLoss();
        }
    }

    @Override // defpackage.x33
    public final void n() {
        boolean z;
        if (GoogleIABHelper.g.d == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        m20.a1(this, d42.C);
    }

    public void o() {
        int i;
        if (ew3.X()) {
            i = R.string.ConnectSupportServerPremium;
        } else {
            i = R.string.ConnectSupportServer;
        }
        Q(pd0.y(i), false);
    }

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zf3.g0(this);
        tf3.B0(this);
        pd0.S(this);
        getLifecycle().a(GoogleIABHelper.g);
        boolean z = false;
        getWindow().getDecorView().setLayoutDirection(0);
        if (bundle != null) {
            b13 b13Var = yc2.c;
            if (((CharSequence) b13Var.getValue()).length() > 0) {
                z = true;
            }
            if (z) {
                N();
                b13Var.g("");
            }
            yc2.a();
        }
        zf3.T(this, null, new hd3(this, null), 3);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onPause() {
        super.onPause();
        ew3.L0("UiPausePage", M());
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onResume() {
        super.onResume();
        zf3.g0(this);
        ew3.L0("UiOpenPage", M());
    }

    @Override // defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onStart() {
        super.onStart();
        y33.B().i(this);
        ew3.g0(M());
    }

    @Override // defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onStop() {
        y33.B().E(this);
        super.onStop();
    }

    @Override // defpackage.aa0
    public final t90 w() {
        return this.f3444a.f5442a;
    }
}
