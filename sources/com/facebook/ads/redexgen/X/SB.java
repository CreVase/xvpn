package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SB implements NK {
    public final /* synthetic */ C8B A00;

    public SB(C8B c8b) {
        this.A00 = c8b;
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final void ABX(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z);
        this.A00.A05();
    }
}
