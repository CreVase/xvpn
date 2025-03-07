package com.vungle.ads.internal.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class NamedThreadFactory implements ThreadFactory {
    private final String name;
    private final ThreadFactory threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    public NamedThreadFactory(String str) {
        this.name = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.threadFactory.newThread(runnable);
        newThread.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        return newThread;
    }
}
