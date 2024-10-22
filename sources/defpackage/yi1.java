package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class yi1 implements Map.Entry {
    private Map.Entry<Object, aj1> entry;

    public aj1 getField() {
        return this.entry.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.entry.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        aj1 value = this.entry.getValue();
        if (value == null) {
            return null;
        }
        return value.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj instanceof yv1) {
            return this.entry.getValue().setValue((yv1) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private yi1(Map.Entry<Object, aj1> entry) {
        this.entry = entry;
    }
}
