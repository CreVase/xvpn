package defpackage;

/* loaded from: classes2.dex */
public final class h63 extends f63 {
    public final Runnable c;

    public h63(Runnable runnable, long j, os osVar) {
        super(j, osVar);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } finally {
            this.f2051b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(pe0.u(runnable));
        sb.append(", ");
        sb.append(this.f2050a);
        sb.append(", ");
        sb.append(this.f2051b);
        sb.append(']');
        return sb.toString();
    }
}
