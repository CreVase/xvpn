package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OR implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"RlzIrkXQUMxOBA0f8ntZcWMgp1uQyBL3", "nfM1dm9yUJ1maOB1", "3Svkd2lvdRmofYAbs9dZJwxmjeUnr2xh", "sPY6jFiS09X65Brr28D6Svz4lO8XBbuT", "PIj7hiNW37fJivrisJGHqPiIf6kz6TA8", "QVlKdLc7hyZZsm", "AmJ5hR6WJTTjUY", "rwvyjD2ChM6DiqOHsUU0Xk1O1i7dVZAR"};
    public final /* synthetic */ AnonymousClass97 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[7] = "lANcDcBPHZozyZY8XltfLEaPbGbTaXPo";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{113, 117, 121, Byte.MAX_VALUE, 125};
    }

    static {
        A01();
    }

    public OR(AnonymousClass97 anonymousClass97) {
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
            ctaButton.A09(A00(0, 5, 90));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
