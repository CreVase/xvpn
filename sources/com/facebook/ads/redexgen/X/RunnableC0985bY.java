package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0985bY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0984bX A01;

    public RunnableC0985bY(C0984bX c0984bX, int i) {
        this.A01 = c0984bX;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC0683Rp interfaceC0683Rp;
        Handler handler;
        Runnable runnable;
        if (K0.A02(this)) {
            return;
        }
        try {
            z = this.A01.A01;
            if (z) {
                C0984bX c0984bX = this.A01;
                interfaceC0683Rp = c0984bX.A05;
                c0984bX.A04(interfaceC0683Rp.AAE());
                handler = this.A01.A04;
                runnable = this.A01.A09;
                handler.postDelayed(runnable, this.A00);
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
