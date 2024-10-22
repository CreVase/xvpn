package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzeie extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzddc zzc;
    private final zzeio zzd;
    private final zzeez zze;

    public zzeie(zzchw zzchwVar, zzcwt zzcwtVar, zzddc zzddcVar, zzeio zzeioVar, zzeez zzeezVar) {
        this.zza = zzchwVar;
        this.zzb = zzcwtVar;
        this.zzc = zzddcVar;
        this.zzd = zzeioVar;
        this.zze = zzeezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final ml1 zzc(zzfdn zzfdnVar, Bundle bundle, zzfcr zzfcrVar, zzfde zzfdeVar) {
        zzcwt zzcwtVar = this.zzb;
        zzcwtVar.zzi(zzfdnVar);
        zzcwtVar.zzf(bundle);
        zzcwtVar.zzg(new zzcwn(zzfdeVar, zzfcrVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzchw zzchwVar = this.zza;
        zzcwt zzcwtVar2 = this.zzb;
        zzcqi zzd = zzchwVar.zzd();
        zzd.zzd(zzcwtVar2.zzj());
        zzd.zzc(this.zzc);
        zzcue zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
