package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgap extends zzfzj {
    private ml1 zza;
    private ScheduledFuture zzb;

    private zzgap(ml1 ml1Var) {
        ml1Var.getClass();
        this.zza = ml1Var;
    }

    public static ml1 zzf(ml1 ml1Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgap zzgapVar = new zzgap(ml1Var);
        zzgam zzgamVar = new zzgam(zzgapVar);
        zzgapVar.zzb = scheduledExecutorService.schedule(zzgamVar, j, timeUnit);
        ml1Var.addListener(zzgamVar, zzfzh.INSTANCE);
        return zzgapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String zza() {
        ml1 ml1Var = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (ml1Var != null) {
            String q = hx2.q("inputFuture=[", ml1Var.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return q + ", remaining delay=[" + delay + " ms]";
                }
                return q;
            }
            return q;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
