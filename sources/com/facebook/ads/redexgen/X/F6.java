package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class F6 extends AbstractC0924aS {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public F6(List<C1D> list) {
        super(list);
    }

    public static F6 A02(JSONObject jSONObject, YA ya) {
        F6 f6 = new F6(AbstractC0924aS.A08(jSONObject, ya, new C0923aR()));
        f6.A15(jSONObject);
        f6.A0Z(A03(0, 6, 27));
        return f6;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0F() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0G() {
        return 0;
    }
}
