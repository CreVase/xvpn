package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzamj {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzalq zze;
    private final zzalz zzf;
    private final zzama[] zzg;
    private zzals zzh;
    private final List zzi;
    private final List zzj;
    private final zzalx zzk;

    public zzamj(zzalq zzalqVar, zzalz zzalzVar, int i) {
        zzalx zzalxVar = new zzalx(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzalqVar;
        this.zzf = zzalzVar;
        this.zzg = new zzama[4];
        this.zzk = zzalxVar;
    }

    public final zzamg zza(zzamg zzamgVar) {
        zzamgVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzamgVar);
        }
        zzamgVar.zzg(this.zza.incrementAndGet());
        zzamgVar.zzm("add-to-queue");
        zzc(zzamgVar, 0);
        this.zzc.add(zzamgVar);
        return zzamgVar;
    }

    public final void zzb(zzamg zzamgVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzamgVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzami) it.next()).zza();
            }
        }
        zzc(zzamgVar, 5);
    }

    public final void zzc(zzamg zzamgVar, int i) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzamh) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzals zzalsVar = this.zzh;
        if (zzalsVar != null) {
            zzalsVar.zzb();
        }
        zzama[] zzamaVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzama zzamaVar = zzamaVarArr[i];
            if (zzamaVar != null) {
                zzamaVar.zza();
            }
        }
        zzals zzalsVar2 = new zzals(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzalsVar2;
        zzalsVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzama zzamaVar2 = new zzama(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzamaVar2;
            zzamaVar2.start();
        }
    }
}
