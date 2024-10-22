package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b83 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (d83.d == floatValue) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            d83.d = floatValue;
            d83.c(true);
        }
    }
}
