package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0538Ma implements View.OnClickListener {
    public final /* synthetic */ TN A00;

    public ViewOnClickListenerC0538Ma(TN tn) {
        this.A00 = tn;
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
