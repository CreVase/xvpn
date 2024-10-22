package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.bo1;
import defpackage.hs3;
import defpackage.j20;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f293a = bo1.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bo1 c = bo1.c();
        String.format("Received intent %s", intent);
        c.a(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                hs3 a0 = hs3.a0(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (hs3.B) {
                    a0.y = goAsync;
                    if (a0.x) {
                        goAsync.finish();
                        a0.y = null;
                    }
                }
                return;
            } catch (IllegalStateException e) {
                bo1.c().b(f293a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                return;
            }
        }
        String str = j20.d;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}
