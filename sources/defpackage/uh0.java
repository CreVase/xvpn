package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.h;

/* loaded from: classes.dex */
public final class uh0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4671a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4672b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ zh0 e;

    public uh0(zh0 zh0Var, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = zh0Var;
        this.f4672b = hVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f4671a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4671a;
        h hVar = this.f4672b;
        zh0 zh0Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                zh0Var.c(hVar);
                zh0Var.q.remove(hVar);
                zh0Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                zh0Var.c(hVar);
                zh0Var.o.remove(hVar);
                zh0Var.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f4671a;
        zh0 zh0Var = this.e;
        switch (i) {
            case 0:
                zh0Var.getClass();
                return;
            default:
                zh0Var.getClass();
                return;
        }
    }

    public uh0(zh0 zh0Var, h hVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = zh0Var;
        this.f4672b = hVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
