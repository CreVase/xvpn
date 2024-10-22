package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class iw2 extends AbstractMap {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2661a;
    public boolean d;
    public volatile o20 e;

    /* renamed from: b, reason: collision with root package name */
    public List f2662b = Collections.emptyList();
    public Map c = Collections.emptyMap();
    public Map f = Collections.emptyMap();

    public iw2(int i) {
        this.f2661a = i;
    }

    public final int a(Comparable comparable) {
        int size = this.f2662b.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((rw2) this.f2662b.get(size)).f4224a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((rw2) this.f2662b.get(i2)).f4224a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public final void c() {
        if (!this.d) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        c();
        if (!this.f2662b.isEmpty()) {
            this.f2662b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new o20(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw2)) {
            return super.equals(obj);
        }
        iw2 iw2Var = (iw2) obj;
        int size = size();
        if (size != iw2Var.size()) {
            return false;
        }
        int j = j();
        if (j != iw2Var.j()) {
            return entrySet().equals(iw2Var.entrySet());
        }
        for (int i = 0; i < j; i++) {
            if (!i(i).equals(iw2Var.i(i))) {
                return false;
            }
        }
        if (j == size) {
            return true;
        }
        return this.c.equals(iw2Var.c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((rw2) this.f2662b.get(a2)).f4225b;
        }
        return this.c.get(comparable);
    }

    public final Map.Entry i(int i) {
        return (Map.Entry) this.f2662b.get(i);
    }

    public final int j() {
        return this.f2662b.size();
    }

    public final Iterable k() {
        if (this.c.isEmpty()) {
            return fl.p;
        }
        return this.c.entrySet();
    }

    public final SortedMap l() {
        c();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int j = j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += ((rw2) this.f2662b.get(i2)).hashCode();
        }
        if (this.c.size() > 0) {
            return i + this.c.hashCode();
        }
        return i;
    }

    public final Object n(Comparable comparable, Object obj) {
        c();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((rw2) this.f2662b.get(a2)).setValue(obj);
        }
        c();
        boolean isEmpty = this.f2662b.isEmpty();
        int i = this.f2661a;
        if (isEmpty && !(this.f2662b instanceof ArrayList)) {
            this.f2662b = new ArrayList(i);
        }
        int i2 = -(a2 + 1);
        if (i2 >= i) {
            return l().put(comparable, obj);
        }
        if (this.f2662b.size() == i) {
            rw2 rw2Var = (rw2) this.f2662b.remove(i - 1);
            l().put(rw2Var.f4224a, rw2Var.f4225b);
        }
        this.f2662b.add(i2, new rw2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return p(a2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    public final Object p(int i) {
        c();
        Object obj = ((rw2) this.f2662b.remove(i)).f4225b;
        if (!this.c.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            List list = this.f2662b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new rw2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        p71.C(obj);
        return n(null, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.c.size() + this.f2662b.size();
    }
}
