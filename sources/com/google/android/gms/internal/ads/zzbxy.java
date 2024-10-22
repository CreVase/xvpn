package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbxy {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzbyy zzc;

    public zzbxy(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyy zzbyyVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzbyyVar;
    }

    public final void zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaq)).booleanValue()) {
            return;
        }
        this.zzc.zzt();
    }

    public final void zzb(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzap)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaq)).booleanValue()) {
            this.zzb.zzL(-1);
            this.zzb.zzM(j);
        } else {
            this.zzb.zzL(i);
            this.zzb.zzM(j);
        }
        zza();
    }
}
