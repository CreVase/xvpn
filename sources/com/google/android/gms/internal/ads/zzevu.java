package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzevu implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzevu(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
    }

    public static zzevs zza(String str, zzawy zzawyVar, zzcac zzcacVar, ScheduledExecutorService scheduledExecutorService, zzgad zzgadVar) {
        return new zzevs(str, zzawyVar, zzcacVar, scheduledExecutorService, zzgadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        String zza = ((zzewx) this.zza).zza();
        zzawy zzawyVar = new zzawy();
        zzcac zzcacVar = (zzcac) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzevs(zza, zzawyVar, zzcacVar, scheduledExecutorService, zzgadVar);
    }
}
