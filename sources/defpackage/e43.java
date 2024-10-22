package defpackage;

/* loaded from: classes2.dex */
public final class e43 {

    /* renamed from: a, reason: collision with root package name */
    public final x31 f1882a;

    /* renamed from: b, reason: collision with root package name */
    public final l41 f1883b;
    public final l41 c;

    public e43(x31 x31Var, l41 l41Var, l41 l41Var2) {
        this.f1882a = x31Var;
        this.f1883b = l41Var;
        this.c = l41Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e43)) {
            return false;
        }
        e43 e43Var = (e43) obj;
        return m20.L(this.f1882a, e43Var.f1882a) && m20.L(this.f1883b, e43Var.f1883b) && m20.L(this.c, e43Var.c);
    }

    public final int hashCode() {
        int hashCode = this.f1882a.hashCode() * 31;
        l41 l41Var = this.f1883b;
        int hashCode2 = (hashCode + (l41Var == null ? 0 : l41Var.hashCode())) * 31;
        l41 l41Var2 = this.c;
        return hashCode2 + (l41Var2 != null ? l41Var2.hashCode() : 0);
    }

    public final String toString() {
        return "Model(condition=" + this.f1882a + ", positive=" + this.f1883b + ", negative=" + this.c + ")";
    }
}
