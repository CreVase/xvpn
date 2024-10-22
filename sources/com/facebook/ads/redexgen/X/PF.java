package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PF implements View.OnClickListener {
    public final /* synthetic */ PI A00;

    public PF(PI pi) {
        this.A00 = pi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PH ph;
        PG pg;
        if (K0.A02(this)) {
            return;
        }
        try {
            ph = this.A00.A02;
            pg = this.A00.A01;
            ph.AD6(pg);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
