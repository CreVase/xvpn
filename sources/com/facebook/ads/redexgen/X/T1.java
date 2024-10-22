package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T1 extends K8 {
    public final /* synthetic */ C0564Na A00;

    public T1(C0564Na c0564Na) {
        this.A00 = c0564Na;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        C0564Na c0564Na = this.A00;
        runnable = c0564Na.A08;
        i = this.A00.A07;
        c0564Na.postOnAnimationDelayed(runnable, i);
    }
}
