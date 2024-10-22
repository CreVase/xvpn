package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdpt {
    private final zzcgn zza;
    private final Context zzb;
    private final zzaro zzc;
    private final zzbdk zzd;
    private final zzcaz zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzaxv zzg;
    private final zzdaa zzh;
    private final zzedz zzi;

    public zzdpt(zzcgn zzcgnVar, Context context, zzaro zzaroVar, zzbdk zzbdkVar, zzcaz zzcazVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxv zzaxvVar, zzdaa zzdaaVar, zzedz zzedzVar) {
        this.zza = zzcgnVar;
        this.zzb = context;
        this.zzc = zzaroVar;
        this.zzd = zzbdkVar;
        this.zze = zzcazVar;
        this.zzf = zzaVar;
        this.zzg = zzaxvVar;
        this.zzh = zzdaaVar;
        this.zzi = zzedzVar;
    }

    public final zzcgb zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfcr zzfcrVar, zzfcv zzfcvVar) throws zzcgm {
        zzchq zzc = zzchq.zzc(zzqVar);
        String str = zzqVar.zza;
        zzdpi zzdpiVar = new zzdpi(this);
        zzedz zzedzVar = this.zzi;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzf;
        zzaxv zzaxvVar = this.zzg;
        return zzcgn.zza(this.zzb, zzc, str, false, false, this.zzc, this.zzd, this.zze, null, zzdpiVar, zzaVar, zzaxvVar, zzfcrVar, zzfcvVar, zzedzVar);
    }
}
