package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PD implements View.OnClickListener {
    public final /* synthetic */ PE A00;

    public PD(PE pe) {
        this.A00 = pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6E c6e;
        if (K0.A02(this)) {
            return;
        }
        try {
            c6e = this.A00.A05;
            c6e.performClick();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
