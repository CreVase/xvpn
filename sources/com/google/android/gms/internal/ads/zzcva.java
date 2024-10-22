package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzcva implements zzdcw, zzcyz {
    private final Clock zza;
    private final zzcvc zzb;
    private final zzfdn zzc;
    private final String zzd;

    public zzcva(Clock clock, zzcvc zzcvcVar, zzfdn zzfdnVar, String str) {
        this.zza = clock;
        this.zzb = zzcvcVar;
        this.zzc = zzfdnVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzr() {
        zzfdn zzfdnVar = this.zzc;
        this.zzb.zzd(zzfdnVar.zzf, this.zzd, this.zza.elapsedRealtime());
    }
}
