package defpackage;

/* loaded from: classes.dex */
public final class ya3 {

    /* renamed from: a, reason: collision with root package name */
    public final ra3 f5303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5304b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ya3(ra3 ra3Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.e(z2);
        cp3.e(iArr2.length == jArr2.length);
        this.f5303a = ra3Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.f5304b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int b2 = wi3.b(jArr, j, true); b2 < jArr.length; b2++) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
