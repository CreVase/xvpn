package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class V5 implements InterfaceC0391Gc {
    public final int A00;
    public final InterfaceC0391Gc A01;
    public final C0424Hl A02;

    public V5(InterfaceC0391Gc interfaceC0391Gc, C0424Hl c0424Hl, int i) {
        this.A01 = (InterfaceC0391Gc) HI.A01(interfaceC0391Gc);
        this.A02 = (C0424Hl) HI.A01(c0424Hl);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final Uri A85() {
        return this.A01.A85();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final long ADb(C0395Gg c0395Gg) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADb(c0395Gg);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
