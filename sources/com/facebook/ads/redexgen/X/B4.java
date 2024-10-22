package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class B4 implements Runnable {
    public final /* synthetic */ B7 A00;
    public final /* synthetic */ B8 A01;

    public B4(B7 b7, B8 b8) {
        this.A00 = b7;
        this.A01 = b8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.ABB();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
