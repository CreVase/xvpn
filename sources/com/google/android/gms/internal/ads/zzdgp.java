package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdgp implements zzhbc {
    private final zzhbp zza;

    public zzdgp(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdev((zzdhi) this.zza.zzb(), zzcbg.zzf));
        zzhbk.zzb(singleton);
        return singleton;
    }
}
