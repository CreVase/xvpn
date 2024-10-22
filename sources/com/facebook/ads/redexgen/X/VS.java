package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VS implements FW {
    public static String[] A01 = {"HW2qPt5u", "AwGYl2mpYTTxi9jMk2ztyBHwHH9P0uOm", "ziApCMCdbQMQdjd0mTARuvEC3B", "RZTttmRl2v5Rh0lD63G6fj8mov5GfzUW", "CAabTzRSjKw", "MBUj6", "1ELfNFRtAis", "0tjH0VZdGvNSLcI7F3HjH1zffCsfPrCD"};
    public final List<FV> A00;

    public VS(List<FV> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final List<FV> A6T(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final long A6t(int i) {
        HI.A03(i == 0);
        if (A01[2].length() == 12) {
            throw new RuntimeException();
        }
        A01[2] = "5DVkB5gcIO90TUIp";
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
