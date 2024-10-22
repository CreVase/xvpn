package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzehg implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzehg(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehf zzb() {
        return new zzehf((Context) this.zza.zzb(), (zzdgx) this.zzb.zzb());
    }
}
