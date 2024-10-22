package defpackage;

import android.animation.Animator;

/* loaded from: classes2.dex */
public final class w8 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u93 f4959b;

    public /* synthetic */ w8(u93 u93Var, int i) {
        this.f4958a = i;
        this.f4959b = u93Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4958a;
        u93 u93Var = this.f4959b;
        switch (i) {
            case 0:
                ((az2) u93Var.f4640b).d();
                return;
            default:
                ((az2) u93Var.f4640b).d();
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
