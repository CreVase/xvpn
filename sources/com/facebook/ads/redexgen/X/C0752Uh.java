package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Uh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0752Uh implements InterfaceC0444If {
    public static InterfaceC0444If A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final Y9 A00;
    public final InterfaceC02068e A01;
    public final InterfaceC0443Ie A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = C0752Uh.class.getSimpleName();
        A06 = false;
    }

    public C0752Uh(Y9 y9) {
        InterfaceC0442Id dispatchCallback;
        this.A00 = y9;
        if (IR.A0T(y9)) {
            InterfaceC02068e A00 = C02048c.A00(y9);
            this.A01 = A00;
            dispatchCallback = C0449Ik.A00(y9, A00);
        } else {
            C0323Dm A01 = C02048c.A01(y9);
            dispatchCallback = C0449Ik.A01(y9, A01);
            this.A01 = A01;
        }
        this.A02 = new C0755Uk(y9, dispatchCallback);
        ExecutorC0512La.A08.execute(new C0754Uj(this));
        A04(y9);
    }

    public static synchronized InterfaceC0444If A01(Y9 y9) {
        InterfaceC0444If interfaceC0444If;
        synchronized (C0752Uh.class) {
            if (A03 == null) {
                A03 = new C0752Uh(y9);
            }
            interfaceC0444If = A03;
        }
        return interfaceC0444If;
    }

    public static synchronized void A04(Y9 y9) {
        synchronized (C0752Uh.class) {
            if (A06) {
                return;
            }
            y9.A03().AAO();
            A06 = true;
        }
    }

    private void A05(C0441Ic c0441Ic) {
        if (!c0441Ic.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c0441Ic.A06() + A02(0, 7, 55));
        } else {
            A06(c0441Ic);
            this.A01.AGT(c0441Ic, new C0753Ui(this, c0441Ic));
        }
    }

    private void A06(C0441Ic c0441Ic) {
        switch (C0445Ig.A00[c0441Ic.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C02007y c02007y = new C02007y(new Exception(A02(36, 5, 50)));
                c02007y.A03(1);
                try {
                    c02007y.A05(new JSONObject().put(A02(48, 4, 107), c0441Ic.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A07().A9N(A02(41, 7, 50), C01997x.A1H, c02007y);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9F(String str, Map<String, String> data) {
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9H(String str, Map<String, String> data) {
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9I(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A07).A06(C0454Ip.A0A(str, EnumC0451Im.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9J(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A08).A06(C0454Ip.A0A(str, EnumC0451Im.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9L(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9P(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9S(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0D).A06(C0454Ip.A0A(str, EnumC0451Im.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9T(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9U(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0F).A06(C0454Ip.A0A(str, EnumC0451Im.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9V(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0K).A06(C0454Ip.A0A(str, EnumC0451Im.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9W(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0H).A06(C0454Ip.A0A(str, EnumC0451Im.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9Y(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0J).A06(C0454Ip.A0A(str, EnumC0451Im.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9Z(String str, Map<String, String> data, String str2, EnumC0446Ih enumC0446Ih) {
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(enumC0446Ih).A02(EnumC0447Ii.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9a(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0441Ic adEvent = new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9e(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0N).A06(C0454Ip.A0A(str, EnumC0451Im.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9f(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0O).A06(C0454Ip.A0A(str, EnumC0451Im.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0P).A06(C0454Ip.A0A(str, EnumC0451Im.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9i(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9m(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0Q).A06(C0454Ip.A0A(str, EnumC0451Im.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9n(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0U).A06(C0454Ip.A0A(str, EnumC0451Im.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9o(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A04).A02(EnumC0447Ii.A0T).A06(C0454Ip.A0A(str, EnumC0451Im.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9p(String str, Map<String, String> data) {
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void A9r(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0440Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0446Ih.A05).A02(EnumC0447Ii.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0444If
    public final void ADr(String str) {
        new R1(this.A00).execute(str);
    }
}
