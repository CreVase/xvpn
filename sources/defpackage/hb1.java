package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class hb1 extends ab1 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final db1 f2394b = new db1(0, ji2.e);

    public static ji2 j(int i, Object[] objArr) {
        if (i == 0) {
            return ji2.e;
        }
        return new ji2(objArr, i);
    }

    public static cb1 k() {
        return new cb1();
    }

    public static hb1 l(Collection collection) {
        if (collection instanceof ab1) {
            hb1 b2 = ((ab1) collection).b();
            if (b2.h()) {
                Object[] array = b2.toArray();
                return j(array.length, array);
            }
            return b2;
        }
        Object[] array2 = collection.toArray();
        cp3.h(array2.length, array2);
        return j(array2.length, array2);
    }

    public static ji2 m(Object[] objArr) {
        if (objArr.length == 0) {
            return ji2.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        cp3.h(objArr2.length, objArr2);
        return j(objArr2.length, objArr2);
    }

    public static ji2 o() {
        return ji2.e;
    }

    public static ji2 p(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        cp3.h(5, objArr);
        return j(5, objArr);
    }

    public static ji2 q(Object obj) {
        Object[] objArr = {obj};
        cp3.h(1, objArr);
        return j(1, objArr);
    }

    public static ji2 r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        cp3.h(2, objArr);
        return j(2, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ab1
    public final hb1 b() {
        return this;
    }

    @Override // defpackage.ab1
    public int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zf3.p(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && zf3.p(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // defpackage.ab1
    /* renamed from: i */
    public final kh3 iterator() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final db1 listIterator(int i) {
        cp3.k(i, size());
        if (isEmpty()) {
            return f2394b;
        }
        return new db1(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public hb1 s() {
        if (size() <= 1) {
            return this;
        }
        return new eb1(this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public hb1 subList(int i, int i2) {
        cp3.l(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return ji2.e;
        }
        return new fb1(this, i, i3);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
