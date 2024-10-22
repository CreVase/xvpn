package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdLayout;

/* loaded from: assets/audience_network.dex */
public final class MS {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (C0506Ku.A02 * 200.0f);
    public static final int A03 = (int) (C0506Ku.A02 * 200.0f);
    public static final int A02 = (int) (C0506Ku.A02 * 50.0f);

    public static AnonymousClass11 A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass11.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass11.A06;
        }
        return AnonymousClass11.A04;
    }

    public static MR A01(YA ya, InterfaceC0444If interfaceC0444If, String str, NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i = A01;
        if (h >= i && w >= i) {
            return new TM(ya, interfaceC0444If, str);
        }
        if (h < A03 || w < A02) {
            return null;
        }
        return new TN(ya, interfaceC0444If, str);
    }

    public static TO A02(YA ya, InterfaceC0444If interfaceC0444If, String str, C1X c1x, InterfaceC0532Lu interfaceC0532Lu, InterfaceC0531Lt interfaceC0531Lt) {
        return new TO(ya, interfaceC0444If, str, c1x, interfaceC0532Lu, interfaceC0531Lt);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w = A01;
        if (h < w || height < w) {
            if (h >= A03) {
                int i = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i) {
                }
            }
            return true;
        }
        return false;
    }
}
