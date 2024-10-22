package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public abstract class e9 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1899a = 0;

    static {
        bo1.e("Alarms");
    }

    public static void a(Context context, int i, String str) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent a2 = j20.a(context, str);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        } else {
            i2 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i, a2, i2);
        if (service != null && alarmManager != null) {
            bo1 c = bo1.c();
            String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i));
            c.a(new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, hs3 hs3Var, String str, long j) {
        int E;
        WorkDatabase workDatabase = hs3Var.s;
        y33 k = workDatabase.k();
        a53 x = k.x(str);
        if (x != null) {
            a(context, x.f28b, str);
            c(context, str, x.f28b, j);
            return;
        }
        ja1 ja1Var = new ja1(workDatabase, 0);
        synchronized (ja1.class) {
            E = ja1Var.E("next_alarm_manager_id");
        }
        k.A(new a53(str, E));
        c(context, str, E, j);
    }

    public static void c(Context context, String str, int i, long j) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i, j20.a(context, str), i2);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
