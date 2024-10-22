package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final /* synthetic */ class l50 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m50 f3066b;

    public /* synthetic */ l50(m50 m50Var, int i) {
        this.f3065a = i;
        this.f3066b = m50Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f3065a;
        m50 m50Var = this.f3066b;
        switch (i) {
            case 0:
                float f = m50Var.q.left;
                RectF rectF = m50Var.r;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f - rectF.left);
                RectF rectF2 = m50Var.p;
                rectF2.set(rectF);
                rectF2.inset(floatValue, floatValue);
                m50Var.postInvalidateOnAnimation();
                return;
            case 1:
                float f2 = m50Var.q.left;
                RectF rectF3 = m50Var.r;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f2 - rectF3.left);
                RectF rectF4 = m50Var.p;
                rectF4.set(rectF3);
                float f3 = -floatValue2;
                rectF4.inset(f3, f3);
                m50Var.postInvalidateOnAnimation();
                return;
            case 2:
                m50Var.postInvalidateOnAnimation();
                return;
            case 3:
                m50Var.postInvalidateOnAnimation();
                return;
            case 4:
                m50Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m50Var.invalidate();
                return;
            default:
                m50Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m50Var.invalidate();
                return;
        }
    }
}
