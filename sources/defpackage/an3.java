package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class an3 {

    /* renamed from: a, reason: collision with root package name */
    public static final dn3 f118a;

    /* renamed from: b, reason: collision with root package name */
    public static final b43 f119b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f118a = new gn3();
        } else if (i >= 23) {
            f118a = new fn3();
        } else if (i >= 22) {
            f118a = new en3();
        } else {
            f118a = new dn3();
        }
        f119b = new b43("translationAlpha", 6, Float.class);
        new b43("clipBounds", 7, Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f118a.o(view, i, i2, i3, i4);
    }
}
