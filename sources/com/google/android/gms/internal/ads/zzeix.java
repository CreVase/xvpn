package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzeix implements zzhbc {
    private final zzeiw zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzeix(zzeiw zzeiwVar, zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzeiwVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
        this.zzd = zzhbpVar3;
        this.zze = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzeiq) this.zzc).zzb(), (zzeez) this.zzd.zzb(), (zzfjx) this.zze.zzb());
    }
}
