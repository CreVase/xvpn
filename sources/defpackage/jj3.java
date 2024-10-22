package defpackage;

/* loaded from: classes.dex */
public final class jj3 implements po2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2772a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2773b;
    public final long c;
    public final long d;

    public jj3(long[] jArr, long[] jArr2, long j, long j2) {
        this.f2772a = jArr;
        this.f2773b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.po2
    public final long a() {
        return this.d;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.po2
    public final long c(long j) {
        return this.f2772a[wi3.f(this.f2773b, j, true)];
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        long[] jArr = this.f2772a;
        int f = wi3.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.f2773b;
        no2 no2Var = new no2(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new ko2(no2Var, new no2(jArr[i], jArr2[i]));
        }
        return new ko2(no2Var, no2Var);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.c;
    }
}
