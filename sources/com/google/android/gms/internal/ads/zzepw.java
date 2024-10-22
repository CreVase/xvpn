package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.ml1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzepw implements zzetw {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzetw zzc;
    private final long zzd;

    public zzepw(zzetw zzetwVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzetwVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        zzepv zzepvVar = (zzepv) this.zza.get();
        if (zzepvVar == null || zzepvVar.zza()) {
            zzetw zzetwVar = this.zzc;
            zzepv zzepvVar2 = new zzepv(zzetwVar.zzb(), this.zzd, this.zzb);
            this.zza.set(zzepvVar2);
            zzepvVar = zzepvVar2;
        }
        return zzepvVar.zza;
    }
}
