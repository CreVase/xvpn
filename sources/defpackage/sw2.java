package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class sw2 implements Iterator {
    private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
    private boolean nextCalledBeforeRemove;
    private int pos;
    final /* synthetic */ vw2 this$0;

    private sw2(vw2 vw2Var) {
        this.this$0 = vw2Var;
        this.pos = -1;
    }

    private Iterator<Map.Entry<Comparable<Object>, Object>> getOverflowIterator() {
        Map map;
        if (this.lazyOverflowIterator == null) {
            map = this.this$0.overflowEntries;
            this.lazyOverflowIterator = map.entrySet().iterator();
        }
        return this.lazyOverflowIterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.this$0.entryList;
        if (i >= list.size()) {
            map = this.this$0.overflowEntries;
            if (!map.isEmpty() && getOverflowIterator().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        List list;
        if (this.nextCalledBeforeRemove) {
            this.nextCalledBeforeRemove = false;
            this.this$0.checkMutable();
            int i = this.pos;
            list = this.this$0.entryList;
            if (i < list.size()) {
                vw2 vw2Var = this.this$0;
                int i2 = this.pos;
                this.pos = i2 - 1;
                vw2Var.removeArrayEntryAt(i2);
                return;
            }
            getOverflowIterator().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        List list;
        List list2;
        this.nextCalledBeforeRemove = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.this$0.entryList;
        if (i < list.size()) {
            list2 = this.this$0.entryList;
            return (Map.Entry) list2.get(this.pos);
        }
        return getOverflowIterator().next();
    }

    public /* synthetic */ sw2(vw2 vw2Var, hw2 hw2Var) {
        this(vw2Var);
    }
}
