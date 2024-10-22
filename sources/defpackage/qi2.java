package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qi2 extends rb1 {
    public static final qi2 g;
    public final transient hb1 f;

    static {
        db1 db1Var = hb1.f2394b;
        g = new qi2(ji2.e, xy1.f5247a);
    }

    public qi2(hb1 hb1Var, Comparator comparator) {
        super(comparator);
        this.f = hb1Var;
    }

    @Override // defpackage.ob1, defpackage.ab1
    public final hb1 b() {
        return this.f;
    }

    @Override // defpackage.ab1
    public final int c(Object[] objArr, int i) {
        return this.f.c(objArr, i);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int t = t(obj, true);
        if (t == size()) {
            return null;
        }
        return this.f.get(t);
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (Collections.binarySearch(this.f, obj, this.d) < 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof cy1) {
            collection = ((cy1) collection).a();
        }
        Comparator comparator = this.d;
        if (m20.s0(collection, comparator) && collection.size() > 1) {
            kh3 it = iterator();
            Iterator it2 = collection.iterator();
            h0 h0Var = (h0) it;
            if (!h0Var.hasNext()) {
                return false;
            }
            Object next = it2.next();
            Object next2 = h0Var.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare < 0) {
                        if (!h0Var.hasNext()) {
                            return false;
                        }
                        next2 = h0Var.next();
                    } else if (compare == 0) {
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else if (compare > 0) {
                        break;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f.s().listIterator(0);
    }

    @Override // defpackage.ab1
    public final Object[] e() {
        return this.f.e();
    }

    @Override // defpackage.ob1, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (m20.s0(set, comparator)) {
            Iterator it = set.iterator();
            try {
                kh3 it2 = iterator();
                do {
                    h0 h0Var = (h0) it2;
                    if (!h0Var.hasNext()) {
                        return true;
                    }
                    next = h0Var.next();
                    next2 = it.next();
                    if (next2 == null) {
                        break;
                    }
                } while (comparator.compare(next, next2) == 0);
                return false;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // defpackage.ab1
    public final int f() {
        return this.f.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int s = s(obj, true) - 1;
        if (s == -1) {
            return null;
        }
        return this.f.get(s);
    }

    @Override // defpackage.ab1
    public final int g() {
        return this.f.g();
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return this.f.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int t = t(obj, false);
        if (t == size()) {
            return null;
        }
        return this.f.get(t);
    }

    @Override // defpackage.ab1
    /* renamed from: i */
    public final kh3 iterator() {
        return this.f.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.f.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int s = s(obj, false) - 1;
        if (s == -1) {
            return null;
        }
        return this.f.get(s);
    }

    @Override // defpackage.rb1
    public final qi2 q(Object obj, boolean z) {
        return r(t(obj, z), size());
    }

    public final qi2 r(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        Comparator comparator = this.d;
        if (i < i2) {
            return new qi2(this.f.subList(i, i2), comparator);
        }
        return rb1.o(comparator);
    }

    public final int s(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    public final int t(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        if (binarySearch >= 0) {
            if (!z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }
}
