package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0680Rm implements C5H {
    public final /* synthetic */ C5J A00;
    public final /* synthetic */ C7H A01;

    public C0680Rm(C7H c7h, C5J c5j) {
        this.A01 = c7h;
        this.A00 = c5j;
    }

    @Override // com.facebook.ads.redexgen.X.C5H
    public final boolean A8k() {
        boolean A0a;
        boolean A0b;
        if (!this.A01.A0Z()) {
            A0a = this.A01.A0a();
            if (A0a) {
                return true;
            }
            A0b = this.A01.A0b();
            return A0b;
        }
        this.A01.A0Y(this.A00);
        return true;
    }
}
