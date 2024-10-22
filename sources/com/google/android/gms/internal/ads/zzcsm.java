package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcsm implements zzcyz, zzauw {
    private final zzfcr zza;
    private final zzcyd zzb;
    private final zzczi zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcsm(zzfcr zzfcrVar, zzcyd zzcydVar, zzczi zzcziVar) {
        this.zza = zzfcrVar;
        this.zzb = zzcydVar;
        this.zzc = zzcziVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzbt(zzauv zzauvVar) {
        if (this.zza.zzf == 1 && zzauvVar.zzj) {
            zza();
        }
        if (zzauvVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final synchronized void zzr() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
