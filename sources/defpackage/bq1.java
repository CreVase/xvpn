package defpackage;

/* loaded from: classes2.dex */
public final class bq1 {
    private static final yp1 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final yp1 LITE_SCHEMA = new zp1();

    public static yp1 full() {
        return FULL_SCHEMA;
    }

    public static yp1 lite() {
        return LITE_SCHEMA;
    }

    private static yp1 loadSchemaForFullRuntime() {
        try {
            return (yp1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
