package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0255Ad extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ XL A01;

    public C0255Ad(XL xl, AudioTrack audioTrack) {
        this.A01 = xl;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (K0.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                conditionVariable = this.A01.A0f;
                conditionVariable.open();
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
