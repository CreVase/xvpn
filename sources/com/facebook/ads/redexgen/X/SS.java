package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SS implements NK {
    public final /* synthetic */ SQ A00;

    public SS(SQ sq) {
        this.A00 = sq;
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final void ABX(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(z);
        this.A00.A07();
    }
}
