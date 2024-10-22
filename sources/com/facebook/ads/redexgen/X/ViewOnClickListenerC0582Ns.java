package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0582Ns implements View.OnClickListener {
    public final /* synthetic */ T3 A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC0582Ns(T3 t3, String str) {
        this.A00 = t3;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
