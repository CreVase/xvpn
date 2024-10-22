package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzms implements Runnable {
    private final /* synthetic */ zzna zza;
    private final /* synthetic */ zzmp zzb;

    public zzms(zzmp zzmpVar, zzna zznaVar) {
        this.zzb = zzmpVar;
        this.zza = zznaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp.zza(this.zzb, this.zza);
        this.zzb.zzv();
    }
}
