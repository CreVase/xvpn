package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OH implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0705Sl A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 66, 66, 67, 82, 71, 79, 74, 85};
    }

    public OH(C0705Sl c0705Sl) {
        this.A00 = c0705Sl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        OL ol;
        if (K0.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0O;
            if (z) {
                return;
            }
            ol = this.A00.A0M;
            ol.A02(A00(0, 9, 31));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
