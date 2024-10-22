package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdof implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcgn zzb;
    private final Context zzc;
    private final zzdso zzd;
    private final zzfib zze;
    private final zzedo zzf;
    private final Executor zzg;
    private final zzaro zzh;
    private final zzcaz zzi;
    private final zzfjx zzj;
    private final zzedz zzk;

    public zzdof(Context context, Executor executor, zzaro zzaroVar, zzcaz zzcazVar, com.google.android.gms.ads.internal.zza zzaVar, zzcgn zzcgnVar, zzedo zzedoVar, zzfjx zzfjxVar, zzdso zzdsoVar, zzfib zzfibVar, zzedz zzedzVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaroVar;
        this.zzi = zzcazVar;
        this.zza = zzaVar;
        this.zzb = zzcgnVar;
        this.zzf = zzedoVar;
        this.zzj = zzfjxVar;
        this.zzd = zzdsoVar;
        this.zze = zzfibVar;
        this.zzk = zzedzVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdof zzdofVar) {
        return zzdofVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzaro zzb(zzdof zzdofVar) {
        return zzdofVar.zzh;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdof zzdofVar) {
        return zzdofVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzcaz zzd(zzdof zzdofVar) {
        return zzdofVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzcgn zze(zzdof zzdofVar) {
        return zzdofVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzdso zzf(zzdof zzdofVar) {
        return zzdofVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzedo zzg(zzdof zzdofVar) {
        return zzdofVar.zzf;
    }

    public static /* bridge */ /* synthetic */ zzedz zzh(zzdof zzdofVar) {
        return zzdofVar.zzk;
    }

    public static /* bridge */ /* synthetic */ zzfib zzi(zzdof zzdofVar) {
        return zzdofVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzfjx zzj(zzdof zzdofVar) {
        return zzdofVar.zzj;
    }

    public static /* bridge */ /* synthetic */ Executor zzk(zzdof zzdofVar) {
        return zzdofVar.zzg;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdoi zzdoiVar = new zzdoi(this);
        zzdoiVar.zzh();
        return zzdoiVar;
    }
}
