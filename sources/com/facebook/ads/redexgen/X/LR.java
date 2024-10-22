package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public final class LR {
    public static EnumC0625Pj A00(VideoStartReason videoStartReason) {
        switch (LQ.A00[videoStartReason.ordinal()]) {
            case 1:
                return EnumC0625Pj.A02;
            case 2:
                return EnumC0625Pj.A03;
            case 3:
                return EnumC0625Pj.A04;
            default:
                return EnumC0625Pj.A03;
        }
    }
}
