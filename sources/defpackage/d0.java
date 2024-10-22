package defpackage;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f1712a;

    /* renamed from: b, reason: collision with root package name */
    public final ml1 f1713b;

    public d0(g0 g0Var, ml1 ml1Var) {
        this.f1712a = g0Var;
        this.f1713b = ml1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1712a.f2184a != this) {
            return;
        }
        if (g0.f.n(this.f1712a, this, g0.e(this.f1713b))) {
            g0.b(this.f1712a);
        }
    }
}
