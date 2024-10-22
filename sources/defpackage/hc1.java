package defpackage;

/* loaded from: classes.dex */
public final class hc1 implements im3 {

    /* renamed from: a, reason: collision with root package name */
    public final fm3[] f2400a;

    public hc1(fm3... fm3VarArr) {
        this.f2400a = fm3VarArr;
    }

    @Override // defpackage.im3
    public final em3 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // defpackage.im3
    public final em3 b(Class cls, dy1 dy1Var) {
        em3 em3Var = null;
        for (fm3 fm3Var : this.f2400a) {
            if (m20.L(fm3Var.f2121a, cls)) {
                Object invoke = fm3Var.f2122b.invoke(dy1Var);
                if (invoke instanceof em3) {
                    em3Var = (em3) invoke;
                } else {
                    em3Var = null;
                }
            }
        }
        if (em3Var != null) {
            return em3Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
