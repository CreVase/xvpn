package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdqx implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdqx(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
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
