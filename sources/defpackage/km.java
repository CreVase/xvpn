package defpackage;

/* loaded from: classes2.dex */
public final class km {

    /* renamed from: a, reason: collision with root package name */
    public final String f2971a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2972b;
    public final n93 c;

    public km(String str, long j, n93 n93Var) {
        this.f2971a = str;
        this.f2972b = j;
        this.c = n93Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        String str = this.f2971a;
        if (str != null ? str.equals(kmVar.f2971a) : kmVar.f2971a == null) {
            if (this.f2972b == kmVar.f2972b) {
                n93 n93Var = kmVar.c;
                n93 n93Var2 = this.c;
                if (n93Var2 == null) {
                    if (n93Var == null) {
                        return true;
                    }
                } else if (n93Var2.equals(n93Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.f2971a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f2972b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        n93 n93Var = this.c;
        if (n93Var != null) {
            i = n93Var.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f2971a + ", tokenExpirationTimestamp=" + this.f2972b + ", responseCode=" + this.c + "}";
    }
}
