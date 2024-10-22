package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network.dex */
public class S8 extends K8 {
    public final /* synthetic */ P2 A00;
    public final /* synthetic */ P3 A01;

    public S8(P3 p3, P2 p2) {
        this.A01 = p3;
        this.A00 = p2;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new S9(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
