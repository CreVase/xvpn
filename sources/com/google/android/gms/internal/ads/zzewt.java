package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzewt implements zzetw {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbsz zzc;

    public zzewt(zzbsz zzbszVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbszVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zzm(zzfzt.zzo(zzfzt.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdV)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzews
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzewu((Bundle) obj);
            }
        }, zzcbg.zza);
    }
}
