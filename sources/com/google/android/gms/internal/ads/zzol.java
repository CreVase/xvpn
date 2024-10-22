package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public final class zzol {
    public static final zzol zza;
    private final zzok zzb;

    static {
        zzol zzolVar;
        if (zzfk.zza < 31) {
            zzolVar = new zzol();
        } else {
            zzolVar = new zzol(zzok.zza);
        }
        zza = zzolVar;
    }

    private zzol(zzok zzokVar) {
        this.zzb = zzokVar;
    }

    public final LogSessionId zza() {
        zzok zzokVar = this.zzb;
        zzokVar.getClass();
        return zzokVar.zzb;
    }

    public zzol() {
        zzdx.zzf(zzfk.zza < 31);
        this.zzb = null;
    }

    public zzol(LogSessionId logSessionId) {
        this.zzb = new zzok(logSessionId);
    }
}
