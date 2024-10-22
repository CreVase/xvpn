package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class GS {
    public static String[] A04 = {"1e59kXQlLqMkYu", "73uDxCsdQKWLV7ukq8JJdZs18UKd6swo", "mCuMZDHsEtXcrT2f0", "82", "pR5c7vVXcuaoTTpQp", "OeCOW4uYvzA4LVqnaAabDbQ1U", "2mUnq0j6yY0W6wQrn1U3Lg5rNBUJPBqf", "6oWLaazoE5vpCSBDL9uHOzoNvgEAVE9"};
    public final int A00;
    public final GP A01;
    public final Object A02;
    public final C02469t[] A03;

    public GS(C02469t[] c02469tArr, GO[] goArr, Object obj) {
        this.A03 = c02469tArr;
        this.A01 = new GP(goArr);
        this.A02 = obj;
        this.A00 = c02469tArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(GS gs) {
        if (gs == null || gs.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(gs, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(GS gs, int i) {
        if (gs == null) {
            return false;
        }
        C02469t[] c02469tArr = this.A03;
        String[] strArr = A04;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "XY11p18RHVDFci";
        strArr2[3] = "x2";
        return C0436Hx.A0g(c02469tArr[i], gs.A03[i]) && C0436Hx.A0g(this.A01.A00(i), gs.A01.A00(i));
    }
}
