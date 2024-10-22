package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcsp {
    private final zzdaa zza;
    private final zzdch zzb;

    public zzcsp(zzdaa zzdaaVar, zzdch zzdchVar) {
        this.zza = zzdaaVar;
        this.zzb = zzdchVar;
    }

    public final zzdaa zza() {
        return this.zza;
    }

    public final zzdch zzb() {
        return this.zzb;
    }

    public final zzdev zzc() {
        zzdch zzdchVar = this.zzb;
        if (zzdchVar != null) {
            return new zzdev(zzdchVar, zzcbg.zzf);
        }
        return new zzdev(new zzcso(this), zzcbg.zzf);
    }
}
