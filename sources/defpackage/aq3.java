package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class aq3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq3 f320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f321b;
    public final /* synthetic */ wq3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public aq3(iq3 iq3Var, wq3 wq3Var, wq3 wq3Var2, int i, View view) {
        this.f320a = iq3Var;
        this.f321b = wq3Var;
        this.c = wq3Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        nq3 kq3Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        iq3 iq3Var = this.f320a;
        iq3Var.f2634a.d(animatedFraction);
        float b2 = iq3Var.f2634a.b();
        PathInterpolator pathInterpolator = dq3.e;
        int i = Build.VERSION.SDK_INT;
        wq3 wq3Var = this.f321b;
        if (i >= 30) {
            kq3Var = new mq3(wq3Var);
        } else if (i >= 29) {
            kq3Var = new lq3(wq3Var);
        } else {
            kq3Var = new kq3(wq3Var);
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.d & i2) == 0) {
                kq3Var.c(i2, wq3Var.a(i2));
            } else {
                rc1 a2 = wq3Var.a(i2);
                rc1 a3 = this.c.a(i2);
                float f = 1.0f - b2;
                kq3Var.c(i2, wq3.f(a2, (int) (((a2.f4129a - a3.f4129a) * f) + 0.5d), (int) (((a2.f4130b - a3.f4130b) * f) + 0.5d), (int) (((a2.c - a3.c) * f) + 0.5d), (int) (((a2.d - a3.d) * f) + 0.5d)));
            }
        }
        dq3.g(this.e, kq3Var.b(), Collections.singletonList(iq3Var));
    }
}
