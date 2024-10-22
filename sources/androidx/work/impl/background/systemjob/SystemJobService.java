package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.bo1;
import defpackage.hs3;
import defpackage.ss0;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements ss0 {
    public static final String c = bo1.e("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public hs3 f295a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f296b = new HashMap();

    @Override // defpackage.ss0
    public final void b(String str, boolean z) {
        JobParameters jobParameters;
        bo1 c2 = bo1.c();
        String.format("%s executed on JobScheduler", str);
        c2.a(new Throwable[0]);
        synchronized (this.f296b) {
            jobParameters = (JobParameters) this.f296b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            hs3 a0 = hs3.a0(getApplicationContext());
            this.f295a = a0;
            a0.v.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                bo1.c().f(new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        hs3 hs3Var = this.f295a;
        if (hs3Var != null) {
            hs3Var.v.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            hs3 r0 = r8.f295a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            bo1 r0 = defpackage.bo1.c()
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r0.a(r3)
            r8.jobFinished(r9, r1)
            return r2
        L13:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r3 = 0
            android.os.PersistableBundle r4 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r4 == 0) goto L27
            boolean r5 = r4.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r5 == 0) goto L27
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r0 = r3
        L28:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L3c
            bo1 r9 = defpackage.bo1.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L3c:
            java.util.HashMap r4 = r8.f296b
            monitor-enter(r4)
            java.util.HashMap r5 = r8.f296b     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L5b
            bo1 r9 = defpackage.bo1.c()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb0
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lb0
            java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb0
            r9.a(r0)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            return r2
        L5b:
            bo1 r5 = defpackage.bo1.c()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb0
            r7[r2] = r0     // Catch: java.lang.Throwable -> Lb0
            java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb0
            r5.a(r2)     // Catch: java.lang.Throwable -> Lb0
            java.util.HashMap r2 = r8.f296b     // Catch: java.lang.Throwable -> Lb0
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto Laa
            y33 r3 = new y33
            r4 = 9
            r3.<init>(r4)
            android.net.Uri[] r4 = defpackage.q62.x(r9)
            if (r4 == 0) goto L90
            android.net.Uri[] r4 = defpackage.q62.x(r9)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.c = r4
        L90:
            java.lang.String[] r4 = defpackage.q62.y(r9)
            if (r4 == 0) goto La0
            java.lang.String[] r4 = defpackage.q62.y(r9)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f5263b = r4
        La0:
            r4 = 28
            if (r2 < r4) goto Laa
            android.net.Network r9 = defpackage.s2.g(r9)
            r3.d = r9
        Laa:
            hs3 r9 = r8.f295a
            r9.e0(r0, r3)
            return r1
        Lb0:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            hs3 r0 = r5.f295a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            bo1 r6 = defpackage.bo1.c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r6.a(r0)
            return r1
        L10:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L23
            if (r6 == 0) goto L23
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L23
            if (r3 == 0) goto L23
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L23
            goto L24
        L23:
            r6 = 0
        L24:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L38
            bo1 r6 = defpackage.bo1.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.b(r0, r1, r3)
            return r2
        L38:
            bo1 r0 = defpackage.bo1.c()
            java.lang.String r3 = "onStopJob for %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r6
            java.lang.String.format(r3, r4)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r2)
            java.util.HashMap r0 = r5.f296b
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f296b     // Catch: java.lang.Throwable -> L62
            r2.remove(r6)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            hs3 r0 = r5.f295a
            r0.f0(r6)
            hs3 r0 = r5.f295a
            v82 r0 = r0.v
            boolean r6 = r0.d(r6)
            r6 = r6 ^ r1
            return r6
        L62:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
