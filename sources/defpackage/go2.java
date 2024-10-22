package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class go2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2293a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2294b;
    public Object c;

    public go2(Context context, TypedArray typedArray) {
        this.f2293a = context;
        this.f2294b = typedArray;
    }

    public static go2 m(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new go2(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static void n() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public final boolean a(int i, boolean z) {
        return ((TypedArray) this.f2294b).getBoolean(i, z);
    }

    public final ColorStateList b(int i) {
        int resourceId;
        ColorStateList colorStateList;
        Object obj = this.f2294b;
        if (((TypedArray) obj).hasValue(i) && (resourceId = ((TypedArray) obj).getResourceId(i, 0)) != 0 && (colorStateList = x80.getColorStateList((Context) this.f2293a, resourceId)) != null) {
            return colorStateList;
        }
        return ((TypedArray) obj).getColorStateList(i);
    }

    public final int c(int i, int i2) {
        return ((TypedArray) this.f2294b).getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return ((TypedArray) this.f2294b).getDimensionPixelSize(i, i2);
    }

    public final Drawable e(int i) {
        int resourceId;
        Object obj = this.f2294b;
        if (((TypedArray) obj).hasValue(i) && (resourceId = ((TypedArray) obj).getResourceId(i, 0)) != 0) {
            return ew3.P0((Context) this.f2293a, resourceId);
        }
        return ((TypedArray) obj).getDrawable(i);
    }

    public final Drawable f(int i) {
        int resourceId;
        Drawable g;
        if (((TypedArray) this.f2294b).hasValue(i) && (resourceId = ((TypedArray) this.f2294b).getResourceId(i, 0)) != 0) {
            nd a2 = nd.a();
            Context context = (Context) this.f2293a;
            synchronized (a2) {
                g = a2.f3439a.g(context, resourceId, true);
            }
            return g;
        }
        return null;
    }

    public final Typeface g(int i, int i2, ke keVar) {
        int resourceId = ((TypedArray) this.f2294b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        Context context = (Context) this.f2293a;
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = jk2.f2780a;
        if (context.isRestricted()) {
            return null;
        }
        return jk2.c(context, resourceId, typedValue, i2, keVar, true, false);
    }

    public final int h(int i, int i2) {
        return ((TypedArray) this.f2294b).getInt(i, i2);
    }

    public final int i(int i, int i2) {
        return ((TypedArray) this.f2294b).getResourceId(i, i2);
    }

    public final String j(int i) {
        return ((TypedArray) this.f2294b).getString(i);
    }

    public final CharSequence k(int i) {
        return ((TypedArray) this.f2294b).getText(i);
    }

    public final boolean l(int i) {
        return ((TypedArray) this.f2294b).hasValue(i);
    }

    public final void o() {
        ((TypedArray) this.f2294b).recycle();
    }

    public go2() {
        this.f2293a = null;
        this.f2294b = null;
        this.c = null;
        n();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f2293a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f2294b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }
}
