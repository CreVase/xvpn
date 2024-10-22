package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0637Pv extends AnimatorListenerAdapter {
    public final /* synthetic */ C0482Ju A00;

    public C0637Pv(C0482Ju c0482Ju) {
        this.A00 = c0482Ju;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
