package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0545Mh implements View.OnClickListener {
    public final /* synthetic */ C0547Mj A00;

    public ViewOnClickListenerC0545Mh(C0547Mj c0547Mj) {
        this.A00 = c0547Mj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MT mt;
        if (K0.A02(this)) {
            return;
        }
        try {
            mt = this.A00.A02;
            mt.A8F();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
