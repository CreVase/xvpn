package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class ER implements Runnable {
    public final /* synthetic */ BT A00;

    public ER(BT bt) {
        this.A00 = bt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC0778Vh interfaceC0778Vh;
        if (K0.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0G;
            if (!z) {
                interfaceC0778Vh = this.A00.A08;
                interfaceC0778Vh.AAx(this.A00);
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
