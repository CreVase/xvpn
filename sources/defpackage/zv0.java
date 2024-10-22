package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class zv0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw0 f5556a;

    public zv0(aw0 aw0Var) {
        this.f5556a = aw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        aw0 aw0Var = this.f5556a;
        aw0Var.c.setAlpha(floatValue);
        aw0Var.d.setAlpha(floatValue);
        aw0Var.s.invalidate();
    }
}
