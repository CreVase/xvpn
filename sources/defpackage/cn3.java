package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class cn3 extends s71 {
    public static boolean g = true;

    public cn3() {
        super(15);
    }

    public float s(View view) {
        float transitionAlpha;
        if (g) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        return view.getAlpha();
    }

    public void t(View view, float f) {
        if (g) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        view.setAlpha(f);
    }
}
