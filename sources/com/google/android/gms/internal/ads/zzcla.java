package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcla implements zzdty {
    private final Context zza;
    private final zzbkh zzb;
    private final zzcjs zzc;
    private final zzcla zzd = this;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;

    public /* synthetic */ zzcla(zzcjs zzcjsVar, Context context, zzbkh zzbkhVar, zzckz zzckzVar) {
        this.zzc = zzcjsVar;
        this.zza = context;
        this.zzb = zzbkhVar;
        zzhbc zza = zzhbd.zza(this);
        this.zze = zza;
        zzhbc zza2 = zzhbd.zza(zzbkhVar);
        this.zzf = zza2;
        zzdtu zzdtuVar = new zzdtu(zza2);
        this.zzg = zzdtuVar;
        this.zzh = zzhbb.zzc(new zzdtw(zza, zzdtuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdty
    public final zzdtp zzb() {
        return new zzcku(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdty
    public final zzdtv zzd() {
        return (zzdtv) this.zzh.zzb();
    }
}
