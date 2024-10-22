package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Rb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0669Rb extends K8 {
    public final /* synthetic */ RX A00;

    public C0669Rb(RX rx) {
        this.A00 = rx;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        boolean z;
        C8Z c8z;
        Handler handler;
        int i;
        z = this.A00.A03;
        if (!z) {
            c8z = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c8z.A02(new P7(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.71
            });
            handler = this.A00.A07;
            i = this.A00.A00;
            handler.postDelayed(this, i);
        }
    }
}
