package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class nd {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3438b = PorterDuff.Mode.SRC_IN;
    public static nd c;

    /* renamed from: a, reason: collision with root package name */
    public bk2 f3439a;

    public static synchronized nd a() {
        nd ndVar;
        synchronized (nd.class) {
            if (c == null) {
                d();
            }
            ndVar = c;
        }
        return ndVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (nd.class) {
            h = bk2.h(i, mode);
        }
        return h;
    }

    public static synchronized void d() {
        synchronized (nd.class) {
            if (c == null) {
                nd ndVar = new nd();
                c = ndVar;
                ndVar.f3439a = bk2.d();
                c.f3439a.l(new jx0(2));
            }
        }
    }

    public static void e(Drawable drawable, j93 j93Var, int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = bk2.h;
        int[] state = drawable.getState();
        int[] iArr2 = in0.f2623a;
        if (drawable.mutate() == drawable) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = j93Var.c;
            if (!z2 && !j93Var.f2730b) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z2) {
                    colorStateList = (ColorStateList) j93Var.d;
                } else {
                    colorStateList = null;
                }
                if (j93Var.f2730b) {
                    mode = (PorterDuff.Mode) j93Var.e;
                } else {
                    mode = bk2.h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = bk2.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3439a.f(context, i);
    }
}
