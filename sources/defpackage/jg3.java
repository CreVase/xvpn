package defpackage;

/* loaded from: classes2.dex */
public final class jg3 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f2763a;

    public /* synthetic */ jg3(long j) {
        this.f2763a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((jg3) obj).f2763a;
        long j2 = this.f2763a ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        if (j2 == j3) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jg3)) {
            return false;
        }
        if (this.f2763a != ((jg3) obj).f2763a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f2763a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f2763a;
        if (j >= 0) {
            fl.p(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        fl.p(10);
        String l = Long.toString(j3, 10);
        fl.p(10);
        return l.concat(Long.toString(j4, 10));
    }
}
