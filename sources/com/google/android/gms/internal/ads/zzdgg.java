package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdgg implements zzhbc {
    private final zzdga zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzdgg(zzdga zzdgaVar, zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzdgaVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
        this.zzd = zzhbpVar3;
        this.zze = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final zzcaz zza = ((zzcio) this.zzc).zza();
        final zzfcr zza2 = ((zzctn) this.zzd).zza();
        final zzfdn zza3 = ((zzcxc) this.zze).zza();
        return new zzdev(new zzcyz() { // from class: com.google.android.gms.internal.ads.zzdfy
            @Override // com.google.android.gms.internal.ads.zzcyz
            public final void zzr() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zza.zza, zza2.zzE.toString(), zza3.zzf);
            }
        }, zzcbg.zzf);
    }
}
