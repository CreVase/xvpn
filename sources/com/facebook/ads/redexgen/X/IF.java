package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public class IF implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ IK A01;

    public IF(IK ik, Format format) {
        this.A01 = ik;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IL il;
        if (K0.A02(this)) {
            return;
        }
        try {
            il = this.A01.A01;
            il.ADQ(this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
