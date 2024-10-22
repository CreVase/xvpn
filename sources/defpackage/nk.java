package defpackage;

/* loaded from: classes.dex */
public final class nk extends y00 {

    /* renamed from: a, reason: collision with root package name */
    public final x00 f3475a;

    /* renamed from: b, reason: collision with root package name */
    public final bb f3476b;

    public nk(x00 x00Var, bb bbVar) {
        this.f3475a = x00Var;
        this.f3476b = bbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        x00 x00Var = this.f3475a;
        if (x00Var != null ? x00Var.equals(((nk) y00Var).f3475a) : ((nk) y00Var).f3475a == null) {
            bb bbVar = this.f3476b;
            if (bbVar == null) {
                if (((nk) y00Var).f3476b == null) {
                    return true;
                }
            } else if (bbVar.equals(((nk) y00Var).f3476b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        x00 x00Var = this.f3475a;
        if (x00Var == null) {
            hashCode = 0;
        } else {
            hashCode = x00Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        bb bbVar = this.f3476b;
        if (bbVar != null) {
            i = bbVar.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f3475a + ", androidClientInfo=" + this.f3476b + "}";
    }
}
