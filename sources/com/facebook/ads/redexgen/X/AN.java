package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AQ A03;

    public AN(AQ aq, int i, long j, long j2) {
        this.A03 = aq;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AR ar;
        if (K0.A02(this)) {
            return;
        }
        try {
            ar = this.A03.A01;
            ar.AAe(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
