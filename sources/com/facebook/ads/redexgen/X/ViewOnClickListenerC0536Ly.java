package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0536Ly implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC0536Ly(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0529Lr interfaceC0529Lr;
        ME me;
        InterfaceC0529Lr interfaceC0529Lr2;
        if (K0.A02(this)) {
            return;
        }
        try {
            interfaceC0529Lr = this.A00.A02;
            if (interfaceC0529Lr != null) {
                me = this.A00.A07;
                if (me.A04()) {
                    interfaceC0529Lr2 = this.A00.A02;
                    interfaceC0529Lr2.AAr();
                }
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
