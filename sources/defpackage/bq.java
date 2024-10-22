package defpackage;

/* loaded from: classes.dex */
public final class bq {
    public static final bq d = new bq(-3, -9223372036854775807L, -1);
    public static bq e;

    /* renamed from: a, reason: collision with root package name */
    public long f509a;

    /* renamed from: b, reason: collision with root package name */
    public long f510b;
    public int c;

    public bq(int i, long j, long j2) {
        this.c = i;
        this.f509a = j;
        this.f510b = j2;
    }

    public static bq b(long j) {
        return new bq(0, -9223372036854775807L, j);
    }

    public void a(long j, double d2, double d3) {
        double d4 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.c = 1;
            this.f509a = -1L;
            this.f510b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.c = 0;
                this.f509a = -1L;
                this.f510b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f509a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f510b = round;
            if (round < j && this.f509a > j) {
                this.c = 0;
            } else {
                this.c = 1;
            }
        }
    }
}
