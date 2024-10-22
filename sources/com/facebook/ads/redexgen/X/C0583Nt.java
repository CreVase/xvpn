package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Nt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0583Nt {
    public static float A00(C1D c1d) {
        int height = c1d.A0D().A01();
        int width = c1d.A0D().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) ((C0505Kt.A00().widthPixels - (AbstractC0585Nv.A07 * 2)) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = LV.A01(16);
        int ctaTextHeight = C0564Na.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC0585Nv.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = C0505Kt.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC0582Ns A03(T3 t3, String str) {
        return new ViewOnClickListenerC0582Ns(t3, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A06(int i, int i2, double d) {
        return i == 2 || A05(d, i2);
    }
}
