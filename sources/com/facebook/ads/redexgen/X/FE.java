package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class FE extends TD {
    public static byte[] A02;
    public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};
    public final /* synthetic */ C0942ak A00;
    public final /* synthetic */ C0932aa A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    static {
        A01();
    }

    public FE(C0942ak c0942ak, C0932aa c0932aa) {
        this.A00 = c0942ak;
        this.A01 = c0932aa;
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void AAY() {
        boolean z;
        this.A00.A0E = true;
        z = this.A00.A0F;
        if (!z) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
    public final void AAp(String str, Map<String, String> extraData) {
        C0336Dz c0336Dz;
        C0336Dz c0336Dz2;
        InterfaceC0444If interfaceC0444If;
        F6 f6;
        F6 f62;
        C1R A0x;
        String str2;
        C0336Dz c0336Dz3;
        InterfaceC00300w interfaceC00300w;
        InterfaceC00300w interfaceC00300w2;
        c0336Dz = this.A00.A03;
        c0336Dz.A0E().A3f();
        Uri A00 = C0490Kc.A00(str);
        if (A00(22, 4, 82).equals(A00.getScheme()) && C00160h.A04(A00.getAuthority())) {
            interfaceC00300w = this.A00.A00;
            if (interfaceC00300w != null) {
                interfaceC00300w2 = this.A00.A00;
                interfaceC00300w2.AAi(this.A00);
            }
        }
        c0336Dz2 = this.A00.A03;
        interfaceC0444If = this.A00.A04;
        String A6N = this.A01.A6N();
        f6 = this.A00.A02;
        if (f6 == null) {
            A0x = null;
        } else {
            f62 = this.A00.A02;
            A0x = f62.A0x();
        }
        AbstractC00150g adAction = C00160h.A00(c0336Dz2, interfaceC0444If, A6N, A00, extraData, A0x);
        if (adAction == null) {
            return;
        }
        try {
            c0336Dz3 = this.A00.A03;
            c0336Dz3.A0E().A3c();
            adAction.A0C();
        } catch (Exception e) {
            str2 = C0942ak.A0I;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "yKt";
            strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
            Log.e(str2, A00(0, 22, 0), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
    public final void ABZ() {
        C0336Dz c0336Dz;
        C0930aY c0930aY;
        C0930aY c0930aY2;
        C0930aY c0930aY3;
        c0336Dz = this.A00.A03;
        InterfaceC0961b3 A0E = c0336Dz.A0E();
        c0930aY = this.A00.A01;
        A0E.A3g(c0930aY != null);
        c0930aY2 = this.A00.A01;
        if (c0930aY2 == null) {
            return;
        }
        c0930aY3 = this.A00.A01;
        c0930aY3.A02();
    }

    @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
    public final void ACH() {
        C0336Dz c0336Dz;
        C0930aY c0930aY;
        c0336Dz = this.A00.A03;
        c0336Dz.A0E().A3i();
        c0930aY = this.A00.A01;
        c0930aY.A07();
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void ADZ() {
    }
}
