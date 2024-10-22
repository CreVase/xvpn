package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public class or2 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f3718a;

    /* renamed from: b, reason: collision with root package name */
    public final t62 f3719b;

    public or2(Set set, t62 t62Var) {
        this.f3718a = set;
        this.f3719b = t62Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        if (this.f3719b.apply(obj)) {
            return this.f3718a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f3719b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f3718a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        Collection collection = this.f3718a;
        boolean z = collection instanceof RandomAccess;
        t62 t62Var = this.f3719b;
        if (z && (collection instanceof List)) {
            List list = (List) collection;
            t62Var.getClass();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (!t62Var.apply(obj)) {
                    if (i2 > i) {
                        try {
                            list.set(i, obj);
                        } catch (IllegalArgumentException unused) {
                            cp3.N(list, t62Var, i, i2);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            cp3.N(list, t62Var, i, i2);
                            return;
                        }
                    }
                    i++;
                }
            }
            list.subList(i, list.size()).clear();
            return;
        }
        Iterator it = collection.iterator();
        t62Var.getClass();
        while (it.hasNext()) {
            if (t62Var.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return cp3.t(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        boolean z;
        Collection collection = this.f3718a;
        collection.getClass();
        try {
            z = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return this.f3719b.apply(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.f3718a.iterator();
        t62 t62Var = this.f3719b;
        cp3.j(t62Var, "predicate");
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (t62Var.apply(it.next())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            z = true;
        }
        return true ^ z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return cp3.z(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.f3718a.iterator();
        it.getClass();
        t62 t62Var = this.f3719b;
        t62Var.getClass();
        return new ve1(it, t62Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f3718a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f3718a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f3719b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f3718a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f3719b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.f3718a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f3719b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        return cp3.G(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        return cp3.G(iterator()).toArray(objArr);
    }
}
