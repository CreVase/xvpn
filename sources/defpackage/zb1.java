package defpackage;

/* loaded from: classes2.dex */
public final class zb1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5457a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5458b;

    public zb1(int i, Object obj) {
        this.f5457a = i;
        this.f5458b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb1)) {
            return false;
        }
        zb1 zb1Var = (zb1) obj;
        return this.f5457a == zb1Var.f5457a && m20.L(this.f5458b, zb1Var.f5458b);
    }

    public final int hashCode() {
        int i = this.f5457a * 31;
        Object obj = this.f5458b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5457a + ", value=" + this.f5458b + ')';
    }
}
