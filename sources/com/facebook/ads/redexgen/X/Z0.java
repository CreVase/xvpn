package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Z0 extends C00802v {
    public static String[] A01 = {"Aypyv0FACfsPQTq8B8UFxLSJIGYFzsCC", "O7nTze5knL3NcSr2rovnk7vqxWhLtUKF", "w8KDuB7m9FBYOy6hiJzio9ilRX5MSLSp", "Kqe5H6YPSeJrA9PRZ2BXFN4qonyjjTB9", "VPpNE9vsyh3HxU94PoFE47DnBqUfoC5Y", "VSW3ZMLcugYKNhiURlJ0g5uJ7Smp29SS", "AB", "JpT6Sbfy0irMNtnKFHDBnJ8tZotKHb"};
    public final C0871Yz A00;

    public Z0(C0871Yz c0871Yz) {
        this.A00 = c0871Yz;
    }

    @Override // com.facebook.ads.redexgen.X.C00802v
    public final void A08(View view, C00913g c00913g) {
        super.A08(view, c00913g);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            this.A00.A01.getLayoutManager().A1C(view, c00913g);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C00802v
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            if (A01[2].charAt(3) == 'j') {
                throw new RuntimeException();
            }
            A01[6] = "SRS22nAnXgHfwC2qheyHP9Kgc2YZ";
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1b(view, i, bundle);
        }
        return false;
    }
}
