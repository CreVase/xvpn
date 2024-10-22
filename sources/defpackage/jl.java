package defpackage;

/* loaded from: classes2.dex */
public final class jl extends ib0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f2784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2785b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public jl(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f2784a = d;
        this.f2785b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        Double d = this.f2784a;
        if (d != null ? d.equals(((jl) ib0Var).f2784a) : ((jl) ib0Var).f2784a == null) {
            if (this.f2785b == ((jl) ib0Var).f2785b) {
                jl jlVar = (jl) ib0Var;
                if (this.c == jlVar.c && this.d == jlVar.d && this.e == jlVar.e && this.f == jlVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Double d = this.f2784a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ this.f2785b) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (((i2 ^ i) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((i3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f2784a + ", batteryVelocity=" + this.f2785b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }
}
