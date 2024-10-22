package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzars {
    private NetworkCapabilities zza;

    public zzars(ConnectivityManager connectivityManager) {
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzarr(this));
            } catch (RuntimeException unused) {
                synchronized (zzars.class) {
                    this.zza = null;
                }
            }
        }
    }

    public static zzars zzc(Context context) {
        if (context != null) {
            return new zzars((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzars.class) {
            NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}
