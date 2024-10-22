package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class JE {
    public final JC A0B;
    public final boolean A0F;
    public final String A0C = JE.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<JD> A0D = new LinkedList();

    public JE(C7S c7s, JC jc) {
        int nativeViewabilityHistorySamplingRate = IR.A0D(c7s);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c7s.A08().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = jc;
    }

    private int A00() {
        return this.A0B.A6W();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(JD jd) {
        synchronized (this.A0D) {
            this.A0D.add(jd);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new JD(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 102, A00(), null));
    }

    public final void A0C(C7S c7s, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new JD(A01(), 103, A00(), null));
        ExecutorC0512La.A06.execute(new JB(this, str, c7s));
    }
}
