package androidx.fragment.app;

import defpackage.b21;
import defpackage.em3;
import defpackage.km3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends em3 {
    public static final b21 j = new b21();
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public q(boolean z) {
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.d.equals(qVar.d) && this.e.equals(qVar.e) && this.f.equals(qVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.em3
    public final void f() {
        if (p.I(3)) {
            toString();
        }
        this.h = true;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final void i(Fragment fragment) {
        if (this.i) {
            return;
        }
        HashMap hashMap = this.d;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (p.I(2)) {
            fragment.toString();
        }
    }

    public final void l(String str, boolean z) {
        HashMap hashMap = this.e;
        q qVar = (q) hashMap.get(str);
        if (qVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(qVar.e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qVar.l((String) it.next(), true);
                }
            }
            qVar.f();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f;
        km3 km3Var = (km3) hashMap2.get(str);
        if (km3Var != null) {
            km3Var.a();
            hashMap2.remove(str);
        }
    }

    public final void m(Fragment fragment) {
        boolean z;
        if (this.i) {
            return;
        }
        if (this.d.remove(fragment.mWho) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && p.I(2)) {
            fragment.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
