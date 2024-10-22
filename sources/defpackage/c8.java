package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c8 extends z33 implements l41 {
    public c8(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new c8(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return new c8((c90) obj2).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        d5 d5Var = gf.f2243a;
        ArrayList F = d5.F(mz2.d);
        ArrayList arrayList = new ArrayList();
        Iterator it = F.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
