package defpackage;

/* loaded from: classes.dex */
public final class tp {

    /* renamed from: b, reason: collision with root package name */
    public int f4555b;
    public boolean c;
    public final c22 d = new c22();
    public final r42 e = new r42(new byte[65025], 0);

    /* renamed from: a, reason: collision with root package name */
    public int f4554a = -1;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.f4555b = 0;
        do {
            int i4 = this.f4555b;
            int i5 = i + i4;
            c22 c22Var = this.d;
            if (i5 >= c22Var.c) {
                break;
            }
            int[] iArr = c22Var.f;
            this.f4555b = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:            return false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.ev0 r9) {
        /*
            r8 = this;
            boolean r0 = r8.c
            r1 = 0
            r42 r2 = r8.e
            if (r0 == 0) goto Lc
            r8.c = r1
            r2.D(r1)
        Lc:
            boolean r0 = r8.c
            r3 = 1
            if (r0 != 0) goto L85
            int r0 = r8.f4554a
            c22 r4 = r8.d
            if (r0 >= 0) goto L48
            r5 = -1
            boolean r0 = r4.b(r9, r5)
            if (r0 == 0) goto L47
            boolean r0 = r4.a(r9, r3)
            if (r0 != 0) goto L26
            goto L47
        L26:
            int r0 = r4.d
            int r5 = r4.f570a
            r5 = r5 & r3
            if (r5 != r3) goto L3a
            int r5 = r2.c
            if (r5 != 0) goto L3a
            int r5 = r8.a(r1)
            int r0 = r0 + r5
            int r5 = r8.f4555b
            int r5 = r5 + r1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            r9.m(r0)     // Catch: java.io.EOFException -> L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L44
            return r1
        L44:
            r8.f4554a = r5
            goto L48
        L47:
            return r1
        L48:
            int r0 = r8.f4554a
            int r0 = r8.a(r0)
            int r5 = r8.f4554a
            int r6 = r8.f4555b
            int r5 = r5 + r6
            if (r0 <= 0) goto L7d
            int r6 = r2.c
            int r6 = r6 + r0
            r2.a(r6)
            byte[] r6 = r2.f4098a
            int r7 = r2.c
            r9.readFully(r6, r7, r0)     // Catch: java.io.EOFException -> L64
            r6 = 1
            goto L66
        L64:
            r6 = 0
        L66:
            if (r6 != 0) goto L69
            return r1
        L69:
            int r6 = r2.c
            int r6 = r6 + r0
            r2.F(r6)
            int[] r0 = r4.f
            int r6 = r5 + (-1)
            r0 = r0[r6]
            r6 = 255(0xff, float:3.57E-43)
            if (r0 == r6) goto L7a
            goto L7b
        L7a:
            r3 = 0
        L7b:
            r8.c = r3
        L7d:
            int r0 = r4.c
            if (r5 != r0) goto L82
            r5 = -1
        L82:
            r8.f4554a = r5
            goto Lc
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp.b(ev0):boolean");
    }
}
