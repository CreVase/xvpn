package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QF implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ JT A01;

    public QF(JT jt, View view) {
        this.A01 = jt;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int value = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.setTranslationY(value);
    }
}
