package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0794Wa implements CT {
    public static byte[] A0C;
    public static String[] A0D = {"qlUqm53dx2wRFYI19yFYkvkmPQFopPfK", "kfzPj4jiKhQrTstJ9wOtTomcMDMJFI2R", "tio4jxSpdKgrcMNksdh3F2ai0PxCizyi", "S5qskWqDqPkhPpuUuuvRcKySD9vc4n0H", "X67UodKHNvmZa3DnASt4fZlpL2cJMcNV", "01LnOYH7rGQp5f5o2UGBiyg7bnJQxBa8", "qDTiiMVukWANjWrPbJo4riKeblMOo1tu", "5dAWhKcmsHilqUXjq3PFXu2GkNxyPnDG"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final CS A0A = new CS();
    public final CW A0B;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{22, 55, 120, 55, 63, 63, 120, 40, 57, 63, 61, 120, 59, 57, 54, 120, 58, 61, 120, 62, 55, 45, 54, 60, 118};
    }

    static {
        A0A();
    }

    public C0794Wa(long j, long j2, CW cw, int i, long j3) {
        HI.A03(j >= 0 && j2 > j);
        this.A0B = cw;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        long j4 = this.A08;
        long j5 = this.A09;
        long j6 = j + ((((j4 - j5) * j2) / this.A07) - j3);
        if (j6 < j5) {
            j6 = this.A09;
        }
        if (j6 >= j4) {
            return j4 - 1;
        }
        return j6;
    }

    private final long A01(long j, InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A7a = interfaceC0279Bb.A7a();
        if (A0D(interfaceC0279Bb, this.A01)) {
            this.A0A.A03(interfaceC0279Bb, false);
            interfaceC0279Bb.AEm();
            long j2 = j - this.A0A.A05;
            int i = this.A0A.A01 + this.A0A.A00;
            if (j2 < 0 || j2 > 72000) {
                if (j2 < 0) {
                    this.A01 = A7a;
                    this.A02 = this.A0A.A05;
                } else {
                    long initialPosition = interfaceC0279Bb.A7a();
                    this.A04 = initialPosition + i;
                    this.A05 = this.A0A.A05;
                    long initialPosition2 = this.A01;
                    if ((initialPosition2 - this.A04) + i < 100000) {
                        interfaceC0279Bb.AFe(i);
                        long initialPosition3 = this.A05;
                        return -(initialPosition3 + 2);
                    }
                }
                long initialPosition4 = this.A01;
                long j3 = this.A04;
                String[] strArr = A0D;
                if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
                    throw new RuntimeException();
                }
                A0D[3] = "zvKF8WQUI0SajHpo4Xv9v8DHT9e2MTPL";
                if (initialPosition4 - j3 < 100000) {
                    this.A01 = j3;
                    return j3;
                }
                long j4 = i;
                long j5 = j2 > 0 ? 1L : 2L;
                long A7a2 = interfaceC0279Bb.A7a();
                long j6 = this.A01;
                long granuleDistance = this.A04;
                long initialPosition5 = this.A02;
                long nextPosition = (A7a2 - (j4 * j5)) + (((j6 - granuleDistance) * j2) / (initialPosition5 - this.A05));
                return Math.min(Math.max(nextPosition, granuleDistance), this.A01 - 1);
            }
            interfaceC0279Bb.AFe(i);
            return -(this.A0A.A05 + 2);
        }
        long j7 = this.A04;
        if (j7 != A7a) {
            return j7;
        }
        throw new IOException(A09(0, 25, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:            return r5.A0A.A05;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long A02(com.facebook.ads.redexgen.X.InterfaceC0279Bb r6) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r5 = this;
            r5.A0C(r6)
            com.facebook.ads.redexgen.X.CS r0 = r5.A0A
            r0.A02()
        L8:
            com.facebook.ads.redexgen.X.CS r0 = r5.A0A
            int r3 = r0.A04
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0794Wa.A0D
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 12
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L52
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0794Wa.A0D
            java.lang.String r1 = "8L7HD1AI4we5ropKbStlQEIIPOmJrEUL"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "xLnKc6RM4Edpr9DSdPLSxPAMnW98GKHb"
            r0 = 2
            r2[r0] = r1
            r0 = 4
            r3 = r3 & r0
            if (r3 == r0) goto L4d
            long r3 = r6.A7a()
            long r1 = r5.A08
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
            com.facebook.ads.redexgen.X.CS r1 = r5.A0A
            r0 = 0
            r1.A03(r6, r0)
            com.facebook.ads.redexgen.X.CS r0 = r5.A0A
            int r1 = r0.A01
            com.facebook.ads.redexgen.X.CS r0 = r5.A0A
            int r0 = r0.A00
            int r1 = r1 + r0
            r6.AFe(r1)
            goto L8
        L4d:
            com.facebook.ads.redexgen.X.CS r0 = r5.A0A
            long r0 = r0.A05
            return r0
        L52:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0794Wa.A02(com.facebook.ads.redexgen.X.Bb):long");
    }

    private final long A03(InterfaceC0279Bb interfaceC0279Bb, long j, long j2) throws IOException, InterruptedException {
        this.A0A.A03(interfaceC0279Bb, false);
        while (this.A0A.A05 < j) {
            interfaceC0279Bb.AFe(this.A0A.A01 + this.A0A.A00);
            j2 = this.A0A.A05;
            this.A0A.A03(interfaceC0279Bb, false);
        }
        interfaceC0279Bb.AEm();
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.CT
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C0795Wb A4i() {
        CQ cq = null;
        if (this.A07 != 0) {
            return new C0795Wb(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        if (A0D(interfaceC0279Bb, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(InterfaceC0279Bb interfaceC0279Bb, long j) throws IOException, InterruptedException {
        long min = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int i = bArr.length;
        while (true) {
            if (interfaceC0279Bb.A7a() + i > min && (i = (int) (min - interfaceC0279Bb.A7a())) < 4) {
                return false;
            }
            interfaceC0279Bb.ADm(bArr, 0, i, false);
            for (int i2 = 0; i2 < i - 3; i2++) {
                int peekLength = bArr[i2];
                if (peekLength == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103) {
                    int peekLength2 = bArr[i2 + 3];
                    if (peekLength2 == 83) {
                        interfaceC0279Bb.AFe(i2);
                        return true;
                    }
                }
            }
            interfaceC0279Bb.AFe(i - 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:            if (r1 > r3) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:            if (r1 > r3) goto L10;     */
    @Override // com.facebook.ads.redexgen.X.CT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AEA(com.facebook.ads.redexgen.X.InterfaceC0279Bb r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            int r0 = r13.A00
            r5 = 3
            r8 = r14
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L51;
                case 2: goto L5c;
                case 3: goto L9c;
                default: goto L7;
            }
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Ld:
            long r3 = r8.A7a()
            r13.A03 = r3
            r0 = 1
            r13.A00 = r0
            long r1 = r13.A08
            java.lang.String[] r6 = com.facebook.ads.redexgen.X.C0794Wa.A0D
            r0 = 5
            r6 = r6[r0]
            r0 = 14
            char r6 = r6.charAt(r0)
            r0 = 69
            if (r6 == r0) goto L3c
            java.lang.String[] r7 = com.facebook.ads.redexgen.X.C0794Wa.A0D
            java.lang.String r6 = "y7O6pPdi4ZltSjD6KADDWtfh1EQ3ypYE"
            r0 = 1
            r7[r0] = r6
            java.lang.String r6 = "PCOWfrd56ab6qHMTUxzEVaAjhpd6ZxlM"
            r0 = 2
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L51
        L3b:
            return r1
        L3c:
            java.lang.String[] r7 = com.facebook.ads.redexgen.X.C0794Wa.A0D
            java.lang.String r6 = "CYddPgWATLyxqxIaeTkpx7ccDiEA63Cn"
            r0 = 4
            r7[r0] = r6
            java.lang.String r6 = "yHXSkk2QTXaOjUGCO1LifWaF4YjGjaVe"
            r0 = 0
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L51
            goto L3b
        L51:
            long r0 = r13.A02(r8)
            r13.A07 = r0
            r13.A00 = r5
            long r0 = r13.A03
            return r0
        L5c:
            long r0 = r13.A06
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C0794Wa.A0D
            r2 = 3
            r3 = r3[r2]
            r2 = 18
            char r3 = r3.charAt(r2)
            r2 = 118(0x76, float:1.65E-43)
            if (r3 == r2) goto L73
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L73:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.C0794Wa.A0D
            java.lang.String r3 = "5HAo5Th3dlJMt4bYi9vd99sok2AKRnDx"
            r2 = 3
            r4[r2] = r3
            r2 = 2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L89
            r0 = 0
        L84:
            r13.A00 = r5
            long r2 = r2 + r0
            long r0 = -r2
            return r0
        L89:
            long r0 = r13.A01(r0, r8)
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 < 0) goto L92
            return r0
        L92:
            long r9 = r13.A06
            long r0 = r0 + r2
            long r11 = -r0
            r7 = r13
            long r0 = r7.A03(r8, r9, r11)
            goto L84
        L9c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0794Wa.AEA(com.facebook.ads.redexgen.X.Bb):long");
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long AFm(long j) {
        int i = this.A00;
        HI.A03(i == 3 || i == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.A0B.A04(j);
        }
        this.A06 = j2;
        this.A00 = 2;
        A0B();
        return this.A06;
    }
}
