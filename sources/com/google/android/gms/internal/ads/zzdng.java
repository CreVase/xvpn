package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdng implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;

    public zzdng(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7, zzhbp zzhbpVar8, zzhbp zzhbpVar9) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
        this.zzg = zzhbpVar7;
        this.zzh = zzhbpVar8;
        this.zzi = zzhbpVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdne(((zzcxc) this.zza).zza(), (Executor) this.zzb.zzb(), (zzdpt) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzdso) this.zze.zzb(), (zzfib) this.zzf.zzb(), (zzfjx) this.zzg.zzb(), (zzedo) this.zzh.zzb(), (zzdoo) this.zzi.zzb());
    }
}
