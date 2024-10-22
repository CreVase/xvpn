package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u13 extends m20 implements bg1 {
    public final qf1 k;
    public final int l;
    public final z13 m;
    public final d5 n;
    public int o = -1;
    public i4 p;
    public final wf1 q;
    public final gg1 r;

    public u13(qf1 qf1Var, int i, z13 z13Var, mp2 mp2Var, i4 i4Var) {
        gg1 gg1Var;
        this.k = qf1Var;
        this.l = i;
        this.m = z13Var;
        this.n = qf1Var.f3990b;
        this.p = i4Var;
        wf1 wf1Var = qf1Var.f3989a;
        this.q = wf1Var;
        if (wf1Var.f) {
            gg1Var = null;
        } else {
            gg1Var = new gg1(mp2Var);
        }
        this.r = gg1Var;
    }

    @Override // defpackage.m20, defpackage.qe0
    public final byte D() {
        z13 z13Var = this.m;
        long i = z13Var.i();
        byte b2 = (byte) i;
        if (i == b2) {
            return b2;
        }
        z13.n(z13Var, "Failed to parse byte for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.m20, defpackage.qe0
    public final short F() {
        z13 z13Var = this.m;
        long i = z13Var.i();
        short s = (short) i;
        if (i == s) {
            return s;
        }
        z13.n(z13Var, "Failed to parse short for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.m20, defpackage.qe0
    public final float G() {
        z13 z13Var = this.m;
        String k = z13Var.k();
        boolean z = false;
        try {
            float parseFloat = Float.parseFloat(k);
            if (!this.k.f3989a.k) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z = true;
                }
                if (!z) {
                    t9.C0(z13Var, Float.valueOf(parseFloat));
                    throw null;
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            z13.n(z13Var, "Failed to parse type 'float' for input '" + k + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.m20, defpackage.qe0
    public final double I() {
        z13 z13Var = this.m;
        String k = z13Var.k();
        boolean z = false;
        try {
            double parseDouble = Double.parseDouble(k);
            if (!this.k.f3989a.k) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z = true;
                }
                if (!z) {
                    t9.C0(z13Var, Double.valueOf(parseDouble));
                    throw null;
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            z13.n(z13Var, "Failed to parse type 'double' for input '" + k + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:            if (r6.e() == 0) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:            if (j(r6) != (-1)) goto L16;     */
    @Override // defpackage.m20, defpackage.f40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.mp2 r6) {
        /*
            r5 = this;
            qf1 r0 = r5.k
            wf1 r0 = r0.f3989a
            boolean r0 = r0.f4996b
            r1 = -1
            if (r0 == 0) goto L15
            int r0 = r6.e()
            if (r0 != 0) goto L15
        Lf:
            int r0 = r5.j(r6)
            if (r0 != r1) goto Lf
        L15:
            int r6 = r5.l
            char r6 = defpackage.p71.d(r6)
            z13 r0 = r5.m
            r0.h(r6)
            f30 r6 = r0.f5417b
            int r0 = r6.f2037b
            java.lang.Object r2 = r6.d
            int[] r2 = (int[]) r2
            r3 = r2[r0]
            r4 = -2
            if (r3 != r4) goto L32
            r2[r0] = r1
            int r0 = r0 + r1
            r6.f2037b = r0
        L32:
            int r0 = r6.f2037b
            if (r0 == r1) goto L39
            int r0 = r0 + r1
            r6.f2037b = r0
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u13.a(mp2):void");
    }

    @Override // defpackage.f40
    public final d5 b() {
        return this.n;
    }

    @Override // defpackage.m20, defpackage.qe0
    public final f40 c(mp2 mp2Var) {
        qf1 qf1Var = this.k;
        int i0 = zf3.i0(mp2Var, qf1Var);
        z13 z13Var = this.m;
        f30 f30Var = z13Var.f5417b;
        int i = f30Var.f2037b + 1;
        f30Var.f2037b = i;
        Object obj = f30Var.c;
        if (i == ((Object[]) obj).length) {
            int i2 = i * 2;
            f30Var.c = Arrays.copyOf((Object[]) obj, i2);
            f30Var.d = Arrays.copyOf((int[]) f30Var.d, i2);
        }
        ((Object[]) f30Var.c)[i] = mp2Var;
        z13Var.h(p71.b(i0));
        if (z13Var.q() != 4) {
            int x = hx2.x(i0);
            if (x != 1 && x != 2 && x != 3) {
                if (this.l == i0 && qf1Var.f3989a.f) {
                    return this;
                }
                return new u13(this.k, i0, this.m, mp2Var, this.p);
            }
            return new u13(this.k, i0, this.m, mp2Var, this.p);
        }
        z13.n(z13Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.bg1
    public final qf1 d() {
        return this.k;
    }

    @Override // defpackage.m20, defpackage.qe0
    public final boolean f() {
        boolean z;
        boolean z2 = this.q.c;
        z13 z13Var = this.m;
        if (z2) {
            int s = z13Var.s();
            String str = z13Var.e;
            if (s != str.length()) {
                if (str.charAt(s) == '\"') {
                    s++;
                    z = true;
                } else {
                    z = false;
                }
                boolean c = z13Var.c(s);
                if (z) {
                    if (z13Var.f5416a != str.length()) {
                        if (str.charAt(z13Var.f5416a) == '\"') {
                            z13Var.f5416a++;
                            return c;
                        }
                        z13.n(z13Var, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    z13.n(z13Var, "EOF", 0, null, 6);
                    throw null;
                }
                return c;
            }
            z13.n(z13Var, "EOF", 0, null, 6);
            throw null;
        }
        return z13Var.c(z13Var.s());
    }

    @Override // defpackage.m20, defpackage.qe0
    public final char g() {
        z13 z13Var = this.m;
        String k = z13Var.k();
        if (k.length() == 1) {
            return k.charAt(0);
        }
        z13.n(z13Var, "Expected single char, but got '" + k + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: xw1 -> 0x006c, TryCatch #1 {xw1 -> 0x006c, blocks: (B:3:0x0004, B:5:0x0008, B:8:0x000f, B:14:0x004c, B:16:0x0050, B:17:0x005e, B:32:0x0064, B:33:0x0066, B:34:0x0067, B:10:0x001d, B:21:0x0028, B:22:0x0031, B:24:0x0037, B:28:0x0041, B:29:0x0046, B:30:0x002d), top: B:2:0x0004, inners: #0 }] */
    @Override // defpackage.m20, defpackage.qe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.uh1 r8) {
        /*
            r7 = this;
            qf1 r0 = r7.k
            z13 r1 = r7.m
            boolean r2 = r8 instanceof defpackage.o1     // Catch: defpackage.xw1 -> L6c
            if (r2 == 0) goto L67
            wf1 r2 = r0.f3989a     // Catch: defpackage.xw1 -> L6c
            boolean r2 = r2.i     // Catch: defpackage.xw1 -> L6c
            if (r2 == 0) goto Lf
            goto L67
        Lf:
            mp2 r2 = r8.getDescriptor()     // Catch: defpackage.xw1 -> L6c
            java.lang.String r0 = defpackage.pd0.q(r2, r0)     // Catch: defpackage.xw1 -> L6c
            wf1 r2 = r7.q     // Catch: defpackage.xw1 -> L6c
            boolean r2 = r2.c     // Catch: defpackage.xw1 -> L6c
            int r3 = r1.f5416a     // Catch: defpackage.xw1 -> L6c
            byte r4 = r1.f()     // Catch: java.lang.Throwable -> L63
            r5 = 6
            r6 = 0
            if (r4 == r5) goto L26
            goto L4b
        L26:
            if (r2 == 0) goto L2d
            java.lang.String r4 = r1.e()     // Catch: java.lang.Throwable -> L63
            goto L31
        L2d:
            java.lang.String r4 = r1.l()     // Catch: java.lang.Throwable -> L63
        L31:
            boolean r0 = defpackage.m20.L(r4, r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L4b
            byte r0 = r1.f()     // Catch: java.lang.Throwable -> L63
            r4 = 5
            if (r0 == r4) goto L3f
            goto L4b
        L3f:
            if (r2 == 0) goto L46
            java.lang.String r0 = r1.j()     // Catch: java.lang.Throwable -> L63
            goto L4c
        L46:
            java.lang.String r0 = r1.l()     // Catch: java.lang.Throwable -> L63
            goto L4c
        L4b:
            r0 = r6
        L4c:
            r1.f5416a = r3     // Catch: defpackage.xw1 -> L6c
            if (r0 == 0) goto L5e
            r0 = r8
            o1 r0 = (defpackage.o1) r0     // Catch: defpackage.xw1 -> L6c
            d5 r0 = r7.b()     // Catch: defpackage.xw1 -> L6c
            r0.getClass()     // Catch: defpackage.xw1 -> L6c
            r0 = 1
            defpackage.fl.J(r0, r6)     // Catch: defpackage.xw1 -> L6c
        L5e:
            java.lang.Object r8 = defpackage.pd0.t(r7, r8)     // Catch: defpackage.xw1 -> L6c
            return r8
        L63:
            r8 = move-exception
            r1.f5416a = r3     // Catch: defpackage.xw1 -> L6c
            throw r8     // Catch: defpackage.xw1 -> L6c
        L67:
            java.lang.Object r8 = r8.deserialize(r7)     // Catch: defpackage.xw1 -> L6c
            return r8
        L6c:
            r8 = move-exception
            xw1 r0 = new xw1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r8.getMessage()
            r2.append(r3)
            java.lang.String r3 = " at path: "
            r2.append(r3)
            f30 r1 = r1.f5417b
            java.lang.String r1 = r1.i()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.util.List r2 = r8.f5238a
            r0.<init>(r2, r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u13.h(uh1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0106 A[EDGE_INSN: B:142:0x0106->B:143:0x0106 BREAK  A[LOOP:0: B:48:0x008d->B:84:0x0241], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    @Override // defpackage.f40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(defpackage.mp2 r21) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u13.j(mp2):int");
    }

    @Override // defpackage.bg1
    public final eg1 m() {
        return new ih1(this.k.f3989a, this.m).b();
    }

    @Override // defpackage.m20, defpackage.qe0
    public final int p() {
        z13 z13Var = this.m;
        long i = z13Var.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        z13.n(z13Var, "Failed to parse int for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.m20, defpackage.qe0
    public final void r() {
    }

    @Override // defpackage.m20, defpackage.qe0
    public final qe0 s(mp2 mp2Var) {
        if (w13.a(mp2Var)) {
            return new cg1(this.m, this.k);
        }
        return this;
    }

    @Override // defpackage.m20, defpackage.f40
    public final Object t(mp2 mp2Var, int i, uh1 uh1Var, Object obj) {
        boolean z;
        if (this.l == 3 && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        z13 z13Var = this.m;
        if (z) {
            f30 f30Var = z13Var.f5417b;
            int[] iArr = (int[]) f30Var.d;
            int i2 = f30Var.f2037b;
            if (iArr[i2] == -2) {
                ((Object[]) f30Var.c)[i2] = d5.h;
            }
        }
        Object h = h(uh1Var);
        if (z) {
            f30 f30Var2 = z13Var.f5417b;
            int[] iArr2 = (int[]) f30Var2.d;
            int i3 = f30Var2.f2037b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                f30Var2.f2037b = i4;
                Object obj2 = f30Var2.c;
                if (i4 == ((Object[]) obj2).length) {
                    int i5 = i4 * 2;
                    f30Var2.c = Arrays.copyOf((Object[]) obj2, i5);
                    f30Var2.d = Arrays.copyOf((int[]) f30Var2.d, i5);
                }
            }
            Object[] objArr = (Object[]) f30Var2.c;
            int i6 = f30Var2.f2037b;
            objArr[i6] = h;
            ((int[]) f30Var2.d)[i6] = -2;
        }
        return h;
    }

    @Override // defpackage.m20, defpackage.qe0
    public final String v() {
        boolean z = this.q.c;
        z13 z13Var = this.m;
        if (z) {
            return z13Var.l();
        }
        return z13Var.j();
    }

    @Override // defpackage.m20, defpackage.qe0
    public final int w(mp2 mp2Var) {
        return pg1.f(mp2Var, this.k, v(), " at path ".concat(this.m.f5417b.i()));
    }

    @Override // defpackage.m20, defpackage.qe0
    public final long x() {
        return this.m.i();
    }

    @Override // defpackage.m20, defpackage.qe0
    public final boolean z() {
        boolean z;
        gg1 gg1Var = this.r;
        if (gg1Var != null) {
            z = gg1Var.f2250b;
        } else {
            z = false;
        }
        if (z || !this.m.v()) {
            return false;
        }
        return true;
    }
}
