package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class GI implements InterfaceC0650Qi {
    public final /* synthetic */ C00993p A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public GI(C00993p c00993p, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c00993p;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650Qi
    public final void AAu(InterfaceC0648Qg interfaceC0648Qg) {
        C00993p.A06(interfaceC0648Qg.A64(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650Qi
    public final void ABI(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
