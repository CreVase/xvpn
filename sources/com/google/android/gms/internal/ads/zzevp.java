package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzevp implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzevp(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcic) this.zzb).zza();
        String zza2 = ((zzewx) this.zzc).zza();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzevn(null, zza, zza2, zzgadVar);
    }
}
