package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcuy implements com.google.android.gms.ads.internal.client.zza {
    private final zzcvc zza;
    private final zzfdn zzb;

    public zzcuy(zzcvc zzcvcVar, zzfdn zzfdnVar) {
        this.zza = zzcvcVar;
        this.zzb = zzfdnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
