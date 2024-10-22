package defpackage;

/* loaded from: classes.dex */
public final class xb1 implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f5137a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f5138b;
    public final long c;
    public final boolean d;

    public xb1(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f5137a = jArr3;
            long[] jArr4 = new long[i];
            this.f5138b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f5137a = jArr;
            this.f5138b = jArr2;
        }
        this.c = j;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        if (!this.d) {
            no2 no2Var = no2.c;
            return new ko2(no2Var, no2Var);
        }
        long[] jArr = this.f5138b;
        int f = wi3.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.f5137a;
        no2 no2Var2 = new no2(j2, jArr2[f]);
        if (j2 != j && f != jArr.length - 1) {
            int i = f + 1;
            return new ko2(no2Var2, new no2(jArr[i], jArr2[i]));
        }
        return new ko2(no2Var2, no2Var2);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.c;
    }
}
