package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class bt3 implements Runnable {
    public static final String t = bo1.e("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public final Context f526a;

    /* renamed from: b, reason: collision with root package name */
    public final String f527b;
    public final List c;
    public final y33 d;
    public rs3 e;
    public ListenableWorker f;
    public final g63 g;
    public final u40 i;
    public final r01 j;
    public final WorkDatabase k;
    public final ts3 l;
    public final ok0 m;
    public final ok0 n;
    public ArrayList o;
    public String p;
    public volatile boolean s;
    public ql1 h = new nl1();
    public final rr2 q = new rr2();
    public ml1 r = null;

    public bt3(at3 at3Var) {
        this.f526a = (Context) at3Var.f337a;
        this.g = (g63) at3Var.d;
        this.j = (r01) at3Var.c;
        this.f527b = (String) at3Var.g;
        this.c = (List) at3Var.h;
        this.d = (y33) at3Var.i;
        this.f = (ListenableWorker) at3Var.f338b;
        this.i = (u40) at3Var.e;
        WorkDatabase workDatabase = (WorkDatabase) at3Var.f;
        this.k = workDatabase;
        this.l = workDatabase.n();
        this.m = workDatabase.i();
        this.n = workDatabase.o();
    }

    public final void a(ql1 ql1Var) {
        boolean z = ql1Var instanceof pl1;
        String str = t;
        if (z) {
            bo1.c().d(str, String.format("Worker result SUCCESS for %s", this.p), new Throwable[0]);
            if (this.e.c()) {
                e();
                return;
            }
            ok0 ok0Var = this.m;
            String str2 = this.f527b;
            ts3 ts3Var = this.l;
            WorkDatabase workDatabase = this.k;
            workDatabase.c();
            try {
                ts3Var.l(fs3.SUCCEEDED, str2);
                ts3Var.j(str2, ((pl1) this.h).f3866a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ok0Var.a(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (ts3Var.e(str3) == fs3.BLOCKED && ok0Var.d(str3)) {
                        bo1.c().d(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                        ts3Var.l(fs3.ENQUEUED, str3);
                        ts3Var.k(str3, currentTimeMillis);
                    }
                }
                workDatabase.h();
                return;
            } finally {
                workDatabase.f();
                f(false);
            }
        }
        if (ql1Var instanceof ol1) {
            bo1.c().d(str, String.format("Worker result RETRY for %s", this.p), new Throwable[0]);
            d();
            return;
        }
        bo1.c().d(str, String.format("Worker result FAILURE for %s", this.p), new Throwable[0]);
        if (this.e.c()) {
            e();
        } else {
            h();
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            ts3 ts3Var = this.l;
            if (ts3Var.e(str2) != fs3.CANCELLED) {
                ts3Var.l(fs3.FAILED, str2);
            }
            linkedList.addAll(this.m.a(str2));
        }
    }

    public final void c() {
        boolean i = i();
        String str = this.f527b;
        WorkDatabase workDatabase = this.k;
        if (!i) {
            workDatabase.c();
            try {
                fs3 e = this.l.e(str);
                workDatabase.m().u(str);
                if (e == null) {
                    f(false);
                } else if (e == fs3.RUNNING) {
                    a(this.h);
                } else if (!e.a()) {
                    d();
                }
                workDatabase.h();
            } finally {
                workDatabase.f();
            }
        }
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((hn2) it.next()).c(str);
            }
            kn2.a(this.i, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f527b;
        ts3 ts3Var = this.l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            ts3Var.l(fs3.ENQUEUED, str);
            ts3Var.k(str, System.currentTimeMillis());
            ts3Var.i(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f527b;
        ts3 ts3Var = this.l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            ts3Var.k(str, System.currentTimeMillis());
            ts3Var.l(fs3.ENQUEUED, str);
            gl2 gl2Var = ts3Var.f4567a;
            gl2Var.b();
            ss3 ss3Var = ts3Var.g;
            o31 a2 = ss3Var.a();
            if (str == null) {
                a2.w(1);
            } else {
                a2.x(1, str);
            }
            gl2Var.c();
            try {
                a2.K();
                gl2Var.h();
                gl2Var.f();
                ss3Var.c(a2);
                ts3Var.i(str, -1L);
                workDatabase.h();
            } catch (Throwable th) {
                gl2Var.f();
                ss3Var.c(a2);
                throw th;
            }
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x0005, B:10:0x002e, B:12:0x0036, B:14:0x003f, B:15:0x0055, B:17:0x0059, B:19:0x005d, B:21:0x0063, B:22:0x006b, B:30:0x0078, B:32:0x0079, B:38:0x008e, B:39:0x0094, B:24:0x006c, B:25:0x0074, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x0005, B:10:0x002e, B:12:0x0036, B:14:0x003f, B:15:0x0055, B:17:0x0059, B:19:0x005d, B:21:0x0063, B:22:0x006b, B:30:0x0078, B:32:0x0079, B:38:0x008e, B:39:0x0094, B:24:0x006c, B:25:0x0074, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.k     // Catch: java.lang.Throwable -> L95
            ts3 r0 = r0.n()     // Catch: java.lang.Throwable -> L95
            r0.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            hl2 r1 = defpackage.hl2.a(r2, r1)     // Catch: java.lang.Throwable -> L95
            gl2 r0 = r0.f4567a     // Catch: java.lang.Throwable -> L95
            r0.b()     // Catch: java.lang.Throwable -> L95
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L95
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L8d
            r4 = 1
            if (r3 == 0) goto L2d
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            r0.close()     // Catch: java.lang.Throwable -> L95
            r1.release()     // Catch: java.lang.Throwable -> L95
            if (r3 != 0) goto L3d
            android.content.Context r0 = r5.f526a     // Catch: java.lang.Throwable -> L95
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.h42.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L95
        L3d:
            if (r6 == 0) goto L55
            ts3 r0 = r5.l     // Catch: java.lang.Throwable -> L95
            fs3 r1 = defpackage.fs3.ENQUEUED     // Catch: java.lang.Throwable -> L95
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L95
            java.lang.String r4 = r5.f527b     // Catch: java.lang.Throwable -> L95
            r3[r2] = r4     // Catch: java.lang.Throwable -> L95
            r0.l(r1, r3)     // Catch: java.lang.Throwable -> L95
            ts3 r0 = r5.l     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r5.f527b     // Catch: java.lang.Throwable -> L95
            r2 = -1
            r0.i(r1, r2)     // Catch: java.lang.Throwable -> L95
        L55:
            rs3 r0 = r5.e     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L79
            androidx.work.ListenableWorker r0 = r5.f     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L79
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L79
            r01 r0 = r5.j     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r5.f527b     // Catch: java.lang.Throwable -> L95
            v82 r0 = (defpackage.v82) r0     // Catch: java.lang.Throwable -> L95
            java.lang.Object r2 = r0.k     // Catch: java.lang.Throwable -> L95
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L95
            java.util.HashMap r3 = r0.f     // Catch: java.lang.Throwable -> L76
            r3.remove(r1)     // Catch: java.lang.Throwable -> L76
            r0.i()     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L95
        L79:
            androidx.work.impl.WorkDatabase r0 = r5.k     // Catch: java.lang.Throwable -> L95
            r0.h()     // Catch: java.lang.Throwable -> L95
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.f()
            rr2 r0 = r5.q
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.h(r6)
            return
        L8d:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L95
            r1.release()     // Catch: java.lang.Throwable -> L95
            throw r6     // Catch: java.lang.Throwable -> L95
        L95:
            r6 = move-exception
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt3.f(boolean):void");
    }

    public final void g() {
        ts3 ts3Var = this.l;
        String str = this.f527b;
        fs3 e = ts3Var.e(str);
        if (e == fs3.RUNNING) {
            bo1 c = bo1.c();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str);
            c.a(new Throwable[0]);
            f(true);
            return;
        }
        bo1 c2 = bo1.c();
        String.format("Status for %s is %s; not doing any work", str, e);
        c2.a(new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f527b;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            b(str);
            this.l.j(str, ((nl1) this.h).f3482a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.s) {
            return false;
        }
        bo1 c = bo1.c();
        String.format("Work interrupted for %s", this.p);
        c.a(new Throwable[0]);
        if (this.l.e(this.f527b) == null) {
            f(false);
        } else {
            f(!r0.a());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:            if (r0 != false) goto L31;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt3.run():void");
    }
}
