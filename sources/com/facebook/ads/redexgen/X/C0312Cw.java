package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0312Cw {
    public final int A00;
    public final long A01;

    public C0312Cw(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0312Cw A00(InterfaceC0279Bb interfaceC0279Bb, C0420Hh c0420Hh) throws IOException, InterruptedException {
        interfaceC0279Bb.ADl(c0420Hh.A00, 0, 8);
        c0420Hh.A0Y(0);
        int A08 = c0420Hh.A08();
        long size = c0420Hh.A0K();
        return new C0312Cw(A08, size);
    }
}
