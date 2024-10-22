package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class w0 extends z0 implements NavigableMap {
    public final /* synthetic */ p0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p0 p0Var, NavigableMap navigableMap) {
        super(p0Var, navigableMap);
        this.g = p0Var;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = g().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return d(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return g().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((w0) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new w0(this.g, g().descendingMap());
    }

    @Override // defpackage.z0
    public final SortedSet e() {
        return new x0(this.g, g());
    }

    @Override // defpackage.z0
    /* renamed from: f */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = g().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return d(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = g().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return d(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return g().floorKey(obj);
    }

    public final bb1 h(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) ((by1) this.g).f.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new bb1(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // defpackage.z0, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = g().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return d(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return g().higherKey(obj);
    }

    @Override // defpackage.z0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final NavigableMap g() {
        return (NavigableMap) ((SortedMap) this.c);
    }

    @Override // defpackage.z0, defpackage.t0, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = g().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return d(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = g().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return d(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return g().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return h(((r0) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return h(((r0) ((t0) descendingMap()).entrySet()).iterator());
    }

    @Override // defpackage.z0, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.z0, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new w0(this.g, g().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new w0(this.g, g().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new w0(this.g, g().tailMap(obj, z));
    }
}
