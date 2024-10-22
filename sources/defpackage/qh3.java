package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class qh3 extends AbstractList implements jj1, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final jj1 f3998a;

    public qh3(jj1 jj1Var) {
        this.f3998a = jj1Var;
    }

    @Override // defpackage.jj1
    public final void d(vs vsVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f3998a.get(i);
    }

    @Override // defpackage.jj1
    public final Object getRaw(int i) {
        return this.f3998a.getRaw(i);
    }

    @Override // defpackage.jj1
    public final List getUnderlyingElements() {
        return this.f3998a.getUnderlyingElements();
    }

    @Override // defpackage.jj1
    public final jj1 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new oh3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new mh3(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3998a.size();
    }
}
