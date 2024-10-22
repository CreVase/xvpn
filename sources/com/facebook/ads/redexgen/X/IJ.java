package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class IJ implements Runnable {
    public final /* synthetic */ C0272Au A00;
    public final /* synthetic */ IK A01;

    public IJ(IK ik, C0272Au c0272Au) {
        this.A01 = ik;
        this.A00 = c0272Au;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IL il;
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            il = this.A01.A01;
            il.ADL(this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
