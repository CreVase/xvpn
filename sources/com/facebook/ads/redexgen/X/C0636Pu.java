package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0636Pu extends AnimatorListenerAdapter {
    public final /* synthetic */ C01686l A00;

    public C0636Pu(C01686l c01686l) {
        this.A00 = c01686l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0485Jx(this), 2000L);
    }
}
