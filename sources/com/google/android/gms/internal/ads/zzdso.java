package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
public final class zzdso {
    private final zzdst zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdso(zzdst zzdstVar, Executor executor) {
        this.zza = zzdstVar;
        this.zzc = zzdstVar.zza();
        this.zzb = executor;
    }

    public final zzdsn zza() {
        zzdsn zzdsnVar = new zzdsn(this);
        zzdsn.zza(zzdsnVar);
        return zzdsnVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkF)).booleanValue()) {
            return;
        }
        zzdsn zza = zza();
        zza.zzb("action", "pecr");
        zza.zzg();
    }
}
