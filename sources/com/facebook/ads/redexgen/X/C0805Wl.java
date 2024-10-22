package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.google.protobuf.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0805Wl implements InterfaceC0278Ba {
    public static byte[] A0E;
    public static String[] A0F = {"FKupPKXcsIkycQ3l5ptAH5wluEqc6YoI", "RW", "ogqWAOna8QODFLIqijT7vOYnhApvYyU7", "UAOUtvFDqNmRNLgZ1GU6DrNnbPesxUgh", "z4WGtVpeHmr0jWMfeyoB2cmDzFByDj9w", "gdGWUcFUabEj8aTRXEAi5amp", "tmhvTid", "WDNv6R6VbALBmvSk6DCmHF7NFi0i9puO"};
    public static final InterfaceC0281Bd A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0280Bc A04;
    public InterfaceC0288Bm A05;
    public InterfaceC0806Wm A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0282Be A0A;
    public final Bf A0B;
    public final Bg A0C;
    public final C0420Hh A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-94, -57, -65, -56, -110, -92, -96, -79, -94, -89, -92, -93, 95, -77, -82, -82, 95, -84, -96, -83, -72, 95, -95, -72, -77, -92, -78, 109, -115, 121, -119, Byte.MIN_VALUE, -100, -83, -78, -85};
    }

    static {
        A05();
        A0G = new C0807Wn();
        A0J = C0436Hx.A08(A04(32, 4, 37));
        A0H = C0436Hx.A08(A04(0, 4, 58));
        A0I = C0436Hx.A08(A04(28, 4, 24));
    }

    public C0805Wl() {
        this(0);
    }

    public C0805Wl(int i) {
        this(i, -9223372036854775807L);
    }

    public C0805Wl(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C0420Hh(10);
        this.A0C = new Bg();
        this.A0A = new C0282Be();
        this.A02 = -9223372036854775807L;
        this.A0B = new Bf();
    }

    private int A00(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC0279Bb.AEm();
            if (!interfaceC0279Bb.ADm(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(A08, sampleHeaderData)) {
                int sampleHeaderData2 = Bg.A00(A08);
                if (sampleHeaderData2 != -1) {
                    Bg.A04(A08, this.A0C);
                    if (this.A02 == -9223372036854775807L) {
                        InterfaceC0806Wm interfaceC0806Wm = this.A06;
                        long A7a = interfaceC0279Bb.A7a();
                        if (A0F[0].charAt(7) == '2') {
                            throw new RuntimeException();
                        }
                        A0F[5] = "uwsYCHPiCgNXlhDD9rc7dT19";
                        this.A02 = interfaceC0806Wm.A7z(A7a);
                        if (this.A09 != -9223372036854775807L) {
                            this.A02 += this.A09 - this.A06.A7z(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            interfaceC0279Bb.AFe(1);
            this.A01 = 0;
            return 0;
        }
        int AEq = this.A05.AEq(interfaceC0279Bb, this.A00, true);
        if (AEq == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - AEq;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A05.AEs(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:            if (r3 == r0) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.facebook.ads.redexgen.X.C0420Hh r4, int r5) {
        /*
            int r1 = r4.A07()
            int r0 = r5 + 4
            if (r1 < r0) goto L3e
            r4.A0Y(r5)
            int r3 = r4.A08()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0805Wl.A0F
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L38
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0805Wl.A0F
            java.lang.String r1 = "RZ9mFeyNnV0sPgPCsPCuasZg37Uzdp17"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fK9CAyTZYj28knSP6u8xHPIK1qnXYcxa"
            r0 = 3
            r2[r0] = r1
            int r0 = com.facebook.ads.redexgen.X.C0805Wl.A0J
            if (r3 == r0) goto L37
            int r0 = com.facebook.ads.redexgen.X.C0805Wl.A0H
            if (r3 != r0) goto L3e
        L37:
            return r3
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            int r1 = r4.A07()
            r0 = 40
            if (r1 < r0) goto L54
            r0 = 36
            r4.A0Y(r0)
            int r1 = r4.A08()
            int r0 = com.facebook.ads.redexgen.X.C0805Wl.A0I
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0805Wl.A01(com.facebook.ads.redexgen.X.Hh, int):int");
    }

    private DJ A02(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        interfaceC0279Bb.ADl(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        Bg.A04(this.A0D.A08(), this.A0C);
        return new DJ(interfaceC0279Bb.A7B(), interfaceC0279Bb.A7a(), this.A0C);
    }

    private InterfaceC0806Wm A03(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        C0420Hh c0420Hh = new C0420Hh(this.A0C.A02);
        interfaceC0279Bb.ADl(c0420Hh.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            int i2 = this.A0C.A01;
            if (A0F[5].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "1a7oiXE";
            strArr[1] = "rh";
            if (i2 != 1) {
                i = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i = 13;
        }
        int xingBase = A01(c0420Hh, i);
        if (xingBase == A0J || xingBase == A0H) {
            D2 A01 = D2.A01(interfaceC0279Bb.A7B(), interfaceC0279Bb.A7a(), this.A0C, c0420Hh);
            if (A01 != null && !this.A0A.A03()) {
                interfaceC0279Bb.AEm();
                interfaceC0279Bb.A3S(i + 141);
                C0420Hh frame = this.A0D;
                interfaceC0279Bb.ADl(frame.A00, 0, 3);
                C0420Hh frame2 = this.A0D;
                frame2.A0Y(0);
                C0282Be c0282Be = this.A0A;
                C0420Hh frame3 = this.A0D;
                c0282Be.A04(frame3.A0G());
            }
            interfaceC0279Bb.AFe(this.A0C.A02);
            if (A01 != null && !A01.A95() && xingBase == A0H) {
                return A02(interfaceC0279Bb);
            }
            return A01;
        }
        if (xingBase == A0I) {
            D3 A00 = D3.A00(interfaceC0279Bb.A7B(), interfaceC0279Bb.A7a(), this.A0C, c0420Hh);
            interfaceC0279Bb.AFe(this.A0C.A02);
            return A00;
        }
        interfaceC0279Bb.AEm();
        return null;
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x009d, code lost:            if (r15 == false) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:            r14.AFe(r2 + r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a3, code lost:            r13.A01 = r7;        r2 = com.facebook.ads.redexgen.X.C0805Wl.A0F;        r1 = r2[2];        r2 = r2[7];        r1 = r1.charAt(28);        r0 = r2.charAt(28);     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:            if (r1 == r0) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:            com.facebook.ads.redexgen.X.C0805Wl.A0F[0] = "JRrUIGwZBJczcB1fqhgNVGoVSbza2n0c";     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c1, code lost:            r14.AEm();     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(com.facebook.ads.redexgen.X.InterfaceC0279Bb r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0805Wl.A07(com.facebook.ads.redexgen.X.Bb, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void A8e(InterfaceC0280Bc interfaceC0280Bc) {
        this.A04 = interfaceC0280Bc;
        this.A05 = interfaceC0280Bc.AFx(0, 1);
        this.A04.A5T();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final int AE9(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0279Bb, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            InterfaceC0806Wm A03 = A03(interfaceC0279Bb);
            this.A06 = A03;
            if (A03 == null || (!A03.A95() && (this.A08 & 1) != 0)) {
                this.A06 = A02(interfaceC0279Bb);
            }
            this.A04.AEx(this.A06);
            this.A05.A5j(Format.A05(null, this.A0C.A06, null, -1, v.DEFAULT_BUFFER_SIZE, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0279Bb);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void AEw(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final boolean AFg(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        return A07(interfaceC0279Bb, true);
    }
}
