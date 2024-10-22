package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class b1 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final Object f382a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f383b;
    public final b1 c;
    public final Collection d;
    public final /* synthetic */ p0 e;

    public b1(p0 p0Var, Object obj, Collection collection, b1 b1Var) {
        Collection collection2;
        this.e = p0Var;
        this.f382a = obj;
        this.f383b = collection;
        this.c = b1Var;
        if (b1Var == null) {
            collection2 = null;
        } else {
            collection2 = b1Var.f383b;
        }
        this.d = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f383b.isEmpty();
        boolean add = this.f383b.add(obj);
        if (add) {
            this.e.e++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f383b.addAll(collection);
        if (addAll) {
            this.e.e += this.f383b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        b1 b1Var = this.c;
        if (b1Var != null) {
            b1Var.b();
        } else {
            this.e.d.put(this.f382a, this.f383b);
        }
    }

    public final void c() {
        Collection collection;
        b1 b1Var = this.c;
        if (b1Var != null) {
            b1Var.c();
            if (b1Var.f383b != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f383b.isEmpty() && (collection = (Collection) this.e.d.get(this.f382a)) != null) {
            this.f383b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f383b.clear();
        this.e.e -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f383b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f383b.containsAll(collection);
    }

    public final void e() {
        b1 b1Var = this.c;
        if (b1Var != null) {
            b1Var.e();
        } else if (this.f383b.isEmpty()) {
            this.e.d.remove(this.f382a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f383b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f383b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new s0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f383b.remove(obj);
        if (remove) {
            p0 p0Var = this.e;
            p0Var.e--;
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f383b.removeAll(collection);
        if (removeAll) {
            this.e.e += this.f383b.size() - size;
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f383b.retainAll(collection);
        if (retainAll) {
            this.e.e += this.f383b.size() - size;
            e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f383b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f383b.toString();
    }
}
