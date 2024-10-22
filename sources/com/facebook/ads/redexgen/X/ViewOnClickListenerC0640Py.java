package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0640Py implements View.OnClickListener {
    public final /* synthetic */ C0480Jr A00;

    public ViewOnClickListenerC0640Py(C0480Jr c0480Jr) {
        this.A00 = c0480Jr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0452In c0452In;
        YA ya;
        RX rx;
        boolean A07;
        RX rx2;
        RX rx3;
        if (K0.A02(this)) {
            return;
        }
        try {
            c0452In = this.A00.A03;
            c0452In.A04(EnumC0451Im.A0d, null);
            ya = this.A00.A02;
            ya.A0E().A37();
            rx = this.A00.A00;
            if (rx != null) {
                A07 = this.A00.A07();
                if (A07) {
                    rx3 = this.A00.A00;
                    rx3.setVolume(1.0f);
                } else {
                    rx2 = this.A00.A00;
                    rx2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
