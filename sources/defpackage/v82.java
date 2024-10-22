package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v82 implements ss0, r01 {
    public static final String l = bo1.e("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f4793b;
    public final u40 c;
    public final g63 d;
    public final WorkDatabase e;
    public final List h;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f4792a = null;
    public final Object k = new Object();

    public v82(Context context, u40 u40Var, y33 y33Var, WorkDatabase workDatabase, List list) {
        this.f4793b = context;
        this.c = u40Var;
        this.d = y33Var;
        this.e = workDatabase;
        this.h = list;
    }

    public static boolean c(String str, bt3 bt3Var) {
        boolean z;
        if (bt3Var != null) {
            bt3Var.s = true;
            bt3Var.i();
            ml1 ml1Var = bt3Var.r;
            if (ml1Var != null) {
                z = ml1Var.isDone();
                bt3Var.r.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = bt3Var.f;
            if (listenableWorker != null && !z) {
                listenableWorker.stop();
            } else {
                String.format("WorkSpec %s is already done. Not interrupting.", bt3Var.e);
                bo1 c = bo1.c();
                String str2 = bt3.t;
                c.a(new Throwable[0]);
            }
            bo1 c2 = bo1.c();
            String.format("WorkerWrapper interrupted for %s", str);
            c2.a(new Throwable[0]);
            return true;
        }
        bo1 c3 = bo1.c();
        String.format("WorkerWrapper could not be found for %s", str);
        c3.a(new Throwable[0]);
        return false;
    }

    public final void a(ss0 ss0Var) {
        synchronized (this.k) {
            this.j.add(ss0Var);
        }
    }

    @Override // defpackage.ss0
    public final void b(String str, boolean z) {
        synchronized (this.k) {
            this.g.remove(str);
            bo1 c = bo1.c();
            String.format("%s %s executed; reschedule = %s", v82.class.getSimpleName(), str, Boolean.valueOf(z));
            c.a(new Throwable[0]);
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((ss0) it.next()).b(str, z);
            }
        }
    }

    public final boolean d(String str) {
        boolean contains;
        synchronized (this.k) {
            contains = this.i.contains(str);
        }
        return contains;
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.k) {
            if (!this.g.containsKey(str) && !this.f.containsKey(str)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public final void f(ss0 ss0Var) {
        synchronized (this.k) {
            this.j.remove(ss0Var);
        }
    }

    public final void g(String str, p01 p01Var) {
        synchronized (this.k) {
            bo1.c().d(l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            bt3 bt3Var = (bt3) this.g.remove(str);
            if (bt3Var != null) {
                if (this.f4792a == null) {
                    PowerManager.WakeLock a2 = go3.a(this.f4793b, "ProcessorForegroundLck");
                    this.f4792a = a2;
                    a2.acquire();
                }
                this.f.put(str, bt3Var);
                x80.startForegroundService(this.f4793b, v43.c(this.f4793b, str, p01Var));
            }
        }
    }

    public final boolean h(String str, y33 y33Var) {
        synchronized (this.k) {
            if (e(str)) {
                bo1 c = bo1.c();
                String.format("Work %s is already enqueued for processing", str);
                c.a(new Throwable[0]);
                return false;
            }
            at3 at3Var = new at3(this.f4793b, this.c, this.d, this, this.e, str);
            at3Var.h = this.h;
            if (y33Var != null) {
                at3Var.i = y33Var;
            }
            bt3 bt3Var = new bt3(at3Var);
            rr2 rr2Var = bt3Var.q;
            rr2Var.addListener(new ku(this, str, rr2Var, 3), (Executor) ((y33) this.d).d);
            this.g.put(str, bt3Var);
            ((rp2) ((y33) this.d).f5263b).execute(bt3Var);
            bo1 c2 = bo1.c();
            String.format("%s: processing %s", v82.class.getSimpleName(), str);
            c2.a(new Throwable[0]);
            return true;
        }
    }

    public final void i() {
        synchronized (this.k) {
            if (!(!this.f.isEmpty())) {
                Context context = this.f4793b;
                String str = v43.j;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f4793b.startService(intent);
                } catch (Throwable th) {
                    bo1.c().b(l, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f4792a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f4792a = null;
                }
            }
        }
    }

    public final boolean j(String str) {
        boolean c;
        synchronized (this.k) {
            bo1 c2 = bo1.c();
            String.format("Processor stopping foreground work %s", str);
            c2.a(new Throwable[0]);
            c = c(str, (bt3) this.f.remove(str));
        }
        return c;
    }

    public final boolean k(String str) {
        boolean c;
        synchronized (this.k) {
            bo1 c2 = bo1.c();
            String.format("Processor stopping background work %s", str);
            c2.a(new Throwable[0]);
            c = c(str, (bt3) this.g.remove(str));
        }
        return c;
    }
}
