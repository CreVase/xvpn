package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0808Wo implements InterfaceC0278Ba {
    public static byte[] A0p;
    public static String[] A0q = {"WhKu7pkuAeXCsVE8uRhv3EZwgBp9riSc", "wrDeNyGLCWUv14ZggE2zPWUzu5gjoOIg", "xUs1VEgTJlmvEesGlKYim2mGX89Mn6Ap", "W8YnXYO8xf4ClNYvDZVYWX", "B88t6KSt5rHqx0X", "mP1RKkMa67OSAD0gBpbGTYhDs7d4UNMk", "rmkWP1gG3PZnRTV6Vu72xnpKfVt", "q3NSDD9bEbAX3BTi5XmjKvgCV917aeoR"};
    public static final InterfaceC0281Bd A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public InterfaceC0280Bc A0N;
    public C0294Bw A0O;
    public HX A0P;
    public HX A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<C0294Bw> A0c;
    public final InterfaceC0292Bs A0d;
    public final C0295Bz A0e;
    public final C0420Hh A0f;
    public final C0420Hh A0g;
    public final C0420Hh A0h;
    public final C0420Hh A0i;
    public final C0420Hh A0j;
    public final C0420Hh A0k;
    public final C0420Hh A0l;
    public final C0420Hh A0m;
    public final C0420Hh A0n;
    public final boolean A0o;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{65, -113, -112, -107, 65, -108, -106, -111, -111, -112, -109, -107, -122, -123, -98, -87, -86, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, 56, 67, 69, 119, 77, 56, 67, 69, 119, 77, 56, 67, 69, 119, 63, 56, 67, 70, 119, -107, -103, -89, -89, -71, -56, -56, -67, -62, -69, -57, -105, -67, -60, -68, -71, -58, -95, -61, -72, -71, 116, -53, -23, -53, -53, -51, -55, -25, -55, -53, -69, -81, -51, -78, -62, -63, -117, -87, -114, -98, -99, 121, -113, -94, -102, -100, -113, -99, -99, -93, -63, -90, -74, -75, -111, -82, -79, -75, -75, -82, -89, -75, -75, -120, -90, -116, -120, -118, 122, 94, 124, 99, 105, 94, 96, -77, -47, -65, -62, -73, -71, -95, -66, -92, 85, 115, 97, 100, 89, 91, 67, 96, 71, 116, -110, Byte.MIN_VALUE, -122, 98, 116, 118, Byte.MIN_VALUE, -77, -47, -63, -62, -57, -59, -100, -70, -85, -98, -88, -118, -92, -87, -81, -118, -89, -92, -81, -117, -87, -98, -100, -97, -113, -110, -114, -92, -62, -71, -78, -75, -91, -84, -74, -109, -79, -66, 119, -60, 112, -61, -77, -79, -68, -75, 112, -60, -71, -67, -75, -77, -65, -76, -75, 112, -64, -62, -71, -65, -62, 112, -60, -65, 112, -60, -71, -67, -75, -77, -65, -76, -75, -93, -77, -79, -68, -75, 112, -78, -75, -71, -66, -73, 112, -61, -75, -60, 126, 89, -123, -125, 120, Byte.MAX_VALUE, -124, Byte.MAX_VALUE, -124, 125, 54, 123, -124, 121, -120, -113, -122, -118, Byte.MAX_VALUE, -123, -124, 54, 119, -124, 122, 54, 121, -123, -125, -122, -120, 123, -119, -119, Byte.MAX_VALUE, -123, -124, 54, Byte.MAX_VALUE, -119, 54, -124, -123, -118, 54, -119, -117, -122, -122, -123, -120, -118, 123, 122, -69, -25, -26, -20, -35, -26, -20, -69, -25, -27, -24, -71, -28, -33, -25, -104, -111, -67, -68, -62, -77, -68, -62, -109, -68, -79, -113, -70, -75, -67, 110, -89, -45, -46, -40, -55, -46, -40, -87, -46, -57, -45, -56, -51, -46, -53, -77, -42, -56, -55, -42, -124, 120, -92, -93, -87, -102, -93, -87, 122, -93, -104, -92, -103, -98, -93, -100, -120, -104, -92, -91, -102, 85, -59, -16, -28, -43, -6, -15, -26, -95, 94, -119, 125, 110, -109, -118, Byte.MAX_VALUE, 108, Byte.MAX_VALUE, 123, 126, 112, Byte.MAX_VALUE, -116, -115, -125, -119, -120, 58, -68, -71, -60, -61, -105, -29, -40, -38, -32, -27, -34, -105, -22, -40, -28, -25, -29, -36, -105, -22, -32, -15, -36, -105, -26, -20, -21, -105, -26, -35, -105, -23, -40, -27, -34, -36, -91, -79, -82, -71, -72, -66, -47, -51, -48, -62, -47, -34, -33, -43, -37, -38, -116, -60, -19, -30, -15, -8, -17, -13, -28, -29, -97, -45, -15, -32, -30, -22, -97, -27, -18, -12, -19, -29, -97, -31, -12, -13, -97, -62, -18, -19, -13, -28, -19, -13, -60, -19, -30, -54, -28, -8, -56, -61, -97, -10, -32, -14, -97, -19, -18, -13, -97, -27, -18, -12, -19, -29, 103, -102, -106, -121, -112, -107, -117, -111, -112, 66, -124, -117, -106, 66, -117, -107, 66, -107, -121, -106, 66, -117, -112, 66, -107, -117, -119, -112, -125, -114, 66, -124, -101, -106, -121, -91, -50, -47, -52, -64, -45, -103, Byte.MAX_VALUE, -78, -45, -64, -47, -45, -117, Byte.MAX_VALUE, -92, -51, -61, -117, Byte.MAX_VALUE, -79, -60, -64, -61, -82, -47, -61, -60, -47, -117, Byte.MAX_VALUE, -85, -64, -40, -60, -47, -117, Byte.MAX_VALUE, -78, -45, -40, -53, -60, -117, Byte.MAX_VALUE, -83, -64, -52, -60, -117, Byte.MAX_VALUE, -84, -64, -47, -58, -56, -51, -85, -117, Byte.MAX_VALUE, -84, -64, -47, -58, -56, -51, -79, -117, Byte.MAX_VALUE, -84, -64, -47, -58, -56, -51, -75, -117, Byte.MAX_VALUE, -92, -59, -59, -60, -62, -45, -117, Byte.MAX_VALUE, -77, -60, -41, -45, -99, -78, -76, -70, -65, -72, 113, -64, -65, -67, -54, 113, -60, -58, -63, -63, -64, -61, -59, -74, -75, 113, -70, -65, 113, -92, -70, -66, -63, -67, -74, -109, -67, -64, -76, -68, -60, Byte.MAX_VALUE, 115, -121, -108, -118, -121, -102, -107, -104, -97, 70, -117, -110, -117, -109, -117, -108, -102, 70, 121, -117, -117, -111, 111, 106, 70, -107, -104, 70, 121, -117, -117, -111, 118, -107, -103, -113, -102, -113, -107, -108, 70, -108, -107, -102, 70, -116, -107, -101, -108, -118, -54, -14, -23, -15, -26, -19, -23, -30, -99, -48, -30, -28, -22, -30, -21, -15, -99, -30, -23, -30, -22, -30, -21, -15, -16, -99, -21, -20, -15, -99, -16, -14, -19, -19, -20, -17, -15, -30, -31, -102, -69, 108, -62, -83, -72, -75, -80, 108, -64, -66, -83, -81, -73, -65, 108, -61, -79, -66, -79, 108, -78, -69, -63, -70, -80, 119, -104, 73, -97, -118, -107, -110, -115, 73, -97, -118, -101, -110, -105, -99, 73, -107, -114, -105, -112, -99, -111, 73, -106, -118, -100, -108, 73, -113, -104, -98, -105, -115, 112, 124, 97, 115, 95, 112, 114, 95, -44, -32, -55, -59, -50, -41, -80, -47, -56, -44, -104, -92, -103, -118, -99, -103, 116, -122, -104, -104, -72, -60, -71, -86, -67, -71, -108, -70, -71, -85, -99, -42, -30, -39, -46, -59, -42, -40, -59, 104, -127, 120, -117, -125, 120, 118, -121, 120, 119, 51, 124, 119, 77, 51, Byte.MAX_VALUE, -104, -113, -94, -102, -113, -115, -98, -113, -114, 74, -106, -117, -115, -109, -104, -111, 74, -96, -117, -106, -97, -113, 100, 74, -86, -77, -95, -92, -103, -101, -122, -38, -29, -47, -44, -55, -53, -72, -77, -51, -41, -45, -77, -59, -44, -72, -63, -81, -78, -89, -87, -106, -111, -85, -75, -79, -111, -93, -75, -78, 122, -125, 113, 116, 105, 107, 88, 83, 109, 119, 115, 83, 101, 122, 103, -53, -44, -62, -59, -70, -68, -87, -92, -66, -56, -60, -92, -56, -59, 116, 125, 107, 110, 99, 101, 102, 77, 103, 113, 109, 77, 102, 99, 116, 97, -47, -38, -56, -50, -86, -47, -63, -46, -86, -63, -54, -48, -51, -66, -66, -67, -58, 
        -69, -81, -84, -74, -71, -88, -100, -91, -100, -106, 126, 118, Byte.MAX_VALUE, 118, 112, 89, -13, -25, -6, -8, -11, -7, -15, -25, -63, -76, -81, -80, -70, 122, -62, -80, -83, -72, -12, -30, -33, -22};
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e6, code lost:            if (A03(967, 16, 18).equals(r12.A0Y) != false) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0276, code lost:            if (r12.A0X == null) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x027e, code lost:            if (r10.A0j.A07() != 0) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0280, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0281, code lost:            com.facebook.ads.redexgen.X.HI.A04(r0);        r12.A0X.A01(r11, r10.A01, r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0295, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028b, code lost:            r0 = r10.A07;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028d, code lost:            if (r0 >= r13) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x028f, code lost:            A00(r11, r3, r13 - r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0263, code lost:            if (A03(967, 16, 18).equals(r12.A0Y) != false) goto L69;     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
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
    private void A08(com.facebook.ads.redexgen.X.InterfaceC0279Bb r11, com.facebook.ads.redexgen.X.C0294Bw r12, int r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0808Wo.A08(com.facebook.ads.redexgen.X.Bb, com.facebook.ads.redexgen.X.Bw, int):void");
    }

    static {
        A06();
        A0r = new C0810Wq();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = C0436Hx.A0i(A03(539, 90, 83));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public C0808Wo() {
        this(0);
    }

    public C0808Wo(int i) {
        this(new C0811Wr(), i);
    }

    public C0808Wo(InterfaceC0292Bs interfaceC0292Bs, int i) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = interfaceC0292Bs;
        interfaceC0292Bs.A8f(new C0809Wp(this, null));
        this.A0o = (i & 1) == 0;
        this.A0e = new C0295Bz();
        this.A0c = new SparseArray<>();
        this.A0k = new C0420Hh(4);
        this.A0n = new C0420Hh(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C0420Hh(4);
        this.A0i = new C0420Hh(C0416Hd.A03);
        this.A0h = new C0420Hh(4);
        this.A0j = new C0420Hh();
        this.A0m = new C0420Hh();
        this.A0f = new C0420Hh(8);
        this.A0g = new C0420Hh();
    }

    private int A00(InterfaceC0279Bb interfaceC0279Bb, InterfaceC0288Bm interfaceC0288Bm, int i) throws IOException, InterruptedException {
        int bytesRead;
        int strippedBytesLeft = this.A0j.A04();
        if (strippedBytesLeft > 0) {
            bytesRead = Math.min(i, strippedBytesLeft);
            interfaceC0288Bm.AEr(this.A0j, bytesRead);
        } else {
            bytesRead = interfaceC0288Bm.AEq(interfaceC0279Bb, i, false);
        }
        this.A07 += bytesRead;
        this.A08 += bytesRead;
        return bytesRead;
    }

    private long A01(long j) throws C02309d {
        long j2 = this.A0M;
        if (j2 != -9223372036854775807L) {
            return C0436Hx.A0F(j, j2, 1000L);
        }
        throw new C02309d(A03(189, 54, 68));
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0064 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.InterfaceC0285Bj A02() {
        /*
            r11 = this;
            long r3 = r11.A0K
            r1 = -1
            r8 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r3 = r11.A0H
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.HX r0 = r11.A0Q
            if (r0 == 0) goto L2e
            int r0 = r0.A02()
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.HX r0 = r11.A0P
            if (r0 == 0) goto L2e
            int r1 = r0.A02()
            com.facebook.ads.redexgen.X.HX r0 = r11.A0Q
            int r0 = r0.A02()
            if (r1 == r0) goto L3a
        L2e:
            r11.A0Q = r8
            r11.A0P = r8
            long r1 = r11.A0H
            com.facebook.ads.redexgen.X.X0 r0 = new com.facebook.ads.redexgen.X.X0
            r0.<init>(r1)
            return r0
        L3a:
            com.facebook.ads.redexgen.X.HX r0 = r11.A0Q
            int r7 = r0.A02()
            int[] r9 = new int[r7]
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            long[] r4 = new long[r7]
            r10 = 0
        L49:
            if (r10 >= r7) goto L61
            com.facebook.ads.redexgen.X.HX r0 = r11.A0Q
            long r0 = r0.A03(r10)
            r4[r10] = r0
            long r0 = r11.A0K
            com.facebook.ads.redexgen.X.HX r2 = r11.A0P
            long r2 = r2.A03(r10)
            long r0 = r0 + r2
            r6[r10] = r0
            int r10 = r10 + 1
            goto L49
        L61:
            r10 = 0
        L62:
            int r0 = r7 + (-1)
            if (r10 >= r0) goto L7c
            int r0 = r10 + 1
            r0 = r6[r0]
            r2 = r6[r10]
            long r0 = r0 - r2
            int r2 = (int) r0
            r9[r10] = r2
            int r0 = r10 + 1
            r2 = r4[r0]
            r0 = r4[r10]
            long r2 = r2 - r0
            r5[r10] = r2
            int r10 = r10 + 1
            goto L62
        L7c:
            int r10 = r7 + (-1)
            long r2 = r11.A0K
            long r0 = r11.A0L
            long r2 = r2 + r0
            int r0 = r7 + (-1)
            r0 = r6[r0]
            long r2 = r2 - r0
            int r0 = (int) r2
            r9[r10] = r0
            int r10 = r7 + (-1)
            long r0 = r11.A0H
            int r2 = r7 + (-1)
            r2 = r4[r2]
            long r0 = r0 - r2
            r5[r10] = r0
            r11.A0Q = r8
            r11.A0P = r8
            com.facebook.ads.redexgen.X.X5 r0 = new com.facebook.ads.redexgen.X.X5
            r0.<init>(r9, r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0808Wo.A02():com.facebook.ads.redexgen.X.Bj");
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(InterfaceC0279Bb interfaceC0279Bb, int i) throws IOException, InterruptedException {
        if (this.A0k.A07() >= i) {
            return;
        }
        if (this.A0k.A05() < i) {
            C0420Hh c0420Hh = this.A0k;
            c0420Hh.A0b(Arrays.copyOf(c0420Hh.A00, Math.max(this.A0k.A00.length * 2, i)), this.A0k.A07());
        }
        byte[] bArr = this.A0k.A00;
        int A07 = this.A0k.A07();
        if (A0q[6].length() != 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0q;
        strArr[0] = "ZmQc4cegfKT6TM2j1HdEhTMrEsYvVAK8";
        strArr[2] = "PLs1alOmXmQPSsdSdZUe4T02xUG6CaQT";
        interfaceC0279Bb.readFully(bArr, A07, i - this.A0k.A07());
        this.A0k.A0X(i);
    }

    private void A09(InterfaceC0279Bb interfaceC0279Bb, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        int sizeWithPrefix = this.A0m.A05();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i;
            this.A0m.A00 = Arrays.copyOf(bArr, sizeWithPrefix2);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        byte[] bArr2 = this.A0m.A00;
        int sizeWithPrefix3 = bArr.length;
        interfaceC0279Bb.readFully(bArr2, sizeWithPrefix3, i);
        this.A0m.A0W(length);
    }

    private void A0A(InterfaceC0279Bb interfaceC0279Bb, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.A0j.A04());
        int pendingStrippedBytes = i2 - min;
        interfaceC0279Bb.readFully(bArr, i + min, pendingStrippedBytes);
        if (min > 0) {
            this.A0j.A0c(bArr, i, min);
        }
        int pendingStrippedBytes2 = this.A07;
        this.A07 = pendingStrippedBytes2 + i2;
    }

    private void A0B(C0294Bw c0294Bw, long j) {
        if (c0294Bw.A0X != null) {
            Bx bx = c0294Bw.A0X;
            if (A0q[6].length() != 27) {
                throw new RuntimeException();
            }
            A0q[6] = "nKrIVrdQs7NkqXN01cL0onp1lFd";
            bx.A03(c0294Bw, j);
        } else {
            if (A03(843, 11, 89).equals(c0294Bw.A0Y)) {
                A0C(c0294Bw, A03(33, 19, 7), 19, 1000L, A0x);
            } else if (A03(833, 10, 57).equals(c0294Bw.A0Y)) {
                A0C(c0294Bw, A03(14, 19, 109), 21, 10000L, A0v);
            }
            c0294Bw.A0W.AEs(j, this.A01, this.A08, 0, c0294Bw.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(C0294Bw c0294Bw, String str, int i, long j, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i, j, bArr);
        InterfaceC0288Bm interfaceC0288Bm = c0294Bw.A0W;
        C0420Hh c0420Hh = this.A0m;
        interfaceC0288Bm.AEr(c0420Hh, c0420Hh.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] timeCodeData;
        if (j == -9223372036854775807L) {
            timeCodeData = bArr2;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - ((i2 * 3600) * 1000000);
            int i3 = (int) (j3 / 60000000);
            int minutes = i3 * 60;
            long j4 = j3 - (minutes * 1000000);
            int lastValue = (int) (j4 / 1000000);
            int seconds = (int) ((j4 - (lastValue * 1000000)) / j2);
            timeCodeData = C0436Hx.A0i(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(lastValue), Integer.valueOf(seconds)));
        }
        System.arraycopy(timeCodeData, 0, bArr, i, bArr2.length);
    }

    private boolean A0E(C0283Bh c0283Bh, long j) {
        if (this.A0Y) {
            this.A0J = j;
            c0283Bh.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        boolean z = this.A0a;
        String[] strArr = A0q;
        if (strArr[0].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0q;
        strArr2[1] = "bgcuSmmv9nMD5qNgR1ZnJGCWOsXR4zDF";
        strArr2[5] = "rXrXJdml0w7r8hjghYXvJH5LLiJomjK3";
        if (z) {
            long j2 = this.A0J;
            if (j2 != -1) {
                c0283Bh.A00 = j2;
                this.A0J = -1L;
                return true;
            }
        }
        return false;
    }

    public static boolean A0F(String str) {
        if (!A03(1006, 5, 58).equals(str) && !A03(1011, 5, 20).equals(str) && !A03(902, 7, 72).equals(str)) {
            String A03 = A03(953, 14, 105);
            String[] strArr = A0q;
            if (strArr[1].charAt(15) == strArr[5].charAt(15)) {
                A0q[7] = "rYhgwmDh4TKBcj4Uwcvshsmah3Wf4ae0";
                if (!A03.equals(str) && !A03(923, 15, 86).equals(str) && !A03(909, 14, 120).equals(str) && !A03(938, 15, 24).equals(str) && !A03(967, 16, 18).equals(str) && !A03(983, 15, 111).equals(str)) {
                    String[] strArr2 = A0q;
                    if (strArr2[1].charAt(15) != strArr2[5].charAt(15)) {
                        throw new RuntimeException();
                    }
                    A0q[6] = "rlxG2GXYid9bCHwXApke8Gz33sW";
                    if (!A03(998, 8, 91).equals(str) && !A03(154, 6, 102).equals(str) && !A03(181, 8, 87).equals(str) && !A03(74, 5, 126).equals(str) && !A03(128, 9, 102).equals(str) && !A03(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 9, 8).equals(str) && !A03(79, 5, 124).equals(str) && !A03(116, 6, 59).equals(str) && !A03(173, 8, 62).equals(str) && !A03(84, 5, 98).equals(str) && !A03(89, 13, 62).equals(str) && !A03(102, 14, 86).equals(str) && !A03(122, 6, 17).equals(str) && !A03(146, 8, 39).equals(str) && !A03(160, 13, 79).equals(str)) {
                        boolean equals = A03(843, 11, 89).equals(str);
                        String[] strArr3 = A0q;
                        if (strArr3[0].charAt(31) != strArr3[2].charAt(31)) {
                            String[] strArr4 = A0q;
                            strArr4[1] = "DfP1dlVZEdoO22ggDOih4DhJX4h9DttB";
                            strArr4[5] = "iPMsbxRLvFu5COzgJWPWeI2fmUuAHT3S";
                            if (!equals && !A03(833, 10, 57).equals(str) && !A03(854, 8, 119).equals(str) && !A03(823, 10, 117).equals(str) && !A03(815, 8, 17).equals(str)) {
                                return false;
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static int[] A0H(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public final void A0I(int i) throws C02309d {
        switch (i) {
            case 160:
                if (this.A04 != 2) {
                    return;
                }
                if (!this.A0W) {
                    this.A01 = 1 | this.A01;
                }
                A0B(this.A0c.get(this.A05), this.A0D);
                this.A04 = 0;
                return;
            case 174:
                if (A0F(this.A0O.A0Y)) {
                    C0294Bw c0294Bw = this.A0O;
                    c0294Bw.A09(this.A0N, c0294Bw.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            case 19899:
                int i2 = this.A0B;
                if (i2 != -1) {
                    long j = this.A0I;
                    if (j != -1) {
                        if (i2 != 475249515) {
                            return;
                        }
                        this.A0F = j;
                        return;
                    }
                }
                throw new C02309d(A03(667, 50, 26));
            case 25152:
                if (!this.A0O.A0c) {
                    return;
                }
                if (this.A0O.A0V != null) {
                    this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(C9E.A04, A03(UserVerificationMethods.USER_VERIFY_ALL, 10, 63), this.A0O.A0V.A03));
                    return;
                }
                throw new C02309d(A03(449, 55, 115));
            case 28032:
                if (!this.A0O.A0c || this.A0O.A0f == null) {
                    return;
                } else {
                    throw new C02309d(A03(243, 53, 10));
                }
            case 357149030:
                if (this.A0M == -9223372036854775807L) {
                    this.A0M = 1000000L;
                }
                long j2 = this.A0G;
                if (j2 == -9223372036854775807L) {
                    return;
                }
                this.A0H = A01(j2);
                return;
            case 374648427:
                if (this.A0c.size() != 0) {
                    this.A0N.A5T();
                    return;
                }
                throw new C02309d(A03(756, 26, 64));
            case 475249515:
                if (this.A0a) {
                    return;
                }
                this.A0N.AEx(A02());
                this.A0a = true;
                return;
            default:
                return;
        }
    }

    public final void A0J(int i, double d) {
        switch (i) {
            case 181:
                this.A0O.A0O = (int) d;
                return;
            case 17545:
                this.A0G = (long) d;
                return;
            case 21969:
                this.A0O.A06 = (float) d;
                return;
            case 21970:
                this.A0O.A07 = (float) d;
                return;
            case 21971:
                this.A0O.A04 = (float) d;
                return;
            case 21972:
                this.A0O.A05 = (float) d;
                return;
            case 21973:
                this.A0O.A02 = (float) d;
                return;
            case 21974:
                this.A0O.A03 = (float) d;
                return;
            case 21975:
                this.A0O.A08 = (float) d;
                return;
            case 21976:
                this.A0O.A09 = (float) d;
                return;
            case 21977:
                this.A0O.A00 = (float) d;
                return;
            case 21978:
                this.A0O.A01 = (float) d;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f6, code lost:            throw new com.facebook.ads.redexgen.X.C02309d(A03(396, 37, 107));     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c8, code lost:            if (r2 > 2147483647L) goto L126;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0306, code lost:            throw new com.facebook.ads.redexgen.X.C02309d(A03(782, 33, 29));     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0212, code lost:            throw new java.lang.RuntimeException();     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02cb, code lost:            r19.A0b[r3 - 1] = ((r21 - r19.A06) - r11) - r15;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0327, code lost:            throw new com.facebook.ads.redexgen.X.C02309d(A03(877, 25, 30) + r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a0, code lost:            if (r11 == 2) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017c, code lost:            if (r11 == 2) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017e, code lost:            r9 = (r21 - r19.A06) - 4;        r11 = r19.A02;        r10 = com.facebook.ads.redexgen.X.C0808Wo.A0q;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0196, code lost:            if (r10[1].charAt(15) == r10[5].charAt(15)) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a3, code lost:            r10 = com.facebook.ads.redexgen.X.C0808Wo.A0q;        r10[1] = "RQftDwpqwbIXAF1g5dDgy2XjM3R9Fufd";        r10[5] = "50lzYqnE8by0N6RgVVPD3M33x9kk99sn";        java.util.Arrays.fill(r3, 0, r11, r9 / r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b5, code lost:            if (r11 != 1) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b7, code lost:            r13 = 0;        r11 = 4;        r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ba, code lost:            r3 = r19.A02;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01be, code lost:            if (r12 >= (r3 - 1)) goto L123;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c0, code lost:            r19.A0b[r12] = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c4, code lost:            r11 = r11 + 1;        A07(r22, r11);        r3 = r19.A0k.A00[r11 - 1] & 255;        r1 = r19.A0b;        r0 = r1[r12] + r3;        r1[r12] = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d8, code lost:            if (r3 == 255) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01da, code lost:            r13 = r13 + r0;        r12 = r12 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01de, code lost:            r19.A0b[r3 - 1] = ((r21 - r19.A06) - r11) - r13;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ea, code lost:            if (r11 != 3) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ec, code lost:            r15 = 0;        r11 = 4;        r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ef, code lost:            r3 = r19.A02;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f3, code lost:            if (r12 >= (r3 - 1)) goto L131;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:            r19.A0b[r12] = r2;        r2 = com.facebook.ads.redexgen.X.C0808Wo.A0q;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020b, code lost:            if (r2[1].charAt(15) == r2[5].charAt(15)) goto L75;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0213, code lost:            com.facebook.ads.redexgen.X.C0808Wo.A0q[6] = "AJCSp0dPwFu9XZoKvCoy3nlmL9O";        r11 = r11 + 1;        A07(r22, r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0227, code lost:            if (r19.A0k.A00[r11 - 1] == 0) goto L129;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0229, code lost:            r2 = 0;        r13 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022c, code lost:            if (r13 >= 8) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022e, code lost:            r10 = r10 << (7 - r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023a, code lost:            if ((r19.A0k.A00[r11 - 1] & r10) == 0) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x025f, code lost:            r13 = r13 + 1;        r10 = com.facebook.ads.redexgen.X.C0808Wo.A0q;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0273, code lost:            if (r10[0].charAt(31) == r10[2].charAt(31)) goto L134;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x027e, code lost:            r10 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0275, code lost:            com.facebook.ads.redexgen.X.C0808Wo.A0q[7] = "JvemuAcSz5vc2l4QyutSma8u3cOiXxC4";        r10 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x023c, code lost:            r2 = r11 - 1;        r11 = r11 + r13;        A07(r22, r11);        r1 = r2 + 1;        r2 = (r19.A0k.A00[r2] & 255) & (r10 ^ (-1));     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024f, code lost:            if (r1 >= r11) goto L141;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0251, code lost:            r2 = (r2 << 8) | (r19.A0k.A00[r1] & 255);        r1 = r1 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0280, code lost:            if (r12 <= 0) goto L90;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0282, code lost:            r2 = r2 - ((1 << ((r13 * 7) + 6)) - 1);     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0291, code lost:            if (r2 < (-2147483648L)) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a4, code lost:            if (com.facebook.ads.redexgen.X.C0808Wo.A0q[7].charAt(2) == 'J') goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02a6, code lost:            r10 = com.facebook.ads.redexgen.X.C0808Wo.A0q;        r10[3] = "iXrhrupjbccuPW1gfooQkR";        r10[4] = "StwCIbMJGGxOC39";     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b2, code lost:            if (r2 > 2147483647L) goto L130;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b4, code lost:            r10 = (int) r2;        r1 = r19.A0b;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02b7, code lost:            if (r12 != 0) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c2, code lost:            r10 = r10 + r1[r12 - 1];     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b9, code lost:            r1[r12] = r10;        r15 = r15 + r10;        r12 = r12 + 1;        r2 = 0;        r10 = 1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(int r20, int r21, com.facebook.ads.redexgen.X.InterfaceC0279Bb r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0808Wo.A0K(int, int, com.facebook.ads.redexgen.X.Bb):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:            if (r11 == 1) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:            r6 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:            r3.A0Z = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:            if (r11 == 1) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L(int r10, long r11) throws com.facebook.ads.redexgen.X.C02309d {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0808Wo.A0L(int, long):void");
    }

    public final void A0M(int i, long j, long j2) throws C02309d {
        switch (i) {
            case 160:
                this.A0W = false;
                return;
            case 174:
                this.A0O = new C0294Bw(null);
                return;
            case 187:
                this.A0Z = false;
                return;
            case 19899:
                this.A0B = -1;
                this.A0I = -1L;
                return;
            case 20533:
                this.A0O.A0c = true;
                return;
            case 21968:
                this.A0O.A0b = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                long j3 = this.A0K;
                if (j3 == -1 || j3 == j) {
                    this.A0K = j;
                    this.A0L = j2;
                    return;
                }
                throw new C02309d(A03(717, 39, 113));
            case 475249515:
                this.A0Q = new HX();
                this.A0P = new HX();
                return;
            case 524531317:
                if (this.A0a) {
                    return;
                }
                if (this.A0o && this.A0F != -1) {
                    this.A0Y = true;
                    return;
                } else {
                    this.A0N.AEx(new X0(this.A0H));
                    this.A0a = true;
                    return;
                }
        }
    }

    public final void A0N(int i, String str) throws C02309d {
        switch (i) {
            case 134:
                this.A0O.A0Y = str;
                return;
            case 17026:
                if (A03(1034, 4, 113).equals(str) || A03(1016, 8, 122).equals(str)) {
                    return;
                } else {
                    throw new C02309d(A03(369, 8, 117) + str + A03(0, 14, 21));
                }
            case 2274716:
                C0294Bw.A02(this.A0O, str);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void A8e(InterfaceC0280Bc interfaceC0280Bc) {
        this.A0N = interfaceC0280Bc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final int AE9(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        this.A0V = false;
        boolean z = true;
        while (z && !this.A0V) {
            z = this.A0d.AEB(interfaceC0279Bb);
            if (z && A0E(c0283Bh, interfaceC0279Bb.A7a())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        int i = 0;
        while (true) {
            SparseArray<C0294Bw> sparseArray = this.A0c;
            String[] strArr = A0q;
            String str = strArr[0];
            String str2 = strArr[2];
            int charAt = str.charAt(31);
            int i2 = str2.charAt(31);
            if (charAt == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[3] = "Tajypdz7aNAm7FibYO8x24";
            strArr2[4] = "TBunjD0UUDKaUo7";
            int i3 = sparseArray.size();
            if (i < i3) {
                this.A0c.valueAt(i).A07();
                i++;
            } else {
                return -1;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x001e */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEw(long r3, long r5) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.A0E = r0
            r0 = 0
            r2.A04 = r0
            com.facebook.ads.redexgen.X.Bs r0 = r2.A0d
            r0.reset()
            com.facebook.ads.redexgen.X.Bz r0 = r2.A0e
            r0.A06()
            r2.A05()
            r1 = 0
        L18:
            android.util.SparseArray<com.facebook.ads.redexgen.X.Bw> r0 = r2.A0c
            int r0 = r0.size()
            if (r1 >= r0) goto L2e
            android.util.SparseArray<com.facebook.ads.redexgen.X.Bw> r0 = r2.A0c
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.Bw r0 = (com.facebook.ads.redexgen.X.C0294Bw) r0
            r0.A08()
            int r1 = r1 + 1
            goto L18
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0808Wo.AEw(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final boolean AFg(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        return new By().A01(interfaceC0279Bb);
    }
}
