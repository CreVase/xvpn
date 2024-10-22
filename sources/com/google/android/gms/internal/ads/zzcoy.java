package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzcoy implements zzcxo {
    private final zzfcv zza;
    private final zzfde zzb;
    private final zzfjt zzc;
    private final zzfjx zzd;

    public zzcoy(zzfde zzfdeVar, zzfjx zzfjxVar, zzfjt zzfjtVar) {
        this.zzb = zzfdeVar;
        this.zzd = zzfjxVar;
        this.zzc = zzfjtVar;
        this.zza = zzfdeVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}
