package defpackage;

/* loaded from: classes.dex */
public abstract class g51 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public final m51 f2206a;

    /* renamed from: b, reason: collision with root package name */
    public m51 f2207b;
    public boolean c = false;

    public g51(m51 m51Var) {
        this.f2206a = m51Var;
        this.f2207b = (m51) m51Var.d(l51.NEW_MUTABLE_INSTANCE);
    }

    public static void d(m51 m51Var, m51 m51Var2) {
        ka2 ka2Var = ka2.c;
        ka2Var.getClass();
        ka2Var.a(m51Var.getClass()).mergeFrom(m51Var, m51Var2);
    }

    public final m51 a() {
        m51 b2 = b();
        if (b2.g()) {
            return b2;
        }
        throw new ju0();
    }

    public final m51 b() {
        if (this.c) {
            return this.f2207b;
        }
        m51 m51Var = this.f2207b;
        m51Var.getClass();
        ka2 ka2Var = ka2.c;
        ka2Var.getClass();
        ka2Var.a(m51Var.getClass()).makeImmutable(m51Var);
        this.c = true;
        return this.f2207b;
    }

    public final void c() {
        if (this.c) {
            m51 m51Var = (m51) this.f2207b.d(l51.NEW_MUTABLE_INSTANCE);
            d(m51Var, this.f2207b);
            this.f2207b = m51Var;
            this.c = false;
        }
    }

    public final Object clone() {
        g51 g51Var = (g51) this.f2206a.d(l51.NEW_BUILDER);
        m51 b2 = b();
        g51Var.c();
        d(g51Var.f2207b, b2);
        return g51Var;
    }
}
