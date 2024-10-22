package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class zzesg implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzesg(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesf(((zzdwy) this.zza).zzb(), (PackageInfo) this.zzb.zzb(), ((zzcic) this.zzc).zza());
    }
}
