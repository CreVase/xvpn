package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class wq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5055b;

    public /* synthetic */ wq(Object obj, int i) {
        this.f5054a = i;
        this.f5055b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f5054a;
        Object obj = this.f5055b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fr1 fr1Var = ((BottomSheetBehavior) obj).i;
                if (fr1Var != null) {
                    er1 er1Var = fr1Var.f2139a;
                    if (er1Var.j != floatValue) {
                        er1Var.j = floatValue;
                        fr1Var.e = true;
                        fr1Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj).G0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
