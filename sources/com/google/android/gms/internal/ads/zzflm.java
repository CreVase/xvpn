package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzflm {
    private static UiModeManager zza;

    public static zzfki zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType != 4) {
                    return zzfki.OTHER;
                }
                return zzfki.CTV;
            }
            return zzfki.MOBILE;
        }
        return zzfki.OTHER;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
