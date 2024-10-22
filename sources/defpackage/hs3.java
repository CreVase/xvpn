package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hs3 extends pe0 {
    public static hs3 A;
    public static final Object B;
    public static hs3 z;
    public Context q;
    public u40 r;
    public WorkDatabase s;
    public g63 t;
    public List u;
    public v82 v;
    public v51 w;
    public boolean x;
    public BroadcastReceiver.PendingResult y;

    static {
        bo1.e("WorkManagerImpl");
        z = null;
        A = null;
        B = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    public hs3(Context context, u40 u40Var, y33 y33Var) {
        fl2 fl2Var;
        Executor executor;
        int i;
        String str;
        boolean z2;
        boolean z3;
        int i2;
        hn2 hn2Var;
        hn2 hn2Var2;
        ?? r5;
        boolean isDeviceProtectedStorage;
        boolean z4 = context.getResources().getBoolean(je2.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        rp2 rp2Var = (rp2) y33Var.f5263b;
        int i3 = WorkDatabase.k;
        if (z4) {
            fl2Var = new fl2(applicationContext, null);
            fl2Var.h = true;
        } else {
            String[] strArr = bs3.f521a;
            fl2Var = new fl2(applicationContext, "androidx.work.workdb");
            fl2Var.g = new s4(applicationContext);
        }
        fl2Var.e = rp2Var;
        yr3 yr3Var = new yr3();
        if (fl2Var.d == null) {
            fl2Var.d = new ArrayList();
        }
        fl2Var.d.add(yr3Var);
        fl2Var.a(cp3.l);
        fl2Var.a(new as3(applicationContext, 2, 3));
        fl2Var.a(cp3.m);
        fl2Var.a(cp3.n);
        fl2Var.a(new as3(applicationContext, 5, 6));
        fl2Var.a(cp3.o);
        fl2Var.a(cp3.p);
        fl2Var.a(cp3.q);
        fl2Var.a(new as3(applicationContext));
        fl2Var.a(new as3(applicationContext, 10, 11));
        fl2Var.a(cp3.r);
        fl2Var.i = false;
        fl2Var.j = true;
        Context context2 = fl2Var.c;
        if (context2 != null) {
            Class cls = fl2Var.f2111a;
            if (cls != null) {
                Executor executor2 = fl2Var.e;
                if (executor2 == null && fl2Var.f == null) {
                    zf zfVar = ag.M;
                    fl2Var.f = zfVar;
                    fl2Var.e = zfVar;
                } else if (executor2 != null && fl2Var.f == null) {
                    fl2Var.f = executor2;
                } else if (executor2 == null && (executor = fl2Var.f) != null) {
                    fl2Var.e = executor;
                }
                if (fl2Var.g == null) {
                    fl2Var.g = new c02(14);
                }
                String str2 = fl2Var.f2112b;
                t33 t33Var = fl2Var.g;
                ja1 ja1Var = fl2Var.k;
                ArrayList arrayList = fl2Var.d;
                boolean z5 = fl2Var.h;
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager != null && !activityManager.isLowRamDevice()) {
                    i = 3;
                } else {
                    i = 2;
                }
                Executor executor3 = fl2Var.e;
                fe0 fe0Var = new fe0(context2, str2, t33Var, ja1Var, arrayList, z5, i, executor3, fl2Var.f, fl2Var.i, fl2Var.j);
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                String str3 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str3;
                    } else {
                        str = name + "." + str3;
                    }
                    gl2 gl2Var = (gl2) Class.forName(str).newInstance();
                    u33 e = gl2Var.e(fe0Var);
                    gl2Var.c = e;
                    if (e instanceof tl2) {
                        ((tl2) e).f = fe0Var;
                    }
                    if (i == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    e.setWriteAheadLoggingEnabled(z2);
                    gl2Var.g = arrayList;
                    gl2Var.f2276b = executor3;
                    new ArrayDeque();
                    gl2Var.e = z5;
                    gl2Var.f = z2;
                    WorkDatabase workDatabase = (WorkDatabase) gl2Var;
                    Context applicationContext2 = context.getApplicationContext();
                    bo1 bo1Var = new bo1(u40Var.f);
                    synchronized (bo1.class) {
                        bo1.f498b = bo1Var;
                    }
                    hn2[] hn2VarArr = new hn2[2];
                    int i4 = Build.VERSION.SDK_INT;
                    int i5 = kn2.f2980a;
                    if (i4 >= 23) {
                        hn2Var2 = new c53(applicationContext2, this);
                        r5 = 1;
                        h42.a(applicationContext2, SystemJobService.class, true);
                        bo1.c().a(new Throwable[0]);
                        i2 = 0;
                    } else {
                        try {
                            hn2 hn2Var3 = (hn2) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                            bo1 c = bo1.c();
                            String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler");
                            c.a(new Throwable[0]);
                            hn2Var = hn2Var3;
                            z3 = true;
                            i2 = 0;
                        } catch (Throwable th) {
                            z3 = true;
                            i2 = 0;
                            bo1.c().a(th);
                            hn2Var = null;
                        }
                        if (hn2Var == null) {
                            hn2Var2 = new s43(applicationContext2);
                            h42.a(applicationContext2, SystemAlarmService.class, z3);
                            bo1.c().a(new Throwable[i2]);
                            r5 = z3;
                        } else {
                            hn2Var2 = hn2Var;
                            r5 = z3;
                        }
                    }
                    hn2VarArr[i2] = hn2Var2;
                    hn2VarArr[r5] = new b61(applicationContext2, u40Var, y33Var, this);
                    List asList = Arrays.asList(hn2VarArr);
                    v82 v82Var = new v82(context, u40Var, y33Var, workDatabase, asList);
                    Context applicationContext3 = context.getApplicationContext();
                    this.q = applicationContext3;
                    this.r = u40Var;
                    this.t = y33Var;
                    this.s = workDatabase;
                    this.u = asList;
                    this.v = v82Var;
                    this.w = new v51(workDatabase, 19);
                    this.x = false;
                    if (Build.VERSION.SDK_INT >= 24) {
                        isDeviceProtectedStorage = applicationContext3.isDeviceProtectedStorage();
                        if (isDeviceProtectedStorage) {
                            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                        }
                    }
                    ((y33) this.t).r(new o01(applicationContext3, this));
                    return;
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
                }
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    public static hs3 Z() {
        synchronized (B) {
            hs3 hs3Var = z;
            if (hs3Var != null) {
                return hs3Var;
            }
            return A;
        }
    }

    public static hs3 a0(Context context) {
        hs3 Z;
        synchronized (B) {
            Z = Z();
            if (Z == null) {
                context.getApplicationContext();
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:            r4 = r4.getApplicationContext();     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:            if (defpackage.hs3.A != null) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:            defpackage.hs3.A = new defpackage.hs3(r4, r5, new defpackage.y33(r5.f4623b));     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:            defpackage.hs3.z = defpackage.hs3.A;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b0(android.content.Context r4, defpackage.u40 r5) {
        /*
            java.lang.Object r0 = defpackage.hs3.B
            monitor-enter(r0)
            hs3 r1 = defpackage.hs3.z     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            hs3 r2 = defpackage.hs3.A     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            hs3 r1 = defpackage.hs3.A     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            hs3 r1 = new hs3     // Catch: java.lang.Throwable -> L32
            y33 r2 = new y33     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.f4623b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            defpackage.hs3.A = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            hs3 r4 = defpackage.hs3.A     // Catch: java.lang.Throwable -> L32
            defpackage.hs3.z = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs3.b0(android.content.Context, u40):void");
    }

    public final x50 Y(List list) {
        if (!list.isEmpty()) {
            xr3 xr3Var = new xr3(this, list);
            if (!xr3Var.p) {
                tr0 tr0Var = new tr0(xr3Var);
                ((y33) this.t).r(tr0Var);
                xr3Var.q = tr0Var.f4562b;
            } else {
                bo1 c = bo1.c();
                String.format("Already enqueued work ids (%s)", TextUtils.join(", ", xr3Var.n));
                c.f(new Throwable[0]);
            }
            return xr3Var.q;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void c0() {
        synchronized (B) {
            this.x = true;
            BroadcastReceiver.PendingResult pendingResult = this.y;
            if (pendingResult != null) {
                pendingResult.finish();
                this.y = null;
            }
        }
    }

    public final void d0() {
        ArrayList f;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.q;
            String str = c53.e;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (f = c53.f(context, jobScheduler)) != null && !f.isEmpty()) {
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    c53.b(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        ts3 n = this.s.n();
        gl2 gl2Var = n.f4567a;
        gl2Var.b();
        ss3 ss3Var = n.i;
        o31 a2 = ss3Var.a();
        gl2Var.c();
        try {
            a2.K();
            gl2Var.h();
            gl2Var.f();
            ss3Var.c(a2);
            kn2.a(this.r, this.s, this.u);
        } catch (Throwable th) {
            gl2Var.f();
            ss3Var.c(a2);
            throw th;
        }
    }

    public final void e0(String str, y33 y33Var) {
        ((y33) this.t).r(new ku(this, str, y33Var, 7));
    }

    public final void f0(String str) {
        ((y33) this.t).r(new l13(this, str, false));
    }
}
