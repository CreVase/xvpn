package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0344Eh implements Runnable {
    public final /* synthetic */ C0346Ej A00;
    public final /* synthetic */ C0348El A01;
    public final /* synthetic */ InterfaceC0349Em A02;

    public RunnableC0344Eh(C0346Ej c0346Ej, InterfaceC0349Em interfaceC0349Em, C0348El c0348El) {
        this.A00 = c0346Ej;
        this.A02 = interfaceC0349Em;
        this.A01 = c0348El;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A02.AB8(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
