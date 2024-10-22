package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0918aM implements InterfaceC00381e {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC0924aS A01;
    public final /* synthetic */ C0922aQ A02;
    public final /* synthetic */ InterfaceC00381e A03;
    public final /* synthetic */ C00391f A04;
    public final /* synthetic */ YA A05;
    public final /* synthetic */ EnumSet A06;

    public C0918aM(C00391f c00391f, YA ya, AbstractC0924aS abstractC0924aS, C0922aQ c0922aQ, int i, InterfaceC00381e interfaceC00381e, EnumSet enumSet) {
        this.A04 = c00391f;
        this.A05 = ya;
        this.A01 = abstractC0924aS;
        this.A02 = c0922aQ;
        this.A00 = i;
        this.A03 = interfaceC00381e;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0q()) {
            return;
        }
        C00391f c00391f = this.A04;
        YA ya = this.A05;
        EnumSet enumSet = this.A06;
        C0922aQ c0922aQ = this.A02;
        c00391f.A0A(ya, enumSet, c0922aQ, c0922aQ.A0t(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00381e
    public final void AAP(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAP(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00381e
    public final void AAQ() {
        this.A05.A00().AF6(this.A01.A11(), this.A02.A0u());
        if (this.A00 == 0) {
            this.A03.AAQ();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00381e
    public final void AEL() {
        if (this.A00 == 0) {
            this.A03.AEL();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00381e
    public final void AG1() {
        if (this.A00 == 0) {
            this.A03.AG1();
        }
    }
}
