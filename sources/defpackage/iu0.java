package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class iu0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f2648a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f2649b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (iu0.class) {
            if (f2648a.add(str)) {
                f2649b += ", " + str;
            }
        }
    }
}
