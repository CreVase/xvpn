package defpackage;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f1710a = "";

    /* renamed from: b, reason: collision with root package name */
    public x31 f1711b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m20.L(this.f1710a, dVar.f1710a) && m20.L(this.f1711b, dVar.f1711b);
    }

    public final int hashCode() {
        int hashCode = this.f1710a.hashCode() * 31;
        x31 x31Var = this.f1711b;
        return hashCode + (x31Var == null ? 0 : x31Var.hashCode());
    }

    public final String toString() {
        return "AboutItemOption(title=" + this.f1710a + ", clickListener=" + this.f1711b + ")";
    }
}
