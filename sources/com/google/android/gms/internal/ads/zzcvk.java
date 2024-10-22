package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcvk implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcvk(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdev((zzdbs) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
