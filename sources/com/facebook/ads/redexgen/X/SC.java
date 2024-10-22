package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SC implements C5H {
    public final /* synthetic */ C8B A00;

    public SC(C8B c8b) {
        this.A00 = c8b;
    }

    @Override // com.facebook.ads.redexgen.X.C5H
    public final boolean A8k() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
