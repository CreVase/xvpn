package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ds, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0329Ds implements Runnable {
    public final /* synthetic */ RunnableC0332Dv A00;

    public RunnableC0329Ds(RunnableC0332Dv runnableC0332Dv) {
        this.A00 = runnableC0332Dv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
