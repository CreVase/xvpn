package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.2P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2P extends AbstractC0265An {
    public final int A00;
    public final int A01;
    public final InterfaceC0411Gy<? super InterfaceC0391Gc> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C2P(String str, InterfaceC0411Gy<? super InterfaceC0391Gc> interfaceC0411Gy) {
        this(str, interfaceC0411Gy, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C2P(String str, InterfaceC0411Gy<? super InterfaceC0391Gc> interfaceC0411Gy, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC0411Gy;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0265An
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0273Av A01(C0400Gn c0400Gn) {
        return new C0273Av(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0400Gn);
    }
}
