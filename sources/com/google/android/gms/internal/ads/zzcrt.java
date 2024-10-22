package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcrt implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzcrt(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        zzfdn zza = ((zzcxc) this.zza).zza();
        zzego zzb = ((zzegp) this.zzb).zzb();
        zzefv zzb2 = ((zzefw) this.zzc).zzb();
        if (zza.zza() == null) {
            return zzb2;
        }
        return zzb;
    }
}
