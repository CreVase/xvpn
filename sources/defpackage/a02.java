package defpackage;

/* loaded from: classes2.dex */
public final class a02 {
    private static final xz1 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final xz1 LITE_SCHEMA = new yz1();

    public static xz1 full() {
        return FULL_SCHEMA;
    }

    public static xz1 lite() {
        return LITE_SCHEMA;
    }

    private static xz1 loadSchemaForFullRuntime() {
        try {
            return (xz1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
