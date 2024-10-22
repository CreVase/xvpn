package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzefw implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;

    public zzefw(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefv zzb() {
        return new zzefv((zzcrs) this.zza.zzb(), (Context) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzdpt) this.zzd.zzb(), ((zzcxc) this.zze).zza(), (zzfsk) this.zzf.zzb());
    }
}
