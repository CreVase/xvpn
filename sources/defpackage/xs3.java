package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xs3 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f5214a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5215b;
    public final HashMap c;
    public final Object d;

    static {
        bo1.e("WorkTimer");
    }

    public xs3() {
        nj2 nj2Var = new nj2(this);
        this.f5215b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.f5214a = Executors.newSingleThreadScheduledExecutor(nj2Var);
    }

    public final void a(String str, vs3 vs3Var) {
        synchronized (this.d) {
            bo1 c = bo1.c();
            String.format("Starting timer for %s", str);
            c.a(new Throwable[0]);
            b(str);
            ws3 ws3Var = new ws3(this, str);
            this.f5215b.put(str, ws3Var);
            this.c.put(str, vs3Var);
            this.f5214a.schedule(ws3Var, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            if (((ws3) this.f5215b.remove(str)) != null) {
                bo1 c = bo1.c();
                String.format("Stopping timer for %s", str);
                c.a(new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}
