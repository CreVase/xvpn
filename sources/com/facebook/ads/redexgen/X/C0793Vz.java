package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0793Vz implements D8 {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{3, -11, -13, 5, 2, -11, -67, 0, -4, -15, 9, -14, -15, -13, -5};
    }

    public C0793Vz(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final int A6O() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final MediaCodecInfo A6P(int i) {
        A01();
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final boolean A94(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 99));
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final boolean AEu() {
        return true;
    }
}
