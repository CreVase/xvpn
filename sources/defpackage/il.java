package defpackage;

/* loaded from: classes2.dex */
public final class il extends eb0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2619b;
    public final String c;
    public final long d;
    public final int e;

    public il(long j, String str, String str2, long j2, int i) {
        this.f2618a = j;
        this.f2619b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        if (this.f2618a == ((il) eb0Var).f2618a) {
            il ilVar = (il) eb0Var;
            if (this.f2619b.equals(ilVar.f2619b)) {
                String str = ilVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == ilVar.d && this.e == ilVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f2618a;
        int hashCode2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2619b.hashCode()) * 1000003;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 ^ hashCode) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f2618a);
        sb.append(", symbol=");
        sb.append(this.f2619b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return hx2.r(sb, this.e, "}");
    }
}
