package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class al3 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(af2.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static wq3 b(View view, wq3 wq3Var, Rect rect) {
        WindowInsets g = wq3Var.g();
        if (g != null) {
            return wq3.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return wq3Var;
    }

    public static boolean c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static wq3 j(View view) {
        nq3 kq3Var;
        if (jq3.d && view.isAttachedToWindow()) {
            try {
                Object obj = jq3.f2811a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) jq3.f2812b.get(obj);
                    Rect rect2 = (Rect) jq3.c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30) {
                            kq3Var = new mq3();
                        } else if (i >= 29) {
                            kq3Var = new lq3();
                        } else {
                            kq3Var = new kq3();
                        }
                        kq3Var.e(rc1.b(rect.left, rect.top, rect.right, rect.bottom));
                        kq3Var.g(rc1.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        wq3 b2 = kq3Var.b();
                        b2.f5059a.p(b2);
                        b2.f5059a.d(view.getRootView());
                        return b2;
                    }
                }
            } catch (IllegalAccessException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f) {
        view.setElevation(f);
    }

    public static void t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void u(View view, f22 f22Var) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(af2.tag_on_apply_window_listener, f22Var);
        }
        if (f22Var == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(af2.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new zk3(view, f22Var));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(View view, float f) {
        view.setZ(f);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
