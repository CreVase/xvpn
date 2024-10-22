package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class NC implements Runnable {
    public final /* synthetic */ ND A00;
    public final /* synthetic */ NE A01;

    public NC(ND nd, NE ne) {
        this.A00 = nd;
        this.A01 = ne;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.AAY();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
