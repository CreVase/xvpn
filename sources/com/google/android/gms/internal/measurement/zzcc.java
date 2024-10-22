package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzcc {
    public static final int zza;
    private static final int zzb;

    static {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        zzb = i;
        if (i2 >= 31) {
            i3 = 33554432;
        }
        zza = i3;
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
