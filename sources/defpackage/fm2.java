package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class fm2 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2120b;
    public fm2 c;
    public fm2 d;

    public fm2(Object obj, Object obj2) {
        this.f2119a = obj;
        this.f2120b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fm2)) {
            return false;
        }
        fm2 fm2Var = (fm2) obj;
        if (this.f2119a.equals(fm2Var.f2119a) && this.f2120b.equals(fm2Var.f2120b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2119a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2120b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2119a.hashCode() ^ this.f2120b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2119a + "=" + this.f2120b;
    }
}
