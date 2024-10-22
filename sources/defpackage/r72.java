package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class r72 extends y10 {

    /* renamed from: b, reason: collision with root package name */
    public final q72 f4114b;

    public r72(uh1 uh1Var) {
        super(uh1Var);
        this.f4114b = new q72(uh1Var.getDescriptor());
    }

    @Override // defpackage.u
    public final Object a() {
        return (p72) g(j());
    }

    @Override // defpackage.u
    public final int b(Object obj) {
        return ((p72) obj).d();
    }

    @Override // defpackage.u
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // defpackage.u, defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return e(qe0Var);
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return this.f4114b;
    }

    @Override // defpackage.u
    public final Object h(Object obj) {
        return ((p72) obj).a();
    }

    @Override // defpackage.y10
    public final void i(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Object j();

    public abstract void k(g40 g40Var, Object obj, int i);

    @Override // defpackage.y10, defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        int d = d(obj);
        q72 q72Var = this.f4114b;
        g40 q = ir0Var.q(q72Var);
        k(q, obj, d);
        q.a(q72Var);
    }
}
