package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class qo implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yo f4028a;

    public qo(yo yoVar, int i) {
        this.f4028a = yoVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        uv0 uv0Var = yo.u;
        this.f4028a.i.setTranslationY(intValue);
    }
}
