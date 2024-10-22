package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzflx implements Runnable {
    final /* synthetic */ zzfmc zza;

    public zzflx(zzfmc zzfmcVar) {
        this.zza = zzfmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflw zzflwVar;
        zzflwVar = this.zza.zzl;
        zzflwVar.zzb();
    }
}
