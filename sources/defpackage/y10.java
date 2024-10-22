package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class y10 extends u {

    /* renamed from: a, reason: collision with root package name */
    public final uh1 f5256a;

    public y10(uh1 uh1Var) {
        this.f5256a = uh1Var;
    }

    @Override // defpackage.u
    public void f(f40 f40Var, int i, Object obj, boolean z) {
        i(i, obj, f40Var.t(getDescriptor(), i, this.f5256a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, Object obj) {
        int d = d(obj);
        mp2 descriptor = getDescriptor();
        g40 q = ir0Var.q(descriptor);
        Iterator c = c(obj);
        for (int i = 0; i < d; i++) {
            q.p(getDescriptor(), i, this.f5256a, c.next());
        }
        q.a(descriptor);
    }
}
