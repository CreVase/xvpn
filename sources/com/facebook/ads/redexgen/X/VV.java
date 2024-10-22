package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VV implements FW {
    public final long[] A00;
    public final FV[] A01;

    public VV(FV[] fvArr, long[] jArr) {
        this.A01 = fvArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final List<FV> A6T(long j) {
        FV fv;
        int A0B = C0436Hx.A0B(this.A00, j, true, false);
        if (A0B == -1 || (fv = this.A01[A0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(fv);
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final long A6t(int i) {
        boolean z = true;
        HI.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        HI.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A6u() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A7L(long j) {
        int A0A = C0436Hx.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
