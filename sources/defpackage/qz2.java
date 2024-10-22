package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qz2 extends z33 implements l41 {
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(boolean z, c90 c90Var) {
        super(2, c90Var);
        this.e = z;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new qz2(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((qz2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        d5 d5Var = gf.f2243a;
        ArrayList F = d5.F(this.e);
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
