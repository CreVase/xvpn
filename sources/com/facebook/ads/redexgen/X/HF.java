package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class HF extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C0767Uw A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HF(C0767Uw c0767Uw, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c0767Uw;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A04();
                } finally {
                    th = th;
                    while (true) {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            K0.A00(th2, this);
        }
    }
}
