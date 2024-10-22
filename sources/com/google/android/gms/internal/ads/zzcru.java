package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcru implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzcru(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzcsa) this.zza).zzb().booleanValue();
        zzeig zzb = ((zzeih) this.zzb).zzb();
        zzekf zzb2 = ((zzekg) this.zzc).zzb();
        if (booleanValue) {
            return zzb;
        }
        return zzb2;
    }
}
