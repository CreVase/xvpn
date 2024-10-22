package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0745Ua implements InterfaceC0464Iz {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ UV A01;

    public C0745Ua(UV uv, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = uv;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0464Iz
    public final void AFI() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0464Iz
    public final void AFN(NativeAd nativeAd) {
        this.A01.A0I(UJ.A0L(nativeAd.getInternalNativeAd()), new UW(UJ.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0464Iz
    public final void AG2() {
        this.A01.A0D();
    }
}
