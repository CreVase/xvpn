package defpackage;

/* loaded from: classes2.dex */
public final class tk extends va0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4519a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4520b;

    public tk(String str, String str2) {
        this.f4519a = str;
        this.f4520b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof va0)) {
            return false;
        }
        va0 va0Var = (va0) obj;
        if (this.f4519a.equals(((tk) va0Var).f4519a) && this.f4520b.equals(((tk) va0Var).f4520b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4519a.hashCode() ^ 1000003) * 1000003) ^ this.f4520b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f4519a);
        sb.append(", value=");
        return hx2.s(sb, this.f4520b, "}");
    }
}
