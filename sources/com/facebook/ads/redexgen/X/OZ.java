package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OZ extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    public EnumC0625Pj A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC0924aS A05;
    public final C6Q A06;
    public final YA A07;
    public final C0452In A08;
    public final InterfaceC0531Lt A09;
    public final MM A0A;
    public final OY A0B;
    public final C0616Pa A0C;
    public final RX A0D;
    public final AnonymousClass76 A0E;
    public final AbstractC0591Ob A0F;
    public final AbstractC0577Nn A0G;
    public final MU A0H;
    public final MI A0I;
    public final MA A0J;
    public final M9 A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public OZ(YA ya, InterfaceC0444If interfaceC0444If, AbstractC0924aS abstractC0924aS, C6Q c6q, C0452In c0452In, InterfaceC0531Lt interfaceC0531Lt, MM mm, OY oy) {
        super(ya);
        MA ma = new MA() { // from class: com.facebook.ads.redexgen.X.94
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(MD md) {
                OY oy2;
                JSONObject A03;
                OZ.this.A03 = true;
                oy2 = OZ.this.A0B;
                A03 = OZ.this.A03();
                oy2.ADO(A00(0, 8, 101), A03);
            }
        };
        this.A0J = ma;
        MI mi = new MI() { // from class: com.facebook.ads.redexgen.X.93
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, 72};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                OY oy2;
                JSONObject A03;
                OZ.this.A04 = true;
                oy2 = OZ.this.A0B;
                A03 = OZ.this.A03();
                oy2.ADO(A00(0, 4, 62), A03);
            }
        };
        this.A0I = mi;
        MU mu = new MU() { // from class: com.facebook.ads.redexgen.X.92
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{28, 13, 25, 31, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
                OY oy2;
                JSONObject A03;
                oy2 = OZ.this.A0B;
                A03 = OZ.this.A03();
                oy2.ADO(A00(0, 5, 49), A03);
            }
        };
        this.A0H = mu;
        M9 m9 = new M9() { // from class: com.facebook.ads.redexgen.X.91
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass71 anonymousClass71) {
                OZ.this.A0H(anonymousClass71);
                OZ.this.A0A();
            }
        };
        this.A0K = m9;
        AbstractC0591Ob abstractC0591Ob = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.90
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                OY oy2;
                RX rx;
                JSONObject A04;
                OZ.this.A07();
                oy2 = OZ.this.A0B;
                OZ oz = OZ.this;
                rx = oz.A0D;
                A04 = oz.A04(rx.getDuration());
                oy2.ADO(A00(0, 9, 100), A04);
            }
        };
        this.A0F = abstractC0591Ob;
        C02268z c02268z = new C02268z(this);
        this.A0G = c02268z;
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = ya;
        this.A05 = abstractC0924aS;
        this.A06 = c6q;
        this.A08 = c0452In;
        this.A09 = interfaceC0531Lt;
        this.A0A = mm;
        RX rx = new RX(ya);
        this.A0D = rx;
        this.A0B = oy;
        rx.setFunnelLoggingHandler(c0452In);
        rx.getEventBus().A03(ma, mi, mu, m9, abstractC0591Ob, c02268z);
        this.A0E = new AnonymousClass76(ya, interfaceC0444If, rx, abstractC0924aS.A11());
        if (IP.A1Y(ya)) {
            this.A0C = new C0616Pa(ya, interfaceC0444If, rx, abstractC0924aS.A11(), null);
        } else {
            this.A0C = null;
        }
        A0B();
        rx.setVideoURI(c6q.A0S(abstractC0924aS.A0v().A0D().A08()));
        A09();
        LV.A0M(this, abstractC0924aS.A0u().A01().A07(true));
        String videoUrl = abstractC0924aS.A0v().A0D().A07();
        if (!TextUtils.isEmpty(videoUrl)) {
            C0579Np.A00(ya, this, videoUrl);
        }
        addView(rx, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new SZ(this), IP.A0K(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new SY(this), IP.A0L(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.ADO(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0v().A0D().A07())) {
            C01666j c01666j = new C01666j(this.A07);
            this.A0D.A0c(c01666j);
            c01666j.setImage(this.A05.A0v().A0D().A07());
        }
        C6E c6e = new C6E(this.A07, true, this.A08);
        this.A0D.A0c(c6e);
        this.A0D.A0c(new C0482Ju(c6e, EnumC0638Pw.A03, true));
        this.A0D.A0c(new C6Z(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(AnonymousClass71 anonymousClass71) {
        if (this.A0D.getState() == QY.A02 && IP.A1E(this.A07)) {
            this.A0D.postDelayed(new SX(this, anonymousClass71), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0E().A2v(str);
        if (IP.A1F(this.A07)) {
            A07();
            return;
        }
        InterfaceC0531Lt interfaceC0531Lt = this.A09;
        MM mm = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC0531Lt.A3z(mm.A6r());
        this.A09.A3z(this.A0A.A6n());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0v().A0D().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(EnumC0625Pj.A02, 26);
        A08();
    }

    public final void A0O() {
        RX rx = this.A0D;
        if (rx != null) {
            if (!this.A02) {
                rx.A0a(EnumC0620Pe.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        C0616Pa c0616Pa = this.A0C;
        if (c0616Pa != null) {
            c0616Pa.A0A();
        }
        this.A0E.A0g();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        LV.A0T(this);
        LV.A0H(this.A0D);
        LV.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(EnumC0620Pe.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z) {
        EnumC0625Pj enumC0625Pj;
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == QY.A06 || (enumC0625Pj = this.A00) == null) {
            return;
        }
        boolean z2 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z2 || z) {
            this.A0D.A0b(enumC0625Pj, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0D.A0e(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0D.A0b(EnumC0625Pj.A04, 25);
    }
}
