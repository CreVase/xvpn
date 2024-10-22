package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0973bI {
    A04,
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{124, 119, 112, Byte.MAX_VALUE, 108, 103, 86, 81, 74, 80, 77, 73, 65, 23, 11, 17, 22, 7, 1};
    }

    static {
        A01();
    }
}
