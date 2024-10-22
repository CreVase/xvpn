package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfrp extends zzfrm {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfrm zzb;
    final /* synthetic */ zzfrw zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfrp(zzfrw zzfrwVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfrm zzfrmVar) {
        super(taskCompletionSource);
        this.zzc = zzfrwVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzfrl zzfrlVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            zzfrw.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzfrlVar = this.zzc.zzc;
                zzfrlVar.zzc("Already connected to the service.", new Object[0]);
            }
            zzfrw.zzp(this.zzc, this.zzb);
        }
    }
}
