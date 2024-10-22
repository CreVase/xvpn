package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class VC implements InterfaceC0390Gb {
    public final InterfaceC0411Gy<? super VD> A00;

    public VC() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public VC(InterfaceC0411Gy<? super VD> interfaceC0411Gy) {
        this.A00 = interfaceC0411Gy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0390Gb
    public final InterfaceC0391Gc A4U() {
        return new VD(this.A00);
    }
}
