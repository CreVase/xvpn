package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0256Ae extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ XL A01;

    public C0256Ae(XL xl, AudioTrack audioTrack) {
        this.A01 = xl;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
