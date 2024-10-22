package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class u implements uh1 {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // defpackage.sk0
    public Object deserialize(qe0 qe0Var) {
        return e(qe0Var);
    }

    public final Object e(qe0 qe0Var) {
        Object a2 = a();
        int b2 = b(a2);
        f40 c = qe0Var.c(getDescriptor());
        c.A();
        while (true) {
            int j = c.j(getDescriptor());
            if (j != -1) {
                f(c, j + b2, a2, true);
            } else {
                c.a(getDescriptor());
                return h(a2);
            }
        }
    }

    public abstract void f(f40 f40Var, int i, Object obj, boolean z);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
