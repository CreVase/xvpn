package com.security.xvpn.z35kb;

import a.bx;
import a.du;
import a.wcyybbcujkCs;
import android.app.Application;
import android.app.UiModeManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.television.HomeActivity;
import defpackage.ai0;
import defpackage.b13;
import defpackage.bk1;
import defpackage.c02;
import defpackage.cz;
import defpackage.d5;
import defpackage.d83;
import defpackage.d9;
import defpackage.di2;
import defpackage.ew0;
import defpackage.ew3;
import defpackage.hx2;
import defpackage.l83;
import defpackage.m12;
import defpackage.m20;
import defpackage.mt3;
import defpackage.n12;
import defpackage.o12;
import defpackage.oj1;
import defpackage.pd0;
import defpackage.pg1;
import defpackage.pp;
import defpackage.qb0;
import defpackage.rf;
import defpackage.rt3;
import defpackage.rx0;
import defpackage.sb;
import defpackage.sc;
import defpackage.t60;
import defpackage.t82;
import defpackage.tf3;
import defpackage.uf;
import defpackage.ut0;
import defpackage.ya0;
import defpackage.yb;
import defpackage.zf3;
import java.lang.ref.WeakReference;
import java.util.Stack;

/* loaded from: classes2.dex */
public class XApplication extends Application implements ai0 {
    public static boolean c = false;
    public static final boolean d = TextUtils.equals("amazon", "normal");
    public static final Stack e = new Stack();
    public static boolean f = false;
    public static boolean g = true;

    /* renamed from: a, reason: collision with root package name */
    public int f1592a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Stack f1593b = new Stack();

    public static void d() {
        while (true) {
            try {
                du.d(216, null);
                boolean z = d;
                boolean z2 = c;
                bx bxVar = new bx();
                bxVar.v(z);
                bxVar.v(z2);
                du.d(77, bxVar);
                bxVar.h();
                String str = t60.f4456a;
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    Thread.sleep(3000L);
                } catch (Exception e3) {
                    Log.i("gcyj7pku7v", "RunRepeat error " + e3.getMessage());
                }
            }
        }
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void b() {
    }

    public final boolean c() {
        if (this.f1592a != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void n(bk1 bk1Var) {
    }

    @Override // android.app.Application
    public final void onCreate() {
        String packageName;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        c02 c02Var;
        boolean z6;
        String processName;
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            processName = Application.getProcessName();
            WebView.setDataDirectorySuffix(String.valueOf(processName.hashCode()));
        }
        if (!oj1.a()) {
            return;
        }
        zf3.M(getApplicationContext());
        String packageName2 = getPackageName();
        boolean z7 = false;
        z7 = false;
        if (i >= 28) {
            packageName = Application.getProcessName();
        } else {
            try {
                packageName = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                packageName = getPackageName();
            }
        }
        if (!m20.L(packageName2, packageName)) {
            return;
        }
        UiModeManager uiModeManager = (UiModeManager) getSystemService("uimode");
        int i2 = 1;
        if (uiModeManager != null) {
            if (uiModeManager.getCurrentModeType() == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            c = z6;
        }
        if (!c && !getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            z = false;
        } else {
            z = true;
        }
        c = z;
        if (!z && !getPackageManager().hasSystemFeature("android.software.leanback")) {
            z2 = false;
        } else {
            z2 = true;
        }
        c = z2;
        if (!z2 && !getResources().getBoolean(R.bool.isTelevision)) {
            z3 = false;
        } else {
            z3 = true;
        }
        c = z3;
        if (!z3 && !pg1.g().equalsIgnoreCase("box")) {
            z4 = false;
        } else {
            z4 = true;
        }
        c = z4;
        if (!z4 && !pg1.g().equalsIgnoreCase("tv")) {
            z5 = false;
        } else {
            z5 = true;
        }
        c = z5;
        bx bxVar = new bx();
        bxVar.v(z5);
        du.d(130, bxVar);
        bxVar.h();
        tf3.s = getApplicationContext();
        du.d(55, null);
        String packageName3 = getPackageName();
        bx bxVar2 = new bx();
        bxVar2.z(packageName3);
        du.d(129, bxVar2);
        bxVar2.h();
        rt3.e().c(rf.f4141a);
        rf.f4142b = rt3.e().d;
        wcyybbcujkCs.i = new d5();
        t82.i.f.a(this);
        try {
            rx0.a().b();
        } catch (Exception unused2) {
        }
        pd0.f = new qb0(8);
        ya0.g = MainActivity.class;
        o12.d = m12.f;
        di2 di2Var = new di2();
        di2Var.f1790a = 134217728;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            di2Var.f1790a = 201326592;
        }
        o12.f3580a = new n12(di2Var, z7 ? 1 : 0);
        o12.f3581b = new n12(di2Var, i2);
        int i4 = 2;
        o12.c = new n12(di2Var, i4);
        boolean z8 = c;
        if (z8) {
            ya0.g = HomeActivity.class;
        }
        if (z8) {
            sc.q(1);
        } else {
            String e2 = tf3.e();
            e2.getClass();
            if (!e2.equals("On")) {
                if (!e2.equals("Off")) {
                    if (i3 >= 29) {
                        sc.q(-1);
                    } else {
                        sc.q(3);
                    }
                    if ((getResources().getConfiguration().uiMode & 48) == 32) {
                        d83.b(2, false);
                    } else {
                        d83.b(1, false);
                    }
                } else {
                    sc.q(1);
                    d83.b(1, false);
                }
            } else {
                sc.q(2);
                d83.b(2, false);
            }
        }
        ya0.i = SplashActivity.class;
        registerActivityLifecycleCallbacks(new ew0(this, i4));
        cz.a(this);
        synchronized (c02.class) {
            if (c02.f563b == null) {
                c02.f563b = new c02(z7 ? 1 : 0);
            }
            c02Var = c02.f563b;
        }
        mt3 mt3Var = new mt3();
        c02Var.getClass();
        sb sbVar = new sb();
        sbVar.e = null;
        sbVar.f4302a = new WeakReference(mt3Var);
        sbVar.start();
        tf3.v = new ut0(this, 6);
        GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
        googleIABHelper.getClass();
        pp ppVar = new pp(this, googleIABHelper);
        GoogleIABHelper.h = ppVar;
        if (!ppVar.a()) {
            ppVar.c(googleIABHelper);
        }
        uf.b(this);
        g = ew3.o0();
        if (c) {
            tf3.J = true;
            yb.f5305b.getClass();
            yb.c = this;
            b13 b13Var = yb.d;
            if (ew3.o0()) {
                bx i5 = hx2.i(356);
                boolean q = i5.q();
                i5.h();
                if (!q) {
                    z7 = true;
                }
            }
            b13Var.g(Boolean.valueOf(z7));
            cz.a(this);
            ew3.b0(new d9(19));
            if (!ew3.o0()) {
                l83.a(this);
            }
        }
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void onDestroy(bk1 bk1Var) {
    }

    @Override // defpackage.ai0
    public final void onStart(bk1 bk1Var) {
    }

    @Override // defpackage.ai0
    public final void onStop(bk1 bk1Var) {
    }
}
