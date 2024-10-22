package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzje implements Runnable {
    private final /* synthetic */ zziq zza;

    public zzje(zziq zziqVar) {
        this.zza = zziqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }
}
