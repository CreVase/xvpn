package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class UW implements InterfaceC0462Ix {
    public WeakReference<UJ> A00;

    public UW(UJ uj) {
        this.A00 = new WeakReference<>(uj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0462Ix
    public final void ACK(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z, false);
        }
    }
}
