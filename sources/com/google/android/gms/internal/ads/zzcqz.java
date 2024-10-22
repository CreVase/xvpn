package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcqz implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;

    public zzcqz(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7, zzhbp zzhbpVar8, zzhbp zzhbpVar9, zzhbp zzhbpVar10) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
        this.zzg = zzhbpVar7;
        this.zzh = zzhbpVar8;
        this.zzi = zzhbpVar9;
        this.zzj = zzhbpVar10;
    }

    public static zzcqy zzc(zzcsw zzcswVar, Context context, zzfcs zzfcsVar, View view, zzcgb zzcgbVar, zzcsv zzcsvVar, zzdju zzdjuVar, zzdff zzdffVar, zzhaw zzhawVar, Executor executor) {
        return new zzcqy(zzcswVar, context, zzfcsVar, view, zzcgbVar, zzcsvVar, zzdjuVar, zzdffVar, zzhawVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcqy zzb() {
        return new zzcqy(((zzcvf) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcrf) this.zzc).zza(), ((zzcre) this.zzd).zza(), ((zzcrq) this.zze).zza(), ((zzcrg) this.zzf).zza(), ((zzdhr) this.zzg).zza(), (zzdff) this.zzh.zzb(), zzhbb.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
