package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0733To implements C5H {
    public final /* synthetic */ C0730Tl A00;

    public C0733To(C0730Tl c0730Tl) {
        this.A00 = c0730Tl;
    }

    @Override // com.facebook.ads.redexgen.X.C5H
    public final boolean A8k() {
        TJ tj;
        TJ tj2;
        tj = this.A00.A0B;
        if (tj.canGoBack()) {
            tj2 = this.A00.A0B;
            tj2.goBack();
            return true;
        }
        return false;
    }
}
