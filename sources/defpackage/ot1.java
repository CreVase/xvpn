package defpackage;

/* loaded from: classes.dex */
public final class ot1 {

    /* renamed from: a, reason: collision with root package name */
    public final rt1 f3725a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3726b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ot1(rt1 rt1Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        cp3.e(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        cp3.e(z6);
        if (!z || (!z2 && !z3 && !z4)) {
            z7 = true;
        }
        cp3.e(z7);
        this.f3725a = rt1Var;
        this.f3726b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final ot1 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new ot1(this.f3725a, this.f3726b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final ot1 b(long j) {
        if (j == this.f3726b) {
            return this;
        }
        return new ot1(this.f3725a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ot1.class != obj.getClass()) {
            return false;
        }
        ot1 ot1Var = (ot1) obj;
        if (this.f3726b == ot1Var.f3726b && this.c == ot1Var.c && this.d == ot1Var.d && this.e == ot1Var.e && this.f == ot1Var.f && this.g == ot1Var.g && this.h == ot1Var.h && this.i == ot1Var.i && wi3.a(this.f3725a, ot1Var.f3725a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3725a.hashCode() + 527) * 31) + ((int) this.f3726b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
