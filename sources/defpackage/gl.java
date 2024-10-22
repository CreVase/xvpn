package defpackage;

/* loaded from: classes2.dex */
public final class gl extends db0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2271b;
    public final long c;

    public gl(String str, String str2, long j) {
        this.f2270a = str;
        this.f2271b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof db0)) {
            return false;
        }
        db0 db0Var = (db0) obj;
        if (this.f2270a.equals(((gl) db0Var).f2270a)) {
            gl glVar = (gl) db0Var;
            if (this.f2271b.equals(glVar.f2271b) && this.c == glVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f2270a.hashCode() ^ 1000003) * 1000003) ^ this.f2271b.hashCode()) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "Signal{name=" + this.f2270a + ", code=" + this.f2271b + ", address=" + this.c + "}";
    }
}
