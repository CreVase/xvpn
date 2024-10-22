package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class gb1 implements List, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final List f2223a;

    public gb1(List list) {
        this.f2223a = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f2223a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f2223a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f2223a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2223a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f2223a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f2223a.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f2223a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f2223a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f2223a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f2223a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f2223a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f2223a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f2223a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f2223a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f2223a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f2223a.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f2223a.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f2223a.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f2223a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f2223a.toArray();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f2223a.add(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f2223a.addAll(i, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f2223a.listIterator(i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f2223a.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f2223a.toArray(objArr);
    }
}
