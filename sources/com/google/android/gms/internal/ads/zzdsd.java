package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdsd implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdsd(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdrz zzdrzVar = (zzdrz) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        zzebr zzebrVar = (zzebr) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            return new zzdev(zzebrVar, zzgadVar);
        }
        return new zzdev(zzdrzVar, zzgadVar);
    }
}
