package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0546Mi implements View.OnClickListener {
    public final /* synthetic */ C2K A00;
    public final /* synthetic */ MV A01;
    public final /* synthetic */ C0547Mj A02;

    public ViewOnClickListenerC0546Mi(C0547Mj c0547Mj, MV mv, C2K c2k) {
        this.A02 = c0547Mj;
        this.A01 = mv;
        this.A00 = c2k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MT mt;
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            mt = this.A02.A02;
            mt.ACF(this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
