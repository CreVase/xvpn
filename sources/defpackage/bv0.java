package defpackage;

import com.google.protobuf.e0;

/* loaded from: classes2.dex */
public final class bv0 {
    private static final zu0 LITE_SCHEMA = new e0();
    private static final zu0 FULL_SCHEMA = loadSchemaForFullRuntime();

    public static zu0 full() {
        zu0 zu0Var = FULL_SCHEMA;
        if (zu0Var != null) {
            return zu0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zu0 lite() {
        return LITE_SCHEMA;
    }

    private static zu0 loadSchemaForFullRuntime() {
        try {
            return (zu0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
