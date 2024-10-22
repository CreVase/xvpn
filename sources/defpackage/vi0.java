package defpackage;

import android.transition.Transition;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;

/* loaded from: classes.dex */
public final class vi0 extends d {
    public final Object c;
    public final boolean d;
    public final Object e;

    public vi0(ux2 ux2Var, xu xuVar, boolean z, boolean z2) {
        super(ux2Var, xuVar);
        Object exitTransition;
        boolean z3;
        Object obj;
        tx2 tx2Var = ux2Var.f4753a;
        tx2 tx2Var2 = tx2.VISIBLE;
        Fragment fragment = ux2Var.c;
        if (tx2Var == tx2Var2) {
            if (z) {
                exitTransition = fragment.getReenterTransition();
            } else {
                exitTransition = fragment.getEnterTransition();
            }
        } else if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        this.c = exitTransition;
        if (ux2Var.f4753a == tx2Var2) {
            if (z) {
                z3 = fragment.getAllowReturnTransitionOverlap();
            } else {
                z3 = fragment.getAllowEnterTransitionOverlap();
            }
        } else {
            z3 = true;
        }
        this.d = z3;
        if (z2) {
            if (z) {
                obj = fragment.getSharedElementReturnTransition();
            } else {
                obj = fragment.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.e = obj;
    }

    public final v21 c() {
        boolean z;
        Object obj = this.c;
        v21 d = d(obj);
        Object obj2 = this.e;
        v21 d2 = d(obj2);
        if (d != null && d2 != null && d != d2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (d == null) {
                return d2;
            }
            return d;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f222a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final v21 d(Object obj) {
        if (obj == null) {
            return null;
        }
        t21 t21Var = o21.f3586a;
        if (obj instanceof Transition) {
            return t21Var;
        }
        v21 v21Var = o21.f3587b;
        if (v21Var != null && v21Var.e(obj)) {
            return v21Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f222a.c + " is not a valid framework Transition or AndroidX Transition");
    }
}
