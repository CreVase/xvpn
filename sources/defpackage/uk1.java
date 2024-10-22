package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class uk1 extends wk1 {
    @Override // defpackage.wk1
    public final void a(Object obj, long j) {
        ((q1) ((xd1) zh3.n(obj, j))).f3948a = false;
    }

    @Override // defpackage.wk1
    public final void b(Object obj, Object obj2, long j) {
        xd1 xd1Var = (xd1) zh3.n(obj, j);
        xd1 xd1Var2 = (xd1) zh3.n(obj2, j);
        int size = xd1Var.size();
        int size2 = xd1Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((q1) xd1Var).f3948a) {
                xd1Var = xd1Var.mutableCopyWithCapacity(size2 + size);
            }
            xd1Var.addAll(xd1Var2);
        }
        if (size > 0) {
            xd1Var2 = xd1Var;
        }
        zh3.u(obj, j, xd1Var2);
    }

    @Override // defpackage.wk1
    public final List c(Object obj, long j) {
        int i;
        xd1 xd1Var = (xd1) zh3.n(obj, j);
        if (!((q1) xd1Var).f3948a) {
            int size = xd1Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            xd1 mutableCopyWithCapacity = xd1Var.mutableCopyWithCapacity(i);
            zh3.u(obj, j, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return xd1Var;
    }
}
