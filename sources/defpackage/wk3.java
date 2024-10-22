package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class wk3 {
    public static Rect a(View view) {
        return view.getClipBounds();
    }

    public static boolean b(View view) {
        return view.isInLayout();
    }

    public static void c(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
