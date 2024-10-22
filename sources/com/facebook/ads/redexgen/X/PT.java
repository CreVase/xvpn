package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0676Ri A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{21, 30, 20, 19, 17, 34, 20, 35};
    }

    public PT(C0676Ri c0676Ri) {
        this.A00 = c0676Ri;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T3 t3;
        T3 t32;
        if (K0.A02(this)) {
            return;
        }
        try {
            t3 = this.A00.A02;
            if (t3 == null) {
                return;
            }
            t32 = this.A00.A02;
            t32.A09(A00(0, 8, 65));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
