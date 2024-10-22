package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class sc {

    /* renamed from: a, reason: collision with root package name */
    public static final mf f4311a = new mf(new nf());

    /* renamed from: b, reason: collision with root package name */
    public static int f4312b = -100;
    public static wm1 c = null;
    public static wm1 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final ng g = new ng(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static void b() {
        wm1 wm1Var;
        Iterator it = g.iterator();
        while (it.hasNext()) {
            sc scVar = (sc) ((WeakReference) it.next()).get();
            if (scVar != null) {
                jd jdVar = (jd) scVar;
                Context context = jdVar.k;
                int i2 = 1;
                if (h(context) && (wm1Var = c) != null && !wm1Var.equals(d)) {
                    f4311a.execute(new pc(context, i2));
                }
                jdVar.v(true, true);
            }
        }
    }

    public static wm1 d() {
        if (ur.c()) {
            Object e2 = e();
            if (e2 != null) {
                return wm1.f(rc.a(e2));
            }
        } else {
            wm1 wm1Var = c;
            if (wm1Var != null) {
                return wm1Var;
            }
        }
        return wm1.f5037b;
    }

    public static Object e() {
        Context context;
        Iterator it = g.iterator();
        while (it.hasNext()) {
            sc scVar = (sc) ((WeakReference) it.next()).get();
            if (scVar != null && (context = ((jd) scVar).k) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean h(Context context) {
        int i2;
        if (e == null) {
            try {
                int i3 = kf.f2938a;
                if (Build.VERSION.SDK_INT >= 24) {
                    i2 = jf.a() | 128;
                } else {
                    i2 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) kf.class), i2).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void k(sc scVar) {
        synchronized (h) {
            Iterator it = g.iterator();
            while (it.hasNext()) {
                sc scVar2 = (sc) ((WeakReference) it.next()).get();
                if (scVar2 == scVar || scVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void m(wm1 wm1Var) {
        Objects.requireNonNull(wm1Var);
        if (ur.c()) {
            Object e2 = e();
            if (e2 != null) {
                rc.b(e2, qc.a(wm1Var.e()));
                return;
            }
            return;
        }
        if (!wm1Var.equals(c)) {
            synchronized (h) {
                c = wm1Var;
                b();
            }
        }
    }

    public static void q(int i2) {
        if ((i2 == -1 || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) && f4312b != i2) {
            f4312b = i2;
            synchronized (h) {
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    sc scVar = (sc) ((WeakReference) it.next()).get();
                    if (scVar != null) {
                        ((jd) scVar).v(true, true);
                    }
                }
            }
        }
    }

    public static void t(Context context) {
        if (!h(context)) {
            return;
        }
        if (ur.c()) {
            if (!f) {
                f4311a.execute(new pc(context, 0));
                return;
            }
            return;
        }
        synchronized (i) {
            wm1 wm1Var = c;
            if (wm1Var == null) {
                if (d == null) {
                    d = wm1.b(tf3.p0(context));
                }
                if (d.d()) {
                } else {
                    c = d;
                }
            } else if (!wm1Var.equals(d)) {
                wm1 wm1Var2 = c;
                d = wm1Var2;
                tf3.o0(context, wm1Var2.e());
            }
        }
    }

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void f();

    public abstract void g();

    public abstract void i(Bundle bundle);

    public abstract void j();

    public abstract boolean l(int i2);

    public abstract void n(int i2);

    public abstract void o(View view);

    public abstract void p(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void r(CharSequence charSequence);

    public abstract h5 s(g5 g5Var);
}
