package defpackage;

/* loaded from: classes2.dex */
public final class s12 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public final uh1 f4256a;

    /* renamed from: b, reason: collision with root package name */
    public final np2 f4257b;

    public s12(uh1 uh1Var) {
        this.f4256a = uh1Var;
        this.f4257b = new np2(uh1Var.getDescriptor());
    }

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        if (qe0Var.z()) {
            return qe0Var.h(this.f4256a);
        }
        qe0Var.r();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m20.L(gi2.a(s12.class), gi2.a(obj.getClass())) && m20.L(this.f4256a, ((s12) obj).f4256a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return this.f4257b;
    }

    public final int hashCode() {
        return this.f4256a.hashCode();
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        if (obj != null) {
            ir0Var.u();
            ir0Var.g(this.f4256a, obj);
        } else {
            ir0Var.f();
        }
    }
}
