package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class pj0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final v51 f3851b;

    public pj0(Set set, v51 v51Var) {
        this.f3850a = b(set);
        this.f3851b = v51Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            vl vlVar = (vl) it.next();
            sb.append(vlVar.f4852a);
            sb.append('/');
            sb.append(vlVar.f4853b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        v51 v51Var = this.f3851b;
        synchronized (((Set) v51Var.f4780b)) {
            unmodifiableSet = Collections.unmodifiableSet((Set) v51Var.f4780b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f3850a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(v51Var.o());
    }
}
