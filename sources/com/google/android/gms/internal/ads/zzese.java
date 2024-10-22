package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzese implements zzetw {
    private final zzetw zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzese(zzetw zzetwVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetwVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        ml1 zzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb = zzfzt.zzo(zzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfzt.zzf(zzb, Throwable.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzh(null);
            }
        }, zzcbg.zzf);
    }
}
