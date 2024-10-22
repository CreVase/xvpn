package defpackage;

/* loaded from: classes.dex */
public final class mq1 extends e11 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public mq1(a93 a93Var, Object obj, Object obj2) {
        super(a93Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.e11, defpackage.a93
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.e11, defpackage.a93
    public final y83 g(int i, y83 y83Var, boolean z) {
        this.e.g(i, y83Var, z);
        if (wi3.a(y83Var.f5294b, this.g) && z) {
            y83Var.f5294b = h;
        }
        return y83Var;
    }

    @Override // defpackage.e11, defpackage.a93
    public final Object m(int i) {
        Object m = this.e.m(i);
        if (wi3.a(m, this.g)) {
            return h;
        }
        return m;
    }

    @Override // defpackage.e11, defpackage.a93
    public final z83 o(int i, z83 z83Var, long j) {
        this.e.o(i, z83Var, j);
        if (wi3.a(z83Var.f5444a, this.f)) {
            z83Var.f5444a = z83.r;
        }
        return z83Var;
    }
}
