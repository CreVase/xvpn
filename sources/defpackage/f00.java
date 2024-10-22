package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f00 implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2025a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2026b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public f00(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f2026b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f2025a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        long[] jArr = this.e;
        int f = wi3.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        no2 no2Var = new no2(j2, jArr2[f]);
        if (j2 < j && f != this.f2025a - 1) {
            int i = f + 1;
            return new ko2(no2Var, new no2(jArr[i], jArr2[i]));
        }
        return new ko2(no2Var, no2Var);
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f2025a + ", sizes=" + Arrays.toString(this.f2026b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
