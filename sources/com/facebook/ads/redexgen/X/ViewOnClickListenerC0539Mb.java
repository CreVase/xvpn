package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0539Mb implements View.OnClickListener {
    public final /* synthetic */ MV A00;
    public final /* synthetic */ TN A01;

    public ViewOnClickListenerC0539Mb(TN tn, MV mv) {
        this.A01 = tn;
        this.A00 = mv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AC6(C2I.A03);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
