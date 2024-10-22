package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdpd implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdpd(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        int i = ((zzcxc) this.zzc).zza().zzo.zza;
        if (i != 0) {
            if (i - 1 != 0) {
                return ((zzekg) this.zzb).zzb();
            }
            return ((zzekg) this.zza).zzb();
        }
        throw null;
    }
}
