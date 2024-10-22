package defpackage;

/* loaded from: classes2.dex */
public final class q32 implements fb2, sj0 {
    public static final ef0 c = new ef0(24);
    public static final a40 d = new a40(1);

    /* renamed from: a, reason: collision with root package name */
    public qj0 f3955a;

    /* renamed from: b, reason: collision with root package name */
    public volatile fb2 f3956b;

    public q32(ef0 ef0Var, fb2 fb2Var) {
        this.f3955a = ef0Var;
        this.f3956b = fb2Var;
    }

    public final void a(qj0 qj0Var) {
        fb2 fb2Var;
        fb2 fb2Var2;
        fb2 fb2Var3 = this.f3956b;
        a40 a40Var = d;
        if (fb2Var3 != a40Var) {
            qj0Var.g(fb2Var3);
            return;
        }
        synchronized (this) {
            fb2Var = this.f3956b;
            if (fb2Var != a40Var) {
                fb2Var2 = fb2Var;
            } else {
                this.f3955a = new ti0(18, this.f3955a, qj0Var);
                fb2Var2 = null;
            }
        }
        if (fb2Var2 != null) {
            qj0Var.g(fb2Var);
        }
    }

    @Override // defpackage.fb2
    public final Object get() {
        return this.f3956b.get();
    }
}
