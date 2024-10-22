package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class bw3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f543a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static boolean a(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.contains(str2);
    }

    public static boolean b(String str, String str2) {
        if (str == null) {
            return c(str2);
        }
        if (str2 == null) {
            return c(str);
        }
        return str.equals(str2);
    }

    public static boolean c(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }
}
