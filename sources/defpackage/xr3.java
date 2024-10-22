package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class xr3 extends bx3 {
    public final hs3 l;
    public final List m;
    public final ArrayList n;
    public final ArrayList o = new ArrayList();
    public boolean p;
    public x50 q;

    static {
        bo1.e("WorkContinuationImpl");
    }

    public xr3(hs3 hs3Var, List list) {
        this.l = hs3Var;
        this.m = list;
        this.n = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((os3) list.get(i)).f3722a.toString();
            this.n.add(uuid);
            this.o.add(uuid);
        }
    }

    public static boolean l0(xr3 xr3Var, HashSet hashSet) {
        hashSet.addAll(xr3Var.n);
        HashSet m0 = m0(xr3Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (m0.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(xr3Var.n);
        return false;
    }

    public static HashSet m0(xr3 xr3Var) {
        HashSet hashSet = new HashSet();
        xr3Var.getClass();
        return hashSet;
    }
}
