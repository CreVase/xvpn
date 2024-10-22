package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class mp1 implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go f3334b;

    public /* synthetic */ mp1(go goVar, int i) {
        this.f3333a = i;
        this.f3334b = goVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3333a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3333a) {
            case 0:
                go goVar = this.f3334b;
                int f = goVar.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    goVar.i(entry.getKey(), entry.getValue());
                }
                if (f != goVar.f()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.f3333a;
        go goVar = this.f3334b;
        switch (i) {
            case 0:
                goVar.c();
                return;
            default:
                goVar.c();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f3333a;
        boolean z = true;
        go goVar = this.f3334b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int g = goVar.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object d = goVar.d(g, 1);
                Object value = entry.getValue();
                if (d != value && (d == null || !d.equals(value))) {
                    z = false;
                }
                return z;
            default:
                if (goVar.g(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3333a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                kg e = this.f3334b.e();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!e.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f3333a) {
            case 0:
                return go.l(this, obj);
            default:
                return go.l(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.f3333a;
        go goVar = this.f3334b;
        switch (i) {
            case 0:
                int i2 = 0;
                for (int f = goVar.f() - 1; f >= 0; f--) {
                    Object d = goVar.d(f, 0);
                    Object d2 = goVar.d(f, 1);
                    if (d == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = d.hashCode();
                    }
                    if (d2 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = d2.hashCode();
                    }
                    i2 += hashCode2 ^ hashCode3;
                }
                return i2;
            default:
                int i3 = 0;
                for (int f2 = goVar.f() - 1; f2 >= 0; f2--) {
                    Object d3 = goVar.d(f2, 0);
                    if (d3 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = d3.hashCode();
                    }
                    i3 += hashCode;
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f3333a;
        go goVar = this.f3334b;
        switch (i) {
            case 0:
                if (goVar.f() != 0) {
                    return false;
                }
                return true;
            default:
                if (goVar.f() != 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f3333a;
        go goVar = this.f3334b;
        switch (i) {
            case 0:
                return new np1(goVar);
            default:
                return new lp1(goVar, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3333a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                go goVar = this.f3334b;
                int g = goVar.g(obj);
                if (g >= 0) {
                    goVar.j(g);
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3333a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                kg e = this.f3334b.e();
                int i = e.c;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    e.remove(it.next());
                }
                if (i != e.c) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3333a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return go.n(this.f3334b.e(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = this.f3333a;
        go goVar = this.f3334b;
        switch (i) {
            case 0:
                return goVar.f();
            default:
                return goVar.f();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f3333a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                go goVar = this.f3334b;
                int f = goVar.f();
                Object[] objArr = new Object[f];
                for (int i = 0; i < f; i++) {
                    objArr[i] = goVar.d(i, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3333a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3334b.o(0, objArr);
        }
    }
}
