package defpackage;

/* loaded from: classes.dex */
public final class f93 {

    /* renamed from: a, reason: collision with root package name */
    public long f2064a;

    /* renamed from: b, reason: collision with root package name */
    public long f2065b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public f93(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f2065b == -9223372036854775807L) {
            long j2 = this.f2064a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.f2065b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.f2065b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            long j6 = (j4 * 8589934592L) + j;
            if (Math.abs(j5 - j3) < Math.abs(j6 - j3)) {
                j = j5;
            } else {
                j = j6;
            }
        }
        return a((j * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j;
        j = this.f2064a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long d() {
        return this.f2065b;
    }

    public final synchronized void e(long j) {
        long j2;
        this.f2064a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f2065b = j2;
        this.c = -9223372036854775807L;
    }
}
