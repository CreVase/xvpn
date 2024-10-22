package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzdtg implements zzhbc {
    private final zzdtc zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdtg(zzdtc zzdtcVar, zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzdtcVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdtm zzdtmVar = (zzdtm) this.zzb.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        Set zzd = zzdtc.zzd(zzdtmVar, zzgadVar);
        zzhbk.zzb(zzd);
        return zzd;
    }
}
