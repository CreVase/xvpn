package defpackage;

/* loaded from: classes.dex */
public final class zp {

    /* renamed from: a, reason: collision with root package name */
    public final long f5526a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5527b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public zp(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f5526a = j;
        this.f5527b = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.c = j7;
        this.h = a(j2, j3, j4, j5, j6, j7);
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 < j5 && j2 + 1 < j3) {
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return wi3.j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
        return j4;
    }
}
