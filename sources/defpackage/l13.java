package defpackage;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class l13 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final hs3 f3047a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3048b;
    public final boolean c;

    static {
        bo1.e("StopWorkRunnable");
    }

    public l13(hs3 hs3Var, String str, boolean z) {
        this.f3047a = hs3Var;
        this.f3048b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean k;
        hs3 hs3Var = this.f3047a;
        WorkDatabase workDatabase = hs3Var.s;
        v82 v82Var = hs3Var.v;
        ts3 n = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f3048b;
            synchronized (v82Var.k) {
                containsKey = v82Var.f.containsKey(str);
            }
            if (this.c) {
                k = this.f3047a.v.j(this.f3048b);
            } else {
                if (!containsKey && n.e(this.f3048b) == fs3.RUNNING) {
                    n.l(fs3.ENQUEUED, this.f3048b);
                }
                k = this.f3047a.v.k(this.f3048b);
            }
            bo1 c = bo1.c();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f3048b, Boolean.valueOf(k));
            c.a(new Throwable[0]);
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}
