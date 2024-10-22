package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class kb1 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient li2 f2923a;

    /* renamed from: b, reason: collision with root package name */
    public transient mi2 f2924b;
    public transient ni2 c;

    public static jb1 a() {
        return new jb1(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kb1 c(HashMap hashMap) {
        int i;
        if ((hashMap instanceof kb1) && !(hashMap instanceof SortedMap)) {
            kb1 kb1Var = (kb1) hashMap;
            kb1Var.getClass();
            return kb1Var;
        }
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z = entrySet instanceof Collection;
        if (z) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        jb1 jb1Var = new jb1(i);
        if (z) {
            int size = (entrySet.size() + jb1Var.f2739b) * 2;
            Object[] objArr = jb1Var.f2738a;
            if (size > objArr.length) {
                jb1Var.f2738a = Arrays.copyOf(objArr, pe0.q(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            jb1Var.b(entry.getKey(), entry.getValue());
        }
        return jb1Var.a();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ob1 entrySet() {
        li2 li2Var = this.f2923a;
        if (li2Var == null) {
            oi2 oi2Var = (oi2) this;
            li2 li2Var2 = new li2(oi2Var, oi2Var.e, oi2Var.f);
            this.f2923a = li2Var2;
            return li2Var2;
        }
        return li2Var;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ab1 values() {
        ni2 ni2Var = this.c;
        if (ni2Var == null) {
            oi2 oi2Var = (oi2) this;
            ni2 ni2Var2 = new ni2(oi2Var.e, 1, oi2Var.f);
            this.c = ni2Var2;
            return ni2Var2;
        }
        return ni2Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return m20.f0(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return cp3.z(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((oi2) this).f == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        mi2 mi2Var = this.f2924b;
        if (mi2Var == null) {
            oi2 oi2Var = (oi2) this;
            mi2 mi2Var2 = new mi2(oi2Var, new ni2(oi2Var.e, 0, oi2Var.f));
            this.f2924b = mi2Var2;
            return mi2Var2;
        }
        return mi2Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((oi2) this).f;
        m20.T(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
