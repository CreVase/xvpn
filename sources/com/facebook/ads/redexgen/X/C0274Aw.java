package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0274Aw extends Thread {
    public final /* synthetic */ XC A00;

    public C0274Aw(XC xc) {
        this.A00 = xc;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
