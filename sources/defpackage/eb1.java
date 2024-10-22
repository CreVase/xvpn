package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class eb1 extends hb1 {
    public final transient hb1 c;

    public eb1(hb1 hb1Var) {
        this.c = hb1Var;
    }

    @Override // defpackage.hb1, defpackage.ab1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        cp3.g(i, size());
        return this.c.get((size() - 1) - i);
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return this.c.h();
    }

    @Override // defpackage.hb1, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (size() - 1) - lastIndexOf;
    }

    @Override // defpackage.hb1, defpackage.ab1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.hb1, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (size() - 1) - indexOf;
    }

    @Override // defpackage.hb1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.hb1
    public final hb1 s() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.hb1, java.util.List
    /* renamed from: t */
    public final hb1 subList(int i, int i2) {
        cp3.l(i, i2, size());
        return this.c.subList(size() - i2, size() - i).s();
    }

    @Override // defpackage.hb1, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
