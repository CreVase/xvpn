package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class yv0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5393a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5394b = false;
    public final Object c;

    public yv0(View view) {
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5393a) {
            case 0:
                this.f5394b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f5393a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.f5394b) {
                    this.f5394b = false;
                    return;
                }
                aw0 aw0Var = (aw0) obj;
                if (((Float) aw0Var.z.getAnimatedValue()).floatValue() == 0.0f) {
                    aw0Var.A = 0;
                    aw0Var.i(0);
                    return;
                } else {
                    aw0Var.A = 2;
                    aw0Var.s.invalidate();
                    return;
                }
            default:
                View view = (View) obj;
                an3.f118a.t(view, 1.0f);
                if (this.f5394b) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5393a) {
            case 1:
                View view = (View) this.c;
                WeakHashMap weakHashMap = ll3.f3151a;
                if (uk3.h(view) && view.getLayerType() == 0) {
                    this.f5394b = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public yv0(aw0 aw0Var) {
        this.c = aw0Var;
    }
}
