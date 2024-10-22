package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdgq implements zzhbc {
    private final zzdga zza;
    private final zzhbp zzb;

    public zzdgq(zzdga zzdgaVar, zzhbp zzhbpVar) {
        this.zza = zzdgaVar;
        this.zzb = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
