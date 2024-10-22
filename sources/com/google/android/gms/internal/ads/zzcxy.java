package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcxy extends zzdcz implements zzcxp {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcxy(zzcxx zzcxxVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcxxVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcxq
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzcxp) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzb() {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcxr
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzcxp) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzc(final zzdhe zzdheVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcxt
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzcxp) obj).zzc(zzdhe.this);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzcat.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdhe("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxs
            @Override // java.lang.Runnable
            public final void run() {
                zzcxy.this.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjR)).intValue(), TimeUnit.MILLISECONDS);
    }
}
