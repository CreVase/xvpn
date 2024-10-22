package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class rb1 extends ob1 implements NavigableSet, lx2 {
    public final transient Comparator d;
    public transient rb1 e;

    public rb1(Comparator comparator) {
        this.d = comparator;
    }

    public static qi2 o(Comparator comparator) {
        if (xy1.f5247a.equals(comparator)) {
            return qi2.g;
        }
        return new qi2(ji2.e, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        rb1 rb1Var = this.e;
        if (rb1Var == null) {
            qi2 qi2Var = (qi2) this;
            Comparator reverseOrder = Collections.reverseOrder(qi2Var.d);
            if (qi2Var.isEmpty()) {
                rb1Var = o(reverseOrder);
            } else {
                rb1Var = new qi2(qi2Var.f.s(), reverseOrder);
            }
            this.e = rb1Var;
            rb1Var.e = this;
        }
        return rb1Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        qi2 qi2Var = (qi2) this;
        return qi2Var.r(0, qi2Var.s(obj, z));
    }

    @Override // java.util.NavigableSet
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final qi2 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            qi2 q = ((qi2) this).q(obj, z);
            return q.r(0, q.s(obj2, z2));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract qi2 q(Object obj, boolean z);

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return q(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return q(obj, true);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        qi2 qi2Var = (qi2) this;
        return qi2Var.r(0, qi2Var.s(obj, false));
    }
}
