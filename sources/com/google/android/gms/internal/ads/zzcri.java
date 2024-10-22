package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcri implements zzhbc {
    private final zzcrc zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzcri(zzcrc zzcrcVar, zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzcrcVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
        this.zzd = zzhbpVar3;
        this.zze = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzcrc.zzf((Context) this.zzb.zzb(), ((zzcio) this.zzc).zza(), ((zzctn) this.zzd).zza(), ((zzcxc) this.zze).zza());
    }
}
