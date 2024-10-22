package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c62 {

    /* renamed from: a, reason: collision with root package name */
    public final b62 f587a;

    /* renamed from: b, reason: collision with root package name */
    public final a62 f588b;
    public final f10 c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public c62(hu0 hu0Var, ko koVar, a93 a93Var, int i, f10 f10Var, Looper looper) {
        this.f588b = hu0Var;
        this.f587a = koVar;
        this.f = looper;
        this.c = f10Var;
    }

    public final synchronized void a(long j) {
        boolean z;
        boolean z2;
        cp3.m(this.g);
        if (this.f.getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        ((t43) this.c).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z2 = this.i;
            if (z2 || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            ((t43) this.c).getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z2) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        cp3.m(!this.g);
        this.g = true;
        hu0 hu0Var = (hu0) this.f588b;
        synchronized (hu0Var) {
            if (!hu0Var.z && hu0Var.j.getThread().isAlive()) {
                hu0Var.h.a(14, this).a();
                return;
            }
            sn1.f();
            b(false);
        }
    }
}
