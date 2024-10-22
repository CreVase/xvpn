package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC0288Bm {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final void A5j(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final int AEq(InterfaceC0279Bb interfaceC0279Bb, int i, boolean z) throws IOException, InterruptedException {
        int AFb = interfaceC0279Bb.AFb(i);
        if (AFb == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AFb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final void AEr(C0420Hh c0420Hh, int i) {
        c0420Hh.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0288Bm
    public final void AEs(long j, int i, int i2, int i3, C0287Bl c0287Bl) {
    }
}
