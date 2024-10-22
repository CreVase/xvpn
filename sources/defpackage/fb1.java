package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class fb1 extends hb1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ hb1 e;

    public fb1(hb1 hb1Var, int i, int i2) {
        this.e = hb1Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ab1
    public final Object[] e() {
        return this.e.e();
    }

    @Override // defpackage.ab1
    public final int f() {
        return this.e.g() + this.c + this.d;
    }

    @Override // defpackage.ab1
    public final int g() {
        return this.e.g() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cp3.g(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return true;
    }

    @Override // defpackage.hb1, defpackage.ab1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.hb1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.hb1, java.util.List
    /* renamed from: t */
    public final hb1 subList(int i, int i2) {
        cp3.l(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.hb1, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
