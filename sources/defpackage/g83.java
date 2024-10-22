package defpackage;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public abstract class g83 {
    public static final void a(Resources.Theme theme, View view) {
        b(theme, view, new TypedValue());
    }

    public static final void b(Resources.Theme theme, View view, TypedValue typedValue) {
        int i;
        WindowInsetsController windowInsetsController;
        if (theme.resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) && typedValue.data != 0) {
            i = 8;
        } else {
            i = 0;
        }
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i |= 16;
        }
        windowInsetsController = view.getWindowInsetsController();
        windowInsetsController.setSystemBarsAppearance(i, 24);
    }
}
