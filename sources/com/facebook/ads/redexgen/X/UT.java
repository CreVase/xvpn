package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UT extends AbstractC00230p {
    public static byte[] A01;
    public final /* synthetic */ UJ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public UT(UJ uj) {
        this.A00 = uj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0B(C0939ah c0939ah) {
        this.A00.A1T(c0939ah);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0C() {
        UI ui;
        UI ui2;
        ui = this.A00.A0G;
        if (ui != null) {
            ui2 = this.A00.A0G;
            ui2.AAN();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0F(InterfaceC00220o interfaceC00220o) {
        C0351Eo c0351Eo;
        C0351Eo c0351Eo2;
        c0351Eo = this.A00.A0A;
        if (c0351Eo != null) {
            c0351Eo2 = this.A00.A0A;
            c0351Eo2.A0I();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0G(JG jg) {
        long j;
        UI ui;
        UI ui2;
        C0S A0E = this.A00.A11().A0E();
        j = this.A00.A00;
        A0E.A2i(LM.A01(j), jg.A03().getErrorCode(), jg.A04());
        ui = this.A00.A0G;
        if (ui != null) {
            ui2 = this.A00.A0G;
            ui2.ABH(jg);
        }
    }
}
