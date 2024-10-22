package com.chartboost.sdk.impl;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class h9 {
    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return System.nanoTime();
    }

    public long c() {
        return SystemClock.uptimeMillis();
    }
}
