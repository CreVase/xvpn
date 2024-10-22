package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VW implements FW {
    public static String[] A02 = {"rC2J7AwmmaBlZB1ox11LDA9ZAB6fxVsC", "FZKyzMmy9TivpD2nKj9z4jyUnxaUeLwM", "SgCjuagBwk99AmsF9yO8OoMMvubs4clZ", "SMyqq5yIGtEsHah", "ZWugu9oJugVg9n7ZMlc8zaFASnxpD2Hj", "S8p9iTCEp8NZOaZR39SQR", "XhPs2dbFqyZTAL6Xfbqo6", "a7gb9qnnbjI1KAE"};
    public final long[] A00;
    public final FV[] A01;

    public VW(FV[] fvArr, long[] jArr) {
        this.A01 = fvArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final List<FV> A6T(long j) {
        int A0B = C0436Hx.A0B(this.A00, j, true, false);
        if (A0B != -1) {
            FV[] fvArr = this.A01;
            if (A02[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A02[1] = "utRrKVvY3UrlqyIa0tu41Z4MJfpwxdGA";
            FV fv = fvArr[A0B];
            if (fv != null) {
                return Collections.singletonList(fv);
            }
        }
        return Collections.emptyList();
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
