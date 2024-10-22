package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class el3 {
    public static void a(View view, jl3 jl3Var) {
        int i = af2.tag_unhandled_key_listeners;
        uu2 uu2Var = (uu2) view.getTag(i);
        if (uu2Var == null) {
            uu2Var = new uu2();
            view.setTag(i, uu2Var);
        }
        Objects.requireNonNull(jl3Var);
        View.OnUnhandledKeyEventListener dl3Var = new dl3();
        uu2Var.put(jl3Var, dl3Var);
        view.addOnUnhandledKeyEventListener(dl3Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, jl3 jl3Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        uu2 uu2Var = (uu2) view.getTag(af2.tag_unhandled_key_listeners);
        if (uu2Var != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) uu2Var.getOrDefault(jl3Var, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
