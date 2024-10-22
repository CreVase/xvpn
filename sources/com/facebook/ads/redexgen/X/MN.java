package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MN implements View.OnClickListener {
    public final /* synthetic */ MQ A00;

    public MN(MQ mq) {
        this.A00 = mq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        MT mt;
        MT mt2;
        if (K0.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                mt2 = this.A00.A04;
                mt2.A4I();
            } else {
                mt = this.A00.A04;
                mt.A4J();
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
