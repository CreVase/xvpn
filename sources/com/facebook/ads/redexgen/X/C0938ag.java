package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0938ag implements C6I {
    public final /* synthetic */ FA A00;

    public C0938ag(FA fa) {
        this.A00 = fa;
    }

    private void A00(boolean z) {
        AnonymousClass15 anonymousClass15;
        AtomicBoolean atomicBoolean;
        AnonymousClass15 anonymousClass152;
        if (!z) {
            anonymousClass15 = this.A00.A01;
            anonymousClass15.ACq(this.A00, AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass152 = this.A00.A01;
            anonymousClass152.ACn(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A00(true);
    }
}
