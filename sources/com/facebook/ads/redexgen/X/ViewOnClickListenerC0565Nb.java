package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0565Nb implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"l4N2Kcxoefptdq", "", "xCyGfauY8Cv8y6z1j6nB0", "I2vrbV9C0ptJWrRodxY1O", "AmZ6eVz7znw", "py", "GJkVNgHUEop", "nCT0hemhHj6ffYmr5ag1r7dDnEHHnadR"};
    public final /* synthetic */ C9G A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[7].charAt(24) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "onCZLFvGkKiXvi8omTZne";
        strArr[3] = "abRPxd6rYbi4uG3hrN9CP";
        A01 = new byte[]{70, 66, 78, 72, 74};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0565Nb(C9G c9g) {
        this.A00 = c9g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T3 ctaButton;
        if (K0.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 74));
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A02[0].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "DOCXsrSX8m5";
            strArr[1] = "";
        }
    }
}
