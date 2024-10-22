package defpackage;

/* loaded from: classes.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    public int f476a;

    /* renamed from: b, reason: collision with root package name */
    public int f477b;
    public float c;
    public float d;
    public float h;
    public int i;
    public long e = Long.MIN_VALUE;
    public long g = -1;
    public long f = 0;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.g;
        if (j3 >= 0 && j >= j3) {
            float f = this.h;
            return (kl1.b(((float) (j - j3)) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
        return kl1.b(((float) (j - j2)) / this.f476a, 0.0f, 1.0f) * 0.5f;
    }
}
