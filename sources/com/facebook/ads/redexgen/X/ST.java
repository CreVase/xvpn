package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class ST extends AbstractC0642Qa {
    public static byte[] A01;
    public final /* synthetic */ AbstractC0612Ow A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 81, 88, 80, 87, 92, 93, 102, 88, 93, 102, 80, 87, 93, 92, 65};
    }

    public ST(AbstractC0612Ow abstractC0612Ow) {
        this.A00 = abstractC0612Ow;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0642Qa
    public final void A03() {
        int i;
        boolean z;
        boolean z2;
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A11())) {
                Map<String, String> A05 = new NL().A03(this.A00.A0B).A02(this.A00.A08).A04(this.A00.A05.A0N()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 11));
                i = this.A00.A01;
                A05.put(A00(0, 16, 10), append.append(i).toString());
                this.A00.A07.A9S(this.A00.A05.A11(), A05);
                C1R.A07(this.A00.A05.A0x(), this.A00.A06);
                this.A00.A06.A0E().A2g();
                z = this.A00.A03;
                if (!z) {
                    C2C.A00(this.A00.A05.A0M());
                }
                z2 = this.A00.A04;
                if (!z2) {
                    this.A00.A09.A3z(this.A00.A0A.A74());
                }
            }
        }
    }
}
