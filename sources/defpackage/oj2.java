package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class oj2 {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final zi3 f3677a = zi3.a();

    /* renamed from: b, reason: collision with root package name */
    public long f3678b;
    public int c;

    public final synchronized long a(int i) {
        boolean z;
        if (i != 429 && (i < 500 || i >= 600)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return d;
        }
        double pow = Math.pow(2.0d, this.c);
        this.f3677a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z;
        if (this.c != 0) {
            this.f3677a.f5487a.getClass();
            if (System.currentTimeMillis() <= this.f3678b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i) {
        boolean z;
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c();
            return;
        }
        this.c++;
        long a2 = a(i);
        this.f3677a.f5487a.getClass();
        this.f3678b = System.currentTimeMillis() + a2;
    }
}
