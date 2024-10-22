package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzeik extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzddc zzc;
    private final zzeio zzd;
    private final zzfdf zze;
    private final zzeez zzf;

    public zzeik(zzchw zzchwVar, zzcwt zzcwtVar, zzddc zzddcVar, zzfdf zzfdfVar, zzeio zzeioVar, zzeez zzeezVar) {
        this.zza = zzchwVar;
        this.zzb = zzcwtVar;
        this.zzc = zzddcVar;
        this.zze = zzfdfVar;
        this.zzd = zzeioVar;
        this.zzf = zzeezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final ml1 zzc(zzfdn zzfdnVar, Bundle bundle, zzfcr zzfcrVar, zzfde zzfdeVar) {
        zzfdf zzfdfVar;
        zzcwt zzcwtVar = this.zzb;
        zzcwtVar.zzi(zzfdnVar);
        zzcwtVar.zzf(bundle);
        zzcwtVar.zzg(new zzcwn(zzfdeVar, zzfcrVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdo)).booleanValue() && (zzfdfVar = this.zze) != null) {
            this.zzb.zzh(zzfdfVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchw zzchwVar = this.zza;
        zzcwt zzcwtVar2 = this.zzb;
        zzdpb zzi = zzchwVar.zzi();
        zzi.zzd(zzcwtVar2.zzj());
        zzi.zzc(this.zzc);
        zzcue zzb = zzi.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
