package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdzf implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzdzf(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdze zzb() {
        zzgad zzgadVar = zzcbg.zzb;
        zzhbk.zzb(zzgadVar);
        zzgad zzgadVar2 = zzcbg.zza;
        zzhbk.zzb(zzgadVar2);
        return new zzdze(zzgadVar, zzgadVar2, ((zzeaa) this.zzc).zzb(), zzhbb.zza(this.zzd));
    }
}
