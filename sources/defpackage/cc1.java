package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class cc1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f610b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ ec1 e;

    public cc1(ec1 ec1Var, int i, TextView textView, int i2, TextView textView2) {
        this.e = ec1Var;
        this.f609a = i;
        this.f610b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i = this.f609a;
        ec1 ec1Var = this.e;
        ec1Var.n = i;
        ec1Var.l = null;
        TextView textView = this.f610b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (appCompatTextView = ec1Var.r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
