package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Wx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0817Wx extends AbstractC0289Bo {
    public static byte[] A03;
    public static String[] A04 = {"NGxGYCc4p5LcUzQMJWyw5DiDSRjOQe9F", "UCFVtk8FFiQwlTHXhlKlMorjx3xQRwUs", "gTYsvz0mqVjOzoMK", "3KonftsBU2Jf7i08alR6FL8DBvSTG56H", "D2cphfoCJeCyY12qt8LourkPjJ4neP20", "nKjfLlw2BnKut4cvipNa", "Z1RdCfwuszFRU44UcECPMtJ2BxVCI0wR", ""};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[6].charAt(5) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "nNsRewLEUEMjLhcIGLcqJY6DWywwxHcp";
            strArr[3] = "fafmuFk897DEXRggqTinAcDDyPNFBZka";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{39, 91, 74, 79, 85, 6, 76, 85, 88, 83, 71, 90, 6, 84, 85, 90, 6, 89, 91, 86, 86, 85, 88, 90, 75, 74, 32, 6, 48, 68, 51, 56, 62, -2, 54, 6, 0, 0, -4, 48, 59, 48, 70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -21, -22, -33, -11, -24, -4, -21, -16, -10, -74, -12, -9, -69, -24, -76, -13, -24, -5, -12, 41, 61, 44, 49, 55, -9, 53, 56, 45, 47};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C0817Wx(InterfaceC0288Bm interfaceC0288Bm) {
        super(interfaceC0288Bm);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0289Bo
    public final void A0B(C0420Hh c0420Hh, long j) throws C02309d {
        if (this.A00 == 2) {
            int A042 = c0420Hh.A04();
            super.A00.AEr(c0420Hh, A042);
            super.A00.AEs(j, 1, A042, 0, null);
            return;
        }
        int A0E = c0420Hh.A0E();
        int packetType = A04[2].length();
        if (packetType != 16) {
            throw new RuntimeException();
        }
        A04[7] = "";
        if (A0E == 0 && !this.A01) {
            byte[] bArr = new byte[c0420Hh.A04()];
            c0420Hh.A0c(bArr, 0, bArr.length);
            Pair<Integer, Integer> audioParams = HM.A03(bArr);
            super.A00.A5j(Format.A07(null, A00(58, 15, 9), null, -1, -1, ((Integer) audioParams.second).intValue(), ((Integer) audioParams.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            this.A01 = true;
            return;
        }
        int packetType2 = this.A00;
        if (packetType2 == 10 && A0E != 1) {
            return;
        }
        int A043 = c0420Hh.A04();
        super.A00.AEr(c0420Hh, A043);
        super.A00.AEs(j, 1, A043, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:            if (r5 == 1) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:            r13 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:            r13 = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:            if (r5 == 1) goto L26;     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0289Bo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0C(com.facebook.ads.redexgen.X.C0420Hh r19) throws com.facebook.ads.redexgen.X.C0813Wt {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0817Wx.A0C(com.facebook.ads.redexgen.X.Hh):boolean");
    }
}
