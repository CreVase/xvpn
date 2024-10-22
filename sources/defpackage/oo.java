package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class oo implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo f3705b;

    public /* synthetic */ oo(yo yoVar, int i) {
        this.f3704a = i;
        this.f3705b = yoVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f3704a;
        yo yoVar = this.f3705b;
        switch (i) {
            case 0:
                yoVar.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yoVar.i.setScaleX(floatValue);
                yoVar.i.setScaleY(floatValue);
                return;
        }
    }
}
