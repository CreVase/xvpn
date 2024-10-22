package com.vungle.ads.internal.executor;

import android.util.Log;
import defpackage.ng0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class FutureResult<T> implements Future<T> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FutureResult";
    private final Future<T> future;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final String getTAG() {
            return FutureResult.TAG;
        }
    }

    public FutureResult(Future<T> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Future<T> future = this.future;
        if (future != null) {
            return future.cancel(z);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().getName();
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            Log.e(TAG, "error on execution", e);
            return null;
        }
    }

    public final Future<T> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get(j, timeUnit);
            }
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().getName();
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            Log.e(TAG, "error on execution", e);
            return null;
        } catch (TimeoutException unused2) {
            Thread.currentThread().getName();
            return null;
        }
    }
}
