package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class MG implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public MG(TS ts) {
        this.A00 = ts;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0531Lt interfaceC0531Lt;
        if (K0.A02(this)) {
            return;
        }
        try {
            interfaceC0531Lt = this.A00.A06;
            interfaceC0531Lt.A3z(A00(0, 15, 9));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
