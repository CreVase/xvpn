package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0567Nd implements View.OnClickListener {
    public final /* synthetic */ C0570Ng A00;

    public ViewOnClickListenerC0567Nd(C0570Ng c0570Ng) {
        this.A00 = c0570Ng;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0569Nf interfaceC0569Nf;
        AbstractC0530Ls abstractC0530Ls;
        View[] viewArr;
        RX rx;
        RX rx2;
        RX rx3;
        AbstractC0530Ls abstractC0530Ls2;
        if (K0.A02(this)) {
            return;
        }
        try {
            interfaceC0569Nf = this.A00.A04;
            interfaceC0569Nf.ABz();
            abstractC0530Ls = this.A00.A00;
            if (abstractC0530Ls != null) {
                abstractC0530Ls2 = this.A00.A00;
                LV.A0L(abstractC0530Ls2);
            }
            viewArr = this.A00.A06;
            for (View view2 : viewArr) {
                LV.A0N(view2, 0);
            }
            LV.A0J(this.A00);
            rx = this.A00.A05;
            if (rx == null) {
                return;
            }
            rx2 = this.A00.A05;
            LV.A0N(rx2, 0);
            rx3 = this.A00.A05;
            rx3.A0b(EnumC0625Pj.A02, 14);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
