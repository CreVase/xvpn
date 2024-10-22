package defpackage;

import a.du;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.google.android.gms.common.util.ArrayUtils;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.browser.BrowserTabIndexActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class lt3 extends ic implements s23, x33 {
    public static final /* synthetic */ int g = 0;

    /* renamed from: b, reason: collision with root package name */
    public qm1 f3191b;
    public lt3 c;
    public boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final String f3190a = getClass().getSimpleName();
    public boolean d = false;
    public boolean f = false;

    @Override // defpackage.x33
    public final void A() {
        int i;
        if (ew3.X()) {
            i = R.string.SupportServerRetryPremium;
        } else {
            i = R.string.SupportServerRetry;
        }
        V(pd0.y(i));
    }

    public abstract String M();

    public void N() {
        qm1 qm1Var = this.f3191b;
        if (qm1Var != null) {
            qm1Var.dismiss();
            this.f3191b = null;
        }
    }

    public boolean O() {
        return !(this instanceof BrowserTabIndexActivity);
    }

    public boolean P() {
        return !(this instanceof BrowserTabIndexActivity);
    }

    public final boolean Q(int i) {
        if (this.e) {
            return false;
        }
        if (i == 1000000) {
            if (ArrayUtils.contains((Class<?>[]) t23.a().c, getClass())) {
                return false;
            }
            m20.R();
            pe0.e();
            return true;
        }
        if (!ew3.o0() && !ew3.n0() && !ArrayUtils.contains((Class<?>[]) t23.a().c, getClass())) {
            if (getSupportFragmentManager().C("PurchaseFragment") != null) {
                p supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                supportFragmentManager.v(new z11(supportFragmentManager, "PurchaseFragment", -1, 1), false);
            }
            try {
                p supportFragmentManager2 = getSupportFragmentManager();
                supportFragmentManager2.getClass();
                a aVar = new a(supportFragmentManager2);
                int i2 = kd2.j;
                Bundle bundle = new Bundle();
                bundle.putInt("from", i);
                kd2 kd2Var = new kd2();
                kd2Var.setArguments(bundle);
                aVar.e(android.R.id.content, kd2Var, "PurchaseFragment");
                aVar.c("PurchaseFragment");
                aVar.h();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public void R() {
    }

    public boolean S() {
        return !(this instanceof SplashActivity);
    }

    public void T() {
        U(pd0.y(R.string.LoadingNormalText));
    }

    public final void U(String str) {
        qm1 qm1Var = this.f3191b;
        if (qm1Var != null && qm1Var.isShowing()) {
            TextView textView = this.f3191b.j;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        qm1 qm1Var2 = new qm1(this);
        this.f3191b = qm1Var2;
        TextView textView2 = qm1Var2.j;
        if (textView2 != null) {
            textView2.setText(str);
        }
        qm1 qm1Var3 = this.f3191b;
        qm1Var3.k = new ut0(this, 5);
        qm1Var3.show();
    }

    public final void V(String str) {
        N();
        l33 l33Var = (l33) getSupportFragmentManager().C("SupportLoadingDialog");
        if (l33Var == null) {
            l33 l33Var2 = new l33();
            l33Var2.d = str;
            if (l33Var2.isAdded()) {
                l33Var2.t().c.setText(str);
            }
            l33Var2.show(getSupportFragmentManager(), "SupportLoadingDialog");
            return;
        }
        l33Var.d = str;
        if (l33Var.isAdded()) {
            l33Var.t().c.setText(str);
        }
    }

    @Override // defpackage.ic, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!oj1.a()) {
            super.attachBaseContext(context);
            return;
        }
        applyOverrideConfiguration(ly1.b(context));
        ly1.b(context.getApplicationContext());
        super.attachBaseContext(context);
    }

    public void clickBackground(View view) {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // defpackage.ic, defpackage.r30, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!oj1.a()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            du.d(486, null);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        this.d = true;
        super.finish();
    }

    @Override // defpackage.x33
    public final void g() {
        l33 l33Var = (l33) getSupportFragmentManager().C("SupportLoadingDialog");
        if (l33Var != null) {
            l33Var.dismissAllowingStateLoss();
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
        t9.w0(getSupportFragmentManager(), new bp1(this, 3));
    }

    @Override // defpackage.x33
    public final void o() {
        int i;
        if (ew3.X()) {
            i = R.string.ConnectSupportServerPremium;
        } else {
            i = R.string.ConnectSupportServer;
        }
        V(pd0.y(i));
    }

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        GoogleIABHelper.g.getClass();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.d = true;
        super.onBackPressed();
    }

    @Override // defpackage.ic, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!oj1.a()) {
            super.onCreate(bundle);
            return;
        }
        if (bundle != null && Build.VERSION.SDK_INT == 29) {
            bundle.setClassLoader(getClassLoader());
        }
        zf3.g0(this);
        tf3.t = this;
        tf3.B0(this);
        boolean z = true;
        setRequestedOrientation(!XApplication.c ? 1 : 0);
        this.c = this;
        super.onCreate(bundle);
        pd0.S(this);
        if (S()) {
            if (ya0.h || ya0.i == null) {
                z = false;
            } else if (!isFinishing()) {
                ya0.i.getClass();
                ya0.H(this, ya0.i);
                finish();
            }
            if (z) {
                finish();
                return;
            }
        }
        R();
    }

    @Override // defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!oj1.a()) {
            return;
        }
        this.d = true;
        this.f = true;
        N();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onPause() {
        super.onPause();
        if (!oj1.a()) {
            return;
        }
        tf3.t = null;
        this.e = true;
        this.f = false;
        t23 a2 = t23.a();
        synchronized (a2.f4444b) {
            int size = ((ArrayList) a2.d).size();
            while (true) {
                size--;
                if (size >= 0) {
                    s23 s23Var = (s23) ((WeakReference) ((ArrayList) a2.d).get(size)).get();
                    if (s23Var == null || s23Var == this) {
                        ((ArrayList) a2.d).remove(size);
                    }
                }
            }
        }
        ew3.L0("UiPausePage", M());
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (!oj1.a()) {
            return;
        }
        this.d = false;
        this.f = false;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!oj1.a()) {
            return;
        }
        zf3.g0(this);
        tf3.t = this;
        ew3.L0("UiOpenPage", M());
        boolean z = false;
        this.e = false;
        this.f = false;
        t23 a2 = t23.a();
        synchronized (a2.f4444b) {
            for (int size = ((ArrayList) a2.d).size() - 1; size >= 0; size--) {
                s23 s23Var = (s23) ((WeakReference) ((ArrayList) a2.d).get(size)).get();
                if (s23Var == null) {
                    ((ArrayList) a2.d).remove(size);
                } else if (s23Var == this) {
                    z = true;
                }
            }
            if (!z) {
                ((ArrayList) a2.d).add(new WeakReference(this));
            }
            int i = a2.f4443a;
            if (i > -1 && Q(i)) {
                a2.f4443a = -1;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!oj1.a()) {
            return;
        }
        this.f = false;
        y33.B().i(this);
        ew3.g0(M().split("_")[0]);
    }

    @Override // defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public void onStop() {
        super.onStop();
        if (!oj1.a()) {
            return;
        }
        this.f = true;
        y33.B().E(this);
    }
}
