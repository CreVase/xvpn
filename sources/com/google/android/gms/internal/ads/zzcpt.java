package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcpt implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzcpt(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzaus zzausVar = (zzaus) this.zza.zzb();
        zzboj zzbojVar = (zzboj) this.zzb.zzb();
        zzgad zza = zzfge.zza();
        zzhbk.zzb(zza);
        return new zzcpm(zzausVar.zzc(), zzbojVar, zza);
    }
}
