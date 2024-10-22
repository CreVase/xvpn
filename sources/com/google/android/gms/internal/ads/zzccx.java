package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
final class zzccx implements Runnable {
    public zzccx(zzccz zzcczVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
