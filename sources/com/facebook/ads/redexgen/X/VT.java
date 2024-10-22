package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VT implements FW {
    public static final VT A01 = new VT();
    public final List<FV> A00;

    public VT() {
        this.A00 = Collections.emptyList();
    }

    public VT(FV fv) {
        this.A00 = Collections.singletonList(fv);
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final List<FV> A6T(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final long A6t(int i) {
        HI.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A6u() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A7L(long j) {
        return j < 0 ? 0 : -1;
    }
}
