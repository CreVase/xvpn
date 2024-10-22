package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjs {
    public static zzol zza(Context context, zzkb zzkbVar, boolean z) {
        LogSessionId logSessionId;
        zzoh zzb = zzoh.zzb(context);
        if (zzb == null) {
            zzer.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzol(logSessionId);
        }
        if (z) {
            zzkbVar.zzz(zzb);
        }
        return new zzol(zzb.zza());
    }
}
