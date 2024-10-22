package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.aK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0916aK implements InterfaceC01505p {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC0924aS A00;
    public final /* synthetic */ InterfaceC00381e A01;
    public final /* synthetic */ C00391f A02;
    public final /* synthetic */ YA A03;
    public final /* synthetic */ boolean A04;

    public C0916aK(C00391f c00391f, YA ya, boolean z, AbstractC0924aS abstractC0924aS, InterfaceC00381e interfaceC00381e) {
        this.A02 = c00391f;
        this.A03 = ya;
        this.A04 = z;
        this.A00 = abstractC0924aS;
        this.A01 = interfaceC00381e;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAW() {
        ArrayList arrayList;
        if (IP.A1P(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(C0598Oi.A01(this.A03, this.A00, 1, new C0917aL(this)));
            return;
        }
        InterfaceC00381e interfaceC00381e = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC00381e.AAQ();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAX() {
        this.A01.AAP(AdError.CACHE_ERROR);
    }
}
