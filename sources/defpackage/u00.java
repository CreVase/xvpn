package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class u00 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v00 f4604b;

    public /* synthetic */ u00(v00 v00Var, int i) {
        this.f4603a = i;
        this.f4604b = v00Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4603a) {
            case 1:
                this.f4604b.f4045b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4603a) {
            case 0:
                this.f4604b.f4045b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
