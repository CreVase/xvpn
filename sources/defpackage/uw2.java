package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class uw2 extends AbstractSet {
    final /* synthetic */ vw2 this$0;

    private uw2(vw2 vw2Var) {
        this.this$0 = vw2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.this$0.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new sw2(this.this$0, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.this$0.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.this$0.size();
    }

    public /* synthetic */ uw2(vw2 vw2Var, hw2 hw2Var) {
        this(vw2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<Comparable<Object>, Object> entry) {
        if (contains(entry)) {
            return false;
        }
        this.this$0.put(entry.getKey(), entry.getValue());
        return true;
    }
}
