package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ad0 implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f59a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f60b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public ad0(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f60b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new lf(24, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f60b, Long.valueOf(this.f59a.getAndIncrement())));
        return newThread;
    }
}
