package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzge implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzgb zzb;

    public zzge(zzgb zzgbVar, boolean z) {
        this.zzb = zzgbVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmpVar = this.zzb.zzb;
        zzmpVar.zza(this.zza);
    }
}
