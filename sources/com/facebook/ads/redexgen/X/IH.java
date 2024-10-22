package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class IH implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ IK A04;

    public IH(IK ik, int i, int i2, int i3, float f) {
        this.A04 = ik;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IL il;
        if (K0.A02(this)) {
            return;
        }
        try {
            il = this.A04.A01;
            il.ADV(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
