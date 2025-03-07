package defpackage;

/* loaded from: classes2.dex */
public final class ya {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        boolean z;
        if (!ASSUME_ANDROID && getClassForName("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        IS_ROBOLECTRIC = z;
    }

    private ya() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    public static boolean isOnAndroidDevice() {
        if (!ASSUME_ANDROID && (MEMORY_CLASS == null || IS_ROBOLECTRIC)) {
            return false;
        }
        return true;
    }
}
