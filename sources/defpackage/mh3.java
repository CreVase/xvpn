package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class mh3 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f3298a;

    public mh3(qh3 qh3Var, int i) {
        this.f3298a = qh3Var.f3998a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3298a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3298a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f3298a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3298a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f3298a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3298a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
