package defpackage;

import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class e2 implements dv0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f1873a = new f2(null);

    /* renamed from: b, reason: collision with root package name */
    public final r42 f1874b = new r42(Http2.INITIAL_MAX_FRAME_SIZE);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:            r5.f = 0;        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:            if ((r4 - r3) < 8192) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:            return false;     */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.ev0 r15) {
        /*
            r14 = this;
            r42 r0 = new r42
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f4098a
            r5 = r15
            ih0 r5 = (defpackage.ih0) r5
            r5.e(r4, r2, r1, r2)
            r0.G(r2)
            int r4 = r0.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L8e
            r5.f = r2
            r5.n(r3, r2)
            r4 = r3
        L24:
            r15 = 0
        L25:
            byte[] r1 = r0.f4098a
            r6 = 7
            r5.e(r1, r2, r6, r2)
            r0.G(r2)
            int r1 = r0.A()
            r8 = 1
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r1 == r9) goto L4b
            if (r1 == r10) goto L4b
            r5.f = r2
            int r4 = r4 + r8
            int r15 = r4 - r3
            r1 = 8192(0x2000, float:1.148E-41)
            if (r15 < r1) goto L47
            return r2
        L47:
            r5.n(r4, r2)
            goto L24
        L4b:
            int r15 = r15 + r8
            r9 = 4
            if (r15 < r9) goto L50
            return r8
        L50:
            byte[] r8 = r0.f4098a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L58
            r11 = -1
            goto L85
        L58:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L7f
            r9 = r8[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r9 = r9 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r9 | r8
            goto L80
        L7f:
            r6 = 4
        L80:
            if (r1 != r10) goto L84
            int r6 = r6 + 2
        L84:
            int r11 = r11 + r6
        L85:
            if (r11 != r12) goto L88
            return r2
        L88:
            int r11 = r11 + (-7)
            r5.n(r11, r2)
            goto L25
        L8e:
            r0.H(r7)
            int r4 = r0.u()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.n(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2.d(ev0):boolean");
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.c = false;
        this.f1873a.c();
    }

    @Override // defpackage.dv0
    public final int f(ev0 ev0Var, lm2 lm2Var) {
        r42 r42Var = this.f1874b;
        int read = ev0Var.read(r42Var.f4098a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        r42Var.G(0);
        r42Var.F(read);
        boolean z = this.c;
        f2 f2Var = this.f1873a;
        if (!z) {
            f2Var.e(4, 0L);
            this.c = true;
        }
        f2Var.a(r42Var);
        return 0;
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.f1873a.f(fv0Var, new qc3(0, 1));
        fv0Var.j();
        fv0Var.m(new ty0(-9223372036854775807L));
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
