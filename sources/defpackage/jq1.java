package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class jq1 extends bx3 {
    public static final Object l0(Map map, Object obj) {
        if (map instanceof fq1) {
            return ((fq1) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static final void m0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n42 n42Var = (n42) it.next();
            linkedHashMap.put(n42Var.f3395a, n42Var.f3396b);
        }
    }

    public static final Map n0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(bx3.N(arrayList.size()));
                m0(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            n42 n42Var = (n42) arrayList.get(0);
            return Collections.singletonMap(n42Var.f3395a, n42Var.f3396b);
        }
        return dr0.f1824a;
    }
}
