package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzexf {
    public static zzetw zza(zzewj zzewjVar, zzerw zzerwVar, ScheduledExecutorService scheduledExecutorService, int i) {
        return i == 0 ? new zzese(zzerwVar, 0L, scheduledExecutorService) : new zzese(zzewjVar, 0L, scheduledExecutorService);
    }

    public static zzetw zzb(zzewt zzewtVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzese(zzewtVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdV)).longValue(), scheduledExecutorService);
    }

    public static zzetw zzc(zzexo zzexoVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzese(zzexoVar, 0L, scheduledExecutorService);
    }
}
