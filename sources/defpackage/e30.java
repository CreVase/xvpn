package defpackage;

/* loaded from: classes2.dex */
public final class e30 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1878a;

    /* renamed from: b, reason: collision with root package name */
    public final x31 f1879b;

    public e30(x31 x31Var, Object obj) {
        this.f1878a = obj;
        this.f1879b = x31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        e30 e30Var = (e30) obj;
        return m20.L(this.f1878a, e30Var.f1878a) && m20.L(this.f1879b, e30Var.f1879b);
    }

    public final int hashCode() {
        Object obj = this.f1878a;
        return this.f1879b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1878a + ", onCancellation=" + this.f1879b + ')';
    }
}
