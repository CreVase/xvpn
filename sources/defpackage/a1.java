package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class a1 extends v0 implements SortedSet {
    public final /* synthetic */ p0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p0 p0Var, SortedMap sortedMap) {
        super(p0Var, sortedMap);
        this.d = p0Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.f4766b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return f().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new a1(this.d, f().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return f().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new a1(this.d, f().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new a1(this.d, f().tailMap(obj));
    }
}
