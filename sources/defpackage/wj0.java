package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wj0 implements vr3, ss0, vs3 {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5022b;
    public final String c;
    public final r43 d;
    public final wr3 e;
    public PowerManager.WakeLock h;
    public boolean i = false;
    public int g = 0;
    public final Object f = new Object();

    static {
        bo1.e("DelayMetCommandHandler");
    }

    public wj0(Context context, int i, String str, r43 r43Var) {
        this.f5021a = context;
        this.f5022b = i;
        this.d = r43Var;
        this.c = str;
        this.e = new wr3(context, r43Var.f4101b, this);
    }

    public final void a() {
        synchronized (this.f) {
            this.e.d();
            this.d.c.b(this.c);
            PowerManager.WakeLock wakeLock = this.h;
            if (wakeLock != null && wakeLock.isHeld()) {
                bo1 c = bo1.c();
                String.format("Releasing wakelock %s for WorkSpec %s", this.h, this.c);
                c.a(new Throwable[0]);
                this.h.release();
            }
        }
    }

    @Override // defpackage.ss0
    public final void b(String str, boolean z) {
        bo1 c = bo1.c();
        String.format("onExecuted %s, %s", str, Boolean.valueOf(z));
        c.a(new Throwable[0]);
        a();
        int i = 6;
        int i2 = this.f5022b;
        r43 r43Var = this.d;
        Context context = this.f5021a;
        if (z) {
            r43Var.f(new l30(r43Var, j20.c(context, this.c), i2, i));
        }
        if (this.i) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            r43Var.f(new l30(r43Var, intent, i2, i));
        }
    }

    public final void c() {
        String str = this.c;
        this.h = go3.a(this.f5021a, String.format("%s (%s)", str, Integer.valueOf(this.f5022b)));
        bo1 c = bo1.c();
        String.format("Acquiring wakelock %s for WorkSpec %s", this.h, str);
        c.a(new Throwable[0]);
        this.h.acquire();
        rs3 h = this.d.e.s.n().h(str);
        if (h == null) {
            e();
            return;
        }
        boolean b2 = h.b();
        this.i = b2;
        if (!b2) {
            bo1 c2 = bo1.c();
            String.format("No constraints for %s", str);
            c2.a(new Throwable[0]);
            f(Collections.singletonList(str));
            return;
        }
        this.e.c(Collections.singletonList(h));
    }

    @Override // defpackage.vr3
    public final void d(ArrayList arrayList) {
        e();
    }

    public final void e() {
        synchronized (this.f) {
            if (this.g < 2) {
                this.g = 2;
                bo1 c = bo1.c();
                String.format("Stopping work for WorkSpec %s", this.c);
                c.a(new Throwable[0]);
                Context context = this.f5021a;
                String str = this.c;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str);
                r43 r43Var = this.d;
                int i = 6;
                r43Var.f(new l30(r43Var, intent, this.f5022b, i));
                if (this.d.d.e(this.c)) {
                    bo1 c2 = bo1.c();
                    String.format("WorkSpec %s needs to be rescheduled", this.c);
                    c2.a(new Throwable[0]);
                    Intent c3 = j20.c(this.f5021a, this.c);
                    r43 r43Var2 = this.d;
                    r43Var2.f(new l30(r43Var2, c3, this.f5022b, i));
                } else {
                    bo1 c4 = bo1.c();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.c);
                    c4.a(new Throwable[0]);
                }
            } else {
                bo1 c5 = bo1.c();
                String.format("Already stopped work for %s", this.c);
                c5.a(new Throwable[0]);
            }
        }
    }

    @Override // defpackage.vr3
    public final void f(List list) {
        if (!list.contains(this.c)) {
            return;
        }
        synchronized (this.f) {
            if (this.g == 0) {
                this.g = 1;
                bo1 c = bo1.c();
                String.format("onAllConstraintsMet for %s", this.c);
                c.a(new Throwable[0]);
                if (this.d.d.h(this.c, null)) {
                    this.d.c.a(this.c, this);
                } else {
                    a();
                }
            } else {
                bo1 c2 = bo1.c();
                String.format("Already started work for %s", this.c);
                c2.a(new Throwable[0]);
            }
        }
    }
}
