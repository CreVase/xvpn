package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class zzcsb implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcsb(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcsd.zzi(this.zza);
    }
}
