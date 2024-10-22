package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbhq extends zzbgr {
    final /* synthetic */ zzbht zza;

    public /* synthetic */ zzbhq(zzbht zzbhtVar, zzbhp zzbhpVar) {
        this.zza = zzbhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zze(zzbgi zzbgiVar, String str) {
        zzbht zzbhtVar = this.zza;
        if (zzbht.zza(zzbhtVar) == null) {
            return;
        }
        zzbht.zza(zzbhtVar).onCustomClick(zzbht.zzc(zzbhtVar, zzbgiVar), str);
    }
}
