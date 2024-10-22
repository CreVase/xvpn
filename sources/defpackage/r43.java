package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class r43 implements ss0 {
    public static final String k = bo1.e("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4100a;

    /* renamed from: b, reason: collision with root package name */
    public final g63 f4101b;
    public final xs3 c;
    public final v82 d;
    public final hs3 e;
    public final j20 f;
    public final Handler g;
    public final ArrayList h;
    public Intent i;
    public q43 j;

    public r43(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4100a = applicationContext;
        this.f = new j20(applicationContext);
        this.c = new xs3();
        hs3 a0 = hs3.a0(context);
        this.e = a0;
        v82 v82Var = a0.v;
        this.d = v82Var;
        this.f4101b = a0.t;
        v82Var.a(this);
        this.h = new ArrayList();
        this.i = null;
        this.g = new Handler(Looper.getMainLooper());
    }

    public final void a(int i, Intent intent) {
        bo1 c = bo1.c();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i));
        c.a(new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            bo1.c().f(new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.h) {
            boolean z = !this.h.isEmpty();
            this.h.add(intent);
            if (!z) {
                g();
            }
        }
    }

    @Override // defpackage.ss0
    public final void b(String str, boolean z) {
        String str2 = j20.d;
        Intent intent = new Intent(this.f4100a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        f(new l30(this, intent, 0, 6));
    }

    public final void c() {
        if (this.g.getLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.h) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void e() {
        bo1.c().a(new Throwable[0]);
        this.d.f(this);
        ScheduledExecutorService scheduledExecutorService = this.c.f5214a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.j = null;
    }

    public final void f(Runnable runnable) {
        this.g.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock a2 = go3.a(this.f4100a, "ProcessCommand");
        try {
            a2.acquire();
            ((y33) this.e.t).r(new p43(this, 0));
        } finally {
            a2.release();
        }
    }
}
