package com.chartboost.sdk.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.b5;
import com.chartboost.sdk.impl.f6;
import com.chartboost.sdk.impl.r1;
import com.chartboost.sdk.impl.ra;
import com.chartboost.sdk.impl.s2;
import com.chartboost.sdk.impl.z4;

/* loaded from: classes.dex */
public final class CBImpressionActivity extends Activity implements z4 {

    /* renamed from: a, reason: collision with root package name */
    public b5 f1355a;

    @Override // com.chartboost.sdk.impl.z4
    public void a() {
        finish();
    }

    @Override // com.chartboost.sdk.impl.z4
    public void b() {
        View view;
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        String unused;
        try {
            int i = Build.VERSION.SDK_INT;
            WindowManager.LayoutParams layoutParams = null;
            if (i >= 30) {
                Window window = getWindow();
                if (window != null) {
                    window.setDecorFitsSystemWindows(true);
                    insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        statusBars = WindowInsets.Type.statusBars();
                        navigationBars = WindowInsets.Type.navigationBars();
                        insetsController.hide(statusBars | navigationBars);
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else {
                Window window2 = getWindow();
                if (window2 != null) {
                    view = window2.getDecorView();
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setSystemUiVisibility(3846);
                }
            }
            if (i >= 28) {
                Window window3 = getWindow();
                if (window3 != null) {
                    layoutParams = window3.getAttributes();
                }
                if (layoutParams != null) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
            }
        } catch (Exception e) {
            unused = r1.f1100a;
            e.toString();
        }
    }

    @Override // com.chartboost.sdk.impl.z4
    public CBImpressionActivity c() {
        return this;
    }

    @Override // com.chartboost.sdk.impl.z4
    public boolean d() {
        View decorView;
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            return decorView.isHardwareAccelerated();
        }
        return false;
    }

    public final void e() {
        String str;
        if (this.f1355a == null) {
            if (!Chartboost.isSdkStarted()) {
                str = r1.f1100a;
                Log.e(str, "Cannot start Chartboost activity due to SDK not being initialized.");
                finish();
                return;
            }
            this.f1355a = new b5(this, s2.f1122b.i().a());
        }
    }

    public final boolean f() {
        Intent intent = getIntent();
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("isChartboost", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b5 b5Var = this.f1355a;
        if (b5Var != null) {
            b5Var.i();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        String str;
        boolean z;
        try {
            b5 b5Var = this.f1355a;
            if (b5Var != null) {
                z = b5Var.b();
            } else {
                z = false;
            }
            if (!z) {
                super.onBackPressed();
            }
        } catch (Exception e) {
            str = r1.f1100a;
            f6.b(str, "onBackPressed error: " + e);
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        b5 b5Var = this.f1355a;
        if (b5Var != null) {
            b5Var.c();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (!f()) {
            str = r1.f1100a;
            f6.b(str, "This activity cannot be called from outside chartboost SDK");
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        e();
        b5 b5Var = this.f1355a;
        if (b5Var != null) {
            b5Var.d();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        b5 b5Var = this.f1355a;
        if (b5Var != null) {
            b5Var.e();
        }
        this.f1355a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        b5 b5Var = this.f1355a;
        if (b5Var != null) {
            b5Var.f();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        e();
        b5 b5Var = this.f1355a;
        if (b5Var != null) {
            b5Var.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        b5 b5Var = this.f1355a;
        if (b5Var != null) {
            b5Var.h();
        }
    }

    @Override // com.chartboost.sdk.impl.z4
    public void a(ra raVar) {
        addContentView(raVar, new FrameLayout.LayoutParams(-1, -1));
    }
}
