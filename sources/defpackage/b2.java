package defpackage;

/* loaded from: classes.dex */
public final class b2 implements dv0 {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f386a = new c2(null);

    /* renamed from: b, reason: collision with root package name */
    public final r42 f387b = new r42(2786);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:            r5.f = 0;        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:            if ((r4 - r3) < 8192) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:            return false;     */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.ev0 r14) {
        /*
            r13 = this;
            r42 r0 = new r42
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f4098a
            r5 = r14
            ih0 r5 = (defpackage.ih0) r5
            r5.e(r4, r2, r1, r2)
            r0.G(r2)
            int r4 = r0.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L84
            r5.f = r2
            r5.n(r3, r2)
            r4 = r3
        L24:
            r14 = 0
        L25:
            byte[] r6 = r0.f4098a
            r8 = 6
            r5.e(r6, r2, r8, r2)
            r0.G(r2)
            int r6 = r0.A()
            r9 = 2935(0xb77, float:4.113E-42)
            r10 = 1
            if (r6 == r9) goto L45
            r5.f = r2
            int r4 = r4 + r10
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r14 < r6) goto L41
            return r2
        L41:
            r5.n(r4, r2)
            goto L24
        L45:
            int r14 = r14 + r10
            r6 = 4
            if (r14 < r6) goto L4a
            return r10
        L4a:
            byte[] r9 = r0.f4098a
            int r11 = r9.length
            r12 = -1
            if (r11 >= r8) goto L52
            r8 = -1
            goto L7b
        L52:
            r11 = 5
            r11 = r9[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L5c
            r11 = 1
            goto L5d
        L5c:
            r11 = 0
        L5d:
            if (r11 == 0) goto L6f
            r6 = 2
            r8 = r9[r6]
            r8 = r8 & 7
            int r8 = r8 << 8
            r9 = r9[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            int r8 = r8 + r10
            int r8 = r8 * 2
            goto L7b
        L6f:
            r6 = r9[r6]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r8 = defpackage.tf3.G(r8, r6)
        L7b:
            if (r8 != r12) goto L7e
            return r2
        L7e:
            int r8 = r8 + (-6)
            r5.n(r8, r2)
            goto L25
        L84:
            r0.H(r7)
            int r4 = r0.u()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.n(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2.d(ev0):boolean");
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.c = false;
        this.f386a.c();
    }

    @Override // defpackage.dv0
    public final int f(ev0 ev0Var, lm2 lm2Var) {
        r42 r42Var = this.f387b;
        int read = ev0Var.read(r42Var.f4098a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        r42Var.G(0);
        r42Var.F(read);
        boolean z = this.c;
        c2 c2Var = this.f386a;
        if (!z) {
            c2Var.e(4, 0L);
            this.c = true;
        }
        c2Var.a(r42Var);
        return 0;
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.f386a.f(fv0Var, new qc3(0, 1));
        fv0Var.j();
        fv0Var.m(new ty0(-9223372036854775807L));
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
