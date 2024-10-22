package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzctu implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzctu(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzczu zzczuVar = (zzczu) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzdev(zzczuVar, zzgadVar);
    }
}
