package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class sn1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4379a = new Object();

    public static String a(String str, Throwable th) {
        boolean z;
        String replace;
        synchronized (f4379a) {
            try {
                if (th == null) {
                    replace = null;
                } else {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                z = true;
                                break;
                            }
                            th2 = th2.getCause();
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        replace = "UnknownHostException (no network)";
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder p = p71.p(str, "\n  ");
            p.append(replace.replace("\n", "\n  "));
            p.append('\n');
            return p.toString();
        }
        return str;
    }

    public static void b() {
        synchronized (f4379a) {
        }
    }

    public static void c(String str, String str2) {
        synchronized (f4379a) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static void e(String str, String str2) {
        synchronized (f4379a) {
            Log.i(str, str2);
        }
    }

    public static void f() {
        synchronized (f4379a) {
        }
    }

    public static void g(String str, Throwable th) {
        a(str, th);
        f();
    }
}
