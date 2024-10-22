package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class hf1 implements ps3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2411a;

    /* renamed from: b, reason: collision with root package name */
    public final os0 f2412b;
    public final cm c;

    public hf1(Context context, os0 os0Var, cm cmVar) {
        this.f2411a = context;
        this.f2412b = os0Var;
        this.c = cmVar;
    }

    public final void a(lm lmVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        Context context = this.f2411a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(lmVar.f3153a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        y72 y72Var = lmVar.c;
        adler32.update(allocate.putInt(b82.a(y72Var)).array());
        byte[] bArr = lmVar.f3154b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        z3 = true;
                    }
                }
            }
            z3 = false;
            if (z3) {
                pe0.n("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", lmVar);
                return;
            }
        }
        SQLiteDatabase a2 = ((am2) this.f2412b).a();
        String valueOf = String.valueOf(b82.a(y72Var));
        String str = lmVar.f3153a;
        long longValue = ((Long) am2.L(a2.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf}), new qy2(5))).longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        cm cmVar = this.c;
        builder.setMinimumLatency(cmVar.a(y72Var, longValue, i));
        Set set = ((dm) cmVar.f666b.get(y72Var)).c;
        if (set.contains(in2.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
            z2 = true;
        } else {
            z2 = true;
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(in2.DEVICE_CHARGING)) {
            builder.setRequiresCharging(z2);
        }
        if (set.contains(in2.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(z2);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", b82.a(y72Var));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {lmVar, Integer.valueOf(value), Long.valueOf(cmVar.a(y72Var, longValue, i)), Long.valueOf(longValue), Integer.valueOf(i)};
        if (Log.isLoggable(pe0.C("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}
