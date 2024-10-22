package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0934ac implements InterfaceC01505p {
    public final /* synthetic */ FA A00;

    public C0934ac(FA fa) {
        this.A00 = fa;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAW() {
        AtomicBoolean atomicBoolean;
        AnonymousClass15 anonymousClass15;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass15 = this.A00.A01;
        anonymousClass15.ACn(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAX() {
        AnonymousClass15 anonymousClass15;
        anonymousClass15 = this.A00.A01;
        anonymousClass15.ACq(this.A00, AdError.CACHE_ERROR);
    }
}
