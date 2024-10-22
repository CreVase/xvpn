package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzenq implements zzetw {
    private final Clock zza;
    private final zzfdn zzb;

    public zzenq(Clock clock, zzfdn zzfdnVar) {
        this.zza = clock;
        this.zzb = zzfdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zzh(new zzenr(this.zzb, this.zza.currentTimeMillis()));
    }
}
