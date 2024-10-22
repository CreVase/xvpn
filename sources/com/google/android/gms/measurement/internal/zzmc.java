package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmc {
    final /* synthetic */ zzlx zza;
    private zzmb zzb;

    public zzmc(zzlx zzlxVar) {
        this.zza = zzlxVar;
    }

    public final void zza(long j) {
        Handler handler;
        this.zzb = new zzmb(this, this.zza.zzb().currentTimeMillis(), j);
        handler = this.zza.zzc;
        handler.postDelayed(this.zzb, 2000L);
    }

    public final void zza() {
        Handler handler;
        this.zza.zzt();
        if (this.zzb != null) {
            handler = this.zza.zzc;
            handler.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
    }
}
