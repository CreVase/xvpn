package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EQ implements Runnable {
    public final /* synthetic */ BT A00;

    public EQ(BT bt) {
        this.A00 = bt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
