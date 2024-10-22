package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class IK {
    public final Handler A00;
    public final IL A01;

    public IK(Handler handler, IL il) {
        this.A00 = il != null ? (Handler) HI.A01(handler) : null;
        this.A01 = il;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new IH(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new IG(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new II(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new IF(this, format));
        }
    }

    public final void A05(C0272Au c0272Au) {
        if (this.A01 != null) {
            this.A00.post(new IJ(this, c0272Au));
        }
    }

    public final void A06(C0272Au c0272Au) {
        if (this.A01 != null) {
            this.A00.post(new ID(this, c0272Au));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new IE(this, str, j, j2));
        }
    }
}
