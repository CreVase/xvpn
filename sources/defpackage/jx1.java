package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jx1 {

    /* renamed from: a, reason: collision with root package name */
    public final uu2 f2847a = new uu2();

    /* renamed from: b, reason: collision with root package name */
    public final uu2 f2848b = new uu2();

    public static jx1 a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static jx1 b(ArrayList arrayList) {
        jx1 jx1Var = new jx1();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                jx1Var.f2848b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = pb.c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = pb.d;
                    }
                } else {
                    interpolator = pb.f3812b;
                }
                kx1 kx1Var = new kx1(startDelay, duration, interpolator);
                kx1Var.d = objectAnimator.getRepeatCount();
                kx1Var.e = objectAnimator.getRepeatMode();
                jx1Var.f2847a.put(propertyName, kx1Var);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return jx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx1)) {
            return false;
        }
        return this.f2847a.equals(((jx1) obj).f2847a);
    }

    public final int hashCode() {
        return this.f2847a.hashCode();
    }

    public final String toString() {
        return "\n" + jx1.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2847a + "}\n";
    }
}
