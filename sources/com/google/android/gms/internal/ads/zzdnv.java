package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public class zzdnv implements com.google.android.gms.ads.internal.client.zza, zzbhz, com.google.android.gms.ads.internal.overlay.zzo, zzbib, com.google.android.gms.ads.internal.overlay.zzz {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbhz zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbib zzd;
    private com.google.android.gms.ads.internal.overlay.zzz zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final synchronized void zza(String str, Bundle bundle) {
        zzbhz zzbhzVar = this.zzb;
        if (zzbhzVar != null) {
            zzbhzVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final synchronized void zzb(String str, String str2) {
        zzbib zzbibVar = this.zzd;
        if (zzbibVar != null) {
            zzbibVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbL() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbL();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbu() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbu();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbv() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbv();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbx() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbx();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzby(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zze;
        if (zzzVar != null) {
            zzzVar.zzg();
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhz zzbhzVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbib zzbibVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar) {
        this.zza = zzaVar;
        this.zzb = zzbhzVar;
        this.zzc = zzoVar;
        this.zzd = zzbibVar;
        this.zze = zzzVar;
    }
}
