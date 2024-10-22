package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public abstract class qm3 {
    public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }
}
