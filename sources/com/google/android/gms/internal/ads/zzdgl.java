package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzdgl implements zzhbc {
    private final zzdga zza;
    private final zzhbp zzb;

    public zzdgl(zzdga zzdgaVar, zzhbp zzhbpVar) {
        this.zza = zzdgaVar;
        this.zzb = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = this.zza.zzf((zzcwi) this.zzb.zzb());
        zzhbk.zzb(zzf);
        return zzf;
    }
}
