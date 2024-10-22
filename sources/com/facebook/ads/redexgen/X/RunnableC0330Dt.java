package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0330Dt implements Runnable {
    public final /* synthetic */ RunnableC0332Dv A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC0330Dt(RunnableC0332Dv runnableC0332Dv, Throwable th) {
        this.A00 = runnableC0332Dv;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A0G;
        boolean A0F;
        boolean A0F2;
        if (K0.A02(this)) {
            return;
        }
        try {
            RunnableC0332Dv runnableC0332Dv = this.A00;
            Throwable th = this.A01;
            A0G = runnableC0332Dv.A0G(1, th != null ? 4 : 2, th);
            if (A0G) {
                return;
            }
            A0F = this.A00.A0F(6, 3);
            if (A0F) {
                return;
            }
            A0F2 = this.A00.A0F(7, 0);
            if (!A0F2) {
                throw new IllegalStateException();
            }
        } catch (Throwable th2) {
            K0.A00(th2, this);
        }
    }
}
