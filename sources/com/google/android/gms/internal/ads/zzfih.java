package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzfih implements zzfib {
    private final zzfil zza;
    private final zzfij zzb;
    private final zzfhy zzc;

    public zzfih(zzfhy zzfhyVar, zzfil zzfilVar, zzfij zzfijVar) {
        this.zzc = zzfhyVar;
        this.zza = zzfilVar;
        this.zzb = zzfijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    public final String zza(zzfia zzfiaVar) {
        zzfij zzfijVar = this.zzb;
        Map zzj = zzfiaVar.zzj();
        zzfijVar.zza(zzj);
        return this.zza.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    public final void zzb(zzfia zzfiaVar) {
        this.zzc.zzb(zza(zzfiaVar));
    }
}
