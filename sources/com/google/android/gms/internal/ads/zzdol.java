package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdol extends zzdnv implements zzdfd {
    private zzdfd zza;

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzbK() {
        zzdfd zzdfdVar = this.zza;
        if (zzdfdVar != null) {
            zzdfdVar.zzbK();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhz zzbhzVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbib zzbibVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, zzdfd zzdfdVar) {
        super.zzh(zzaVar, zzbhzVar, zzoVar, zzbibVar, zzzVar);
        this.zza = zzdfdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzs() {
        zzdfd zzdfdVar = this.zza;
        if (zzdfdVar != null) {
            zzdfdVar.zzs();
        }
    }
}
