package defpackage;

/* loaded from: classes2.dex */
public final class lz1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3209a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3210b;

    public lz1(String str, int i) {
        this.f3209a = str;
        this.f3210b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz1)) {
            return false;
        }
        lz1 lz1Var = (lz1) obj;
        return m20.L(this.f3209a, lz1Var.f3209a) && this.f3210b == lz1Var.f3210b;
    }

    public final int hashCode() {
        return (this.f3209a.hashCode() * 31) + this.f3210b;
    }

    public final String toString() {
        return "IPInfo(host=" + this.f3209a + ", priority=" + this.f3210b + ")";
    }
}
