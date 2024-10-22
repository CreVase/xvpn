package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class AQ {
    public final Handler A00;
    public final AR A01;

    public AQ(Handler handler, AR ar) {
        this.A00 = ar != null ? (Handler) HI.A01(handler) : null;
        this.A01 = ar;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new AP(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new AN(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new AM(this, format));
        }
    }

    public final void A04(C0272Au c0272Au) {
        if (this.A01 != null) {
            this.A00.post(new AO(this, c0272Au));
        }
    }

    public final void A05(C0272Au c0272Au) {
        if (this.A01 != null) {
            this.A00.post(new AK(this, c0272Au));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new AL(this, str, j, j2));
        }
    }
}
