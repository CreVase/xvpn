package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzaw {
    private static volatile Handler zza;
    private final zzif zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzaw(zzif zzifVar) {
        Preconditions.checkNotNull(zzifVar);
        this.zzb = zzifVar;
        this.zzc = new zzav(this, zzifVar);
    }

    private final Handler zzd() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzaw.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzcp(this.zzb.zza().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public abstract void zzb();

    public final boolean zzc() {
        if (this.zzd != 0) {
            return true;
        }
        return false;
    }

    public final void zza() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    public final void zza(long j) {
        zza();
        if (j >= 0) {
            this.zzd = this.zzb.zzb().currentTimeMillis();
            if (zzd().postDelayed(this.zzc, j)) {
                return;
            }
            this.zzb.zzj().zzg().zza("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }
}
