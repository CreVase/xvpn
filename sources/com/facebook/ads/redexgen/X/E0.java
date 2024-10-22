package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* loaded from: assets/audience_network.dex */
public final class E0 extends C0849Yd {
    public PY A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(NativeAdLayout nativeAdLayout, YA ya, NativeAd nativeAd, J6 j6) {
        C0572Ni c0572Ni = new C0572Ni(ya);
        MediaView mediaView = new MediaView(ya);
        AdOptionsView adOptionsView = new AdOptionsView(ya, nativeAd, nativeAdLayout);
        j6.A09(adOptionsView, 28);
        this.A00 = new C0671Rd(ya, nativeAd, j6, UJ.A0L(nativeAd.getInternalNativeAd()).A17(), c0572Ni, mediaView, adOptionsView);
        LV.A0M(nativeAdLayout, j6.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c0572Ni, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5O, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
