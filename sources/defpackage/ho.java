package defpackage;

/* loaded from: classes.dex */
public abstract class ho implements y12 {

    /* renamed from: a, reason: collision with root package name */
    public transient z92 f2455a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y12
    public final void a(x12 x12Var) {
        synchronized (this) {
            if (this.f2455a == null) {
                this.f2455a = new z92();
            }
        }
        this.f2455a.a((z12) x12Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y12
    public final void b(x12 x12Var) {
        synchronized (this) {
            z92 z92Var = this.f2455a;
            if (z92Var == null) {
                return;
            }
            z92Var.f((z12) x12Var);
        }
    }

    public final void e(int i) {
        synchronized (this) {
            z92 z92Var = this.f2455a;
            if (z92Var == null) {
                return;
            }
            z92Var.c(i, this);
        }
    }
}
