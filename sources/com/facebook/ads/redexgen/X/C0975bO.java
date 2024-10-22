package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0975bO {
    public final C0986bZ A00;
    public final C0984bX A01;

    public C0975bO(AbstractC0991be abstractC0991be, C0984bX c0984bX, C0986bZ c0986bZ) {
        this.A00 = c0986bZ;
        this.A01 = c0984bX;
        abstractC0991be.A02(new C0363Fa(c0984bX));
    }

    public static C0975bO A00(AbstractC0991be abstractC0991be, InterfaceC0995bi interfaceC0995bi, InterfaceC0385Fw interfaceC0385Fw) {
        C0986bZ c0986bZ = new C0986bZ();
        C0984bX viewpointScanner = new C0984bX(interfaceC0995bi, new G2(), interfaceC0385Fw, c0986bZ, new Handler(Looper.getMainLooper()));
        return new C0975bO(abstractC0991be, viewpointScanner, c0986bZ);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C0993bg c0993bg) {
        this.A00.A02(view, c0993bg);
    }

    public final void A03(InterfaceC0990bd interfaceC0990bd) {
        this.A01.A09(interfaceC0990bd);
    }

    public final void A04(InterfaceC0988bb interfaceC0988bb) {
        this.A01.A0A(interfaceC0988bb);
    }
}
