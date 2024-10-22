package defpackage;

/* loaded from: classes.dex */
public final class lo3 implements mo3 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final fv0 f3163a;

    /* renamed from: b, reason: collision with root package name */
    public final xa3 f3164b;
    public final d2 c;
    public final int d;
    public final byte[] e;
    public final r42 f;
    public final int g;
    public final y01 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public lo3(fv0 fv0Var, xa3 xa3Var, d2 d2Var) {
        this.f3163a = fv0Var;
        this.f3164b = xa3Var;
        this.c = d2Var;
        int max = Math.max(1, d2Var.d / 10);
        this.g = max;
        r42 r42Var = new r42((byte[]) d2Var.f1719b);
        r42Var.n();
        int n2 = r42Var.n();
        this.d = n2;
        int i = d2Var.c;
        int i2 = d2Var.f;
        int i3 = (((i2 - (i * 4)) * 8) / (d2Var.g * i)) + 1;
        if (n2 == i3) {
            int i4 = wi3.f5017a;
            int i5 = ((max + n2) - 1) / n2;
            this.e = new byte[i2 * i5];
            this.f = new r42(n2 * 2 * i * i5);
            int i6 = d2Var.d;
            int i7 = ((d2Var.f * i6) * 8) / n2;
            x01 x01Var = new x01();
            x01Var.k = "audio/raw";
            x01Var.f = i7;
            x01Var.g = i7;
            x01Var.l = max * 2 * i;
            x01Var.x = d2Var.c;
            x01Var.y = i6;
            x01Var.z = 2;
            this.h = new y01(x01Var);
            return;
        }
        throw u42.a("Expected frames per block: " + i3 + "; got: " + n2, null);
    }

    @Override // defpackage.mo3
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0048 -> B:4:0x004a). Please report as a decompilation issue!!! */
    @Override // defpackage.mo3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.ev0 r24, long r25) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo3.b(ev0, long):boolean");
    }

    @Override // defpackage.mo3
    public final void c(int i, long j) {
        this.f3163a.m(new qo3(this.c, this.d, i, j));
        this.f3164b.e(this.h);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        d2 d2Var = this.c;
        long G = j + wi3.G(j2, 1000000L, d2Var.d);
        int i2 = i * 2 * d2Var.c;
        this.f3164b.a(G, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
