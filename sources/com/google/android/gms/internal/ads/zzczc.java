package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzczc implements zzhbc {
    private final zzhbp zza;

    public zzczc(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    public static zzczb zzc(Set set) {
        return new zzczb(set);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzczb zzb() {
        return new zzczb(((zzhbn) this.zza).zzb());
    }
}
