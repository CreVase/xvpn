package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class op1 implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ go f3712a;

    public op1(go goVar) {
        this.f3712a = goVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f3712a.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f3712a.h(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f3712a.f() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lp1(this.f3712a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        go goVar = this.f3712a;
        int h = goVar.h(obj);
        if (h >= 0) {
            goVar.j(h);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        go goVar = this.f3712a;
        int f = goVar.f();
        int i = 0;
        boolean z = false;
        while (i < f) {
            if (collection.contains(goVar.d(i, 1))) {
                goVar.j(i);
                i--;
                f--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        go goVar = this.f3712a;
        int f = goVar.f();
        int i = 0;
        boolean z = false;
        while (i < f) {
            if (!collection.contains(goVar.d(i, 1))) {
                goVar.j(i);
                i--;
                f--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3712a.f();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3712a.o(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        go goVar = this.f3712a;
        int f = goVar.f();
        Object[] objArr = new Object[f];
        for (int i = 0; i < f; i++) {
            objArr[i] = goVar.d(i, 1);
        }
        return objArr;
    }
}
