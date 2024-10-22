package defpackage;

/* loaded from: classes2.dex */
public final class tu0 {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    public static xu0 create() {
        xu0 invokeSubclassFactory = invokeSubclassFactory("newInstance");
        if (invokeSubclassFactory == null) {
            return new xu0();
        }
        return invokeSubclassFactory;
    }

    public static xu0 createEmpty() {
        xu0 invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        if (invokeSubclassFactory == null) {
            return xu0.EMPTY_REGISTRY_LITE;
        }
        return invokeSubclassFactory;
    }

    private static final xu0 invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (xu0) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isFullRegistry(xu0 xu0Var) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls != null && cls.isAssignableFrom(xu0Var.getClass())) {
            return true;
        }
        return false;
    }

    public static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
