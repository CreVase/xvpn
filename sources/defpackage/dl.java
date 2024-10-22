package defpackage;

/* loaded from: classes2.dex */
public final class dl extends bb0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1800a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1801b;
    public final String c;
    public final String d;

    public dl(long j, long j2, String str, String str2) {
        this.f1800a = j;
        this.f1801b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bb0)) {
            return false;
        }
        bb0 bb0Var = (bb0) obj;
        if (this.f1800a == ((dl) bb0Var).f1800a) {
            dl dlVar = (dl) bb0Var;
            if (this.f1801b == dlVar.f1801b && this.c.equals(dlVar.c)) {
                String str = dlVar.d;
                String str2 = this.d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f1800a;
        long j2 = this.f1801b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f1800a);
        sb.append(", size=");
        sb.append(this.f1801b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return hx2.s(sb, this.d, "}");
    }
}
