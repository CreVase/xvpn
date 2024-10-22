package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0914aI implements C6I {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC0924aS A00;
    public final /* synthetic */ InterfaceC00381e A01;
    public final /* synthetic */ C00391f A02;
    public final /* synthetic */ YA A03;
    public final /* synthetic */ boolean A04;

    public C0914aI(C00391f c00391f, YA ya, boolean z, AbstractC0924aS abstractC0924aS, InterfaceC00381e interfaceC00381e) {
        this.A02 = c00391f;
        this.A03 = ya;
        this.A04 = z;
        this.A00 = abstractC0924aS;
        this.A01 = interfaceC00381e;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            YA ya = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (IP.A1P(ya) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(C0598Oi.A01(this.A03, this.A00, 1, new C0915aJ(this)));
                return;
            } else {
                this.A01.AAQ();
                return;
            }
        }
        this.A01.AAP(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A00(true);
    }
}
