package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class nj2 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3471a;

    /* renamed from: b, reason: collision with root package name */
    public int f3472b;
    public final Object c;

    public nj2(xs3 xs3Var) {
        this.f3471a = 1;
        this.c = xs3Var;
        this.f3472b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3471a) {
            case 0:
                return new mj2(runnable, (String) this.c, this.f3472b);
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkTimer-thread-" + this.f3472b);
                this.f3472b = this.f3472b + 1;
                return newThread;
        }
    }

    public nj2() {
        this.f3471a = 0;
        this.c = "fonts-androidx";
        this.f3472b = 10;
    }
}
