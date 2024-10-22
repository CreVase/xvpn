package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0947ap implements InterfaceC01505p {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0942ak A01;
    public final /* synthetic */ C0942ak A02;
    public final /* synthetic */ C8G A03;

    public C0947ap(C0942ak c0942ak, int i, C8G c8g, C0942ak c0942ak2) {
        this.A01 = c0942ak;
        this.A00 = i;
        this.A03 = c8g;
        this.A02 = c0942ak2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAW() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAX() {
        InterfaceC00300w interfaceC00300w;
        interfaceC00300w = this.A01.A00;
        interfaceC00300w.ABm(this.A02, JG.A00(AdErrorType.NO_FILL));
    }
}
