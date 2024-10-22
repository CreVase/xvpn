package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0936ae implements InterfaceC01505p {
    public final /* synthetic */ FA A00;
    public final /* synthetic */ boolean A01;

    public C0936ae(FA fa, boolean z) {
        this.A00 = fa;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAW() {
        YA ya;
        AtomicBoolean atomicBoolean;
        AnonymousClass15 anonymousClass15;
        YA ya2;
        C1C c1c;
        ya = this.A00.A04;
        if (!IP.A1S(ya) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass15 = this.A00.A01;
            anonymousClass15.ACn(this.A00);
            return;
        }
        FA fa = this.A00;
        ya2 = fa.A04;
        c1c = this.A00.A03;
        fa.A06 = C0598Oi.A01(ya2, (C0361Ey) c1c, 0, new C0937af(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAX() {
        AnonymousClass15 anonymousClass15;
        anonymousClass15 = this.A00.A01;
        anonymousClass15.ACq(this.A00, AdError.CACHE_ERROR);
    }
}
