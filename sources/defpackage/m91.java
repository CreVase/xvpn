package defpackage;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class m91 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3257a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f3257a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return l91.c(l91.a(l91.b(locale)));
        }
        try {
            return k91.a((Locale) f3257a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return k91.a(locale);
        }
    }
}
