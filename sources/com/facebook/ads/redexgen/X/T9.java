package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class T9 extends K8 {
    public final /* synthetic */ NJ A00;

    public T9(NJ nj) {
        this.A00 = nj;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (z) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
