package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EZ implements Runnable {
    public final /* synthetic */ C0346Ej A00;
    public final /* synthetic */ InterfaceC0349Em A01;

    public EZ(C0346Ej c0346Ej, InterfaceC0349Em interfaceC0349Em) {
        this.A00 = c0346Ej;
        this.A01 = interfaceC0349Em;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.AC4(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
