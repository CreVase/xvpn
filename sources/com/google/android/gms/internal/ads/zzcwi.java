package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcwi implements zzcxl, zzdem, zzdcd, zzcyb, zzauw {
    private final zzcyd zza;
    private final zzfcr zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgal zze = zzgal.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcwi(zzcyd zzcydVar, zzfcr zzfcrVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcydVar;
        this.zzb = zzfcrVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        if (this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzbt(zzauv zzauvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzku)).booleanValue() && zzm() && zzauvVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzbw(zzbvw zzbvwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzc() {
        zzfcr zzfcrVar = this.zzb;
        if (zzfcrVar.zzf == 3) {
            return;
        }
        int i = zzfcrVar.zzaa;
        if (i != 0 && i != 1) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzku)).booleanValue() && zzm()) {
            return;
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzf() {
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcd
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcd
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzk() {
        if (this.zzb.zzf == 3) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbu)).booleanValue()) {
            zzfcr zzfcrVar = this.zzb;
            if (zzfcrVar.zzaa == 2) {
                if (zzfcrVar.zzs == 0) {
                    this.zza.zza();
                } else {
                    zzfzt.zzr(this.zze, new zzcwh(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcwi.this.zzh();
                        }
                    }, this.zzb.zzs, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final synchronized void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }
}
