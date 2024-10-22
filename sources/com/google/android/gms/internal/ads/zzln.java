package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzln {
    private final zzlm zza;
    private final zzll zzb;
    private final zzdy zzc;
    private final zzcv zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzln(zzll zzllVar, zzlm zzlmVar, zzcv zzcvVar, int i, zzdy zzdyVar, Looper looper) {
        this.zzb = zzllVar;
        this.zza = zzlmVar;
        this.zzd = zzcvVar;
        this.zzg = looper;
        this.zzc = zzdyVar;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzlm zzc() {
        return this.zza;
    }

    public final zzln zzd() {
        zzdx.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzln zze(Object obj) {
        zzdx.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzln zzf(int i) {
        zzdx.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        boolean z;
        zzdx.zzf(this.zzi);
        if (this.zzg.getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzk) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
