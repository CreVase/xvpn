package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: assets/audience_network.dex */
public class OC extends AnimatorListenerAdapter {
    public final /* synthetic */ C0705Sl A00;
    public final /* synthetic */ boolean A01;

    public OC(C0705Sl c0705Sl, boolean z) {
        this.A00 = c0705Sl;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OL ol;
        C0466Jb c0466Jb;
        C0466Jb c0466Jb2;
        TJ tj;
        TJ tj2;
        super.onAnimationEnd(animator);
        ol = this.A00.A0M;
        ol.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01) {
            tj = this.A00.A0J;
            if (tj != null) {
                tj2 = this.A00.A0J;
                tj2.destroy();
            }
        }
        c0466Jb = this.A00.A0h;
        if (c0466Jb == null) {
            return;
        }
        c0466Jb2 = this.A00.A0h;
        c0466Jb2.setVisibility(this.A01 ? 8 : 0);
    }
}
