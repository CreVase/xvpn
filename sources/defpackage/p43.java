package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class p43 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3781a;

    /* renamed from: b, reason: collision with root package name */
    public final r43 f3782b;

    public /* synthetic */ p43(r43 r43Var, int i) {
        this.f3781a = i;
        this.f3782b = r43Var;
    }

    private void a() {
        r43 r43Var = this.f3782b;
        r43Var.getClass();
        bo1 c = bo1.c();
        String str = r43.k;
        c.a(new Throwable[0]);
        r43Var.c();
        synchronized (r43Var.h) {
            if (r43Var.i != null) {
                bo1 c2 = bo1.c();
                String.format("Removing command %s", r43Var.i);
                c2.a(new Throwable[0]);
                if (((Intent) r43Var.h.remove(0)).equals(r43Var.i)) {
                    r43Var.i = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            rp2 rp2Var = (rp2) ((y33) r43Var.f4101b).f5263b;
            if (!r43Var.f.d() && r43Var.h.isEmpty() && !rp2Var.a()) {
                bo1.c().a(new Throwable[0]);
                q43 q43Var = r43Var.j;
                if (q43Var != null) {
                    ((SystemAlarmService) q43Var).b();
                }
            } else if (!r43Var.h.isEmpty()) {
                r43Var.g();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        r43 r43Var;
        p43 p43Var;
        switch (this.f3781a) {
            case 0:
                synchronized (this.f3782b.h) {
                    r43 r43Var2 = this.f3782b;
                    r43Var2.i = (Intent) r43Var2.h.get(0);
                }
                Intent intent = this.f3782b.i;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f3782b.i.getIntExtra("KEY_START_ID", 0);
                    bo1 c = bo1.c();
                    String str = r43.k;
                    int i = 1;
                    String.format("Processing command %s, %s", this.f3782b.i, Integer.valueOf(intExtra));
                    c.a(new Throwable[0]);
                    PowerManager.WakeLock a2 = go3.a(this.f3782b.f4100a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                    try {
                        bo1 c2 = bo1.c();
                        String.format("Acquiring operation wake lock (%s) %s", action, a2);
                        c2.a(new Throwable[0]);
                        a2.acquire();
                        r43 r43Var3 = this.f3782b;
                        r43Var3.f.e(r43Var3.i, intExtra, r43Var3);
                        bo1 c3 = bo1.c();
                        String.format("Releasing operation wake lock (%s) %s", action, a2);
                        c3.a(new Throwable[0]);
                        a2.release();
                        r43Var = this.f3782b;
                        p43Var = new p43(r43Var, i);
                    } catch (Throwable th) {
                        try {
                            bo1.c().b(r43.k, "Unexpected error in onHandleIntent", th);
                            bo1 c4 = bo1.c();
                            String.format("Releasing operation wake lock (%s) %s", action, a2);
                            c4.a(new Throwable[0]);
                            a2.release();
                            r43Var = this.f3782b;
                            p43Var = new p43(r43Var, i);
                        } catch (Throwable th2) {
                            bo1 c5 = bo1.c();
                            String str2 = r43.k;
                            String.format("Releasing operation wake lock (%s) %s", action, a2);
                            c5.a(new Throwable[0]);
                            a2.release();
                            r43 r43Var4 = this.f3782b;
                            r43Var4.f(new p43(r43Var4, i));
                            throw th2;
                        }
                    }
                    r43Var.f(p43Var);
                    return;
                }
                return;
            default:
                a();
                return;
        }
    }
}
