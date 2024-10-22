package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbhs extends zzbgu {
    final /* synthetic */ zzbht zza;

    public /* synthetic */ zzbhs(zzbht zzbhtVar, zzbhr zzbhrVar) {
        this.zza = zzbhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final void zze(zzbgi zzbgiVar) {
        zzbht zzbhtVar = this.zza;
        zzbhtVar.zza.onCustomTemplateAdLoaded(zzbht.zzc(zzbhtVar, zzbgiVar));
    }
}
