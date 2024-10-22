package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0339Ec implements Runnable {
    public final /* synthetic */ C0346Ej A00;
    public final /* synthetic */ C0347Ek A01;
    public final /* synthetic */ C0348El A02;
    public final /* synthetic */ InterfaceC0349Em A03;

    public RunnableC0339Ec(C0346Ej c0346Ej, InterfaceC0349Em interfaceC0349Em, C0347Ek c0347Ek, C0348El c0348El) {
        this.A00 = c0346Ej;
        this.A03 = interfaceC0349Em;
        this.A01 = c0347Ek;
        this.A02 = c0348El;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A03.ABq(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
