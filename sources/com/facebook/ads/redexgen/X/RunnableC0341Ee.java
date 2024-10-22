package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0341Ee implements Runnable {
    public final /* synthetic */ C0346Ej A00;
    public final /* synthetic */ C0347Ek A01;
    public final /* synthetic */ C0348El A02;
    public final /* synthetic */ InterfaceC0349Em A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public RunnableC0341Ee(C0346Ej c0346Ej, InterfaceC0349Em interfaceC0349Em, C0347Ek c0347Ek, C0348El c0348El, IOException iOException, boolean z) {
        this.A00 = c0346Ej;
        this.A03 = interfaceC0349Em;
        this.A01 = c0347Ek;
        this.A02 = c0348El;
        this.A04 = iOException;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A03.ABt(this.A00.A00, this.A00.A01, this.A01, this.A02, this.A04, this.A05);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
