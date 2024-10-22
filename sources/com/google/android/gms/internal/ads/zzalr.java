package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzalr implements Runnable {
    final /* synthetic */ zzamg zza;
    final /* synthetic */ zzals zzb;

    public zzalr(zzals zzalsVar, zzamg zzamgVar) {
        this.zzb = zzalsVar;
        this.zza = zzamgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
