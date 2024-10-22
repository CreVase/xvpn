package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class O0 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C9F A00;

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
        A01 = new byte[]{27, 31, 19, 25, 23};
    }

    public O0(C9F c9f) {
        this.A00 = c9f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            getCtaButton().A09(A00(0, 5, 67));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
