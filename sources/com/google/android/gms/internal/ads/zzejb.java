package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzejb implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzejb(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeja((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzdpc) this.zzc.zzb());
    }
}
