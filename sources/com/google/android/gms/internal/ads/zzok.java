package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
final class zzok {
    public static final zzok zza;
    public final LogSessionId zzb;

    static {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        zza = new zzok(logSessionId);
    }

    public zzok(LogSessionId logSessionId) {
        this.zzb = logSessionId;
    }
}
