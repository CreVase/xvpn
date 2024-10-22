package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class O1 implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"c2PEJ6DOqpui9EPvmckbHNLd48C", "0LubsyKGJKKePfKATMceGef14XY86Ri5", "M6oVByKNfKe8LZIrCewzhyGONHgeYcNo", "g1oo9eCM7RcmOvTxZ1VejNMrbdbCR0G4", "3al8rHdAj04D", "Lmo63BJo3ocNRJpk0", "u0Zxd4kfnWeayuGPbNnNq6ZbpiAglx3D", "JRUzdnx3lrNIQCskW6e2Avl8V"};
    public final /* synthetic */ C9D A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = copyOfRange[i4];
            if (A02[6].charAt(25) != 'i') {
                throw new RuntimeException();
            }
            A02[3] = "5a6mLeJ2IjXboF1UfYYlwLhwsx6RVGTR";
            copyOfRange[i4] = (byte) ((b2 - i3) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 5, 0, 1, 11};
    }

    static {
        A01();
    }

    public O1(C9D c9d) {
        this.A00 = c9d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 67));
        } catch (Throwable th) {
            if (A02[3].charAt(5) != 'e') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "oQ6hKoRa6K50vxrlE5lU8mLQHveYoJVv";
            strArr[1] = "5HqmMGmqvKeUZ55y8iy1lLJbe1y4dd8I";
            K0.A00(th, this);
        }
    }
}
