package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W0 implements D8 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    public W0() {
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final int A6O() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final MediaCodecInfo A6P(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final boolean A94(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 2).equals(str);
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final boolean AEu() {
        return false;
    }
}
