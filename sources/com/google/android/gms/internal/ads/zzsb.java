package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
final class zzsb {
    public static void zza(zzru zzruVar, zzol zzolVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zzolVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = zzruVar.zzb;
            stringId = zza.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
