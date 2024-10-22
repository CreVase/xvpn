package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0548Mk implements View.OnClickListener {
    public final /* synthetic */ TM A00;

    public ViewOnClickListenerC0548Mk(TM tm) {
        this.A00 = tm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8F();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
