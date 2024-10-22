package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzady {
    protected final zzacs zza;

    public zzady(zzacs zzacsVar) {
        this.zza = zzacsVar;
    }

    public abstract boolean zza(zzfb zzfbVar) throws zzcc;

    public abstract boolean zzb(zzfb zzfbVar, long j) throws zzcc;

    public final boolean zzf(zzfb zzfbVar, long j) throws zzcc {
        if (zza(zzfbVar) && zzb(zzfbVar, j)) {
            return true;
        }
        return false;
    }
}
