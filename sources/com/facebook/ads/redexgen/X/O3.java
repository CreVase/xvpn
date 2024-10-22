package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class O3 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0714Su A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 111, 99, 101, 103};
    }

    public O3(C0714Su c0714Su) {
        this.A00 = c0714Su;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 47));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
