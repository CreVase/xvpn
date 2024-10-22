package defpackage;

/* loaded from: classes.dex */
public final class ki0 implements d22 {

    /* renamed from: a, reason: collision with root package name */
    public final c22 f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2950b;
    public final long c;
    public final r13 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public ki0(r13 r13Var, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.e(z2);
        this.d = r13Var;
        this.f2950b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.f2949a = new c22();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    @Override // defpackage.d22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(defpackage.ev0 r25) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki0.f(ev0):long");
    }

    @Override // defpackage.d22
    public final lo2 j() {
        if (this.f != 0) {
            return new ji0(this);
        }
        return null;
    }

    @Override // defpackage.d22
    public final void m(long j) {
        this.h = wi3.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.f2950b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
