package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0555Mr implements View.OnClickListener {
    public final /* synthetic */ C0560Mw A00;

    public ViewOnClickListenerC0555Mr(C0560Mw c0560Mw) {
        this.A00 = c0560Mw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0559Mv interfaceC0559Mv;
        InterfaceC0559Mv interfaceC0559Mv2;
        if (K0.A02(this)) {
            return;
        }
        try {
            interfaceC0559Mv = this.A00.A04;
            if (interfaceC0559Mv == null) {
                return;
            }
            interfaceC0559Mv2 = this.A00.A04;
            interfaceC0559Mv2.AAr();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
