package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class d1 extends b1 implements List {
    public final /* synthetic */ p0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p0 p0Var, Object obj, List list, b1 b1Var) {
        super(p0Var, obj, list, b1Var);
        this.f = p0Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean isEmpty = this.f383b.isEmpty();
        ((List) this.f383b).add(i, obj);
        this.f.e++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f383b).addAll(i, collection);
        if (addAll) {
            this.f.e += this.f383b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.f383b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f383b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f383b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new c1(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object remove = ((List) this.f383b).remove(i);
        p0 p0Var = this.f;
        p0Var.e--;
        e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.f383b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        List subList = ((List) this.f383b).subList(i, i2);
        b1 b1Var = this.c;
        if (b1Var == null) {
            b1Var = this;
        }
        p0 p0Var = this.f;
        p0Var.getClass();
        boolean z = subList instanceof RandomAccess;
        Object obj = this.f382a;
        if (z) {
            return new y0(p0Var, obj, subList, b1Var);
        }
        return new d1(p0Var, obj, subList, b1Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new c1(this, i);
    }
}
