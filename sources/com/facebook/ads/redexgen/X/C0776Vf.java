package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0776Vf implements InterfaceC0288Bm {
    public static String[] A0F = {"J778k2tN1A71aNteuaiayf8W9Cwuw9", "SddvXAFvjaaaNZPS5hBFE72C4u8NAkzU", "DlS6L0Rs4yOHZbnixJzGuxf7gpgZ1", "jQlCDwUBXdtP", "ybgFHcAQFxf90xR6S9k4k72uXmSANsHZ", "TXMpPdQfareL1guTNfB0PsKfFvbJoTHv", "R2X9ywuliv1XsGmKXBlkokivcnsZ5nAf", "17XTwjN4yTPZEt52JUGlNgZMXTvW6CfX"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0354Er A04;
    public C0354Er A05;
    public C0354Er A06;
    public InterfaceC0355Es A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final C0352Ep A0B;
    public final C0353Eq A0C;
    public final GU A0D;
    public final C0420Hh A0E;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07(XE xe, C0352Ep c0352Ep) {
        int i;
        long j = c0352Ep.A01;
        this.A0E.A0W(1);
        A06(j, this.A0E.A00, 1);
        long j2 = j + 1;
        byte b2 = this.A0E.A00[0];
        boolean z = (b2 & 128) != 0;
        int i2 = b2 & Byte.MAX_VALUE;
        if (xe.A02.A04 == null) {
            xe.A02.A04 = new byte[16];
        }
        A06(j2, xe.A02.A04, i2);
        long j3 = j2 + i2;
        if (z) {
            this.A0E.A0W(2);
            A06(j3, this.A0E.A00, 2);
            j3 += 2;
            i = this.A0E.A0I();
        } else {
            i = 1;
            if (A0F[4].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "qfwCamou4xH4TsJy70kUYaPJ1paRPrQS";
            strArr[6] = "GMGbKrn5SK4TcHFeKaSIsaM2NwTeIDah";
        }
        int[] iArr = xe.A02.A06;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = xe.A02.A07;
        if (A0F[1].charAt(27) == 'T') {
            throw new RuntimeException();
        }
        A0F[3] = "l74rmj1cvzMl";
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            if (A0F[3].length() != 12) {
                A0F[5] = "mTjJh6O10GTQKtsNTzpZkGXCEgBidJyY";
            } else {
                String[] strArr2 = A0F;
                strArr2[2] = "gGnYbSzqov18WRGS84osGLTli7oQ4";
                strArr2[0] = "bcZjTvBd8pDqGicoFFRFmeT3NfcxuZ";
            }
        }
        if (z) {
            int i3 = i * 6;
            this.A0E.A0W(i3);
            A06(j3, this.A0E.A00, i3);
            j3 += i3;
            this.A0E.A0Y(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = this.A0E.A0I();
                iArr2[i4] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c0352Ep.A00 - ((int) (j3 - c0352Ep.A01));
        }
        C0287Bl c0287Bl = c0352Ep.A02;
        xe.A02.A03(i, iArr, iArr2, c0287Bl.A03, xe.A02.A04, c0287Bl.A01, c0287Bl.A02, c0287Bl.A00);
        int i5 = (int) (j3 - c0352Ep.A01);
        c0352Ep.A01 += i5;
        c0352Ep.A00 -= i5;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final void AEs(long j, int i, int i2, int i3, C0287Bl c0287Bl) {
        if (this.A08) {
            A5j(this.A03);
        }
        if (this.A09) {
            if ((i & 1) == 0 || !this.A0C.A0J(j)) {
                return;
            } else {
                this.A09 = false;
            }
        }
        this.A0C.A0G(j + this.A00, i, (this.A01 - i2) - i3, i2, c0287Bl);
    }

    public C0776Vf(GU gu) {
        this.A0D = gu;
        int A76 = gu.A76();
        this.A0A = A76;
        this.A0C = new C0353Eq();
        this.A0B = new C0352Ep();
        this.A0E = new C0420Hh(32);
        C0354Er c0354Er = new C0354Er(0L, A76);
        this.A04 = c0354Er;
        this.A05 = c0354Er;
        this.A06 = c0354Er;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3T(), new C0354Er(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[5] = "lOB1PW6jUN1Flr4ublIocLHYYSFUXZqB";
        if (j != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j);
        }
        return format;
    }

    private void A02(int i) {
        long j = this.A01 + i;
        this.A01 = j;
        if (j == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            this.A0D.AEP(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int remaining = (int) (this.A05.A03 - j);
            int min = Math.min(i, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j);
            byteBuffer.put(bArr, remaining2, min);
            i -= min;
            j += min;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.A05.A03 - j));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j);
            int remaining = i - i2;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i2 -= min;
            j += min;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A08(C0354Er c0354Er) {
        if (!c0354Er.A02) {
            return;
        }
        boolean z = this.A06.A02;
        int i = (z ? 1 : 0) + (((int) (this.A06.A04 - c0354Er.A04)) / this.A0A);
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[1] = "iejtrz5gn5ypfg4If5spWIciPKrb2ZMM";
        GT[] gtArr = new GT[i];
        for (int i2 = 0; i2 < gtArr.length; i2++) {
            gtArr[i2] = c0354Er.A01;
            c0354Er = c0354Er.A01();
        }
        this.A0D.AEQ(gtArr);
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        C0354Er c0354Er = new C0354Er(0L, this.A0A);
        this.A04 = c0354Er;
        this.A05 = c0354Er;
        this.A06 = c0354Er;
        this.A01 = 0L;
        this.A0D.AFy();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(C9X c9x, XE xe, boolean z, boolean z2, long j) {
        int result = this.A0C.A09(c9x, xe, z, z2, this.A02, this.A0B);
        switch (result) {
            case -5:
                this.A02 = c9x.A00;
                return -5;
            case -4:
                if (!xe.A04()) {
                    if (xe.A00 < j) {
                        String[] strArr = A0F;
                        String str = strArr[2];
                        String str2 = strArr[0];
                        int length = str.length();
                        int result2 = str2.length();
                        if (length == result2) {
                            throw new RuntimeException();
                        }
                        A0F[3] = "3oC8GcXqxYNt";
                        xe.A00(Integer.MIN_VALUE);
                    }
                    if (xe.A0A()) {
                        A07(xe, this.A0B);
                    }
                    int result3 = this.A0B.A00;
                    xe.A09(result3);
                    long j2 = this.A0B.A01;
                    ByteBuffer byteBuffer = xe.A01;
                    int result4 = this.A0B.A00;
                    A05(j2, byteBuffer, result4);
                    return -4;
                }
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(InterfaceC0355Es interfaceC0355Es) {
        this.A07 = interfaceC0355Es;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final void A5j(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0355Es interfaceC0355Es = this.A07;
        if (interfaceC0355Es != null && formatChanged) {
            interfaceC0355Es.ADI(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final int AEq(InterfaceC0279Bb interfaceC0279Bb, int i, boolean z) throws IOException, InterruptedException {
        int read = interfaceC0279Bb.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        return read;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final void AEr(C0420Hh c0420Hh, int i) {
        while (i > 0) {
            int A00 = A00(i);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            c0420Hh.A0c(bArr, bytesAppended, A00);
            i -= A00;
            A02(A00);
        }
    }
}
