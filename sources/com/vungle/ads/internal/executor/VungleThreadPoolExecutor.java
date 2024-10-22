package com.vungle.ads.internal.executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor {
    public VungleThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        try {
            return super.submit(runnable);
        } catch (OutOfMemoryError unused) {
            return new FutureResult(null);
        }
    }

    public final void execute(Runnable runnable, Runnable runnable2) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        try {
            return super.submit(runnable, (Runnable) t);
        } catch (OutOfMemoryError unused) {
            return new FutureResult(null);
        }
    }

    public final Future<?> submit(Runnable runnable, Runnable runnable2) {
        try {
            return super.submit(runnable);
        } catch (OutOfMemoryError unused) {
            if (runnable2 != null) {
                runnable2.run();
            }
            return new FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        try {
            return super.submit(callable);
        } catch (OutOfMemoryError unused) {
            return new FutureResult(null);
        }
    }
}
