package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OI implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0705Sl A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 50, 50, 49, 63, 60, 47};
    }

    public OI(C0705Sl c0705Sl) {
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
            ol.A02(A00(0, 7, 95));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
