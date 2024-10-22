package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcgh implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcgb zza;
    private final com.google.android.gms.ads.internal.overlay.zzo zzb;

    public zzcgh(zzcgb zzcgbVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zza = zzcgbVar;
        this.zzb = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbu();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbv();
        }
        this.zza.zzX();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbx();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzby(i);
        }
        this.zza.zzV();
    }
}
