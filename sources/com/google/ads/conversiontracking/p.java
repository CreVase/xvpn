package com.google.ads.conversiontracking;

import android.os.Looper;

/* loaded from: classes.dex */
public final class p {
    public static void a(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
