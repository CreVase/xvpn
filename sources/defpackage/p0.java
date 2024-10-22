package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class p0 extends k1 implements Serializable {
    public final transient Map d;
    public transient int e;

    public p0(Map map) {
        if (map.isEmpty()) {
            this.d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.wx1
    public final Map a() {
        Map map = this.c;
        if (map == null) {
            Map d = d();
            this.c = d;
            return d;
        }
        return map;
    }

    @Override // defpackage.wx1
    public final void clear() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }

    @Override // defpackage.k1
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.k1
    public final Iterator f() {
        return new q0(this, 1);
    }

    @Override // defpackage.k1
    public final Iterator g() {
        return new q0(this, 0);
    }

    public final Collection h() {
        return new j1(this, 0);
    }

    public final boolean i(Double d, Integer num) {
        Map map = this.d;
        Collection collection = (Collection) map.get(d);
        if (collection == null) {
            List list = (List) ((by1) this).f.get();
            if (list.add(num)) {
                this.e++;
                map.put(d, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(num)) {
            this.e++;
            return true;
        }
        return false;
    }

    public final Collection j() {
        Collection collection = this.f2870b;
        if (collection == null) {
            Collection h = h();
            this.f2870b = h;
            return h;
        }
        return collection;
    }

    @Override // defpackage.wx1
    public final int size() {
        return this.e;
    }
}
