package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgae implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfyh zzb;

    public zzgae(Executor executor, zzfyh zzfyhVar) {
        this.zza = executor;
        this.zzb = zzfyhVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
