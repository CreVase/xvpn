package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfmf {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfme zzd = null;

    public zzfmf() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfme zzfmeVar = (zzfme) this.zzc.poll();
        this.zzd = zzfmeVar;
        if (zzfmeVar != null) {
            zzfmeVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfme zzfmeVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfme zzfmeVar) {
        zzfmeVar.zzb(this);
        this.zzc.add(zzfmeVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
