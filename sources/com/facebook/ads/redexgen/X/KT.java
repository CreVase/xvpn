package com.facebook.ads.redexgen.X;

import android.app.Activity;

/* loaded from: assets/audience_network.dex */
public final class KT {
    public static final KT A04 = new KT(new U3(), new U2());
    public final KS A02;
    public final LL A03;
    public boolean A01 = true;
    public long A00 = -1;

    public KT(LL ll, KS ks) {
        this.A03 = ll;
        this.A02 = ks;
    }

    public static KT A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A4w();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A79();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (KT.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A4w() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
