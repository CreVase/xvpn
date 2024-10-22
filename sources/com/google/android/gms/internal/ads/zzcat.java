package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

/* loaded from: classes.dex */
public class zzcat {
    protected static final zzftj zza = zzftj.zzb(4000);

    public static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            return str + " @" + stackTrace[3].getLineNumber();
        }
        return str;
    }

    public static void zze(String str) {
        if (zzm(3) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzf(String str, Throwable th) {
        zzm(3);
    }

    public static void zzg(String str) {
        if (zzm(6)) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : zza.zzd(str)) {
                    if (z) {
                        Log.e(AdRequest.LOGTAG, str2);
                    } else {
                        Log.e("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzi(String str) {
        if (zzm(4)) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : zza.zzd(str)) {
                    if (z) {
                        Log.i(AdRequest.LOGTAG, str2);
                    } else {
                        Log.i("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    public static void zzj(String str) {
        if (zzm(5) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzk(String str, Throwable th) {
        zzm(5);
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(zzd(str), th);
            } else {
                zzj(zzd(str));
            }
        }
    }

    public static boolean zzm(int i) {
        if (i < 5 && !Log.isLoggable(AdRequest.LOGTAG, i)) {
            return false;
        }
        return true;
    }
}
