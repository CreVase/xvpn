package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OG implements View.OnClickListener {
    public final /* synthetic */ C0705Sl A00;

    public OG(C0705Sl c0705Sl) {
        this.A00 = c0705Sl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC00150g abstractC00150g;
        AbstractC0924aS abstractC0924aS;
        Handler handler;
        Runnable runnable;
        AbstractC0924aS abstractC0924aS2;
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A0P = true;
            z = this.A00.A0O;
            if (!z) {
                C0705Sl c0705Sl = this.A00;
                abstractC00150g = c0705Sl.A0d;
                c0705Sl.A0c(((FH) abstractC00150g).A0G().toString());
                abstractC0924aS = this.A00.A0G;
                if (abstractC0924aS.A0H() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0j;
                    abstractC0924aS2 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC0924aS2.A0H());
                }
            }
            C0705Sl c0705Sl2 = this.A00;
            z2 = c0705Sl2.A0O;
            c0705Sl2.A0f(z2 ? false : true);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
