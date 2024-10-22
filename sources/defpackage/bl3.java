package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class bl3 {
    public static wq3 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        wq3 h = wq3.h(null, rootWindowInsets);
        uq3 uq3Var = h.f5059a;
        uq3Var.p(h);
        uq3Var.d(view.getRootView());
        return h;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
