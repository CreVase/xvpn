package defpackage;

import android.animation.TimeInterpolator;

/* loaded from: classes2.dex */
public final class kx1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3029a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3030b;
    public final TimeInterpolator c;
    public int d = 0;
    public int e = 1;

    public kx1(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f3029a = 0L;
        this.f3030b = 300L;
        this.c = null;
        this.f3029a = j;
        this.f3030b = j2;
        this.c = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator == null) {
            return pb.f3812b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx1)) {
            return false;
        }
        kx1 kx1Var = (kx1) obj;
        if (this.f3029a != kx1Var.f3029a || this.f3030b != kx1Var.f3030b || this.d != kx1Var.d || this.e != kx1Var.e) {
            return false;
        }
        return a().getClass().equals(kx1Var.a().getClass());
    }

    public final int hashCode() {
        long j = this.f3029a;
        long j2 = this.f3030b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(kx1.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f3029a);
        sb.append(" duration: ");
        sb.append(this.f3030b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return hx2.r(sb, this.e, "}\n");
    }
}
