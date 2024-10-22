package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzehr implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzehr(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzehq((Context) this.zza.zzb(), (zzdht) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
