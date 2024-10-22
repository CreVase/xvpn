package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzejf implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzejf(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeje zzb() {
        return new zzeje((Context) this.zza.zzb(), (zzdpc) this.zzb.zzb());
    }
}
