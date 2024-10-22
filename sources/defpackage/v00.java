package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final class v00 extends qr0 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final cr1 j;
    public final t00 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public v00(pr0 pr0Var) {
        super(pr0Var);
        this.j = new cr1(this, 1);
        this.k = new t00(this, 0);
        Context context = pr0Var.getContext();
        int i = he2.motionDurationShort3;
        this.e = zf3.c0(context, i, 100);
        this.f = zf3.c0(pr0Var.getContext(), i, 150);
        this.g = zf3.d0(pr0Var.getContext(), he2.motionEasingLinearInterpolator, pb.f3811a);
        this.h = zf3.d0(pr0Var.getContext(), he2.motionEasingEmphasizedInterpolator, pb.d);
    }

    @Override // defpackage.qr0
    public final void a() {
        if (this.f4045b.p != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.qr0
    public final int c() {
        return mf2.clear_text_end_icon_content_description;
    }

    @Override // defpackage.qr0
    public final int d() {
        return ue2.mtrl_ic_cancel;
    }

    @Override // defpackage.qr0
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.qr0
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.qr0
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.qr0
    public final void m(EditText editText) {
        this.i = editText;
        this.f4044a.setEndIconVisible(u());
    }

    @Override // defpackage.qr0
    public final void p(boolean z) {
        if (this.f4045b.p == null) {
            return;
        }
        t(z);
    }

    @Override // defpackage.qr0
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s00

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v00 f4249b;

            {
                this.f4249b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                v00 v00Var = this.f4249b;
                switch (i2) {
                    case 0:
                        v00Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = v00Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        v00Var.getClass();
                        v00Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s00

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v00 f4249b;

            {
                this.f4249b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                v00 v00Var = this.f4249b;
                switch (i22) {
                    case 0:
                        v00Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = v00Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        v00Var.getClass();
                        v00Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new u00(this, i));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s00

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v00 f4249b;

            {
                this.f4249b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                v00 v00Var = this.f4249b;
                switch (i22) {
                    case 0:
                        v00Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = v00Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        v00Var.getClass();
                        v00Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new u00(this, i3));
    }

    @Override // defpackage.qr0
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new nw3(this, 22));
        }
    }

    public final void t(boolean z) {
        boolean z2;
        if (this.f4045b.d() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null && ((editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
