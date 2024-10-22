package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class bn3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f494a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f495b;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f495b = z;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f494a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(view) == 1) {
            return true;
        }
        return false;
    }
}
