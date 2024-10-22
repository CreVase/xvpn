package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgas extends zzfzj implements RunnableFuture {
    private volatile zzgac zza;

    public zzgas(zzfyz zzfyzVar) {
        this.zza = new zzgaq(this, zzfyzVar);
    }

    public static zzgas zze(Runnable runnable, Object obj) {
        return new zzgas(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgac zzgacVar = this.zza;
        if (zzgacVar != null) {
            zzgacVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String zza() {
        zzgac zzgacVar = this.zza;
        if (zzgacVar != null) {
            return hx2.q("task=[", zzgacVar.toString(), "]");
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final void zzb() {
        zzgac zzgacVar;
        if (zzt() && (zzgacVar = this.zza) != null) {
            zzgacVar.zzh();
        }
        this.zza = null;
    }

    public zzgas(Callable callable) {
        this.zza = new zzgar(this, callable);
    }
}
