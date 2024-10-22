package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class BS extends AbstractC0784Vn implements ET {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0281Bd A05;
    public final InterfaceC0390Gb A06;
    public final Object A07;
    public final String A08;

    public BS(Uri uri, InterfaceC0390Gb interfaceC0390Gb, InterfaceC0281Bd interfaceC0281Bd, int i, String str, int i2, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0390Gb;
        this.A05 = interfaceC0281Bd;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new C0775Ve(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0784Vn
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0784Vn
    public final void A03(XT xt, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.EY
    public final InterfaceC0777Vg A4g(EW ew, GU gu) {
        HI.A03(ew.A02 == 0);
        return new BT(this.A04, this.A06.A4U(), this.A05.A4Y(), this.A03, A00(ew), this, gu, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.EY
    public final void AA4() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final void ACy(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.EY
    public final void AET(InterfaceC0777Vg interfaceC0777Vg) {
        ((BT) interfaceC0777Vg).A0R();
    }
}
