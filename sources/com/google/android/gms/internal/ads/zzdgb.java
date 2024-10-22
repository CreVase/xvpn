package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdgb implements zzhbc {
    private final zzdga zza;
    private final zzhbp zzb;

    public zzdgb(zzdga zzdgaVar, zzhbp zzhbpVar) {
        this.zza = zzdgaVar;
        this.zzb = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdev((zzcwi) this.zzb.zzb(), zzcbg.zzf));
        zzhbk.zzb(singleton);
        return singleton;
    }
}
