package com.vungle.ads.internal.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ConcurrencyTimeoutProvider {
    private final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    public final long getTimeout() {
        if (ThreadUtil.INSTANCE.isMainThread()) {
            return this.OPERATION_TIMEOUT;
        }
        return Long.MAX_VALUE;
    }
}
