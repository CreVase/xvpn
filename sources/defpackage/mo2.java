package defpackage;

/* loaded from: classes.dex */
public final class mo2 {
    public static final mo2 c;

    /* renamed from: a, reason: collision with root package name */
    public final long f3327a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3328b;

    static {
        mo2 mo2Var = new mo2(0L, 0L);
        new mo2(Long.MAX_VALUE, Long.MAX_VALUE);
        new mo2(Long.MAX_VALUE, 0L);
        new mo2(0L, Long.MAX_VALUE);
        c = mo2Var;
    }

    public mo2(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        cp3.e(j2 >= 0);
        this.f3327a = j;
        this.f3328b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mo2.class != obj.getClass()) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        if (this.f3327a == mo2Var.f3327a && this.f3328b == mo2Var.f3328b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3327a) * 31) + ((int) this.f3328b);
    }
}
