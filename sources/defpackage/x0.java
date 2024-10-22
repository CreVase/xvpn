package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class x0 extends a1 implements NavigableSet {
    public final /* synthetic */ p0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p0 p0Var, NavigableMap navigableMap) {
        super(p0Var, navigableMap);
        this.e = p0Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((v0) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new x0(this.e, f().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return f().floorKey(obj);
    }

    @Override // defpackage.a1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.f4766b);
    }

    @Override // defpackage.a1, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return f().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        s0 s0Var = (s0) iterator();
        if (s0Var.hasNext()) {
            Object next = s0Var.next();
            s0Var.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // defpackage.a1, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.a1, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new x0(this.e, f().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new x0(this.e, f().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new x0(this.e, f().tailMap(obj, z));
    }
}
