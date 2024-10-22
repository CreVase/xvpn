package defpackage;

/* loaded from: classes.dex */
public final class ws3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final xs3 f5065a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5066b;

    public ws3(xs3 xs3Var, String str) {
        this.f5065a = xs3Var;
        this.f5066b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5065a.d) {
            if (((ws3) this.f5065a.f5215b.remove(this.f5066b)) != null) {
                vs3 vs3Var = (vs3) this.f5065a.c.remove(this.f5066b);
                if (vs3Var != null) {
                    String str = this.f5066b;
                    bo1 c = bo1.c();
                    String.format("Exceeded time limits on execution for %s", str);
                    int i = wj0.j;
                    c.a(new Throwable[0]);
                    ((wj0) vs3Var).e();
                }
            } else {
                bo1 c2 = bo1.c();
                String.format("Timer with %s is already marked as complete.", this.f5066b);
                c2.a(new Throwable[0]);
            }
        }
    }
}
