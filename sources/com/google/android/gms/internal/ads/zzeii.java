package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzeii extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzekt zzc;
    private final zzddc zzd;
    private final zzeio zze;
    private final zzeez zzf;

    public zzeii(zzchw zzchwVar, zzcwt zzcwtVar, zzekt zzektVar, zzddc zzddcVar, zzeio zzeioVar, zzeez zzeezVar) {
        this.zza = zzchwVar;
        this.zzb = zzcwtVar;
        this.zzc = zzektVar;
        this.zzd = zzddcVar;
        this.zze = zzeioVar;
        this.zzf = zzeezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final ml1 zzc(zzfdn zzfdnVar, Bundle bundle, zzfcr zzfcrVar, zzfde zzfdeVar) {
        zzcwt zzcwtVar = this.zzb;
        zzcwtVar.zzi(zzfdnVar);
        zzcwtVar.zzf(bundle);
        zzcwtVar.zzg(new zzcwn(zzfdeVar, zzfcrVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchw zzchwVar = this.zza;
        zzcwt zzcwtVar2 = this.zzb;
        zzdgw zzg = zzchwVar.zzg();
        zzg.zze(zzcwtVar2.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcue zza = zzg.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
