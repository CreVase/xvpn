package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class m63 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3246a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f3247b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final sy1 f;
    public static final os g;
    public static final os h;

    static {
        String str;
        int i = d53.f1736a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3246a = str;
        f3247b = pd0.P(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = d53.f1736a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = pd0.Q("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = pd0.Q("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(pd0.P(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = sy1.n;
        g = new os(0);
        h = new os(1);
    }
}
