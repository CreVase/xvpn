package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdse implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdse(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdsr zzdsrVar = (zzdsr) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        zzeby zzebyVar = (zzeby) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            return new zzdev(zzebyVar, zzgadVar);
        }
        return new zzdev(zzdsrVar, zzgadVar);
    }
}
