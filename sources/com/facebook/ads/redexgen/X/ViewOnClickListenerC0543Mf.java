package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0543Mf implements View.OnClickListener {
    public final /* synthetic */ C2K A00;
    public final /* synthetic */ MV A01;
    public final /* synthetic */ TN A02;

    public ViewOnClickListenerC0543Mf(TN tn, MV mv, C2K c2k) {
        this.A02 = tn;
        this.A01 = mv;
        this.A00 = c2k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ACF(this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
