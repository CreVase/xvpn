package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjt implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zziq zzb;

    public zzjt(zziq zziqVar, Boolean bool) {
        this.zzb = zziqVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza, true);
    }
}
