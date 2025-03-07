package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdaa extends zzdcz {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzdaa(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final synchronized void zze(long j) {
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzg.cancel(true);
        }
        this.zzd = this.zzc.elapsedRealtime() + j;
        this.zzg = this.zzb.schedule(new zzczz(this, null), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzf = false;
        zze(0L);
    }

    public final synchronized void zzb() {
        if (!this.zzf) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.zzg.cancel(true);
                this.zze = this.zzd - this.zzc.elapsedRealtime();
            } else {
                this.zze = -1L;
            }
            this.zzf = true;
        }
    }

    public final synchronized void zzc() {
        if (this.zzf) {
            if (this.zze > 0 && this.zzg.isCancelled()) {
                zze(this.zze);
            }
            this.zzf = false;
        }
    }

    public final synchronized void zzd(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.zzf) {
            long j = this.zze;
            if (j <= 0 || millis >= j) {
                millis = j;
            }
            this.zze = millis;
            return;
        }
        long elapsedRealtime = this.zzc.elapsedRealtime();
        long j2 = this.zzd;
        if (elapsedRealtime <= j2 && j2 - this.zzc.elapsedRealtime() <= millis) {
            return;
        }
        zze(millis);
    }
}
