package com.google.android.gms.internal.appset;

import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes.dex */
final class zzj implements Runnable {
    final /* synthetic */ zzl zza;

    public /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long zza = this.zza.zza();
        if (zza != -1 && DefaultClock.getInstance().currentTimeMillis() > zza) {
            zzl.zze(zzl.zzb(this.zza));
        }
    }
}
