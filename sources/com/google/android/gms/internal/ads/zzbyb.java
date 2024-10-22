package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzbyb implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzbyb(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbya zzb() {
        return new zzbya((Clock) this.zza.zzb(), (zzbxy) this.zzb.zzb());
    }
}
