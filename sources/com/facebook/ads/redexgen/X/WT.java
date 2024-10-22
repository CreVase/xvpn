package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WT extends CW {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public CY A01;
    public C0296Ca A02;
    public C0297Cc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final CY A02(C0420Hh c0420Hh) throws IOException {
        if (this.A03 == null) {
            this.A03 = C0298Cd.A04(c0420Hh);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = C0298Cd.A03(c0420Hh);
            return null;
        }
        byte[] bArr = new byte[c0420Hh.A07()];
        System.arraycopy(c0420Hh.A00, 0, bArr, 0, c0420Hh.A07());
        return new CY(this.A03, this.A02, bArr, C0298Cd.A0C(c0420Hh, this.A03.A05), C0298Cd.A00(r4.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, 22, 79, 86, 75, 91, 80, 74};
    }

    static {
        A04();
    }

    public static int A00(byte b2, int i, int i2) {
        return (b2 >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b2, CY cy) {
        if (!cy.A04[A00(b2, cy.A00, 1)].A03) {
            int modeNumber = cy.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = cy.A02.A04;
        return modeNumber2;
    }

    public static void A05(C0420Hh c0420Hh, long j) {
        c0420Hh.A0X(c0420Hh.A07() + 4);
        c0420Hh.A00[c0420Hh.A07() - 4] = (byte) (j & 255);
        c0420Hh.A00[c0420Hh.A07() - 3] = (byte) ((j >>> 8) & 255);
        c0420Hh.A00[c0420Hh.A07() - 2] = (byte) ((j >>> 16) & 255);
        c0420Hh.A00[c0420Hh.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C0420Hh c0420Hh) {
        try {
            return C0298Cd.A0A(1, c0420Hh, true);
        } catch (C02309d unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final long A07(C0420Hh c0420Hh) {
        int i = 0;
        if ((c0420Hh.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c0420Hh.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + A01) / 4;
        }
        A05(c0420Hh, i);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
        strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
        this.A00 = A01;
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        C0297Cc c0297Cc = this.A03;
        this.A00 = c0297Cc != null ? c0297Cc.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final boolean A0A(C0420Hh c0420Hh, long j, CV cv) throws IOException, InterruptedException {
        if (this.A01 == null) {
            CY A02 = A02(c0420Hh);
            this.A01 = A02;
            if (A02 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            cv.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
