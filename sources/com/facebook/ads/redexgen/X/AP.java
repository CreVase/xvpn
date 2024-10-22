package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AQ A01;

    public AP(AQ aq, int i) {
        this.A01 = aq;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AR ar;
        if (K0.A02(this)) {
            return;
        }
        try {
            ar = this.A01.A01;
            ar.AAd(this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
