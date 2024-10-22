package defpackage;

/* loaded from: classes2.dex */
public final class hi2 {
    public static String a(w41 w41Var) {
        String obj = w41Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
