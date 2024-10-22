package defpackage;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class m52 implements gn2 {
    public static final int d;

    /* renamed from: a, reason: collision with root package name */
    public final int f3235a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f3236b;
    public final JobScheduler c;

    static {
        int i;
        if (wi3.f5017a >= 26) {
            i = 16;
        } else {
            i = 0;
        }
        d = i | 15;
    }

    public m52(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f3235a = i;
        this.f3236b = new ComponentName(applicationContext, (Class<?>) l52.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.c = jobScheduler;
    }
}
