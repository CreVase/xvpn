package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0670Rc extends K8 {
    public final /* synthetic */ C0616Pa A00;

    public C0670Rc(C0616Pa c0616Pa) {
        this.A00 = c0616Pa;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        RX rx;
        AbstractC0576Nm abstractC0576Nm;
        MU mu;
        AbstractC0591Ob abstractC0591Ob;
        rx = this.A00.A02;
        C8Z<AbstractC02028a, C8Y> eventBus = rx.getEventBus();
        abstractC0576Nm = this.A00.A04;
        mu = this.A00.A05;
        abstractC0591Ob = this.A00.A03;
        eventBus.A04(abstractC0576Nm, mu, abstractC0591Ob);
    }
}
