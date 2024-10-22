package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

/* loaded from: classes.dex */
public class zzfw {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzfw() {
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }

    public static boolean zzb(Context context) {
        if (zza() && !zzc(context)) {
            return false;
        }
        return true;
    }

    @TargetApi(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzfw.class) {
            if (zzb) {
                return true;
            }
            boolean zzd = zzd(context);
            if (zzd) {
                zzb = zzd;
            }
            return zzd;
        }
    }

    @TargetApi(24)
    private static boolean zzd(Context context) {
        boolean z;
        boolean isUserUnlocked;
        Object systemService;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                systemService = context.getSystemService((Class<Object>) UserManager.class);
                zza = (UserManager) systemService;
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException unused) {
                zza = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            zza = null;
        }
        return z;
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
