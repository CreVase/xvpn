package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfnt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh implements zzfnt {
    final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zza(int i, long j) {
        zzfmq zzfmqVar;
        zzfmqVar = this.zza.zzi;
        zzfmqVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zzb(int i, long j, String str) {
        zzfmq zzfmqVar;
        zzfmqVar = this.zza.zzi;
        zzfmqVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
