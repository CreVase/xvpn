package defpackage;

/* loaded from: classes2.dex */
public final class fm {

    /* renamed from: a, reason: collision with root package name */
    public final long f2113a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2114b;
    public final long c;

    public fm(long j, long j2, long j3) {
        this.f2113a = j;
        this.f2114b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        if (this.f2113a == fmVar.f2113a && this.f2114b == fmVar.f2114b && this.c == fmVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2113a;
        long j2 = this.f2114b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f2113a + ", elapsedRealtime=" + this.f2114b + ", uptimeMillis=" + this.c + "}";
    }
}
