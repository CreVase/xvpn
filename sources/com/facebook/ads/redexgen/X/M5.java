package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class M5 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TU A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{43, 41, 27, 40, 25, 34, 31, 25, 33};
    }

    public M5(TU tu) {
        this.A00 = tu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A0X(false, A00(0, 9, 121));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
