package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0463Iy {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 111);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    EnumC0463Iy(long j, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    public static EnumC0463Iy A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (EnumC0463Iy enumC0463Iy : values()) {
            if (enumC0463Iy.A01 == mediaCacheFlag) {
                return enumC0463Iy;
            }
        }
        return null;
    }
}
