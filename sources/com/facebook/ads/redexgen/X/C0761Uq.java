package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0761Uq implements InterfaceC0996bj<IV, C0439Ia> {
    public C0758Un A00;

    public C0761Uq(C0758Un c0758Un) {
        this.A00 = c0758Un;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0996bj
    public final void A5X(C0993bg<IV, C0439Ia> c0993bg, InterfaceC0982bV interfaceC0982bV) {
        switch (IT.A00[interfaceC0982bV.A8A(c0993bg).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c0993bg, interfaceC0982bV);
                return;
            default:
                return;
        }
    }
}
