package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzct {
    public static final Handler zza = new Handler(Looper.getMainLooper());
    public static final Executor zzb = new zzcs("Google consent worker");

    public static void zza() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
