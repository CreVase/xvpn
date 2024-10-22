package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zi1 implements Iterator {
    private Iterator<Map.Entry<Object, Object>> iterator;

    public zi1(Iterator<Map.Entry<Object, Object>> it) {
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        Map.Entry<Object, Object> next = this.iterator.next();
        return next.getValue() instanceof aj1 ? new yi1(next) : next;
    }
}
