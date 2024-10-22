package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzekz implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzdfx zza;

    public zzekz(zzela zzelaVar, zzdfx zzdfxVar) {
        this.zza = zzdfxVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
