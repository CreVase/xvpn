package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class IG implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IK A02;

    public IG(IK ik, int i, long j) {
        this.A02 = ik;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IL il;
        if (K0.A02(this)) {
            return;
        }
        try {
            il = this.A02.A01;
            il.ABD(this.A00, this.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
