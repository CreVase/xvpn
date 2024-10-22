package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdlt implements zzhbc {
    private final zzdlm zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdlt(zzdlm zzdlmVar, zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzdlmVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdev(((zzdot) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
