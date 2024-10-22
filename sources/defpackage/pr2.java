package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class pr2 extends or2 implements SortedSet {
    public pr2(SortedSet sortedSet, t62 t62Var) {
        super(sortedSet, t62Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f3718a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f3718a.iterator();
        it.getClass();
        t62 t62Var = this.f3719b;
        t62Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (t62Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new pr2(((SortedSet) this.f3718a).headSet(obj), this.f3719b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f3718a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f3719b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new pr2(((SortedSet) this.f3718a).subSet(obj, obj2), this.f3719b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new pr2(((SortedSet) this.f3718a).tailSet(obj), this.f3719b);
    }
}
