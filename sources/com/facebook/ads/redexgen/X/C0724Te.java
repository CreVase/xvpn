package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Te, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0724Te implements InterfaceC0500Km {
    public static String[] A02 = {"loUGRX1wFwfO8pi8DgxPrGsPJe85sO42", "t9Fx4", "3oarn8HbUVUj6u6EULIVhfy23k9jn", "", "MOoTM", "MayuUyWiOMYLrKJeDUJbe9Zh46", "X9niQtR04keYRbnSLMpJZHmvyyUcrdIf", "5gFPyDfRsmHweMwy7A1yA2IFiPZ"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC0723Td A01;

    public C0724Te(AbstractC0723Td abstractC0723Td, int i) {
        this.A01 = abstractC0723Td;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void AAv() {
        InterfaceC0531Lt interfaceC0531Lt;
        this.A01.A03 = false;
        this.A01.A0U();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07) {
            PU pu = this.A01.A06;
            if (A02[2].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "KtnVXPQG8pyake3V1oVxr2XzOzf";
            strArr[3] = "";
            if (pu != null) {
                this.A01.A06.A05();
                interfaceC0531Lt = this.A01.A09;
                interfaceC0531Lt.A3z(new TQ().A5o());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void ACZ(float f) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
