package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
final class zzejv extends zzbwg {
    final /* synthetic */ zzczr zza;
    final /* synthetic */ zzcxj zzb;
    final /* synthetic */ zzcys zzc;
    final /* synthetic */ zzdfm zzd;

    public zzejv(zzejw zzejwVar, zzczr zzczrVar, zzcxj zzcxjVar, zzcys zzcysVar, zzdfm zzdfmVar) {
        this.zza = zzczrVar;
        this.zzb = zzcxjVar;
        this.zzc = zzcysVar;
        this.zzd = zzdfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzby(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzbv();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzm(IObjectWrapper iObjectWrapper, zzbwi zzbwiVar) {
        this.zzd.zza(zzbwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
