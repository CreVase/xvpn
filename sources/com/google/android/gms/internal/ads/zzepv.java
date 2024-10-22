package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.ml1;

/* loaded from: classes.dex */
final class zzepv {
    public final ml1 zza;
    private final long zzb;
    private final Clock zzc;

    public zzepv(ml1 ml1Var, long j, Clock clock) {
        this.zza = ml1Var;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        if (this.zzb < this.zzc.elapsedRealtime()) {
            return true;
        }
        return false;
    }
}
