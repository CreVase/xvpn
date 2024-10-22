package com.facebook.ads.redexgen.X;

import android.content.Context;

/* loaded from: assets/audience_network.dex */
public final class VG implements InterfaceC0390Gb {
    public final Context A00;
    public final InterfaceC0390Gb A01;
    public final InterfaceC0411Gy<? super InterfaceC0391Gc> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public VG(Context context, InterfaceC0411Gy<? super InterfaceC0391Gc> interfaceC0411Gy, InterfaceC0390Gb interfaceC0390Gb) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0411Gy;
        this.A01 = interfaceC0390Gb;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public VG(Context context, String str, InterfaceC0411Gy<? super InterfaceC0391Gc> interfaceC0411Gy) {
        this(context, interfaceC0411Gy, new C2P(str, interfaceC0411Gy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0390Gb
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final VH A4U() {
        return new VH(this.A00, this.A02, this.A01.A4U());
    }
}
