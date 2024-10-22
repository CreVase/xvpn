package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class qw2 implements Map.Entry, Comparable {
    private final Comparable<Object> key;
    final /* synthetic */ vw2 this$0;
    private Object value;

    public qw2(vw2 vw2Var, Map.Entry<Comparable<Object>, Object> entry) {
        this(vw2Var, entry.getKey(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        Comparable<Object> comparable = this.key;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.this$0.checkMutable();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }

    public qw2(vw2 vw2Var, Comparable<Object> comparable, Object obj) {
        this.this$0 = vw2Var;
        this.key = comparable;
        this.value = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(qw2 qw2Var) {
        return getKey().compareTo(qw2Var.getKey());
    }

    @Override // java.util.Map.Entry
    public Comparable<Object> getKey() {
        return this.key;
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
