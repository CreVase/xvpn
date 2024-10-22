package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.b82;
import defpackage.bv3;
import defpackage.dc3;
import defpackage.fi3;
import defpackage.lf;
import defpackage.lm;
import defpackage.y33;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1456a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        dc3.b(getApplicationContext());
        y33 a2 = lm.a();
        a2.G(string);
        a2.H(b82.b(i));
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        fi3 fi3Var = dc3.a().d;
        lm o = a2.o();
        lf lfVar = new lf(8, this, jobParameters);
        fi3Var.getClass();
        fi3Var.e.execute(new bv3(fi3Var, o, i2, lfVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
