package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OF implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"0HsLQMHMjdf9XxY0FoFJM6DI5mSYk5cq", "dhr4behIProWKSykj", "GE701vnHE9lzBn3SwA4tW4e1BtUaptEm", "cLSMigQ4cfHVDaX8bfW4FJ5X08fXhUZC", "1xDVph1vyW65p7zSnZeJ5giXq27He7tX", "cas2Jd68DEdp6", "xZiGDxwVLZDgesSRv509BK1mAeaT2HFq", "7L9x50qsEvVQf3Iy1"};
    public final /* synthetic */ C0705Sl A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(10) != 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "t4xutyPnAWvSKPJUD0NJxEchNrBIH7fo";
            strArr[0] = "mOxo7NoxjINZF7CLuWUnFWlPSsoX4esJ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{48, 52, 40, 46, 44};
    }

    static {
        A01();
    }

    public OF(C0705Sl c0705Sl) {
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
            ol.A02(A00(0, 5, 85));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
