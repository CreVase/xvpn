package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0741Tw implements LB {
    public int A00;
    public final LB A01;

    public C0741Tw(LB lb, int i) {
        this.A01 = lb;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void ADy(String str) {
        if (this.A00 > 0) {
            this.A01.ADy(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void flush() {
        this.A01.flush();
    }
}
