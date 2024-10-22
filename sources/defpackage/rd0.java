package defpackage;

/* loaded from: classes2.dex */
public final class rd0 {

    /* renamed from: a, reason: collision with root package name */
    public final qd0 f4134a;

    /* renamed from: b, reason: collision with root package name */
    public final qd0 f4135b;
    public final double c;

    public rd0(qd0 qd0Var, qd0 qd0Var2, double d) {
        this.f4134a = qd0Var;
        this.f4135b = qd0Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd0)) {
            return false;
        }
        rd0 rd0Var = (rd0) obj;
        return this.f4134a == rd0Var.f4134a && this.f4135b == rd0Var.f4135b && m20.L(Double.valueOf(this.c), Double.valueOf(rd0Var.c));
    }

    public final int hashCode() {
        int hashCode = (this.f4135b.hashCode() + (this.f4134a.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f4134a + ", crashlytics=" + this.f4135b + ", sessionSamplingRate=" + this.c + ')';
    }
}
