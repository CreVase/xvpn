package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c53 implements hn2 {
    public static final String e = bo1.e("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f585a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f586b;
    public final hs3 c;
    public final b53 d;

    public c53(Context context, hs3 hs3Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        b53 b53Var = new b53(context);
        this.f585a = context;
        this.c = hs3Var;
        this.f586b = jobScheduler;
        this.d = b53Var;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            bo1.c().b(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = f(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L31
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L31
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r2 = r6
        L32:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c53.d(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            bo1.c().b(e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // defpackage.hn2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.hn2
    public final void c(String str) {
        Context context = this.f585a;
        JobScheduler jobScheduler = this.f586b;
        ArrayList d = d(context, jobScheduler, str);
        if (d != null && !d.isEmpty()) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                b(jobScheduler, ((Integer) it.next()).intValue());
            }
            this.c.s.k().F(str);
        }
    }

    @Override // defpackage.hn2
    public final void e(rs3... rs3VarArr) {
        ok0 j;
        v62 v62Var;
        gl2 gl2Var;
        int i;
        ArrayList d;
        int F;
        hs3 hs3Var = this.c;
        WorkDatabase workDatabase = hs3Var.s;
        ja1 ja1Var = new ja1(workDatabase, 0);
        for (rs3 rs3Var : rs3VarArr) {
            workDatabase.c();
            try {
                rs3 h = workDatabase.n().h(rs3Var.f4206a);
                if (h == null) {
                    bo1.c().f(new Throwable[0]);
                    workDatabase.h();
                } else if (h.f4207b != fs3.ENQUEUED) {
                    bo1.c().f(new Throwable[0]);
                    workDatabase.h();
                } else {
                    a53 x = workDatabase.k().x(rs3Var.f4206a);
                    if (x != null) {
                        i = x.f28b;
                    } else {
                        hs3Var.r.getClass();
                        int i2 = hs3Var.r.g;
                        synchronized (ja1.class) {
                            int E = ja1Var.E("next_job_scheduler_id");
                            try {
                                if (E >= 0 && E <= i2) {
                                    i = E;
                                }
                                j.f3682b.e(v62Var);
                                gl2Var.h();
                                gl2Var.f();
                                i = 0;
                            } finally {
                            }
                            j = ((WorkDatabase) ja1Var.f2735b).j();
                            v62Var = new v62("next_job_scheduler_id", 1);
                            gl2Var = j.f3681a;
                            gl2Var.b();
                            gl2Var.c();
                        }
                    }
                    if (x == null) {
                        hs3Var.s.k().A(new a53(rs3Var.f4206a, i));
                    }
                    g(rs3Var, i);
                    if (Build.VERSION.SDK_INT == 23 && (d = d(this.f585a, this.f586b, rs3Var.f4206a)) != null) {
                        int indexOf = d.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            d.remove(indexOf);
                        }
                        if (!d.isEmpty()) {
                            F = ((Integer) d.get(0)).intValue();
                        } else {
                            hs3Var.r.getClass();
                            F = ja1Var.F(hs3Var.r.g);
                        }
                        g(rs3Var, F);
                    }
                    workDatabase.h();
                }
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0070, code lost:            if (r6 < 26) goto L19;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.rs3 r19, int r20) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c53.g(rs3, int):void");
    }
}
