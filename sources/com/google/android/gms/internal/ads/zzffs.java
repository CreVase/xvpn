package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzffs implements zzfzp {
    final /* synthetic */ zzffv zza;
    final /* synthetic */ zzffw zzb;

    public zzffs(zzffw zzffwVar, zzffv zzffvVar) {
        this.zzb = zzffwVar;
        this.zza = zzffvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzffw zzffwVar = this.zzb;
            i = zzffwVar.zzf;
            if (i == 1) {
                zzffwVar.zzh();
            }
        }
    }
}
