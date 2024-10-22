package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Bf {
    public final C0420Hh A00 = new C0420Hh(10);

    public final Metadata A00(InterfaceC0279Bb interfaceC0279Bb, DQ dq) throws IOException, InterruptedException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC0279Bb.ADl(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int A0G = this.A00.A0G();
                int peekedId3Bytes = C0789Vu.A03;
                if (A0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int framesLength = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    interfaceC0279Bb.ADl(bArr, 10, A0D);
                    metadata = new C0789Vu(dq).A0O(bArr, framesLength);
                } else {
                    interfaceC0279Bb.A3S(A0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC0279Bb.AEm();
        interfaceC0279Bb.A3S(tagLength);
        return metadata;
    }
}
