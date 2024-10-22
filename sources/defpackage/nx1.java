package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nx1 implements dv0, lo2 {
    public int i;
    public long j;
    public int k;
    public r42 l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final ro2 f = new ro2();
    public final ArrayList g = new ArrayList();
    public final r42 d = new r42(16);
    public final ArrayDeque e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final r42 f3557a = new r42(py1.f3937a);

    /* renamed from: b, reason: collision with root package name */
    public final r42 f3558b = new r42(4);
    public final r42 c = new r42();
    public int m = -1;
    public fv0 q = fv0.a0;
    public mx1[] r = new mx1[0];

    public nx1(int i) {
    }

    @Override // defpackage.lo2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        return m20.b1(ev0Var, false, false);
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                ro2 ro2Var = this.f;
                ro2Var.f4191a.clear();
                ro2Var.f4192b = 0;
                this.g.clear();
                return;
            }
        }
        for (mx1 mx1Var : this.r) {
            ya3 ya3Var = mx1Var.f3370b;
            int f = wi3.f(ya3Var.f, j2, false);
            while (true) {
                if (f >= 0) {
                    if ((ya3Var.g[f] & 1) != 0) {
                        break;
                    } else {
                        f--;
                    }
                } else {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                f = ya3Var.a(j2);
            }
            mx1Var.e = f;
            lc3 lc3Var = mx1Var.d;
            if (lc3Var != null) {
                lc3Var.f3104b = false;
                lc3Var.c = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:180:0x006e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x061f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x046b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0006 A[SYNTHETIC] */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r30, defpackage.lm2 r31) {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx1.f(ev0, lm2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8 A[EDGE_INSN: B:64:0x00d8->B:65:0x00d8 BREAK  A[LOOP:1: B:28:0x006e->B:56:0x00d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    @Override // defpackage.lo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ko2 g(long r17) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx1.g(long):ko2");
    }

    @Override // defpackage.lo2
    public final long h() {
        return this.u;
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.q = fv0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ae, code lost:            r19 = r3;        r8 = null;        r10 = null;        r12 = -1;        r15 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b4, code lost:            r3 = r6.f4099b;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b6, code lost:            if (r3 >= r13) goto L351;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b8, code lost:            r23 = r6.f();        r3 = r6.f();        r25 = r0;        r6.H(4);     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cb, code lost:            if (r3 != 1835360622) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cd, code lost:            r8 = r6.q(r23 - 12);     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ee, code lost:            r0 = r25;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d7, code lost:            if (r3 != 1851878757) goto L106;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d9, code lost:            r10 = r6.q(r23 - 12);     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e3, code lost:            if (r3 != 1684108385) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e5, code lost:            r15 = r23;        r12 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e9, code lost:            r6.H(r23 - 12);     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f1, code lost:            r25 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f3, code lost:            if (r8 == null) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f5, code lost:            if (r10 == null) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f8, code lost:            if (r12 != (-1)) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fc, code lost:            r6.G(r12);        r6.H(16);        r10 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r8, r10, r6.q(r15 - 16));     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029a, code lost:            r10 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0212, code lost:            r25 = r0;        r19 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0294, code lost:            defpackage.mr.f(r10);        defpackage.sn1.b();     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00bb, code lost:            r8 = defpackage.pw1.f(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00bf, code lost:            if (r8 <= 0) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00c3, code lost:            if (r8 > 192) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00c5, code lost:            r8 = defpackage.pw1.f3927a[r8 - 1];     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00cd, code lost:            if (r8 == null) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00cf, code lost:            r10 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", null, defpackage.hb1.q(r8));     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00dd, code lost:            defpackage.sn1.f();        r25 = r0;        r19 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00cc, code lost:            r8 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00da, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02bc, code lost:            r6.G(r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bf, code lost:            throw r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0218, code lost:            r25 = r0;        r19 = r3;        r0 = 16777215 & r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0223, code lost:            if (r0 != 6516084) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0225, code lost:            r10 = defpackage.pw1.a(r10, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x022e, code lost:            if (r0 == 7233901) goto L156;     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0233, code lost:            if (r0 != 7631467) goto L127;     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023a, code lost:            if (r0 == 6516589) goto L155;     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x023f, code lost:            if (r0 != 7828084) goto L132;     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0245, code lost:            if (r0 != 6578553) goto L135;     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0247, code lost:            r10 = defpackage.pw1.d(r10, r6, "TDRC");     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0251, code lost:            if (r0 != 4280916) goto L138;     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0253, code lost:            r10 = defpackage.pw1.d(r10, r6, "TPE1");     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x025d, code lost:            if (r0 != 7630703) goto L141;     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x025f, code lost:            r10 = defpackage.pw1.d(r10, r6, "TSSE");     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0269, code lost:            if (r0 != 6384738) goto L144;     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x026b, code lost:            r10 = defpackage.pw1.d(r10, r6, "TALB");     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0275, code lost:            if (r0 != 7108978) goto L147;     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0277, code lost:            r10 = defpackage.pw1.d(r10, r6, "USLT");     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0281, code lost:            if (r0 != 6776174) goto L150;     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0283, code lost:            r10 = defpackage.pw1.d(r10, r6, "TCON");     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x028b, code lost:            if (r0 != 6779504) goto L153;     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x028d, code lost:            r10 = defpackage.pw1.d(r10, r6, "TIT1");     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x029c, code lost:            r10 = defpackage.pw1.d(r10, r6, "TCOM");     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02a3, code lost:            r10 = defpackage.pw1.d(r10, r6, "TIT2");     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02c0, code lost:            r25 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02c6, code lost:            if (r9.isEmpty() == false) goto L166;     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02c9, code lost:            r19 = new com.google.android.exoplayer2.metadata.Metadata(r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:            r6.G(r3);        r3 = r3 + r10;        r6.H(r15);        r9 = new java.util.ArrayList();     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:            r10 = r6.f4099b;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:            if (r10 >= r3) goto L348;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:            r13 = r6.f() + r10;        r10 = r6.f();        r15 = (r10 >> 24) & 255;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:            if (r15 == 169) goto L119;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:            if (r15 != 253) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:            if (r10 != 1735291493) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:            if (r10 != 1684632427) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:            r10 = defpackage.pw1.c(r10, r6, "TPOS");     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:            r25 = r0;        r19 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02ac, code lost:            if (r10 == null) goto L350;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ae, code lost:            r9.add(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02b1, code lost:            r3 = r19;        r0 = r25;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:            if (r10 != 1953655662) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:            r10 = defpackage.pw1.c(r10, r6, "TRCK");     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:            if (r10 != 1953329263) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010a, code lost:            r10 = defpackage.pw1.e(r10, "TBPM", r6, true, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0116, code lost:            if (r10 != 1668311404) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0118, code lost:            r10 = defpackage.pw1.e(r10, "TCMP", r6, true, true);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:            if (r10 != 1668249202) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:            r10 = defpackage.pw1.b(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012d, code lost:            if (r10 != 1631670868) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:            r10 = defpackage.pw1.d(r10, r6, "TPE2");     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0139, code lost:            if (r10 != 1936682605) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013b, code lost:            r10 = defpackage.pw1.d(r10, r6, "TSOT");     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0145, code lost:            if (r10 != 1936679276) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:            r10 = defpackage.pw1.d(r10, r6, "TSO2");     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0151, code lost:            if (r10 != 1936679282) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:            r10 = defpackage.pw1.d(r10, r6, "TSOA");     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015d, code lost:            if (r10 != 1936679265) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:            r10 = defpackage.pw1.d(r10, r6, "TSOP");     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0169, code lost:            if (r10 != 1936679791) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016b, code lost:            r10 = defpackage.pw1.d(r10, r6, "TSOC");     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:            if (r10 != 1920233063) goto L86;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0177, code lost:            r10 = defpackage.pw1.e(r10, "ITUNESADVISORY", r6, false, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0183, code lost:            if (r10 != 1885823344) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0185, code lost:            r10 = defpackage.pw1.e(r10, "ITUNESGAPLESS", r6, false, true);     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:            if (r10 != 1936683886) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:            r10 = defpackage.pw1.d(r10, r6, "TVSHOWSORT");     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019f, code lost:            if (r10 != 1953919848) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a1, code lost:            r10 = defpackage.pw1.d(r10, r6, "TVSHOW");     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ac, code lost:            if (r10 != 757935405) goto L118;     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05bd A[LOOP:12: B:335:0x05ba->B:337:0x05bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r27) {
        /*
            Method dump skipped, instructions count: 1611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx1.j(long):void");
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
