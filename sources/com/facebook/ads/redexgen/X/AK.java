package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AK implements Runnable {
    public final /* synthetic */ AQ A00;
    public final /* synthetic */ C0272Au A01;

    public AK(AQ aq, C0272Au c0272Au) {
        this.A00 = aq;
        this.A01 = c0272Au;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AR ar;
        if (K0.A02(this)) {
            return;
        }
        try {
            ar = this.A00.A01;
            ar.AAb(this.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
