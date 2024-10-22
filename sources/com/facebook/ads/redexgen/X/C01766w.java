package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01766w extends L1 {
    public final /* synthetic */ K2 A00;

    public C01766w(K2 k2) {
        this.A00 = k2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(L2 l2) {
        RX rx;
        boolean z;
        Handler handler;
        boolean A0D;
        boolean z2;
        Handler handler2;
        int i;
        rx = this.A00.A01;
        if (rx == null) {
            return;
        }
        z = this.A00.A03;
        if (z || l2.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(Q5.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        handler2 = this.A00.A05;
        K3 k3 = new K3(this);
        i = this.A00.A00;
        handler2.postDelayed(k3, i);
    }
}
