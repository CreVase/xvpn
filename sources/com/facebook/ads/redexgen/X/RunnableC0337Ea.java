package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0337Ea implements Runnable {
    public final /* synthetic */ C0346Ej A00;
    public final /* synthetic */ InterfaceC0349Em A01;

    public RunnableC0337Ea(C0346Ej c0346Ej, InterfaceC0349Em interfaceC0349Em) {
        this.A00 = c0346Ej;
        this.A01 = interfaceC0349Em;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.AC5(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
