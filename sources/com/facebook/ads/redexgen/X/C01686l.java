package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01686l extends L1 {
    public final /* synthetic */ C0482Ju A00;

    public C01686l(C0482Ju c0482Ju) {
        this.A00 = c0482Ju;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(L2 l2) {
        RX rx;
        Handler handler;
        rx = this.A00.A01;
        if (rx == null || l2.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C0636Pu(this));
    }
}
