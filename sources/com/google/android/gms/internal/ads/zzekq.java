package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzekq implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzcbl zza;
    final /* synthetic */ zzfde zzb;
    final /* synthetic */ zzfcr zzc;
    final /* synthetic */ zzekw zzd;
    final /* synthetic */ zzekr zze;

    public zzekq(zzekr zzekrVar, zzcbl zzcblVar, zzfde zzfdeVar, zzfcr zzfcrVar, zzekw zzekwVar) {
        this.zze = zzekrVar;
        this.zza = zzcblVar;
        this.zzb = zzfdeVar;
        this.zzc = zzfcrVar;
        this.zzd = zzekwVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzela zzelaVar;
        zzekw zzekwVar = this.zzd;
        zzelaVar = this.zze.zzd;
        this.zza.zzc(zzelaVar.zza(this.zzb, this.zzc, view, zzekwVar));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
