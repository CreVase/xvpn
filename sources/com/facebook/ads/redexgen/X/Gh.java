package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Gh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ VI A03;

    public Gh(VI vi, int i, long j, long j2) {
        this.A03 = vi;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GW gw;
        if (K0.A02(this)) {
            return;
        }
        try {
            gw = this.A03.A07;
            gw.AAh(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
