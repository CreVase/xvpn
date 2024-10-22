package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class WY extends CW {
    public static byte[] A02;
    public static String[] A03 = {"8dTWvXK8tch0WiEnFvHb8QUOTjgSOqY9", "GP5XsFGUIcP3F8wb7eo6", "CqCUMDrIKsNfOt03xA9INRdZ8", "ntm6pkiJXJn0b4vYMFRbAtYqalurqDmt", "MKNWZ4ceQqyXKZHhShlPBWdiS", "qmQfSGtBK4Bh2Swsb", "DS4", "jEA"};
    public WZ A00;
    public HU A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-97, -77, -94, -89, -83, 109, -92, -86, -97, -95};
    }

    static {
        A03();
    }

    private int A00(C0420Hh c0420Hh) {
        int i = (c0420Hh.A00[2] & 255) >> 4;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int i2 = i - 2;
                String[] strArr = A03;
                String str = strArr[3];
                String str2 = strArr[0];
                int charAt = str.charAt(11);
                int blockSizeCode = str2.charAt(11);
                if (charAt == blockSizeCode) {
                    A03[1] = "m7WV3F64xJdvTLT";
                    return 576 << i2;
                }
                String[] strArr2 = A03;
                strArr2[6] = "ZGd";
                strArr2[7] = "V9k";
                return 576 << i2;
            case 6:
            case 7:
                c0420Hh.A0Z(4);
                c0420Hh.A0O();
                String[] strArr3 = A03;
                String str3 = strArr3[3];
                String str4 = strArr3[0];
                int charAt2 = str3.charAt(11);
                int blockSizeCode2 = str4.charAt(11);
                if (charAt2 != blockSizeCode2) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[6] = "ycs";
                strArr4[7] = "AJV";
                int value = i == 6 ? c0420Hh.A0E() : c0420Hh.A0I();
                c0420Hh.A0Y(0);
                int blockSizeCode3 = value + 1;
                return blockSizeCode3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int value2 = i - 8;
                int blockSizeCode4 = UserVerificationMethods.USER_VERIFY_HANDPRINT << value2;
                return blockSizeCode4;
            default:
                return -1;
        }
    }

    public static boolean A04(C0420Hh c0420Hh) {
        return c0420Hh.A04() >= 5 && c0420Hh.A0E() == 127 && c0420Hh.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final long A07(C0420Hh c0420Hh) {
        if (!A05(c0420Hh.A00)) {
            return -1L;
        }
        return A00(c0420Hh);
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final boolean A0A(C0420Hh c0420Hh, long j, CV cv) throws IOException, InterruptedException {
        byte[] bArr = c0420Hh.A00;
        if (this.A01 == null) {
            this.A01 = new HU(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, c0420Hh.A07());
            copyOfRange[4] = Byte.MIN_VALUE;
            cv.A00 = Format.A07(null, A02(0, 10, 50), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, Collections.singletonList(copyOfRange), null, 0, null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            WZ wz = new WZ(this);
            this.A00 = wz;
            wz.A01(c0420Hh);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        WZ wz2 = this.A00;
        if (A03[5].length() != 17) {
            throw new RuntimeException();
        }
        A03[1] = "qWJSCS9yuHod5mMI2FbA5J9U";
        if (wz2 != null) {
            wz2.A00(j);
            cv.A01 = this.A00;
        }
        return false;
    }
}
