package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class YY implements C6I {
    public final List<C0939ah> A00;
    public final /* synthetic */ YX A01;

    public YY(YX yx, List<C0939ah> list) {
        this.A01 = yx;
        this.A00 = list;
    }

    private void A00() {
        C01355a c01355a;
        C01355a c01355a2;
        C01355a c01355a3;
        YA ya;
        C01355a c01355a4;
        C01355a c01355a5;
        YA ya2;
        c01355a = this.A01.A00;
        c01355a.A05(true);
        c01355a2 = this.A01.A00;
        c01355a2.A02();
        c01355a3 = this.A01.A00;
        c01355a3.A03(0);
        for (C0939ah c0939ah : this.A00) {
            ya = this.A01.A01;
            UM A0K = UJ.A0K();
            c01355a4 = this.A01.A00;
            UJ uj = new UJ(ya, c0939ah, null, A0K, c01355a4.A01());
            if (uj.A0y() != null && uj.A0y().A0F() != null) {
                ((AbstractC0899a3) uj.A0y().A0F()).A00(uj);
            }
            c01355a5 = this.A01.A00;
            ya2 = this.A01.A01;
            c01355a5.A04(new NativeAd(ya2, uj));
        }
        C0487Jz.A00(new YZ(this));
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A00();
    }
}
