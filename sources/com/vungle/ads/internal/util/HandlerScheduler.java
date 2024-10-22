package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class HandlerScheduler {
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long j) {
        return SystemClock.uptimeMillis() + j;
    }

    public final void cancel(String str) {
        this.handler.removeCallbacksAndMessages(str);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, String str, long j) {
        this.handler.postAtTime(runnable, str, calculateTime(j));
    }

    public final void schedule(Runnable runnable, long j) {
        this.handler.postAtTime(runnable, calculateTime(j));
    }
}
