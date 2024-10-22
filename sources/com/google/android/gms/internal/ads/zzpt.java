package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
final class zzpt {
    public static void zza(AudioTrack audioTrack, zzol zzolVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId zza = zzolVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
