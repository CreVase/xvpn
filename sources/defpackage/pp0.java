package defpackage;

/* loaded from: classes2.dex */
public final class pp0 {
    public static final long[] e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final mp2 f3890a;

    /* renamed from: b, reason: collision with root package name */
    public final l41 f3891b;
    public long c;
    public final long[] d;

    public pp0(mp2 mp2Var, fg1 fg1Var) {
        this.f3890a = mp2Var;
        this.f3891b = fg1Var;
        int e2 = mp2Var.e();
        if (e2 <= 64) {
            this.c = e2 != 64 ? (-1) << e2 : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (e2 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((e2 & 63) != 0) {
            jArr[i - 1] = (-1) << e2;
        }
        this.d = jArr;
    }
}
