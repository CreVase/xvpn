package defpackage;

/* loaded from: classes.dex */
public final class zt0 implements b62 {

    /* renamed from: a, reason: collision with root package name */
    public zt0 f5542a;

    /* renamed from: b, reason: collision with root package name */
    public zt0 f5543b;

    public final void a(float[] fArr, long j) {
        zt0 zt0Var = this.f5543b;
        if (zt0Var != null) {
            zt0Var.a(fArr, j);
        }
    }

    public final void b() {
        zt0 zt0Var = this.f5543b;
        if (zt0Var != null) {
            zt0Var.b();
        }
    }

    @Override // defpackage.b62
    public final void c(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i == 10000) {
                    p71.C(obj);
                    return;
                }
                return;
            }
            this.f5543b = (zt0) obj;
            return;
        }
        this.f5542a = (zt0) obj;
    }

    public final void d(long j, long j2) {
        zt0 zt0Var = this.f5542a;
        if (zt0Var != null) {
            zt0Var.d(j, j2);
        }
    }
}
