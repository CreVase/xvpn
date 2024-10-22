package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes2.dex */
public final class no extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo f3501b;

    public /* synthetic */ no(yo yoVar, int i, int i2) {
        this.f3500a = i2;
        this.f3501b = yoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f3500a;
        yo yoVar = this.f3501b;
        switch (i) {
            case 0:
                yoVar.b();
                return;
            default:
                yoVar.b();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3500a) {
            case 1:
                yo yoVar = this.f3501b;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) yoVar.j;
                snackbarContentLayout.f1558a.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout.f1558a.animate().alpha(0.0f);
                long j = yoVar.f5367b;
                ViewPropertyAnimator duration = alpha.setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.c;
                long j2 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.f1559b.getVisibility() == 0) {
                    snackbarContentLayout.f1559b.setAlpha(1.0f);
                    snackbarContentLayout.f1559b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
