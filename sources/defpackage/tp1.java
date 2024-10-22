package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class tp1 implements Map.Entry, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4557a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4558b;

    public tp1(Object obj, Object obj2) {
        this.f4557a = obj;
        this.f4558b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp1)) {
            return false;
        }
        tp1 tp1Var = (tp1) obj;
        if (m20.L(this.f4557a, tp1Var.f4557a) && m20.L(this.f4558b, tp1Var.f4558b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4557a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4558b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f4557a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4558b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f4557a + ", value=" + this.f4558b + ')';
    }
}
