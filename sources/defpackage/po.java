package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes2.dex */
public final class po extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo f3881b;

    public /* synthetic */ po(yo yoVar, int i) {
        this.f3880a = i;
        this.f3881b = yoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f3880a;
        yo yoVar = this.f3881b;
        switch (i) {
            case 0:
                yoVar.c();
                return;
            default:
                yoVar.c();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3880a) {
            case 0:
                yo yoVar = this.f3881b;
                k80 k80Var = yoVar.j;
                int i = yoVar.c;
                int i2 = yoVar.f5366a;
                int i3 = i - i2;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) k80Var;
                snackbarContentLayout.f1558a.setAlpha(0.0f);
                long j = i2;
                ViewPropertyAnimator duration = snackbarContentLayout.f1558a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.c;
                long j2 = i3;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.f1559b.getVisibility() == 0) {
                    snackbarContentLayout.f1559b.setAlpha(0.0f);
                    snackbarContentLayout.f1559b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
