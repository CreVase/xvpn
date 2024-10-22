package defpackage;

/* loaded from: classes.dex */
public final class v62 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4784a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f4785b;

    public v62(String str, long j) {
        this.f4784a = str;
        this.f4785b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v62)) {
            return false;
        }
        v62 v62Var = (v62) obj;
        if (!this.f4784a.equals(v62Var.f4784a)) {
            return false;
        }
        Long l = v62Var.f4785b;
        Long l2 = this.f4785b;
        if (l2 != null) {
            return l2.equals(l);
        }
        if (l == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f4784a.hashCode() * 31;
        Long l = this.f4785b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
