package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class C6 {
    public static byte[] A00;
    public static String[] A01 = {"b", "1fRxwJ5XE31BEFto", "uScK6DjhwaakoKLKywWqQqJcG3f6AUTY", "4Hlq2lRki9cJUEzjlqXKmdMa0dcUUFBD", "g78w6vvkNWOU54nDIB5PtPh0iS7AkCQe", "b", "Krct3XGjvdQG30dTRHyGL58gGhCYlC87", "LauCO"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<long[], long[]> A05(C0804Wk c0804Wk) {
        C0803Wj A072;
        if (c0804Wk == null || (A072 = c0804Wk.A07(C1.A0P)) == null) {
            return Pair.create(null, null);
        }
        C0420Hh c0420Hh = A072.A00;
        c0420Hh.A0Y(8);
        int A012 = C1.A01(c0420Hh.A08());
        int A0H = c0420Hh.A0H();
        long[] jArr = new long[A0H];
        long[] jArr2 = new long[A0H];
        for (int i = 0; i < A0H; i++) {
            jArr[i] = A012 == 1 ? c0420Hh.A0N() : c0420Hh.A0M();
            jArr2[i] = A012 == 1 ? c0420Hh.A0L() : c0420Hh.A08();
            if (c0420Hh.A0U() != 1) {
                throw new IllegalArgumentException(A0I(272, 23, 92));
            }
            c0420Hh.A0Z(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C5 A0B(C0420Hh c0420Hh) {
        long A0M;
        c0420Hh.A0Y(8);
        int A012 = C1.A01(c0420Hh.A08());
        c0420Hh.A0Z(A012 == 0 ? 8 : 16);
        int A082 = c0420Hh.A08();
        c0420Hh.A0Z(4);
        boolean z = true;
        String[] strArr = A01;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "r";
        strArr2[5] = "s";
        int A062 = c0420Hh.A06();
        int i = A012 == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (c0420Hh.A00[A062 + i2] != -1) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            c0420Hh.A0Z(i);
            A0M = -9223372036854775807L;
        } else {
            A0M = A012 == 0 ? c0420Hh.A0M() : c0420Hh.A0N();
            if (A0M == 0) {
                A0M = -9223372036854775807L;
            }
        }
        c0420Hh.A0Z(16);
        int A083 = c0420Hh.A08();
        int A084 = c0420Hh.A08();
        c0420Hh.A0Z(4);
        int A085 = c0420Hh.A08();
        int A086 = c0420Hh.A08();
        return new C5(A082, A0M, (A083 == 0 && A084 == 65536 && A085 == (-65536) && A086 == 0) ? 90 : (A083 == 0 && A084 == (-65536) && A085 == 65536 && A086 == 0) ? SubsamplingScaleImageView.ORIENTATION_270 : (A083 == (-65536) && A084 == 0 && A085 == 0 && A086 == (-65536)) ? SubsamplingScaleImageView.ORIENTATION_180 : 0);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 25
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CM A0C(C0804Wk c0804Wk, C0803Wj c0803Wj, long j, DrmInitData drmInitData, boolean z, boolean z2) throws C02309d {
        int i;
        int i2;
        int i3;
        long j2 = j;
        C0804Wk A062 = c0804Wk.A06(C1.A0e);
        int A022 = A02(A062.A07(C1.A0W).A00);
        if (A022 == -1) {
            return null;
        }
        C5 A0B = A0B(c0804Wk.A07(C1.A1K).A00);
        if (j2 == -9223372036854775807L) {
            j2 = A0B.A02;
        }
        long A042 = A04(c0803Wj.A00);
        if (A01[6].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A01[7] = "VRI";
        long A0F = j2 == -9223372036854775807L ? -9223372036854775807L : C0436Hx.A0F(j2, 1000000L, A042);
        C0804Wk A063 = A062.A06(C1.A0i).A06(C1.A17);
        Pair<Long, String> A064 = A06(A062.A07(C1.A0d).A00);
        C0420Hh c0420Hh = A063.A07(C1.A1B).A00;
        i = A0B.A00;
        i2 = A0B.A01;
        C4 A0A = A0A(c0420Hh, i, i2, (String) A064.second, drmInitData, z2);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z) {
            Pair<long[], long[]> A052 = A05(c0804Wk.A06(C1.A0O));
            jArr = (long[]) A052.first;
            jArr2 = (long[]) A052.second;
        }
        if (A0A.A02 == null) {
            return null;
        }
        i3 = A0B.A00;
        return new CM(i3, A022, ((Long) A064.first).longValue(), A042, A0F, A0A.A02, A0A.A01, A0A.A03, A0A.A00, jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CN A0D(C0420Hh c0420Hh, int i, int i2, String str) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c0420Hh.A0Y(i3);
            int A082 = c0420Hh.A08();
            if (c0420Hh.A08() == C1.A1H) {
                int A012 = C1.A01(c0420Hh.A08());
                c0420Hh.A0Z(1);
                int i4 = 0;
                int i5 = 0;
                if (A012 == 0) {
                    c0420Hh.A0Z(1);
                } else {
                    int A0E = c0420Hh.A0E();
                    i4 = (A0E & 240) >> 4;
                    i5 = A0E & 15;
                }
                boolean z = c0420Hh.A0E() == 1;
                int A0E2 = c0420Hh.A0E();
                byte[] bArr = new byte[16];
                c0420Hh.A0c(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z && A0E2 == 0) {
                    int A0E3 = c0420Hh.A0E();
                    if (A01[3].charAt(18) == 'y') {
                        throw new RuntimeException();
                    }
                    A01[6] = "4wz2pNpdOED2I1F7uwyPx7ja9AIbtNj6";
                    bArr2 = new byte[A0E3];
                    c0420Hh.A0c(bArr2, 0, A0E3);
                }
                return new CN(z, str, A0E2, bArr, i4, i5, bArr2);
            }
            i3 += A082;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x044c, code lost:            if (r7 != r24) goto L157;     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x044e, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0511, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x050d, code lost:            if (r7 != r24) goto L157;     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01d3, code lost:            r6 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01cf, code lost:            if (r4 != false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:            if (r4 != false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:            if (A0I(492, 9, 73).equals(r35.A07.A0O) == false) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:            if (r7 != 0) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:            if (r27 != 0) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:            if (r10 != 0) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:            r6 = true;     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 38
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.CP A0E(com.facebook.ads.redexgen.X.CM r35, com.facebook.ads.redexgen.X.C0804Wk r36, com.facebook.ads.redexgen.X.C0282Be r37) throws com.facebook.ads.redexgen.X.C02309d {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6.A0E(com.facebook.ads.redexgen.X.CM, com.facebook.ads.redexgen.X.Wk, com.facebook.ads.redexgen.X.Be):com.facebook.ads.redexgen.X.CP");
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{92, 80, -94, -107, -99, -111, -103, -98, -103, -98, -105, -125, -111, -99, -96, -100, -107, -93, 113, -92, -124, -103, -99, -107, -93, -92, -111, -99, -96, 116, -107, -100, -92, -111, 80, 86, 74, -100, -113, -105, -117, -109, -104, -109, -104, -111, 125, -117, -105, -102, -106, -113, -99, 115, -104, 109, -110, -97, -104, -107, 74, -96, -108, -26, -39, -31, -43, -35, -30, -35, -30, -37, -56, -35, -31, -39, -25, -24, -43, -31, -28, -72, -39, -32, -24, -43, -73, -36, -43, -30, -37, -39, -25, -108, 102, 76, -98, -111, -103, -115, -107, -102, -107, -102, -109, Byte.MAX_VALUE, -91, -102, -113, -108, -98, -101, -102, -107, -90, -115, -96, -107, -101, -102, Byte.MAX_VALUE, -115, -103, -100, -104, -111, -97, 76, 87, -118, -123, -125, 102, 119, -120, -119, 123, -120, -119, Byte.MAX_VALUE, -99, -92, -91, -88, -97, -92, -99, 86, -101, -102, -97, -86, 86, -94, -97, -87, -86, 112, 86, -101, -102, -97, -86, 86, -102, -91, -101, -87, 86, -92, -91, -86, 86, -87, -86, -105, -88, -86, 86, -83, -97, -86, -98, 86, -105, 86, -87, -81, -92, -103, 86, -87, -105, -93, -90, -94, -101, 100, -102, -65, -76, -64, -65, -60, -70, -60, -59, -74, -65, -59, 113, -60, -59, -77, -67, 113, -77, -64, -55, 113, -73, -64, -61, 113, -59, -61, -78, -76, -68, 113, -61, -31, -48, -46, -38, -113, -41, -48, -30, -113, -35, -34, -113, -30, -48, -36, -33, -37, -44, -113, -29, -48, -47, -37, -44, -113, -30, -40, -23, -44, -113, -40, -35, -43, -34, -31, -36, -48, -29, -40, -34, -35, -64, -39, -34, -32, -37, -37, -38, -35, -33, -48, -49, -117, -40, -48, -49, -44, -52, -117, -35, -52, -33, -48, -103, -126, -111, -111, -115, -118, -124, -126, -107, -118, -112, -113, 80, -107, -107, -114, -115, 76, -103, -114, -115, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -78, 103, -99, -101, -89, -97, -84, -101, 103, -89, -87, -82, -93, -87, -88, -88, -73, -73, -77, -80, -86, -88, -69, -80, -74, -75, 118, -65, 116, -76, -73, 123, 116, -86, -84, -88, 116, 125, 119, Byte.MAX_VALUE, 121, -120, -120, -124, -127, 123, 121, -116, -127, -121, -122, 71, -112, 69, -123, -120, 76, 69, -114, -116, -116, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -66, 115, -73, -69, -81, -87, -79, -70, -81, -77, -85, 115, -70, -66, 121, -83, -96, -76, -93, -88, -82, 110, 114, -90, -81, -81, 126, -110, -127, -122, -116, 76, 126, Byte.MIN_VALUE, 80, -39, -19, -36, -31, -25, -89, -39, -28, -39, -37, 120, -116, 123, Byte.MIN_VALUE, -122, 70, 120, -124, -119, 68, -114, 121, -30, -10, -27, -22, -16, -80, -26, -30, -28, -76, -127, -107, -124, -119, -113, 79, -115, -112, 84, -127, 77, -116, -127, -108, -115, -49, -29, -46, -41, -35, -99, -37, -34, -45, -43, -71, -51, -68, -63, -57, -121, -54, -71, -49, -21, -1, -18, -13, -7, -71, 0, -8, -18, -72, -18, -2, -3, -96, -76, -93, -88, -82, 110, -75, -83, -93, 109, -93, -77, -78, 109, -89, -93, -36, -16, -33, -28, -22, -86, -15, -23, -33, -87, -33, -17, -18, -87, -29, -33, -74, -21, -19, -22, -31, -28, -25, -32, -72, -25, -35, -19, -69, -70, -69, -119, -17, -18, -17, -1, -65, -63, -54, -65, -65, -63, -54, -49, -55, -50, -49, -46, -54, -89, -38, -43, -45, -71, -49, -32, -53, -122, -39, -50, -43, -37, -46, -54, -122, -56, -53, -122, -42, -43, -39, -49, -38, -49, -36, -53, -127, -118, -127, -114, -123, -111, -116, Byte.MIN_VALUE, 63, Byte.MIN_VALUE, -109, -114, -116, 63, -120, -110, 63, -116, Byte.MIN_VALUE, -115, -125, Byte.MIN_VALUE, -109, -114, -111, -104, -12, -20, -5, -24, -114, 125, -113, -121, -8, -24, -19, -18, -91, -26, -7, -12, -14, -91, -18, -8, -91, -14, -26, -13, -23, -26, -7, -12, -9, -2, -8, -12, -6, -13, -31, -29, -48, -30, -76, -91, -82, -93, 96, -95, -76, -81, -83, 96, -87, -77, 96, -83, -95, -82, -92, -95, -76, -81, -78, -71, -58, -73, -54, -58, -74, -87, -92, -91, -61, -74, -79, -78, -68, 124, Byte.MIN_VALUE, -76, -67, -67, -112, -125, 126, Byte.MAX_VALUE, -119, 73, 123, -112, 125, -114, -127, 124, 125, -121, 71, Byte.MIN_VALUE, 125, -114, 123, -21, -34, -39, -38, -28, -92, -19, -94, -21, -29, -39, -93, -28, -29, -89, -93, -21, -27, -83, -95, -108, -113, -112, -102, 90, -93, 88, -95, -103, -113, 89, -102, -103, 93, 89, -95, -101, 100};
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0145, code lost:            if (r6 == r3) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0120, code lost:            if (r6 == r3) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:            if (r0 != null) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:            com.facebook.ads.redexgen.X.HI.A04(r17);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0129, code lost:            if (r14 != com.facebook.ads.redexgen.X.C1.A1T) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:            r0 = A0I(729, 19, 102);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:            r0 = A0I(748, 19, 28);     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:            r17 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A0E) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0158, code lost:            if (r0 != null) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015a, code lost:            com.facebook.ads.redexgen.X.HI.A04(r17);        r0 = A0I(700, 10, 62);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0169, code lost:            r17 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016e, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A0T) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:            if (r0 != null) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0172, code lost:            com.facebook.ads.redexgen.X.HI.A04(r17);        r1 = A07(r23, r11);        r0 = (java.lang.String) r1.first;        r5 = java.util.Collections.singletonList((byte[]) r1.second);     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0187, code lost:            r17 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A0q) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018e, code lost:            r15 = A00(r23, r11);        r18 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0198, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A1G) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019a, code lost:            r25 = A0O(r23, r11, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a2, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A16) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a4, code lost:            r2 = r23.A0E();        r23.A0Z(3);     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ac, code lost:            if (r2 != 0) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:            switch(r23.A0E()) {            case 0: goto L78;            case 1: goto L79;            case 2: goto L80;            case 3: goto L81;            default: goto L111;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b7, code lost:            r26 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bb, code lost:            r26 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bf, code lost:            r26 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c3, code lost:            r26 = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d0, code lost:            if (com.facebook.ads.redexgen.X.C6.A01[1].length() == 12) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d2, code lost:            com.facebook.ads.redexgen.X.C6.A01[2] = "ncqjdIo8Q7C9TEhGWLQwCcGeWNY5S9h6";     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01db, code lost:            com.facebook.ads.redexgen.X.C6.A01[2] = "dnuTGkt9wQcTbo6J7tdoKURT12LZQ83u";     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 36 out of bounds for length 32
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0K(com.facebook.ads.redexgen.X.C0420Hh r23, int r24, int r25, int r26, int r27, int r28, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r29, com.facebook.ads.redexgen.X.C4 r30, int r31) throws com.facebook.ads.redexgen.X.C02309d {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6.A0K(com.facebook.ads.redexgen.X.Hh, int, int, int, int, int, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData, com.facebook.ads.redexgen.X.C4, int):void");
    }

    static {
        A0J();
        A08 = C0436Hx.A08(A0I(696, 4, 49));
        A05 = C0436Hx.A08(A0I(662, 4, 118));
        A07 = C0436Hx.A08(A0I(692, 4, 67));
        A04 = C0436Hx.A08(A0I(636, 4, 12));
        A06 = C0436Hx.A08(A0I(666, 4, 95));
        A02 = C0436Hx.A08(A0I(606, 4, 15));
        A03 = C0436Hx.A08(A0I(632, 4, 120));
    }

    public static float A00(C0420Hh c0420Hh, int i) {
        c0420Hh.A0Y(i + 8);
        int vSpacing = c0420Hh.A0H();
        int hSpacing = c0420Hh.A0H();
        return vSpacing / hSpacing;
    }

    public static int A01(C0420Hh c0420Hh) {
        int A0E = c0420Hh.A0E();
        int size = A0E & 127;
        while ((A0E & 128) == 128) {
            A0E = c0420Hh.A0E();
            int currentByte = A0E & 127;
            size = (size << 7) | currentByte;
        }
        return size;
    }

    public static int A02(C0420Hh c0420Hh) {
        c0420Hh.A0Y(16);
        int A082 = c0420Hh.A08();
        int trackType = A05;
        if (A082 == trackType) {
            return 1;
        }
        int trackType2 = A08;
        if (A082 == trackType2) {
            return 2;
        }
        int trackType3 = A07;
        if (A082 == trackType3) {
            return 3;
        }
        int trackType4 = A04;
        if (A082 == trackType4) {
            return 3;
        }
        int trackType5 = A06;
        if (A082 == trackType5) {
            return 3;
        }
        int trackType6 = A02;
        if (A082 == trackType6) {
            return 3;
        }
        int trackType7 = A03;
        if (A082 == trackType7) {
            return 4;
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(com.facebook.ads.redexgen.X.C0420Hh r7, int r8, int r9) {
        /*
            int r3 = r7.A06()
        L4:
            int r0 = r3 - r8
            if (r0 >= r9) goto L48
            r7.A0Y(r3)
            int r6 = r7.A08()
            if (r6 <= 0) goto L46
            r4 = 1
        L12:
            r5 = 574(0x23e, float:8.04E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C6.A01
            r0 = 4
            r1 = r1[r0]
            r0 = 24
            char r1 = r1.charAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L29
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C6.A01
            java.lang.String r1 = "NygnrBLA11LVP9MJCR7n8rNii2RIBIyr"
            r0 = 4
            r2[r0] = r1
            r1 = 32
            r0 = 87
            java.lang.String r0 = A0I(r5, r1, r0)
            com.facebook.ads.redexgen.X.HI.A05(r4, r0)
            int r1 = r7.A08()
            int r0 = com.facebook.ads.redexgen.X.C1.A0T
            if (r1 != r0) goto L44
            return r3
        L44:
            int r3 = r3 + r6
            goto L4
        L46:
            r4 = 0
            goto L12
        L48:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6.A03(com.facebook.ads.redexgen.X.Hh, int, int):int");
    }

    public static long A04(C0420Hh c0420Hh) {
        int fullAtom = 8;
        c0420Hh.A0Y(8);
        if (C1.A01(c0420Hh.A08()) != 0) {
            fullAtom = 16;
        }
        c0420Hh.A0Z(fullAtom);
        int fullAtom2 = A01[1].length();
        if (fullAtom2 == 12) {
            throw new RuntimeException();
        }
        A01[7] = "3W9G8I03JPUdsev";
        return c0420Hh.A0M();
    }

    public static Pair<Long, String> A06(C0420Hh c0420Hh) {
        c0420Hh.A0Y(8);
        int fullAtom = C1.A01(c0420Hh.A08());
        int languageCode = fullAtom == 0 ? 8 : 16;
        c0420Hh.A0Z(languageCode);
        long A0M = c0420Hh.A0M();
        int version = fullAtom == 0 ? 4 : 8;
        c0420Hh.A0Z(version);
        int A0I = c0420Hh.A0I();
        int languageCode2 = A0I >> 10;
        StringBuilder append = new StringBuilder().append(A0I(0, 0, 85)).append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = A0I >> 5;
        StringBuilder append2 = append.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = A0I & 31;
        return Pair.create(Long.valueOf(A0M), append2.append((char) (languageCode4 + 96)).toString());
    }

    public static Pair<String, byte[]> A07(C0420Hh c0420Hh, int i) {
        c0420Hh.A0Y(i + 8 + 4);
        c0420Hh.A0Z(1);
        A01(c0420Hh);
        c0420Hh.A0Z(2);
        int A0E = c0420Hh.A0E();
        if ((A0E & 128) != 0) {
            c0420Hh.A0Z(2);
        }
        int i2 = A0E & 64;
        if (A01[6].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A01[4] = "xKeFRQRG14ulCThjCTH6nGG5i69swr7b";
        if (i2 != 0) {
            c0420Hh.A0Z(c0420Hh.A0I());
        }
        if ((A0E & 32) != 0) {
            c0420Hh.A0Z(2);
        }
        c0420Hh.A0Z(1);
        A01(c0420Hh);
        String mimeType = C0413Ha.A03(c0420Hh.A0E());
        if (A0I(482, 10, 95).equals(mimeType) || A0I(501, 13, 123).equals(mimeType) || A0I(514, 16, 48).equals(mimeType)) {
            Pair<String, byte[]> create = Pair.create(mimeType, null);
            int objectTypeIndication = A01[6].charAt(18);
            if (objectTypeIndication != 121) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "4";
            strArr[5] = "i";
            return create;
        }
        c0420Hh.A0Z(12);
        c0420Hh.A0Z(1);
        int flags = A01(c0420Hh);
        byte[] bArr = new byte[flags];
        c0420Hh.A0c(bArr, 0, flags);
        return Pair.create(mimeType, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:            if (A0I(566, 4, 77).equals(r3) == false) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:            if (A0I(558, 4, 73).equals(r3) != false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:            if (A0I(570, 4, 77).equals(r3) != false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:            if (A0I(562, 4, 125).equals(r3) == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:            r8 = true;        r1 = com.facebook.ads.redexgen.X.C6.A01[3].charAt(18);     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:            if (r1 == 121) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:            com.facebook.ads.redexgen.X.C6.A01[4] = "c3g2qilHanrF8nzgjzcjaWK2icn944It";     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:            if (r4 == null) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:            com.facebook.ads.redexgen.X.HI.A05(r7, A0I(610, 22, 16));     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:            if (r6 == (-1)) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:            com.facebook.ads.redexgen.X.HI.A05(r7, A0I(640, 22, 118));        r3 = A0D(r10, r6, r5, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:            if (r3 == null) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:            com.facebook.ads.redexgen.X.HI.A05(r8, A0I(670, 22, 49));     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:            return android.util.Pair.create(r4, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:            r8 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:            r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:            r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:            throw new java.lang.RuntimeException();     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:            if (A0I(566, 4, 77).equals(r3) == false) goto L23;     */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.X.CN> A08(com.facebook.ads.redexgen.X.C0420Hh r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6.A08(com.facebook.ads.redexgen.X.Hh, int, int):android.util.Pair");
    }

    public static Pair<Integer, CN> A09(C0420Hh c0420Hh, int i, int i2) {
        Pair<Integer, CN> A082;
        int A062 = c0420Hh.A06();
        while (true) {
            int i3 = A062 - i;
            if (A01[3].charAt(18) == 'y') {
                throw new RuntimeException();
            }
            A01[6] = "VuSqoU71mDFleviScFynwgGpV5GSmBmr";
            if (i3 < i2) {
                c0420Hh.A0Y(A062);
                int A083 = c0420Hh.A08();
                HI.A05(A083 > 0, A0I(574, 32, 87));
                int childAtomSize = c0420Hh.A08();
                int childPosition = C1.A14;
                if (childAtomSize == childPosition && (A082 = A08(c0420Hh, A062, A083)) != null) {
                    return A082;
                }
                A062 += A083;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:            if (r6 == r3) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0l) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0R) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A05) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:            r3 = com.facebook.ads.redexgen.X.C1.A0N;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:            if (com.facebook.ads.redexgen.X.C6.A01[6].charAt(18) == 'y') goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:            com.facebook.ads.redexgen.X.C6.A01[7] = "sstJHJE2SSSA0gl";     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:            if (r6 == r3) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0J) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0K) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0L) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0M) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0w) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0x) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A0b) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0107, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A15) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A04) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A06) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0124, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A03) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0128, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A1P) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012c, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A1X) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:            if (r6 == com.facebook.ads.redexgen.X.C1.A19) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A0A) goto L82;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:            if (r6 != com.facebook.ads.redexgen.X.C1.A0B) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:            r13.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0B(java.lang.Integer.toString(r24), A0I(315, 27, 43), null, -1, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0136, code lost:            r5 = r5;        r7 = r7;        r8 = r8;        A0L(r5, r6, r7, r8, r24, r26, r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0118, code lost:            com.facebook.ads.redexgen.X.C6.A01[4] = "NowU1j8TXSe0umpE5Ib758xlieALevMk";     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:            if (r6 == r3) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:            r5 = r5;        A0M(r5, r6, r7, r8, r24, r26, r28, r27, r13, r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00be, code lost:            if (r6 == r3) goto L32;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C4 A0A(com.facebook.ads.redexgen.X.C0420Hh r23, int r24, int r25, java.lang.String r26, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r27, boolean r28) throws com.facebook.ads.redexgen.X.C02309d {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6.A0A(com.facebook.ads.redexgen.X.Hh, int, int, java.lang.String, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData, boolean):com.facebook.ads.redexgen.X.C4");
    }

    public static Metadata A0F(C0803Wj c0803Wj, boolean z) {
        if (z) {
            return null;
        }
        C0420Hh c0420Hh = c0803Wj.A00;
        c0420Hh.A0Y(8);
        while (c0420Hh.A04() >= 8) {
            int atomPosition = c0420Hh.A06();
            int A082 = c0420Hh.A08();
            if (c0420Hh.A08() == C1.A0h) {
                c0420Hh.A0Y(atomPosition);
                return A0H(c0420Hh, atomPosition + A082);
            }
            c0420Hh.A0Z(A082 - 8);
        }
        return null;
    }

    public static Metadata A0G(C0420Hh c0420Hh, int i) {
        c0420Hh.A0Z(8);
        ArrayList arrayList = new ArrayList();
        while (c0420Hh.A06() < i) {
            Id3Frame A042 = CE.A04(c0420Hh);
            if (A042 != null) {
                arrayList.add(A042);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(C0420Hh c0420Hh, int i) {
        c0420Hh.A0Z(12);
        while (true) {
            int A062 = c0420Hh.A06();
            if (A01[2].charAt(2) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "B";
            strArr[5] = "e";
            if (A062 < i) {
                int A063 = c0420Hh.A06();
                int atomType = c0420Hh.A08();
                int atomSize = c0420Hh.A08();
                int atomPosition = C1.A0a;
                if (atomSize == atomPosition) {
                    c0420Hh.A0Y(A063);
                    return A0G(c0420Hh, A063 + atomType);
                }
                int atomPosition2 = atomType - 8;
                c0420Hh.A0Z(atomPosition2);
            } else {
                return null;
            }
        }
    }

    public static void A0L(C0420Hh c0420Hh, int i, int i2, int i3, int i4, String str, C4 c4) throws C02309d {
        String A0I;
        c0420Hh.A0Y(i2 + 8 + 8);
        List list = null;
        long j = Long.MAX_VALUE;
        if (i == C1.A03) {
            A0I = A0I(295, 20, 18);
        } else if (i == C1.A1P) {
            A0I = A0I(388, 28, 55);
            int i5 = (i3 - 8) - 8;
            byte[] bArr = new byte[i5];
            c0420Hh.A0c(bArr, 0, i5);
            list = Collections.singletonList(bArr);
        } else if (i == C1.A1X) {
            A0I = A0I(367, 21, 9);
        } else if (i == C1.A19) {
            A0I = A0I(295, 20, 18);
            j = 0;
        } else if (i == C1.A0A) {
            A0I = A0I(342, 25, 56);
            c4.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        c4.A02 = Format.A09(Integer.toString(i4), A0I, null, -1, 0, str, -1, null, j, list);
    }

    public static void A0M(C0420Hh c0420Hh, int i, int childPosition, int i2, int i3, String mimeType, boolean z, DrmInitData drmInitData, C4 c4, int i4) throws C02309d {
        int A0I;
        int A0F;
        int A032;
        DrmInitData drmInitData2 = drmInitData;
        int childPosition2 = i;
        c0420Hh.A0Y(childPosition + 8 + 8);
        int quickTimeSoundDescriptionVersion = 0;
        if (z) {
            quickTimeSoundDescriptionVersion = c0420Hh.A0I();
            c0420Hh.A0Z(6);
        } else {
            c0420Hh.A0Z(8);
        }
        if (quickTimeSoundDescriptionVersion == 0 || quickTimeSoundDescriptionVersion == 1) {
            A0I = c0420Hh.A0I();
            c0420Hh.A0Z(6);
            A0F = c0420Hh.A0F();
            if (quickTimeSoundDescriptionVersion == 1) {
                c0420Hh.A0Z(16);
            }
        } else if (quickTimeSoundDescriptionVersion == 2) {
            c0420Hh.A0Z(16);
            A0F = (int) Math.round(c0420Hh.A03());
            A0I = c0420Hh.A0H();
            c0420Hh.A0Z(20);
        } else {
            return;
        }
        int channelCount = c0420Hh.A06();
        if (childPosition2 == C1.A0R) {
            Pair<Integer, CN> A09 = A09(c0420Hh, childPosition, i2);
            if (A01[2].charAt(2) == 't') {
                throw new RuntimeException();
            }
            A01[1] = "rXJd0uQKTdLTB";
            if (A09 != null) {
                childPosition2 = ((Integer) A09.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.A02(((CN) A09.second).A02);
                }
                c4.A03[i4] = (CN) A09.second;
            }
            c0420Hh.A0Y(channelCount);
        }
        String str = null;
        if (childPosition2 == C1.A05) {
            str = A0I(426, 9, 14);
        } else if (childPosition2 == C1.A0N) {
            str = A0I(457, 10, 114);
        } else if (childPosition2 == C1.A0J) {
            str = A0I(501, 13, 123);
        } else if (childPosition2 == C1.A0L || childPosition2 == C1.A0M) {
            str = A0I(514, 16, 48);
        } else if (childPosition2 == C1.A0K) {
            str = A0I(530, 28, 108);
        } else if (childPosition2 == C1.A0w) {
            str = A0I(416, 10, 48);
        } else if (childPosition2 == C1.A0x) {
            str = A0I(445, 12, 8);
        } else if (childPosition2 == C1.A0b || childPosition2 == C1.A15) {
            str = A0I(492, 9, 73);
        } else if (childPosition2 == C1.A04) {
            str = A0I(482, 10, 95);
        } else {
            int atomType = C1.A06;
            int atomType2 = A01[7].length();
            if (atomType2 == 14) {
                throw new RuntimeException();
            }
            A01[1] = "HdbKXAaE1rDpPSyLEE9ktT";
            if (childPosition2 == atomType) {
                str = A0I(435, 10, 105);
            }
        }
        byte[] bArr = null;
        int atomType3 = A01[4].charAt(24);
        if (atomType3 != 105) {
            throw new RuntimeException();
        }
        A01[6] = "QyfbMcdO26pfDQU6rlymYH0CLTjMRKBW";
        while (channelCount - childPosition < i2) {
            c0420Hh.A0Y(channelCount);
            int childAtomSize = c0420Hh.A08();
            HI.A05(childAtomSize > 0, A0I(574, 32, 87));
            int atomType4 = c0420Hh.A08();
            if (atomType4 == C1.A0T || (z && atomType4 == C1.A1W)) {
                if (atomType4 == C1.A0T) {
                    A032 = channelCount;
                } else {
                    A032 = A03(c0420Hh, channelCount, childAtomSize);
                }
                if (A032 != -1) {
                    Pair<String, byte[]> A072 = A07(c0420Hh, A032);
                    str = (String) A072.first;
                    bArr = (byte[]) A072.second;
                    if (A0I(467, 15, 17).equals(str)) {
                        Pair<Integer, Integer> A033 = HM.A03(bArr);
                        A0F = ((Integer) A033.first).intValue();
                        A0I = ((Integer) A033.second).intValue();
                    }
                }
            } else {
                int i5 = C1.A0F;
                if (A01[2].charAt(2) == 't') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "Q";
                strArr[5] = "M";
                if (atomType4 == i5) {
                    c0420Hh.A0Y(channelCount + 8);
                    c4.A02 = A8.A07(c0420Hh, Integer.toString(i3), mimeType, drmInitData2);
                } else if (atomType4 == C1.A0I) {
                    c0420Hh.A0Y(channelCount + 8);
                    c4.A02 = A8.A08(c0420Hh, Integer.toString(i3), mimeType, drmInitData2);
                } else if (atomType4 == C1.A0H) {
                    c4.A02 = Format.A07(Integer.toString(i3), str, null, -1, -1, A0I, A0F, null, drmInitData2, 0, mimeType);
                } else if (atomType4 == C1.A06) {
                    bArr = new byte[childAtomSize];
                    c0420Hh.A0Y(channelCount);
                    c0420Hh.A0c(bArr, 0, childAtomSize);
                }
            }
            channelCount += childAtomSize;
        }
        if (c4.A02 != null || str == null) {
            return;
        }
        int atomType5 = A0I(492, 9, 73).equals(str) ? 2 : -1;
        c4.A02 = Format.A06(Integer.toString(i3), str, null, -1, -1, A0I, A0F, atomType5, bArr != null ? Collections.singletonList(bArr) : null, drmInitData2, 0, mimeType);
    }

    public static boolean A0N(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int latestDelayIndex = C0436Hx.A06(3, 0, length);
        int lastIndex = jArr.length;
        return jArr[0] <= j2 && j2 < jArr[latestDelayIndex] && jArr[C0436Hx.A06(lastIndex - 3, 0, length)] < j3 && j3 <= j;
    }

    public static byte[] A0O(C0420Hh c0420Hh, int i, int i2) {
        int i3 = i + 8;
        while (true) {
            int i4 = i3 - i;
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[5];
            int length = str.length();
            int childPosition = str2.length();
            if (length != childPosition) {
                break;
            }
            A01[2] = "hiyhCkw83qioTZht4ycME2aPtqNlSya0";
            if (i4 >= i2) {
                if (A01[4].charAt(24) != 'i') {
                    return null;
                }
                A01[6] = "op0Xll27WP2wTMdM3NyEU8fL7oyu7ROp";
                return null;
            }
            c0420Hh.A0Y(i3);
            int A082 = c0420Hh.A08();
            int A083 = c0420Hh.A08();
            int i5 = C1.A0r;
            int childAtomSize = A01[2].charAt(2);
            if (childAtomSize == 116) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[0] = "K";
            strArr2[5] = "V";
            if (A083 == i5) {
                int childPosition2 = i3 + A082;
                return Arrays.copyOfRange(c0420Hh.A00, i3, childPosition2);
            }
            i3 += A082;
        }
        throw new RuntimeException();
    }
}
