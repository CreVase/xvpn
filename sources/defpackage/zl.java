package defpackage;

/* loaded from: classes.dex */
public final class zl extends oz1 {

    /* renamed from: a, reason: collision with root package name */
    public final nz1 f5502a;

    /* renamed from: b, reason: collision with root package name */
    public final mz1 f5503b;

    public zl(nz1 nz1Var, mz1 mz1Var) {
        this.f5502a = nz1Var;
        this.f5503b = mz1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oz1)) {
            return false;
        }
        oz1 oz1Var = (oz1) obj;
        nz1 nz1Var = this.f5502a;
        if (nz1Var != null ? nz1Var.equals(((zl) oz1Var).f5502a) : ((zl) oz1Var).f5502a == null) {
            mz1 mz1Var = this.f5503b;
            if (mz1Var == null) {
                if (((zl) oz1Var).f5503b == null) {
                    return true;
                }
            } else if (mz1Var.equals(((zl) oz1Var).f5503b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        nz1 nz1Var = this.f5502a;
        if (nz1Var == null) {
            hashCode = 0;
        } else {
            hashCode = nz1Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        mz1 mz1Var = this.f5503b;
        if (mz1Var != null) {
            i = mz1Var.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5502a + ", mobileSubtype=" + this.f5503b + "}";
    }
}
