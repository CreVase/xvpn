package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdqv implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdqv(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdri zzdriVar = (zzdri) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzdev(zzdriVar, zzgadVar);
    }
}
