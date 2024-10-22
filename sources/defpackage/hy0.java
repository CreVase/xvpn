package defpackage;

/* loaded from: classes2.dex */
public final class hy0 {

    /* renamed from: a, reason: collision with root package name */
    public final hy1 f2500a;

    /* renamed from: b, reason: collision with root package name */
    public ha0 f2501b = null;

    public hy0(ky1 ky1Var) {
        this.f2500a = ky1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy0)) {
            return false;
        }
        hy0 hy0Var = (hy0) obj;
        return m20.L(this.f2500a, hy0Var.f2500a) && m20.L(this.f2501b, hy0Var.f2501b);
    }

    public final int hashCode() {
        int hashCode = this.f2500a.hashCode() * 31;
        ha0 ha0Var = this.f2501b;
        return hashCode + (ha0Var == null ? 0 : ha0Var.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f2500a + ", subscriber=" + this.f2501b + ')';
    }
}
