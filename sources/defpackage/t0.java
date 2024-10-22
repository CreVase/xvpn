package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public class t0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient r0 f4431a;

    /* renamed from: b, reason: collision with root package name */
    public transient r20 f4432b;
    public final transient Map c;
    public final /* synthetic */ p0 d;

    public t0(p0 p0Var, Map map) {
        this.d = p0Var;
        this.c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        r0 r0Var = this.f4431a;
        if (r0Var == null) {
            r0 r0Var2 = new r0(this);
            this.f4431a = r0Var2;
            return r0Var2;
        }
        return r0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Collection values() {
        r20 r20Var = this.f4432b;
        if (r20Var == null) {
            r20 r20Var2 = new r20(this);
            this.f4432b = r20Var2;
            return r20Var2;
        }
        return r20Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p0 p0Var = this.d;
        if (this.c == p0Var.d) {
            p0Var.clear();
            return;
        }
        s0 s0Var = new s0(this);
        while (s0Var.hasNext()) {
            s0Var.next();
            s0Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final bb1 d(Map.Entry entry) {
        Object d1Var;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        p0 p0Var = this.d;
        p0Var.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            d1Var = new y0(p0Var, key, list, null);
        } else {
            d1Var = new d1(p0Var, key, list, null);
        }
        return new bb1(key, d1Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object d1Var;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        p0 p0Var = this.d;
        p0Var.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            d1Var = new y0(p0Var, obj, list, null);
        } else {
            d1Var = new d1(p0Var, obj, list, null);
        }
        return d1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        p0 p0Var = this.d;
        Set set = p0Var.f2869a;
        if (set == null) {
            Set e = p0Var.e();
            p0Var.f2869a = e;
            return e;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        p0 p0Var = this.d;
        List list = (List) ((by1) p0Var).f.get();
        list.addAll(collection);
        p0Var.e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }
}
