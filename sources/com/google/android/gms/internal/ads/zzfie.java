package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfie implements zzfib {
    private final zzfib zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziu)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfie(zzfib zzfibVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfibVar;
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzit)).intValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkO)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfid
                @Override // java.lang.Runnable
                public final void run() {
                    zzfie.zzc(zzfie.this);
                }
            }, intValue, intValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfid
                @Override // java.lang.Runnable
                public final void run() {
                    zzfie.zzc(zzfie.this);
                }
            }, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void zzc(zzfie zzfieVar) {
        while (!zzfieVar.zzb.isEmpty()) {
            zzfieVar.zza.zzb((zzfia) zzfieVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    public final String zza(zzfia zzfiaVar) {
        return this.zza.zza(zzfiaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    public final void zzb(zzfia zzfiaVar) {
        if (this.zzb.size() >= this.zzc) {
            if (!this.zzd.getAndSet(true)) {
                Queue queue = this.zzb;
                zzfia zzb = zzfia.zzb("dropped_event");
                Map zzj = zzfiaVar.zzj();
                if (zzj.containsKey("action")) {
                    zzb.zza("dropped_action", (String) zzj.get("action"));
                }
                queue.offer(zzb);
                return;
            }
            return;
        }
        this.zzb.offer(zzfiaVar);
    }
}
