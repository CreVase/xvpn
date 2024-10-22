package defpackage;

import android.database.Cursor;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class gl2 {

    /* renamed from: a, reason: collision with root package name */
    public volatile r33 f2275a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f2276b;
    public u33 c;
    public final ne1 d;
    public boolean e;
    public boolean f;
    public List g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public gl2() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        boolean z;
        if (this.e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((j31) this.c.q()).f2698a.inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        r33 q = this.c.q();
        this.d.c(q);
        ((j31) q).a();
    }

    public abstract ne1 d();

    public abstract u33 e(fe0 fe0Var);

    public final void f() {
        ((j31) this.c.q()).c();
        if (!((j31) this.c.q()).f2698a.inTransaction()) {
            ne1 ne1Var = this.d;
            if (ne1Var.d.compareAndSet(false, true)) {
                ne1Var.c.f2276b.execute(ne1Var.i);
            }
        }
    }

    public final Cursor g(v33 v33Var) {
        a();
        b();
        return ((j31) this.c.q()).w(v33Var);
    }

    public final void h() {
        ((j31) this.c.q()).K();
    }
}
