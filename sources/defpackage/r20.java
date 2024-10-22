package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r20 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4091a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4092b;

    public r20(s20 s20Var) {
        this.f4092b = s20Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.f4091a;
        Map map = this.f4092b;
        switch (i) {
            case 0:
                ((s20) map).clear();
                return;
            default:
                map.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4091a) {
            case 1:
                return this.f4092b.containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f4091a) {
            case 1:
                return this.f4092b.isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f4091a;
        Map map = this.f4092b;
        switch (i) {
            case 0:
                s20 s20Var = (s20) map;
                Map a2 = s20Var.a();
                if (a2 != null) {
                    return a2.values().iterator();
                }
                return new n20(s20Var, 2);
            default:
                return new iq1(map.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f4091a) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = this.f4092b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (zf3.p(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f4091a) {
            case 1:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f4092b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f4091a) {
            case 1:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f4092b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f4091a;
        Map map = this.f4092b;
        switch (i) {
            case 0:
                return ((s20) map).size();
            default:
                return map.size();
        }
    }

    public r20(Map map) {
        map.getClass();
        this.f4092b = map;
    }
}
