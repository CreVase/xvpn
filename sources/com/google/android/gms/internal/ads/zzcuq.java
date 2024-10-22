package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzcuq implements zzcyz, com.google.android.gms.ads.internal.client.zza, zzdag, zzcyf, zzcxl, zzdcs {
    private final Clock zza;
    private final zzbzv zzb;

    public zzcuq(Clock clock, zzbzv zzbzvVar) {
        this.zza = clock;
        this.zzb = zzbzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbr(zzbvg zzbvgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbs(zzfde zzfdeVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzbw(zzbvw zzbvwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdcs
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcs
    public final void zzi(zzayq zzayqVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdcs
    public final void zzj(zzayq zzayqVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcs
    public final void zzl(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcs
    public final void zzm(zzayq zzayqVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcs
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzr() {
        this.zzb.zzh(true);
    }
}
