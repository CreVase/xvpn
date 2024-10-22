package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TP implements MT {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ MR A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public TP(MR mr) {
        this.A00 = mr;
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public final void A4I() {
        InterfaceC0531Lt interfaceC0531Lt;
        InterfaceC0531Lt interfaceC0531Lt2;
        interfaceC0531Lt = this.A00.A07;
        if (interfaceC0531Lt != null) {
            interfaceC0531Lt2 = this.A00.A07;
            interfaceC0531Lt2.A3z(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public final void A4J() {
        InterfaceC0532Lu interfaceC0532Lu;
        InterfaceC0532Lu interfaceC0532Lu2;
        this.A00.A0M();
        interfaceC0532Lu = this.A00.A08;
        if (interfaceC0532Lu != null) {
            interfaceC0532Lu2 = this.A00.A08;
            interfaceC0532Lu2.ACj(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public final void A8F() {
        C2K c2k;
        C2K c2k2;
        C2K c2k3;
        YA ya;
        c2k = this.A00.A03;
        if (c2k == null) {
            A4J();
            return;
        }
        MR.A01(this.A00);
        c2k2 = this.A00.A03;
        if (c2k2.A02() == null) {
            MR mr = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            mr.A0C();
        } else {
            MR mr2 = this.A00;
            c2k3 = mr2.A03;
            mr2.A0E(c2k3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            ya = this.A00.A05;
            if (IP.A1z(ya)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public final void A99() {
        C2G c2g;
        C2J c2j;
        YA ya;
        C2G c2g2;
        String str;
        c2g = this.A00.A04;
        if (!TextUtils.isEmpty(c2g.A0I())) {
            KZ kz = new KZ();
            ya = this.A00.A05;
            c2g2 = this.A00.A04;
            Uri A00 = C0490Kc.A00(c2g2.A0I());
            str = this.A00.A09;
            KZ.A0L(kz, ya, A00, str);
        }
        c2j = this.A00.A02;
        c2j.A04();
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public final void A9A() {
        InterfaceC0532Lu interfaceC0532Lu;
        C2G c2g;
        C2J c2j;
        YA ya;
        C2G c2g2;
        String str;
        InterfaceC0532Lu interfaceC0532Lu2;
        this.A00.A0M();
        interfaceC0532Lu = this.A00.A08;
        if (interfaceC0532Lu != null) {
            interfaceC0532Lu2 = this.A00.A08;
            interfaceC0532Lu2.ACj(true);
        }
        c2g = this.A00.A04;
        if (!TextUtils.isEmpty(c2g.A0C())) {
            KZ kz = new KZ();
            ya = this.A00.A05;
            c2g2 = this.A00.A04;
            Uri A00 = C0490Kc.A00(c2g2.A0C());
            str = this.A00.A09;
            KZ.A0L(kz, ya, A00, str);
        }
        c2j = this.A00.A02;
        c2j.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public final void AC6(C2I c2i) {
        C2I c2i2;
        C2G c2g;
        C2K A0B;
        C2G c2g2;
        MR.A00(this.A00);
        this.A00.A01 = c2i;
        c2i2 = this.A00.A01;
        if (c2i2 == C2I.A03) {
            c2g2 = this.A00.A04;
            A0B = c2g2.A0A();
        } else {
            c2g = this.A00.A04;
            A0B = c2g.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public final void ACF(C2K c2k) {
        C2J c2j;
        MR.A00(this.A00);
        c2j = this.A00.A02;
        c2j.A07(c2k.A01());
        if (!c2k.A05().isEmpty()) {
            this.A00.A0E(c2k);
        } else {
            this.A00.A0D(c2k);
        }
    }
}
