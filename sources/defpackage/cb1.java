package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class cb1 extends za1 {
    public final void Z(Object obj) {
        obj.getClass();
        Y(this.r + 1);
        Object[] objArr = this.q;
        int i = this.r;
        this.r = i + 1;
        objArr[i] = obj;
    }

    public final void a0(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            Y(list2.size() + this.r);
            if (list2 instanceof ab1) {
                this.r = ((ab1) list2).c(this.q, this.r);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public final ji2 b0() {
        this.s = true;
        return hb1.j(this.r, this.q);
    }
}
