package defpackage;

/* loaded from: classes.dex */
public abstract class za {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5450a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f5451b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5450a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f5451b = z;
    }

    public static boolean a() {
        if (f5450a != null && !f5451b) {
            return true;
        }
        return false;
    }
}
