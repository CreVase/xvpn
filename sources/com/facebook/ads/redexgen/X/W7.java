package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public class W7 implements InterfaceC0305Co {
    public static String[] A02 = {"KDcVXuz53RpoF9UEOZ96l2VZuhVX9ip0", "CKRJ1Pqx0SMvAzHTc14bPVY1Im6KLWKe", "CZRg2SIX1VWZgfyXTOdEl1", "FcRR7mDk42dnDG0ym1pZJ2", "QPo", "3iSkzhZlTwG2jcdx249ci8whKDsXKTKF", "nuc6nRuUqT3GqwIih", "HhkYvD09GQfRAuSaGWngxJEfFHmtitdD"};
    public final C0419Hg A00 = new C0419Hg(new byte[4]);
    public final /* synthetic */ W5 A01;

    public W7(W5 w5) {
        this.A01 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0305Co
    public final void A4O(C0420Hh c0420Hh) {
        int i;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = c0420Hh.A0E();
        if (tableId != 0) {
            return;
        }
        c0420Hh.A0Z(7);
        int A04 = c0420Hh.A04() / 4;
        for (int programNumber = 0; programNumber < A04; programNumber++) {
            c0420Hh.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int i2 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(i2, new WA(new W6(this.A01, i2)));
                W5.A01(this.A01);
            }
        }
        i = this.A01.A05;
        int programCount = A02[4].length();
        if (programCount == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "4awIAPS5zJKVkKN48BLjJX";
        strArr[2] = "yyhTqQNSKamLuuIUjTGErW";
        if (i != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0305Co
    public final void A8g(C0432Ht c0432Ht, InterfaceC0280Bc interfaceC0280Bc, C0310Cu c0310Cu) {
    }
}
