package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MO implements View.OnClickListener {
    public final /* synthetic */ MQ A00;

    public MO(MQ mq) {
        this.A00 = mq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MT mt;
        if (K0.A02(this)) {
            return;
        }
        try {
            mt = this.A00.A04;
            mt.A99();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
