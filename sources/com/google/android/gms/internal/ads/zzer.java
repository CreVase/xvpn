package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class zzer {
    private static final Object zza = new Object();
    private static final zzeq zzb = zzeq.zza;

    public static String zza(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (zza) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th2 = th2.getCause();
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
        }
        return str;
    }

    public static void zzb(String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzc(String str, String str2) {
        synchronized (zza) {
            Log.e(str, zza(str2, null));
        }
    }

    public static void zzd(String str, String str2, Throwable th) {
        synchronized (zza) {
            Log.e(str, zza(str2, th));
        }
    }

    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.i(str, zza(str2, null));
        }
    }

    public static void zzf(String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzg(String str, String str2, Throwable th) {
        synchronized (zza) {
            zza(str2, th);
        }
    }
}
