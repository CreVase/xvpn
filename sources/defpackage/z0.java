package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class z0 extends t0 implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ p0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(p0 p0Var, SortedMap sortedMap) {
        super(p0Var, sortedMap);
        this.f = p0Var;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return g().comparator();
    }

    public SortedSet e() {
        return new a1(this.f, g());
    }

    @Override // defpackage.t0, java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet == null) {
            SortedSet e = e();
            this.e = e;
            return e;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return g().firstKey();
    }

    public SortedMap g() {
        return (SortedMap) this.c;
    }

    public SortedMap headMap(Object obj) {
        return new z0(this.f, g().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return g().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new z0(this.f, g().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new z0(this.f, g().tailMap(obj));
    }
}
