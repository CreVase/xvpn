package androidx.lifecycle;

import android.os.Looper;
import defpackage.a22;
import defpackage.ag;
import defpackage.bk1;
import defpackage.ck1;
import defpackage.gm2;
import defpackage.hx2;
import defpackage.jm2;
import defpackage.qw3;
import defpackage.uj1;
import defpackage.ul1;
import defpackage.vl1;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f263a;

    /* renamed from: b, reason: collision with root package name */
    public final jm2 f264b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final qw3 j;

    public b(Object obj) {
        this.f263a = new Object();
        this.f264b = new jm2();
        this.c = 0;
        this.f = k;
        this.j = new qw3(this, 9);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        boolean z;
        ag.C0().K.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
        } else {
            throw new IllegalStateException(hx2.q("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(vl1 vl1Var) {
        if (!vl1Var.f4857b) {
            return;
        }
        if (!vl1Var.g()) {
            vl1Var.c(false);
            return;
        }
        int i = vl1Var.c;
        int i2 = this.g;
        if (i >= i2) {
            return;
        }
        vl1Var.c = i2;
        vl1Var.f4856a.F(this.e);
    }

    public final void c(vl1 vl1Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (vl1Var != null) {
                b(vl1Var);
                vl1Var = null;
            } else {
                jm2 jm2Var = this.f264b;
                jm2Var.getClass();
                gm2 gm2Var = new gm2(jm2Var);
                jm2Var.c.put(gm2Var, Boolean.FALSE);
                while (gm2Var.hasNext()) {
                    b((vl1) ((Map.Entry) gm2Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(bk1 bk1Var, a22 a22Var) {
        a("observe");
        if (((ck1) bk1Var.getLifecycle()).d == uj1.DESTROYED) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, bk1Var, a22Var);
        vl1 vl1Var = (vl1) this.f264b.c(a22Var, liveData$LifecycleBoundObserver);
        if (vl1Var != null && !vl1Var.f(bk1Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (vl1Var != null) {
            return;
        }
        bk1Var.getLifecycle().a(liveData$LifecycleBoundObserver);
    }

    public final void e(a22 a22Var) {
        a("observeForever");
        ul1 ul1Var = new ul1(this, a22Var);
        vl1 vl1Var = (vl1) this.f264b.c(a22Var, ul1Var);
        if (!(vl1Var instanceof LiveData$LifecycleBoundObserver)) {
            if (vl1Var != null) {
                return;
            }
            ul1Var.c(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void f() {
    }

    public void g() {
    }

    public void h(a22 a22Var) {
        a("removeObserver");
        vl1 vl1Var = (vl1) this.f264b.e(a22Var);
        if (vl1Var == null) {
            return;
        }
        vl1Var.d();
        vl1Var.c(false);
    }

    public abstract void i(Object obj);

    public b() {
        this.f263a = new Object();
        this.f264b = new jm2();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new qw3(this, 9);
        this.e = obj;
        this.g = -1;
    }
}
