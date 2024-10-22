package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzcqu implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcqu(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdaa zzb() {
        return new zzdaa((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
