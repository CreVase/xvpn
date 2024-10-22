package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjr implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zziq zzb;

    public zzjr(zziq zziqVar, AtomicReference atomicReference) {
        this.zzb = zziqVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Integer.valueOf(this.zzb.zze().zzb(this.zzb.zzg().zzad(), zzbi.zzan)));
            } finally {
                this.zza.notify();
            }
        }
    }
}
