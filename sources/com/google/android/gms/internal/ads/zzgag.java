package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzgag extends zzfzn implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzgag(ml1 ml1Var, ScheduledFuture scheduledFuture) {
        super(ml1Var);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzfzm, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = zzb().cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
