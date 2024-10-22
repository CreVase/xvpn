package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class oa implements dv0 {
    public static final int[] q;
    public static final int t;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public fv0 l;
    public xa3 m;
    public lo2 n;
    public boolean o;
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] r = wi3.x("#!AMR\n");
    public static final byte[] s = wi3.x("#!AMR-WB\n");

    /* renamed from: b, reason: collision with root package name */
    public final int f3628b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3627a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        t = iArr[8];
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:            if (r1 != false) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.ev0 r6) {
        /*
            r5 = this;
            r6.l()
            r0 = 0
            byte[] r1 = r5.f3627a
            r2 = 1
            r6.b(r0, r1, r2)
            r6 = r1[r0]
            r1 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r1 > 0) goto L6f
            int r6 = r6 >> 3
            r1 = 15
            r6 = r6 & r1
            if (r6 < 0) goto L3b
            if (r6 > r1) goto L3b
            boolean r1 = r5.c
            if (r1 == 0) goto L28
            r4 = 10
            if (r6 < r4) goto L26
            r4 = 13
            if (r6 <= r4) goto L28
        L26:
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 != 0) goto L3a
            if (r1 != 0) goto L37
            r1 = 12
            if (r6 < r1) goto L35
            r1 = 14
            if (r6 <= r1) goto L37
        L35:
            r1 = 1
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L3b
        L3a:
            r0 = 1
        L3b:
            if (r0 != 0) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal AMR "
            r0.<init>(r1)
            boolean r1 = r5.c
            if (r1 == 0) goto L4b
            java.lang.String r1 = "WB"
            goto L4d
        L4b:
            java.lang.String r1 = "NB"
        L4d:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            u42 r6 = defpackage.u42.a(r6, r3)
            throw r6
        L61:
            boolean r0 = r5.c
            if (r0 == 0) goto L6a
            int[] r0 = defpackage.oa.q
            r6 = r0[r6]
            goto L6e
        L6a:
            int[] r0 = defpackage.oa.p
            r6 = r0[r6]
        L6e:
            return r6
        L6f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            u42 r6 = defpackage.u42.a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.a(ev0):int");
    }

    public final boolean b(ev0 ev0Var) {
        ev0Var.l();
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        ev0Var.b(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            ev0Var.m(bArr.length);
            return true;
        }
        ev0Var.l();
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        ev0Var.b(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        ev0Var.m(bArr3.length);
        return true;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        return b(ev0Var);
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            lo2 lo2Var = this.n;
            if (lo2Var instanceof u60) {
                this.k = ((Math.max(0L, j - ((u60) lo2Var).f4628b) * 8) * 1000000) / r0.e;
                return;
            }
        }
        this.k = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r14, defpackage.lm2 r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.l = fv0Var;
        this.m = fv0Var.l(0, 1);
        fv0Var.j();
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
