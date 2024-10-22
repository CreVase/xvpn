package defpackage;

/* loaded from: classes.dex */
public final class no2 {
    public static final no2 c = new no2(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f3503a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3504b;

    public no2(long j, long j2) {
        this.f3503a = j;
        this.f3504b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || no2.class != obj.getClass()) {
            return false;
        }
        no2 no2Var = (no2) obj;
        if (this.f3503a == no2Var.f3503a && this.f3504b == no2Var.f3504b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3503a) * 31) + ((int) this.f3504b);
    }

    public final String toString() {
        return "[timeUs=" + this.f3503a + ", position=" + this.f3504b + "]";
    }
}
