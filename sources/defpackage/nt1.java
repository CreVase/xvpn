package defpackage;

/* loaded from: classes.dex */
public class nt1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3537b;
    public final int c;
    public final long d;
    public final int e;

    public nt1(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        if (this.f3537b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt1)) {
            return false;
        }
        nt1 nt1Var = (nt1) obj;
        if (this.f3536a.equals(nt1Var.f3536a) && this.f3537b == nt1Var.f3537b && this.c == nt1Var.c && this.d == nt1Var.d && this.e == nt1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f3536a.hashCode() + 527) * 31) + this.f3537b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public nt1(nt1 nt1Var) {
        this.f3536a = nt1Var.f3536a;
        this.f3537b = nt1Var.f3537b;
        this.c = nt1Var.c;
        this.d = nt1Var.d;
        this.e = nt1Var.e;
    }

    public nt1(Object obj, int i, int i2, long j, int i3) {
        this.f3536a = obj;
        this.f3537b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
