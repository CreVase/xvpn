package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class yi0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5339a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f5340b;
    public final Object c;

    public yi0() {
        this.f5339a = 1;
        this.c = Executors.defaultThreadFactory();
        this.f5340b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f5339a;
        Object obj = this.c;
        Serializable serializable = this.f5340b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) serializable).getAndIncrement());
                return thread;
            case 1:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + ((AtomicInteger) serializable).getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = Executors.defaultThreadFactory().newThread(new ws0(runnable));
                newThread2.setName(((String) serializable) + ((AtomicLong) obj).getAndIncrement());
                return newThread2;
        }
    }

    public yi0(aj0 aj0Var) {
        this.f5339a = 0;
        this.c = aj0Var;
        this.f5340b = new AtomicInteger(0);
    }

    public yi0(String str, AtomicLong atomicLong) {
        this.f5339a = 2;
        this.f5340b = str;
        this.c = atomicLong;
    }
}
