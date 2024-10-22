package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OS implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass97 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{67, 92, 81, 80, 90};
    }

    public OS(AnonymousClass97 anonymousClass97) {
        this.A00 = anonymousClass97;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T3 ctaButton;
        if (K0.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 7));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
