package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TV implements PL {
    public static byte[] A01;
    public final /* synthetic */ TU A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{29, 27, 13, 26, 11, 4, 1, 11, 3};
    }

    public TV(TU tu) {
        this.A00 = tu;
    }

    public /* synthetic */ TV(TU tu, C0722Tc c0722Tc) {
        this(tu);
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void AAy() {
        this.A00.A0X(true, A00(0, 9, 55));
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void ABZ() {
        AbstractC0924aS abstractC0924aS;
        InterfaceC0531Lt interfaceC0531Lt;
        MM mm;
        InterfaceC0444If interfaceC0444If;
        AbstractC0924aS abstractC0924aS2;
        PN pn;
        PN pn2;
        AbstractC0924aS abstractC0924aS3;
        YA ya;
        AbstractC0924aS abstractC0924aS4;
        YA ya2;
        abstractC0924aS = this.A00.A0G;
        if (!TextUtils.isEmpty(abstractC0924aS.A11())) {
            interfaceC0444If = this.A00.A0K;
            abstractC0924aS2 = this.A00.A0G;
            String A11 = abstractC0924aS2.A11();
            NL nl = new NL();
            pn = this.A00.A07;
            NL A03 = nl.A03(pn.getViewabilityChecker());
            pn2 = this.A00.A07;
            interfaceC0444If.A9S(A11, A03.A02(pn2.getTouchDataRecorder()).A05());
            abstractC0924aS3 = this.A00.A0G;
            C1R A0x = abstractC0924aS3.A0x();
            ya = this.A00.A0J;
            C1R.A07(A0x, ya);
            abstractC0924aS4 = this.A00.A0G;
            C2C.A00(abstractC0924aS4.A0M());
            ya2 = this.A00.A0J;
            ya2.A0E().A2g();
        }
        interfaceC0531Lt = this.A00.A0O;
        mm = this.A00.A0P;
        interfaceC0531Lt.A3z(mm.A74());
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void ABu() {
        InterfaceC0531Lt interfaceC0531Lt;
        MM mm;
        interfaceC0531Lt = this.A00.A0O;
        mm = this.A00.A0P;
        interfaceC0531Lt.A3z(mm.A6r());
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void ADZ() {
        InterfaceC0531Lt interfaceC0531Lt;
        interfaceC0531Lt = this.A00.A0O;
        interfaceC0531Lt.AAl(15);
    }
}
