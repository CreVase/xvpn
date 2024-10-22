package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o01 implements Runnable {
    public static final String d = bo1.e("ForceStopRunnable");
    public static final long e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3574a;

    /* renamed from: b, reason: collision with root package name */
    public final hs3 f3575b;
    public int c = 0;

    public o01(Context context, hs3 hs3Var) {
        this.f3574a = context.getApplicationContext();
        this.f3575b = hs3Var;
    }

    public static void c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (ur.b()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o01.a():void");
    }

    public final boolean b() {
        u40 u40Var = this.f3575b.r;
        u40Var.getClass();
        if (TextUtils.isEmpty(null)) {
            bo1.c().a(new Throwable[0]);
            return true;
        }
        boolean a2 = u82.a(this.f3574a, u40Var);
        bo1 c = bo1.c();
        String.format("Is default app process = %s", Boolean.valueOf(a2));
        c.a(new Throwable[0]);
        return a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = d;
        hs3 hs3Var = this.f3575b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                bs3.a(this.f3574a);
                bo1.c().a(new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    int i = this.c + 1;
                    this.c = i;
                    if (i < 3) {
                        long j = i * 300;
                        bo1 c = bo1.c();
                        String.format("Retrying after %s", Long.valueOf(j));
                        c.a(e2);
                        try {
                            Thread.sleep(this.c * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        bo1.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        hs3Var.r.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            hs3Var.c0();
        }
    }
}
