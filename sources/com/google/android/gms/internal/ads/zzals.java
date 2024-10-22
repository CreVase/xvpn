package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class zzals extends Thread {
    private static final boolean zza = zzams.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzalq zzd;
    private volatile boolean zze = false;
    private final zzamt zzf;
    private final zzalx zzg;

    public zzals(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzalq zzalqVar, zzalx zzalxVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzalqVar;
        this.zzg = zzalxVar;
        this.zzf = new zzamt(this, blockingQueue2, zzalxVar);
    }

    private void zzc() throws InterruptedException {
        zzamg zzamgVar = (zzamg) this.zzb.take();
        zzamgVar.zzm("cache-queue-take");
        zzamgVar.zzt(1);
        try {
            zzamgVar.zzw();
            zzalp zza2 = this.zzd.zza(zzamgVar.zzj());
            if (zza2 == null) {
                zzamgVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzamgVar)) {
                    this.zzc.put(zzamgVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzamgVar.zzm("cache-hit-expired");
                zzamgVar.zze(zza2);
                if (!this.zzf.zzc(zzamgVar)) {
                    this.zzc.put(zzamgVar);
                }
                return;
            }
            zzamgVar.zzm("cache-hit");
            zzamm zzh = zzamgVar.zzh(new zzamc(zza2.zza, zza2.zzg));
            zzamgVar.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzamgVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzamgVar.zzj(), true);
                zzamgVar.zze(null);
                if (!this.zzf.zzc(zzamgVar)) {
                    this.zzc.put(zzamgVar);
                }
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzamgVar.zzm("cache-hit-refresh-needed");
                zzamgVar.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzamgVar)) {
                    this.zzg.zzb(zzamgVar, zzh, new zzalr(this, zzamgVar));
                } else {
                    this.zzg.zzb(zzamgVar, zzh, null);
                }
            } else {
                this.zzg.zzb(zzamgVar, zzh, null);
            }
        } finally {
            zzamgVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzams.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzams.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
