package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcvz implements zzdag {
    private final Context zza;
    private final zzfdn zzb;
    private final zzcaz zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdur zze;
    private final zzfjh zzf;

    public zzcvz(Context context, zzfdn zzfdnVar, zzcaz zzcazVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdur zzdurVar, zzfjh zzfjhVar) {
        this.zza = context;
        this.zzb = zzfdnVar;
        this.zzc = zzcazVar;
        this.zzd = zzgVar;
        this.zze = zzdurVar;
        this.zzf = zzfjhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbr(zzbvg zzbvgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdN)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            zzcaz zzcazVar = this.zzc;
            zzfdn zzfdnVar = this.zzb;
            zzfjh zzfjhVar = this.zzf;
            com.google.android.gms.ads.internal.zzt.zza().zzc(context, zzcazVar, zzfdnVar.zzf, zzgVar.zzh(), zzfjhVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbs(zzfde zzfdeVar) {
    }
}
