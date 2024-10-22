package defpackage;

/* loaded from: classes2.dex */
public final class uk extends xa0 {

    /* renamed from: a, reason: collision with root package name */
    public final gb1 f4685a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4686b;

    public uk(gb1 gb1Var, String str) {
        this.f4685a = gb1Var;
        this.f4686b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0Var = (xa0) obj;
        if (this.f4685a.equals(((uk) xa0Var).f4685a)) {
            String str = this.f4686b;
            if (str == null) {
                if (((uk) xa0Var).f4686b == null) {
                    return true;
                }
            } else if (str.equals(((uk) xa0Var).f4686b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4685a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4686b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f4685a);
        sb.append(", orgId=");
        return hx2.s(sb, this.f4686b, "}");
    }
}
