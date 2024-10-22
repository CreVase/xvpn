package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class EM extends ZP {
    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A03(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A05(View view) {
        return view.getMinimumHeight();
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A06(View view) {
        return view.getMinimumWidth();
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A0A(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public void A0C(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A0D(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A0G(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A0H(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A0I(View view) {
        return view.hasTransientState();
    }
}
