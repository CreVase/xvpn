package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class IE implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IK A02;
    public final /* synthetic */ String A03;

    public IE(IK ik, String str, long j, long j2) {
        this.A02 = ik;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IL il;
        if (K0.A02(this)) {
            return;
        }
        try {
            il = this.A02.A01;
            il.ADK(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
