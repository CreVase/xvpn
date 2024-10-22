package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class zzama extends Thread {
    private final BlockingQueue zza;
    private final zzalz zzb;
    private final zzalq zzc;
    private volatile boolean zzd = false;
    private final zzalx zze;

    public zzama(BlockingQueue blockingQueue, zzalz zzalzVar, zzalq zzalqVar, zzalx zzalxVar) {
        this.zza = blockingQueue;
        this.zzb = zzalzVar;
        this.zzc = zzalqVar;
        this.zze = zzalxVar;
    }

    private void zzb() throws InterruptedException {
        zzamg zzamgVar = (zzamg) this.zza.take();
        SystemClock.elapsedRealtime();
        zzamgVar.zzt(3);
        try {
            zzamgVar.zzm("network-queue-take");
            zzamgVar.zzw();
            TrafficStats.setThreadStatsTag(zzamgVar.zzc());
            zzamc zza = this.zzb.zza(zzamgVar);
            zzamgVar.zzm("network-http-complete");
            if (zza.zze && zzamgVar.zzv()) {
                zzamgVar.zzp("not-modified");
                zzamgVar.zzr();
                return;
            }
            zzamm zzh = zzamgVar.zzh(zza);
            zzamgVar.zzm("network-parse-complete");
            if (zzh.zzb != null) {
                this.zzc.zzd(zzamgVar.zzj(), zzh.zzb);
                zzamgVar.zzm("network-cache-written");
            }
            zzamgVar.zzq();
            this.zze.zzb(zzamgVar, zzh, null);
            zzamgVar.zzs(zzh);
        } catch (zzamp e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzamgVar, e);
            zzamgVar.zzr();
        } catch (Exception e2) {
            zzams.zzc(e2, "Unhandled exception %s", e2.toString());
            zzamp zzampVar = new zzamp(e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzamgVar, zzampVar);
            zzamgVar.zzr();
        } finally {
            zzamgVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzams.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
