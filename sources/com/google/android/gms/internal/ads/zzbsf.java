package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbsf extends zzbgr {
    final /* synthetic */ zzbsi zza;

    public /* synthetic */ zzbsf(zzbsi zzbsiVar, zzbse zzbseVar) {
        this.zza = zzbsiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zze(zzbgi zzbgiVar, String str) {
        zzbsi zzbsiVar = this.zza;
        if (zzbsiVar.zzb == null) {
            return;
        }
        zzbsiVar.zzb.onCustomClick(zzbsiVar.zzf(zzbgiVar), str);
    }
}
