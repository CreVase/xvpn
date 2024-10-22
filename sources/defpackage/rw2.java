package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class rw2 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f4224a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4225b;
    public final /* synthetic */ iw2 c;

    public rw2(iw2 iw2Var, Comparable comparable, Object obj) {
        this.c = iw2Var;
        this.f4224a = comparable;
        this.f4225b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4224a.compareTo(((rw2) obj).f4224a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f4224a;
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f4225b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4224a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4225b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Comparable comparable = this.f4224a;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f4225b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = iw2.g;
        this.c.c();
        Object obj2 = this.f4225b;
        this.f4225b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4224a + "=" + this.f4225b;
    }
}
