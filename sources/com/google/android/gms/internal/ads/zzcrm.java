package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcrm implements zzhbc {
    private final zzcrc zza;
    private final zzhbp zzb;

    public zzcrm(zzcrc zzcrcVar, zzhbp zzhbpVar) {
        this.zza = zzcrcVar;
        this.zzb = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdev((zzcsm) this.zzb.zzb(), zzcbg.zzf));
        zzhbk.zzb(singleton);
        return singleton;
    }
}
