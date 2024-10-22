package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzdwv implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdwv(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaro zzaroVar = (zzaro) this.zza.zzb();
        final Context zza = ((zzcic) this.zzb).zza();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        ml1 zzb = zzgadVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdws
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaro.this.zzc().zzg(zza);
            }
        });
        zzhbk.zzb(zzb);
        return zzb;
    }
}
