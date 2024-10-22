package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzeig extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzekt zzc;
    private final zzddc zzd;
    private final zzdho zze;
    private final zzdaa zzf;
    private final ViewGroup zzg;
    private final zzdch zzh;
    private final zzeio zzi;
    private final zzeez zzj;

    public zzeig(zzchw zzchwVar, zzcwt zzcwtVar, zzekt zzektVar, zzddc zzddcVar, zzdho zzdhoVar, zzdaa zzdaaVar, ViewGroup viewGroup, zzdch zzdchVar, zzeio zzeioVar, zzeez zzeezVar) {
        this.zza = zzchwVar;
        this.zzb = zzcwtVar;
        this.zzc = zzektVar;
        this.zzd = zzddcVar;
        this.zze = zzdhoVar;
        this.zzf = zzdaaVar;
        this.zzg = viewGroup;
        this.zzh = zzdchVar;
        this.zzi = zzeioVar;
        this.zzj = zzeezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final ml1 zzc(zzfdn zzfdnVar, Bundle bundle, zzfcr zzfcrVar, zzfde zzfdeVar) {
        zzcwt zzcwtVar = this.zzb;
        zzcwtVar.zzi(zzfdnVar);
        zzcwtVar.zzf(bundle);
        zzcwtVar.zzg(new zzcwn(zzfdeVar, zzfcrVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzchw zzchwVar = this.zza;
        zzcwt zzcwtVar2 = this.zzb;
        zzcrr zze = zzchwVar.zze();
        zze.zzi(zzcwtVar2.zzj());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcsp(this.zzf, this.zzh));
        zze.zzc(new zzcqs(this.zzg));
        zzcue zzd = zze.zzk().zzd();
        return zzd.zzi(zzd.zzj());
    }
}
