package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class sk1 extends wk1 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(Object obj, long j, int i) {
        hj1 hj1Var;
        List arrayList;
        List list = (List) zh3.n(obj, j);
        if (list.isEmpty()) {
            if (list instanceof jj1) {
                arrayList = new hj1(i);
            } else if ((list instanceof v72) && (list instanceof xd1)) {
                arrayList = ((xd1) list).mutableCopyWithCapacity(i);
            } else {
                arrayList = new ArrayList(i);
            }
            zh3.u(obj, j, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zh3.u(obj, j, arrayList2);
            hj1Var = arrayList2;
        } else if (list instanceof qh3) {
            hj1 hj1Var2 = new hj1(list.size() + i);
            hj1Var2.addAll((qh3) list);
            zh3.u(obj, j, hj1Var2);
            hj1Var = hj1Var2;
        } else {
            if ((list instanceof v72) && (list instanceof xd1)) {
                xd1 xd1Var = (xd1) list;
                if (!((q1) xd1Var).f3948a) {
                    xd1 mutableCopyWithCapacity = xd1Var.mutableCopyWithCapacity(list.size() + i);
                    zh3.u(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return list;
            }
            return list;
        }
        return hj1Var;
    }

    @Override // defpackage.wk1
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zh3.n(obj, j);
        if (list instanceof jj1) {
            unmodifiableList = ((jj1) list).getUnmodifiableView();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof v72) && (list instanceof xd1)) {
                q1 q1Var = (q1) ((xd1) list);
                if (q1Var.f3948a) {
                    q1Var.f3948a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zh3.u(obj, j, unmodifiableList);
    }

    @Override // defpackage.wk1
    public final void b(Object obj, Object obj2, long j) {
        List list = (List) zh3.n(obj2, j);
        List d = d(obj, j, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        zh3.u(obj, j, list);
    }

    @Override // defpackage.wk1
    public final List c(Object obj, long j) {
        return d(obj, j, 10);
    }
}
