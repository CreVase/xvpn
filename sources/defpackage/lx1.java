package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class lx1 implements dv0 {
    public static final qb0 t = new qb0(21);
    public final no0 f;
    public fv0 g;
    public xa3 h;
    public xa3 i;
    public int j;
    public Metadata k;
    public long m;
    public long n;
    public int o;
    public po2 p;
    public boolean q;
    public boolean r;
    public long s;

    /* renamed from: a, reason: collision with root package name */
    public final int f3203a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final r42 f3204b = new r42(10);
    public final d2 c = new d2();
    public final d51 d = new d51();
    public long l = -9223372036854775807L;
    public final ja1 e = new ja1(22);

    public lx1() {
        no0 no0Var = new no0();
        this.f = no0Var;
        this.i = no0Var;
    }

    public static long b(Metadata metadata) {
        if (metadata != null) {
            int d = metadata.d();
            for (int i = 0; i < d; i++) {
                Metadata.Entry b2 = metadata.b(i);
                if (b2 instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) b2;
                    if (textInformationFrame.f1487a.equals("TLEN")) {
                        return wi3.C(Long.parseLong((String) textInformationFrame.c.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final v60 a(ev0 ev0Var, boolean z) {
        r42 r42Var = this.f3204b;
        ev0Var.b(0, r42Var.f4098a, 4);
        r42Var.G(0);
        this.c.a(r42Var.f());
        return new v60(ev0Var.j(), ev0Var.getPosition(), this.c, z);
    }

    public final boolean c(ev0 ev0Var) {
        po2 po2Var = this.p;
        if (po2Var != null) {
            long a2 = po2Var.a();
            if (a2 != -1 && ev0Var.f() > a2 - 4) {
                return true;
            }
        }
        try {
            return !ev0Var.e(this.f3204b.f4098a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        return g(ev0Var, true);
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.o = 0;
        this.s = j2;
        po2 po2Var = this.p;
        if ((po2Var instanceof yb1) && !((yb1) po2Var).d(j2)) {
            this.r = true;
            this.i = this.f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:            if (r14 != 1231971951) goto L24;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02fa  */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r39, defpackage.lm2 r40) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.f(ev0, lm2):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:            if (r19 == false) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:            r18.m(r4 + r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:            r17.j = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:            r18.l();     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.ev0 r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r18.l()
            long r3 = r18.getPosition()
            r5 = 1
            r6 = 0
            r7 = 0
            r9 = 0
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L45
            int r3 = r0.f3203a
            r3 = r3 & 8
            if (r3 != 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            if (r3 == 0) goto L29
            r3 = r9
            goto L2b
        L29:
            qb0 r3 = defpackage.lx1.t
        L2b:
            ja1 r4 = r0.e
            com.google.android.exoplayer2.metadata.Metadata r3 = r4.I(r1, r3)
            r0.k = r3
            if (r3 == 0) goto L3a
            d51 r4 = r0.d
            r4.b(r3)
        L3a:
            long r3 = r18.f()
            int r4 = (int) r3
            if (r19 != 0) goto L46
            r1.m(r4)
            goto L46
        L45:
            r4 = 0
        L46:
            r3 = 0
            r7 = 0
            r8 = 0
        L49:
            boolean r10 = r17.c(r18)
            if (r10 == 0) goto L58
            if (r7 <= 0) goto L52
            goto Lab
        L52:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L58:
            r42 r10 = r0.f3204b
            r10.G(r6)
            int r10 = r10.f()
            if (r3 == 0) goto L76
            long r11 = (long) r3
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r10
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L73
            r11 = 1
            goto L74
        L73:
            r11 = 0
        L74:
            if (r11 == 0) goto L7d
        L76:
            int r11 = defpackage.t9.I(r10)
            r12 = -1
            if (r11 != r12) goto L9d
        L7d:
            int r3 = r8 + 1
            if (r8 != r2) goto L8b
            if (r19 == 0) goto L84
            return r6
        L84:
            java.lang.String r1 = "Searched too many bytes."
            u42 r1 = defpackage.u42.a(r1, r9)
            throw r1
        L8b:
            if (r19 == 0) goto L96
            r18.l()
            int r7 = r4 + r3
            r1.g(r7)
            goto L99
        L96:
            r1.m(r5)
        L99:
            r8 = r3
            r3 = 0
            r7 = 0
            goto L49
        L9d:
            int r7 = r7 + 1
            if (r7 != r5) goto La8
            d2 r3 = r0.c
            r3.a(r10)
            r3 = r10
            goto Lb8
        La8:
            r10 = 4
            if (r7 != r10) goto Lb8
        Lab:
            if (r19 == 0) goto Lb2
            int r4 = r4 + r8
            r1.m(r4)
            goto Lb5
        Lb2:
            r18.l()
        Lb5:
            r0.j = r3
            return r5
        Lb8:
            int r11 = r11 + (-4)
            r1.g(r11)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.g(ev0, boolean):boolean");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.g = fv0Var;
        xa3 l = fv0Var.l(0, 1);
        this.h = l;
        this.i = l;
        this.g.j();
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
