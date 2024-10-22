package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ln3 extends AnimatorListenerAdapter implements ob3 {

    /* renamed from: a, reason: collision with root package name */
    public final View f3159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3160b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public ln3(View view, int i) {
        this.f3159a = view;
        this.f3160b = i;
        this.c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // defpackage.ob3
    public final void a() {
        f(false);
    }

    @Override // defpackage.ob3
    public final void b(pb3 pb3Var) {
        if (!this.f) {
            an3.f118a.q(this.f3159a, this.f3160b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        pb3Var.v(this);
    }

    @Override // defpackage.ob3
    public final void c() {
    }

    @Override // defpackage.ob3
    public final void d() {
    }

    @Override // defpackage.ob3
    public final void e() {
        f(true);
    }

    public final void f(boolean z) {
        ViewGroup viewGroup;
        if (this.d && this.e != z && (viewGroup = this.c) != null) {
            this.e = z;
            m20.e1(viewGroup, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            an3.f118a.q(this.f3159a, this.f3160b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.f) {
            an3.f118a.q(this.f3159a, this.f3160b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.f) {
            an3.f118a.q(this.f3159a, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
