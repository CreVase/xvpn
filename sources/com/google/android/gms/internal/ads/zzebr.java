package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzebr implements zzdag, zzcyz, zzcxo {
    private final zzfia zza;
    private final zzfib zzb;
    private final zzcag zzc;

    public zzebr(zzfia zzfiaVar, zzfib zzfibVar, zzcag zzcagVar) {
        this.zza = zzfiaVar;
        this.zzb = zzfibVar;
        this.zzc = zzcagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfia zzfiaVar = this.zza;
        zzfiaVar.zza("action", "ftl");
        zzfiaVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfiaVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbr(zzbvg zzbvgVar) {
        this.zza.zzi(zzbvgVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbs(zzfde zzfdeVar) {
        this.zza.zzh(zzfdeVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzr() {
        zzfia zzfiaVar = this.zza;
        zzfiaVar.zza("action", "loaded");
        this.zzb.zzb(zzfiaVar);
    }
}
