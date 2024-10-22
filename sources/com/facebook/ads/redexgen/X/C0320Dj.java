package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0320Dj implements Handler.Callback, InterfaceC0778Vh, GQ, EX, C9H, InterfaceC02419o {
    public static byte[] A0V;
    public static String[] A0W = {"TSIQGmaqgvrUxo0yYDewkVNDuuioOpPV", "LhstooR1wZsH8RVMZSyyF7FJZ5wrHutR", "WZmkRBn8iXpnqDBIN644YOqcruHieEQJ", "OBm1ApV8rqkCiyt7FxArHXpNA0", "RSLtmQKc5IgtmDXEpea3qKBmF", "cT5hSyxhu4oYAFMn61C1ja3cHbuAf9wl", "QQz6Qig88n9IGtqyO", "pBG4ezF2k8D44jdvacVEPM0q7VNUtk0G"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C9T A04;
    public C02319e A05;
    public EY A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public XS[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final XV A0G;
    public final XT A0H;
    public final C9Z A0J;
    public final C02499x A0L;
    public final C02509y A0M;
    public final GR A0N;
    public final GS A0O;
    public final HL A0P;
    public final HV A0Q;
    public final ArrayList<C9R> A0R;
    public final boolean A0S;
    public final XS[] A0T;
    public final InterfaceC02459s[] A0U;
    public final C02299c A0K = new C02299c();
    public C02489v A06 = C02489v.A03;
    public final C9S A0I = new C9S();

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07() throws C9K, IOException {
        long AG7 = this.A0P.AG7();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(AG7, 10L);
            return;
        }
        C02279a A0G = this.A0K.A0G();
        C0433Hu.A02(A06(150, 10, 20));
        A0J();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        A0G.A08.A55(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean z2 = true;
        for (XS xs : this.A0C) {
            xs.AEb(this.A03, elapsedRealtime);
            boolean z3 = true;
            z = z && xs.A8q();
            boolean z4 = xs.A90() || xs.A8q() || A0s(xs);
            if (!z4) {
                xs.AA5();
            }
            if (!z2 || !z4) {
                z3 = false;
            }
            z2 = z3;
        }
        if (!z2) {
            A0B();
        }
        long j = A0G.A02.A01;
        if (z && ((j == -9223372036854775807L || j <= this.A05.A0A) && A0G.A02.A05)) {
            A0N(4);
            A0H();
        } else if (this.A05.A00 == 2 && A0u(z2)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3) {
            int length = this.A0C.length;
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "Eggx5Ft4Lgnx6HVrotcHBkscR";
            strArr2[3] = "Urp4oA4mdP1paz0o5Y10JqXrCe";
            if (length != 0 ? !z2 : !A0q()) {
                this.A09 = this.A08;
                A0N(2);
                A0H();
            }
        }
        if (this.A05.A00 == 2) {
            for (XS xs2 : this.A0C) {
                xs2.AA5();
            }
        }
        boolean z5 = this.A08;
        if (A0W[7].charAt(9) != '8') {
            throw new RuntimeException();
        }
        A0W[5] = "rTELFOhgZqImPwKgVJI0nXuoysvpkaxO";
        if ((z5 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(AG7, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AEY(2);
        } else {
            A0R(AG7, 1000L);
        }
        C0433Hu.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:            if (r4 != false) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:            r4 = r14.A0K.A0G();        r2 = r14.A0K.A0S(r4);        r5 = new boolean[r14.A0T.length];        r10 = r4.A0B(r14.A05.A0A, r2, r5);        A0i(r4.A03, r4.A04);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:            if (r14.A05.A00 == 4) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:            if (r10 == r14.A05.A0A) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:            r8 = r14.A05;        r14.A05 = r8.A04(r8.A04, r10, r14.A05.A01);        r14.A0I.A04(4);        A0P(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:            r6 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:            if (com.facebook.ads.redexgen.X.C0320Dj.A0W[2].charAt(12) == 'N') goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:            r2 = com.facebook.ads.redexgen.X.C0320Dj.A0W;        r2[1] = "v6rigB8My08mC5ZvZtTcxONYTtnHkhiY";        r2[0] = "jJJ7EyTzSHhVUQBMBNjuu6IlWzfsi9o6";        r9 = new boolean[r14.A0T.length];        r11 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:            r1 = r14.A0T;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:            if (r11 >= r1.length) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:            r10 = r1[r11];     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:            if (r10.A7t() == 0) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:            r9[r11] = r0;        r1 = r4.A0A[r11];     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:            if (r1 == null) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:            r6 = r6 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:            if (r9[r11] == false) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:            if (r1 == r10.A7w()) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:            A0b(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:            r11 = r11 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:            if (r5[r11] == false) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:            r1 = r14.A03;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:            if (com.facebook.ads.redexgen.X.C0320Dj.A0W[5].charAt(1) == 'w') goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:            com.facebook.ads.redexgen.X.C0320Dj.A0W[7] = "kUW5tsmcM8CZIAjkj84TOGdyZAx2gWc6";        r10.AEn(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a3, code lost:            throw new java.lang.RuntimeException();     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:            r14.A05 = r14.A05.A05(r4.A03, r4.A04);        A0p(r9, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:            com.facebook.ads.redexgen.X.C0320Dj.A0W[7] = "5RhHFxqKf8KludlSzI9zDK8m295dvAFV";        r9 = new boolean[r14.A0T.length];        r11 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0133, code lost:            r14.A0K.A0S(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:            if (r6.A06 == false) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013c, code lost:            r6.A0A(java.lang.Math.max(r6.A02.A03, r6.A08(r14.A03)), false);        A0i(r6.A03, r6.A04);     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0128, code lost:            if (r4 != false) goto L20;     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0E() throws com.facebook.ads.redexgen.X.C9K {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0320Dj.A0E():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:            if (r8.A8n() != false) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:            r9 = r5.A01.A00(r4);        r3 = r5.A00(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a8, code lost:            if (r1.A0U[r4].A83() != 5) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01aa, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ab, code lost:            r1 = r7.A03[r4];        r0 = r5.A03[r4];     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b3, code lost:            if (r3 == false) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b9, code lost:            if (r0.equals(r1) == false) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:            if (r2 != false) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:            r8.AEd(A0v(r9), r6.A0A[r4], r6.A07());     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cf, code lost:            r8.AFE();     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cd, code lost:            r2 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d4, code lost:            if (r4 >= r8.length) goto L124;     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d9, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d7, code lost:            r10 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00fe, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:            if (r6 != false) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:            r2 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:            r2 = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:            if (r6 != false) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:            if (r4.A02.A05 == false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:            r5 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:            r2 = r1.A0T;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:            if (r5 >= r2.length) goto L113;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:            r3 = r2[r5];        r2 = r4.A0A[r5];     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:            if (r2 == null) goto L115;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:            if (r3.A7w() != r2) goto L116;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:            if (r3.A8Q() == false) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:            r3.AFE();     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:            r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:            if (r4.A01 == null) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:            if (r4.A01.A06 != false) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:            r6 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0100, code lost:            r2 = r1.A0T;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:            if (r6 >= r2.length) goto L119;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0105, code lost:            r8 = r2[r6];        r7 = r4.A0A[r6];        r5 = r8.A7w();        r3 = com.facebook.ads.redexgen.X.C0320Dj.A0W;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:            if (r3[1].charAt(10) == r3[0].charAt(10)) goto L73;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:            com.facebook.ads.redexgen.X.C0320Dj.A0W[2] = "GzZd6F7lJVp08TeGQitpN19OrvCnG4PK";     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:            if (r5 != r7) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:            if (r7 == null) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:            if (r8.A8Q() != false) goto L123;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0134, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:            r6 = r6 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:            com.facebook.ads.redexgen.X.C0320Dj.A0W[5] = "G5Kl7lcZBM87T4fNUwO1IYVdGnNcsgpo";     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013f, code lost:            if (r5 != r7) goto L121;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:            r7 = r4.A04;        r6 = r1.A0K.A0D();        r5 = r6.A04;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:            if (r6.A08.AED() == (-9223372036854775807L)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:            r10 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:            r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:            r8 = r1.A0T;        r3 = com.facebook.ads.redexgen.X.C0320Dj.A0W;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0171, code lost:            if (r3[1].charAt(10) == r3[0].charAt(10)) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0173, code lost:            com.facebook.ads.redexgen.X.C0320Dj.A0W[5] = "zgqvIFw9hHXttypZtkJx3efsgqUZ32NO";     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:            if (r4 >= r8.length) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017d, code lost:            r8 = r8[r4];     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0183, code lost:            if (r7.A00(r4) != false) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0189, code lost:            if (r10 == false) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018b, code lost:            r8.AFE();     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:            r4 = r4 + 1;        r1 = r12;     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0I() throws com.facebook.ads.redexgen.X.C9K, java.io.IOException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0320Dj.A0I():void");
    }

    public static void A0K() {
        byte[] bArr = {68, 121, 110, 81, 109, 96, 120, 100, 115, 72, 108, 113, 109, 72, 111, 117, 100, 115, 111, 96, 109, 111, 82, 69, 122, 70, 75, 83, 79, 88, 99, 71, 90, 70, 99, 68, 94, 79, 88, 68, 75, 70, 16, 98, 75, 68, 78, 70, 79, 88, 66, 108, 101, 100, 121, 98, 101, 108, 43, 102, 110, 120, 120, 106, 108, 110, 120, 43, 120, 110, 101, Byte.MAX_VALUE, 43, 106, 109, Byte.MAX_VALUE, 110, 121, 43, 121, 110, 103, 110, 106, 120, 110, 37, 69, 98, 120, 105, 126, 98, 109, 96, 44, 126, 121, 98, 120, 101, 97, 105, 44, 105, 126, 126, 99, 126, 34, 24, 36, 41, 49, 42, 41, 43, 35, 104, 45, 58, 58, 39, 58, 102, 74, 118, 108, 107, 122, 124, 57, 124, 107, 107, 118, 107, 55, 72, 111, 116, 107, 59, 125, 122, 114, 119, 126, Byte.MAX_VALUE, 53, 90, 81, 109, 81, 83, 91, 105, 81, 76, 85};
        String[] strArr = A0W;
        if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        A0W[7] = "OuUcfGxYs8HKuxzYIQS3N8YCcqwYwO9D";
        A0V = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0S(C9Q c9q) throws C9K {
        if (c9q.A01 != this.A07) {
            return;
        }
        AbstractC02519z abstractC02519z = this.A05.A03;
        AbstractC02519z abstractC02519z2 = c9q.A00;
        Object obj = c9q.A02;
        this.A0K.A0N(abstractC02519z2);
        this.A05 = this.A05.A03(abstractC02519z2, obj);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            C9T c9t = this.A04;
            if (c9t != null) {
                Pair<Integer, Long> A04 = A04(c9t, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                EW A0L = this.A0K.A0L(intValue, longValue);
                this.A05 = this.A05.A04(A0L, A0L.A01() ? 0L : longValue, longValue);
                return;
            }
            if (this.A05.A02 == -9223372036854775807L) {
                if (abstractC02519z2.A0E()) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(abstractC02519z2, abstractC02519z2.A05(this.A0B), -9223372036854775807L);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                EW A0L2 = this.A0K.A0L(intValue2, longValue2);
                this.A05 = this.A05.A04(A0L2, A0L2.A01() ? 0L : longValue2, longValue2);
                return;
            }
            return;
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (abstractC02519z.A0E()) {
            if (abstractC02519z2.A0E()) {
                return;
            }
            EW A0L3 = this.A0K.A0L(i2, j);
            this.A05 = this.A05.A04(A0L3, A0L3.A01() ? 0L : j, j);
            return;
        }
        C02279a A0E = this.A0K.A0E();
        int A042 = abstractC02519z2.A04(A0E == null ? abstractC02519z.A0A(i2, this.A0L, true).A03 : A0E.A09);
        if (A042 != -1) {
            if (A042 != i2) {
                this.A05 = this.A05.A01(A042);
            }
            EW ew = this.A05.A04;
            if (ew.A01()) {
                EW A0L4 = this.A0K.A0L(A042, j);
                if (!A0L4.equals(ew)) {
                    this.A05 = this.A05.A04(A0L4, A02(A0L4, A0L4.A01() ? 0L : j), j);
                    return;
                }
            }
            if (this.A0K.A0U(ew, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int A01 = A01(i2, abstractC02519z, abstractC02519z2);
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[4] = "W6zkXP9eIZkyJx4uPbHf9NTX6";
        strArr[3] = "m3yrwIeXeqUIkhQgLJp1WNCsrl";
        if (A01 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> A052 = A05(abstractC02519z2, abstractC02519z2.A09(A01, this.A0L).A00, -9223372036854775807L);
        int intValue3 = ((Integer) A052.first).intValue();
        long longValue3 = ((Long) A052.second).longValue();
        EW A0L5 = this.A0K.A0L(intValue3, longValue3);
        abstractC02519z2.A0A(intValue3, this.A0L, true);
        if (A0E != null) {
            Object obj2 = this.A0L.A03;
            A0E.A02 = A0E.A02.A00(-1);
            while (A0E.A01 != null) {
                A0E = A0E.A01;
                if (A0E.A09.equals(obj2)) {
                    C02299c c02299c = this.A0K;
                    C02289b c02289b = A0E.A02;
                    if (A0W[2].charAt(12) == 'N') {
                        throw new RuntimeException();
                    }
                    A0W[5] = "ODoCru5Men7rnsumvsVlRJsOWyiHNrdt";
                    A0E.A02 = c02299c.A0J(c02289b, intValue3);
                } else {
                    A0E.A02 = A0E.A02.A00(-1);
                }
            }
        }
        boolean A012 = A0L5.A01();
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "hRbRvIJE18IQkSZp4h0fxN12mLMfZDhd";
        this.A05 = this.A05.A04(A0L5, A02(A0L5, A012 ? 0L : longValue3), longValue3);
    }

    static {
        A0K();
    }

    public C0320Dj(XS[] xsArr, GR gr, GS gs, C9Z c9z, boolean z, int i, boolean z2, Handler handler, XT xt, HL hl) {
        this.A0T = xsArr;
        this.A0N = gr;
        this.A0O = gs;
        this.A0J = c9z;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = xt;
        this.A0P = hl;
        this.A0D = c9z.A60();
        this.A0S = c9z.AEo();
        this.A05 = new C02319e(AbstractC02519z.A01, -9223372036854775807L, TrackGroupArray.A04, gs);
        this.A0U = new InterfaceC02459s[xsArr.length];
        for (int i2 = 0; i2 < xsArr.length; i2++) {
            xsArr[i2].AFH(i2);
            this.A0U[i2] = xsArr[i2].A6D();
        }
        this.A0G = new XV(this, hl);
        this.A0R = new ArrayList<>();
        this.A0C = new XS[0];
        this.A0M = new C02509y();
        this.A0L = new C02499x();
        gr.A00(this);
        HandlerThread handlerThread = new HandlerThread(A06(21, 29, 0), -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = hl.A4Z(handlerThread.getLooper(), this);
    }

    private int A00() {
        AbstractC02519z abstractC02519z = this.A05.A03;
        if (abstractC02519z.A0E()) {
            return 0;
        }
        return abstractC02519z.A0B(abstractC02519z.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AbstractC02519z abstractC02519z, AbstractC02519z abstractC02519z2) {
        int i2 = i;
        int maxIterations = -1;
        int A00 = abstractC02519z.A00();
        for (int i3 = 0; i3 < A00 && maxIterations == -1; i3++) {
            i2 = abstractC02519z.A03(i2, this.A0L, this.A0M, this.A02, this.A0B);
            if (i2 == -1) {
                break;
            }
            maxIterations = abstractC02519z2.A04(abstractC02519z.A0A(i2, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(EW ew, long j) throws C9K {
        return A03(ew, j, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:            if (r4 != r3) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:            if (r12 == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:            if (r3 == null) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:            A0V(r4);        r2 = com.facebook.ads.redexgen.X.C0320Dj.A0W;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:            if (r2[1].charAt(10) == r2[0].charAt(10)) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:            r2 = com.facebook.ads.redexgen.X.C0320Dj.A0W;        r2[4] = "JYav744H3005gGdd3wHQ67gij";        r2[3] = "FVGbgJ3f5rxs8oy2Mt1O3WpPvx";     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:            if (r3.A05 == false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:            r10 = r3.A08.AF0(r10);        r7 = r3.A08;        r2 = r10 - r8.A0D;        r6 = r8.A0S;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:            if (com.facebook.ads.redexgen.X.C0320Dj.A0W[7].charAt(9) == '8') goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:            com.facebook.ads.redexgen.X.C0320Dj.A0W[7] = "LvYFslBjN8wEk55S4mS5Jlrj4VNptxmz";        r7.A55(r2, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:            A0P(r10);        A09();     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:            r8.A0Q.AF2(2);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:            if (com.facebook.ads.redexgen.X.C0320Dj.A0W[2].charAt(12) == 'N') goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:            com.facebook.ads.redexgen.X.C0320Dj.A0W[2] = "qbdkiXSPlbFYutVyIKxCWSr3uDHCS3n2";     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:            return r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:            if (r3.A05 == false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:            r8.A0K.A0O(true);        A0P(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:            r4 = r8.A0C;        r2 = r4.length;        r1 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:            if (r1 >= r2) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:            A0b(r4[r1]);        r1 = r1 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:            r8.A0C = new com.facebook.ads.redexgen.X.XS[0];        r4 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long A03(com.facebook.ads.redexgen.X.EW r9, long r10, boolean r12) throws com.facebook.ads.redexgen.X.C9K {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0320Dj.A03(com.facebook.ads.redexgen.X.EW, long, boolean):long");
    }

    private Pair<Integer, Long> A04(C9T c9t, boolean z) {
        int A01;
        AbstractC02519z abstractC02519z = this.A05.A03;
        AbstractC02519z abstractC02519z2 = c9t.A02;
        if (abstractC02519z.A0E()) {
            return null;
        }
        if (abstractC02519z2.A0E()) {
            abstractC02519z2 = abstractC02519z;
        }
        try {
            Pair<Integer, Long> A07 = abstractC02519z2.A07(this.A0M, this.A0L, c9t.A00, c9t.A01);
            if (abstractC02519z == abstractC02519z2) {
                return A07;
            }
            int A04 = abstractC02519z.A04(abstractC02519z2.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                return Pair.create(Integer.valueOf(A04), (Long) A07.second);
            }
            if (!z || (A01 = A01(((Integer) A07.first).intValue(), abstractC02519z2, abstractC02519z)) == -1) {
                return null;
            }
            Pair<Integer, Long> A05 = A05(abstractC02519z, abstractC02519z.A09(A01, this.A0L).A00, -9223372036854775807L);
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[1] = "LZRu6qU1d7MAJxELkyp6D6bqJ9pCtQWv";
            strArr2[0] = "5OOlDtGsHYXmvjCA2lYHypc4I8JTMes9";
            return A05;
        } catch (IndexOutOfBoundsException unused) {
            throw new C9Y(abstractC02519z, c9t.A00, c9t.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC02519z abstractC02519z, int i, long j) {
        return abstractC02519z.A07(this.A0M, this.A0L, i, j);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C02279a A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AFX = this.A0J.AFX(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A7Z().A01);
        A0k(AFX);
        if (AFX) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        boolean z;
        int i2;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i = this.A0I.A01;
            z = this.A0I.A03;
            if (z) {
                i2 = this.A0I.A00;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i, i2, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C02279a A0F = this.A0K.A0F();
        C02279a readingPeriodHolder = this.A0K.A0H();
        if (A0F != null && !A0F.A06) {
            if (readingPeriodHolder != null) {
                C02279a loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != A0F) {
                    return;
                }
            }
            XS[] xsArr = this.A0C;
            if (A0W[2].charAt(12) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "M2PhxJTgTMxoek0nGdRGZ8ED7";
            strArr[3] = "JhH24KrsERDOvzAX41swXn1Uhz";
            for (XS xs : xsArr) {
                if (!xs.A8Q()) {
                    return;
                }
            }
            A0F.A08.AA3();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C02289b A0I = this.A0K.A0I(this.A03, this.A05);
            if (A0I == null) {
                this.A07.AA4();
                return;
            }
            InterfaceC0777Vg mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5v(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.ADu(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ACg();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C9K {
        this.A09 = false;
        this.A0G.A05();
        for (XS xs : this.A0C) {
            xs.start();
        }
    }

    private void A0H() throws C9K {
        this.A0G.A06();
        for (XS xs : this.A0C) {
            A0c(xs);
        }
    }

    private void A0J() throws C9K {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C02279a A0G = this.A0K.A0G();
        InterfaceC0777Vg interfaceC0777Vg = A0G.A08;
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "e9etinPRA8BQH2CZknXr4yAbSJ3blA39";
        long AED = interfaceC0777Vg.AED();
        if (AED != -9223372036854775807L) {
            A0P(AED);
            if (AED != this.A05.A0A) {
                C02319e c02319e = this.A05;
                EW ew = c02319e.A04;
                long periodPositionUs = this.A05.A01;
                this.A05 = c02319e.A04(ew, AED, periodPositionUs);
                this.A0I.A04(4);
            }
        } else {
            long A04 = this.A0G.A04();
            this.A03 = A04;
            long A08 = A0G.A08(A04);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C02319e c02319e2 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c02319e2.A09 = A0C;
    }

    private void A0L(float f) {
        for (C02279a A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            GS gs = A0E.A04;
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[5] = "TmHCYSIZuHNmxK6kBnR58JopztOBcNrn";
            if (gs != null) {
                for (GO go : A0E.A04.A01.A01()) {
                    if (go != null) {
                        go.ACP(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws C9K {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            C02319e A02 = this.A05.A02(i);
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[2] = "kM2qExU4ybhQ7HWfawBquzR2zjX0F4jA";
            this.A05 = A02;
        }
    }

    private void A0O(int i, boolean playing, int i2) throws C9K {
        C02279a A0G = this.A0K.A0G();
        XS xs = this.A0T[i];
        this.A0C[i2] = xs;
        if (xs.A7t() == 0) {
            C02469t c02469t = A0G.A04.A03[i];
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0W[2] = "NYdCxyfB4qBB5fQElsuicf6C6huVudSr";
            Format[] A0v = A0v(A0G.A04.A01.A00(i));
            boolean z = this.A08 && this.A05.A00 == 3;
            xs.A5Q(c02469t, A0v, A0G.A0A[i], this.A03, !playing && z, A0G.A07());
            this.A0G.A09(xs);
            if (z) {
                xs.start();
            }
        }
    }

    private void A0P(long j) throws C9K {
        if (this.A0K.A0P()) {
            j = this.A0K.A0G().A09(j);
        }
        this.A03 = j;
        this.A0G.A07(j);
        for (XS xs : this.A0C) {
            xs.AEn(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws C9K {
        C9R c9r;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        C02319e c02319e = this.A05;
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        A0W[2] = "iI9novLuZIFAEfCO4qiE3Y1J9OFTcxg5";
        int i = c02319e.A04.A02;
        int currentPeriodIndex = this.A00;
        C9R c9r2 = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c9r2 != null) {
            if (c9r2.A00 <= i) {
                int i2 = c9r2.A00;
                if (A0W[7].charAt(9) == '8') {
                    A0W[2] = "hDlIvL5rLgyE5VG4VUIth4YrdDyvlxxs";
                    if (i2 == i) {
                        if (c9r2.A01 <= j) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            int currentPeriodIndex2 = this.A00 - 1;
            this.A00 = currentPeriodIndex2;
            c9r2 = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c9r = this.A0R.get(this.A00);
        } else {
            c9r = null;
        }
        while (c9r != null && c9r.A02 != null && (c9r.A00 < i || (c9r.A00 == i && c9r.A01 <= j))) {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if (i3 < this.A0R.size()) {
                c9r = this.A0R.get(this.A00);
            } else {
                c9r = null;
            }
        }
        while (c9r != null && c9r.A02 != null && c9r.A00 == i && c9r.A01 > j && c9r.A01 <= j2) {
            A0Z(c9r.A03);
            if (c9r.A03.A0B() || c9r.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                ArrayList<C9R> arrayList = this.A0R;
                int i4 = this.A00;
                if (A0W[5].charAt(1) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "2inRqgHKNmW90mXz8";
                c9r = arrayList.get(i4);
            } else {
                c9r = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.AEY(2);
        this.A0Q.AF3(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.facebook.ads.redexgen.X.C9T r20) throws com.facebook.ads.redexgen.X.C9K {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0320Dj.A0T(com.facebook.ads.redexgen.X.9T):void");
    }

    private void A0V(C02279a c02279a) throws C9K {
        C02279a A0G = this.A0K.A0G();
        if (A0G == null || c02279a == A0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            XS[] xsArr = this.A0T;
            if (i2 < xsArr.length) {
                XS xs = xsArr[i2];
                zArr[i2] = xs.A7t() != 0;
                if (A0G.A04.A00(i2)) {
                    i++;
                }
                if (zArr[i2] && (!A0G.A04.A00(i2) || (xs.A8n() && xs.A7w() == c02279a.A0A[i2]))) {
                    A0b(xs);
                }
                i2++;
            } else {
                this.A05 = this.A05.A05(A0G.A03, A0G.A04);
                A0p(zArr, i);
                return;
            }
        }
    }

    private void A0W(C02329f c02329f) {
        this.A0G.AFP(c02329f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(C02439q c02439q) throws C9K {
        if (c02439q.A0D()) {
            return;
        }
        try {
            c02439q.A04().A8L(c02439q.A00(), c02439q.A09());
            c02439q.A0A(true);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "j7cBoz179DrNpy3qD7RptXNd9";
            strArr2[3] = "0iwSWX3dM4PAnuiRq1LulMUFPW";
        } catch (Throwable th) {
            c02439q.A0A(true);
            throw th;
        }
    }

    private void A0Y(C02439q c02439q) throws C9K {
        if (c02439q.A02() == -9223372036854775807L) {
            A0Z(c02439q);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C9R(c02439q));
            return;
        }
        C9R c9r = new C9R(c02439q);
        if (A0r(c9r)) {
            this.A0R.add(c9r);
            Collections.sort(this.A0R);
        } else {
            c02439q.A0A(false);
        }
    }

    private void A0Z(C02439q c02439q) throws C9K {
        if (c02439q.A03().getLooper() == this.A0Q.A7D()) {
            A0X(c02439q);
            C02319e c02319e = this.A05;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            A0W[5] = "cBEQE15IFXZqMCE104UHZMDgeC8qTiqN";
            if (c02319e.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AF2(2);
                return;
            }
            return;
        }
        this.A0Q.AAH(15, c02439q).sendToTarget();
    }

    private void A0a(final C02439q c02439q) {
        c02439q.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9P
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-60, -9, -18, -49, -21, -32, -8, -28, -15, -56, -20, -17, -21, -56, -19, -13, -28, -15, -19, -32, -21, -52, -27, -36, -17, -25, -36, -38, -21, -36, -37, -105, -36, -23, -23, -26, -23, -105, -37, -36, -29, -32, -19, -36, -23, -32, -27, -34, -105, -28, -36, -22, -22, -40, -34, -36, -105, -26, -27, -105, -36, -17, -21, -36, -23, -27, -40, -29, -105, -21, -33, -23, -36, -40, -37, -91};
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (K0.A02(this)) {
                    return;
                }
                try {
                    try {
                        C0320Dj.this.A0X(c02439q);
                    } catch (C9K e) {
                        Log.e(A00(0, 21, 113), A00(21, 55, 105), e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    K0.A00(th, this);
                }
            }
        });
    }

    private void A0b(XS xs) throws C9K {
        this.A0G.A08(xs);
        A0c(xs);
        xs.A53();
    }

    private void A0c(XS xs) throws C9K {
        if (xs.A7t() == 2) {
            xs.stop();
        }
    }

    private void A0d(C02489v c02489v) {
        this.A06 = c02489v;
    }

    private void A0e(InterfaceC0777Vg interfaceC0777Vg) {
        if (!this.A0K.A0T(interfaceC0777Vg)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(InterfaceC0777Vg interfaceC0777Vg) throws C9K {
        if (!this.A0K.A0T(interfaceC0777Vg)) {
            return;
        }
        C02279a A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A7Z().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C02279a loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0357Eu
    /* renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void AAx(InterfaceC0777Vg interfaceC0777Vg) {
        this.A0Q.AAH(10, interfaceC0777Vg).sendToTarget();
    }

    private void A0h(EY ey, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = ey;
        A0N(2);
        ey.ADx(this.A0H, true, this);
        this.A0Q.AF2(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, GS gs) {
        this.A0J.ADD(this.A0T, trackGroupArray, gs.A01);
    }

    private void A0j(boolean z) throws C9K {
        EW ew = this.A0K.A0G().A02.A04;
        long A03 = A03(ew, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            C02319e c02319e = this.A05;
            this.A05 = c02319e.A04(ew, A03, c02319e.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C9K {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AF2(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AF2(2);
        }
    }

    private void A0m(boolean z) throws C9K {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.AD4();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        GS gs;
        EY ey;
        this.A0Q.AEY(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (XS xs : this.A0C) {
            try {
                A0b(xs);
            } catch (C9K | RuntimeException e) {
                Log.e(A06(0, 21, 43), A06(138, 12, 49), e);
            }
        }
        this.A0C = new XS[0];
        this.A0K.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AbstractC02519z.A01);
            Iterator<C9R> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC02519z abstractC02519z = z3 ? AbstractC02519z.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        EW ew = z2 ? new EW(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        TrackGroupArray trackGroupArray = z3 ? TrackGroupArray.A04 : this.A05.A05;
        if (z3) {
            gs = this.A0O;
        } else {
            gs = this.A05.A06;
        }
        this.A05 = new C02319e(abstractC02519z, obj, ew, j, j2, i, false, trackGroupArray, gs);
        if (z && (ey = this.A07) != null) {
            ey.AEV(this);
            this.A07 = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0p(boolean[] r6, int r7) throws com.facebook.ads.redexgen.X.C9K {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.XS[] r0 = new com.facebook.ads.redexgen.X.XS[r7]
            r5.A0C = r0
            r4 = 0
            com.facebook.ads.redexgen.X.9c r0 = r5.A0K
            com.facebook.ads.redexgen.X.9a r3 = r0.A0G()
            r2 = 0
        Lc:
            com.facebook.ads.redexgen.X.XS[] r0 = r5.A0T
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.GS r0 = r3.A04
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L21
            boolean r1 = r6[r2]
            int r0 = r4 + 1
            r5.A0O(r2, r1, r4)
            r4 = r0
        L21:
            int r2 = r2 + 1
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0320Dj.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C02279a A0G = this.A0K.A0G();
        long j = A0G.A02.A01;
        if (j != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                C02279a c02279a = A0G.A01;
                if (A0W[7].charAt(9) != '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[1] = "YaIhV2LltIG4HuclCS5WOO9hjwkCXeMt";
                strArr[0] = "X0pypN8zwLPsNLuJVHuHfetSc0yM8k9B";
                if (c02279a != null) {
                    C02279a playingPeriodHolder = A0G.A01;
                    if (!playingPeriodHolder.A06) {
                        C02279a playingPeriodHolder2 = A0G.A01;
                        if (playingPeriodHolder2.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C9R c9r) {
        if (c9r.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C9T(c9r.A03.A08(), c9r.A03.A01(), C9E.A00(c9r.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            int intValue = ((Integer) A04.first).intValue();
            long longValue = ((Long) A04.second).longValue();
            AbstractC02519z abstractC02519z = this.A05.A03;
            Integer num = (Integer) A04.first;
            String[] strArr = A0W;
            String str = strArr[1];
            String str2 = strArr[0];
            int charAt = str.charAt(10);
            int index = str2.charAt(10);
            if (charAt == index) {
                throw new RuntimeException();
            }
            A0W[6] = "Qe4SjxIsSBa3x6HAW";
            c9r.A01(intValue, longValue, abstractC02519z.A0A(num.intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(c9r.A02);
            if (A042 == -1) {
                return false;
            }
            c9r.A00 = A042;
        }
        return true;
    }

    private boolean A0s(XS xs) {
        C02279a A0H = this.A0K.A0H();
        C02279a readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C02279a readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && xs.A8Q()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(EW ew, long j, C02279a c02279a) {
        if (ew.equals(c02279a.A02.A04) && c02279a.A06) {
            this.A05.A03.A09(c02279a.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j);
            if (A04 == -1 || this.A0L.A09(A04) == c02279a.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C02279a A0F = this.A0K.A0F();
        long A0C = A0F.A0C(!A0F.A02.A05);
        return A0C == Long.MIN_VALUE || this.A0J.AFa(A0C - A0F.A08(this.A03), this.A0G.A7Z().A01, this.A09);
    }

    public static Format[] A0v(GO go) {
        int length = go != null ? go.length() : 0;
        Format[] formatArr = new Format[length];
        String[] strArr = A0W;
        String str = strArr[1];
        String str2 = strArr[0];
        int charAt = str.charAt(10);
        int length2 = str2.charAt(10);
        if (charAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[4] = "X04sVE4WijYjotgv6w3bASzS6";
        strArr2[3] = "U1jCIvxI6fY8JZE6Ili1DHAvIg";
        for (int i = 0; i < length; i++) {
            formatArr[i] = go.A6z(i);
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.HV r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AF2(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0320Dj.A0x():void");
    }

    public final void A0y(AbstractC02519z abstractC02519z, int i, long j) {
        this.A0Q.AAH(3, new C9T(abstractC02519z, i, j)).sendToTarget();
    }

    public final void A0z(EY ey, boolean z, boolean z2) {
        this.A0Q.AAG(0, z ? 1 : 0, z2 ? 1 : 0, ey).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.AAF(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.AAF(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.C9H
    public final void ACO(C02329f c02329f) {
        this.A0E.obtainMessage(1, c02329f).sendToTarget();
        A0L(c02329f.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0778Vh
    public final void ACW(InterfaceC0777Vg interfaceC0777Vg) {
        this.A0Q.AAH(9, interfaceC0777Vg).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.EX
    public final void ACz(EY ey, AbstractC02519z abstractC02519z, Object obj) {
        this.A0Q.AAH(8, new C9Q(ey, abstractC02519z, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02419o
    public final synchronized void AF4(C02439q c02439q) {
        if (this.A0A) {
            Log.w(A06(0, 21, 43), A06(50, 37, 33));
            c02439q.A0A(false);
        } else {
            this.A0Q.AAH(14, c02439q).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 43);
        try {
            switch (message.what) {
                case 0:
                    A0h((EY) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C9T) message.obj);
                    break;
                case 4:
                    A0W((C02329f) message.obj);
                    break;
                case 5:
                    A0d((C02489v) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C9Q) message.obj);
                    break;
                case 9:
                    A0f((InterfaceC0777Vg) message.obj);
                    break;
                case 10:
                    A0e((InterfaceC0777Vg) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C02439q) message.obj);
                    break;
                case 15:
                    A0a((C02439q) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C9K e) {
            Log.e(A06, A06(110, 15, 98), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(125, 13, 51), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, C9K.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, 38), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, C9K.A02(e3)).sendToTarget();
            A0A();
        }
        return true;
    }
}
