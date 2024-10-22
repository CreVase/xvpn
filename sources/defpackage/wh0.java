package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.h;

/* loaded from: classes.dex */
public final class wh0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xh0 f5008b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ zh0 e;

    public /* synthetic */ wh0(zh0 zh0Var, xh0 xh0Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f5007a = i;
        this.e = zh0Var;
        this.f5008b = xh0Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f5007a;
        zh0 zh0Var = this.e;
        xh0 xh0Var = this.f5008b;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                zh0Var.c(xh0Var.f5159a);
                zh0Var.r.remove(xh0Var.f5159a);
                zh0Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                zh0Var.c(xh0Var.f5160b);
                zh0Var.r.remove(xh0Var.f5160b);
                zh0Var.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f5007a;
        zh0 zh0Var = this.e;
        xh0 xh0Var = this.f5008b;
        switch (i) {
            case 0:
                h hVar = xh0Var.f5159a;
                zh0Var.getClass();
                return;
            default:
                h hVar2 = xh0Var.f5160b;
                zh0Var.getClass();
                return;
        }
    }
}
