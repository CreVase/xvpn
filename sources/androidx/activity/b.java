package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.p;
import defpackage.bk1;
import defpackage.ck1;
import defpackage.g22;
import defpackage.gg;
import defpackage.h22;
import defpackage.i22;
import defpackage.k22;
import defpackage.m22;
import defpackage.o22;
import defpackage.p22;
import defpackage.uj1;
import defpackage.vj1;
import defpackage.x31;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f130a;

    /* renamed from: b, reason: collision with root package name */
    public final gg f131b = new gg();
    public g22 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public b(Runnable runnable) {
        OnBackInvokedCallback a2;
        this.f130a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a2 = m22.f3225a.a(new h22(this, 0), new h22(this, 1), new i22(this, 0), new i22(this, 1));
            } else {
                a2 = k22.f2875a.a(new i22(this, 2));
            }
            this.d = a2;
        }
    }

    public final void a(bk1 bk1Var, p22 p22Var) {
        vj1 lifecycle = bk1Var.getLifecycle();
        if (((ck1) lifecycle).d == uj1.DESTROYED) {
            return;
        }
        p22Var.f2194b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, p22Var));
        d();
        p22Var.c = new o22(this, 0);
    }

    public final void b() {
        Object obj;
        gg ggVar = this.f131b;
        ggVar.getClass();
        ListIterator listIterator = ggVar.listIterator(ggVar.c);
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((g22) obj).f2193a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        g22 g22Var = (g22) obj;
        this.c = null;
        if (g22Var != null) {
            p22 p22Var = (p22) g22Var;
            int i = p22Var.d;
            Object obj2 = p22Var.e;
            switch (i) {
                case 0:
                    ((x31) obj2).invoke(p22Var);
                    return;
                default:
                    p pVar = (p) obj2;
                    pVar.x(true);
                    if (pVar.h.f2193a) {
                        pVar.Q();
                        return;
                    } else {
                        pVar.g.b();
                        return;
                    }
            }
        }
        Runnable runnable = this.f130a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.d) != null) {
            k22 k22Var = k22.f2875a;
            if (z && !this.f) {
                k22Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z && this.f) {
                k22Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void d() {
        boolean z;
        boolean z2 = this.g;
        gg ggVar = this.f131b;
        if (!(ggVar instanceof Collection) || !ggVar.isEmpty()) {
            Iterator it = ggVar.iterator();
            while (it.hasNext()) {
                if (((g22) it.next()).f2193a) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.g = z;
        if (z != z2 && Build.VERSION.SDK_INT >= 33) {
            c(z);
        }
    }
}
