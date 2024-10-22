package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class in0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2623a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2624b = new int[0];
    public static final Rect c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f2624b;
        int[] iArr2 = f2623a;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state2 = drawable.getState();
            if (state2 != null && state2.length != 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Insets a2 = hn0.a(drawable);
            i = a2.left;
            i2 = a2.top;
            i3 = a2.right;
            i4 = a2.bottom;
            return new Rect(i, i2, i3, i4);
        }
        boolean z = drawable instanceof ct3;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = ((dt3) ((ct3) drawable)).f;
        }
        if (i5 < 29) {
            if (gn0.f2285a) {
                try {
                    Object invoke = gn0.f2286b.invoke(drawable2, new Object[0]);
                    if (invoke != null) {
                        return new Rect(gn0.c.getInt(invoke), gn0.d.getInt(invoke), gn0.e.getInt(invoke), gn0.f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z2 = gn0.f2285a;
        }
        return c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
