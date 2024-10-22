package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* loaded from: classes.dex */
public final class dq3 extends hq3 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final tv0 f = new tv0();
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view) {
        sc1 j = j(view);
        if (j != null) {
            j.f4314b.setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z) {
        sc1 j = j(view);
        if (j != null) {
            j.f4313a = windowInsets;
            if (!z) {
                View view2 = j.f4314b;
                int[] iArr = j.e;
                view2.getLocationOnScreen(iArr);
                z = true;
                j.c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void g(View view, wq3 wq3Var, List list) {
        sc1 j = j(view);
        if (j != null) {
            j.a(wq3Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), wq3Var, list);
            }
        }
    }

    public static void h(View view, x50 x50Var) {
        sc1 j = j(view);
        if (j != null) {
            View view2 = j.f4314b;
            int[] iArr = j.e;
            view2.getLocationOnScreen(iArr);
            int i = j.c - iArr[1];
            j.d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), x50Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(af2.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static sc1 j(View view) {
        Object tag = view.getTag(af2.tag_window_insets_animation_callback);
        if (tag instanceof cq3) {
            return ((cq3) tag).f1655a;
        }
        return null;
    }
}
