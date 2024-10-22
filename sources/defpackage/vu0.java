package defpackage;

/* loaded from: classes2.dex */
public final class vu0 {
    static final Class<?> INSTANCE = resolveExtensionClass();

    private vu0() {
    }

    public static Class<?> resolveExtensionClass() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
