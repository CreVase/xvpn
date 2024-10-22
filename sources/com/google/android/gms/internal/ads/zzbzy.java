package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbzy extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcac zza;

    public zzbzy(zzcac zzcacVar) {
        this.zza = zzcacVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcaz zzcazVar;
        Object obj;
        zzbcq zzbcqVar;
        zzcac zzcacVar = this.zza;
        context = zzcacVar.zze;
        zzcazVar = zzcacVar.zzf;
        zzbco zzbcoVar = new zzbco(context, zzcazVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbcqVar = this.zza.zzh;
                zzbcr.zza(zzbcqVar, zzbcoVar);
            } catch (IllegalArgumentException e) {
                zzcat.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
