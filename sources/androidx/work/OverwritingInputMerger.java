package androidx.work;

import defpackage.id0;
import defpackage.jd0;
import defpackage.oc1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends oc1 {
    @Override // defpackage.oc1
    public final jd0 a(ArrayList arrayList) {
        id0 id0Var = new id0();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((jd0) it.next()).f2751a));
        }
        id0Var.a(hashMap);
        jd0 jd0Var = new jd0(id0Var.f2570a);
        jd0.b(jd0Var);
        return jd0Var;
    }
}
