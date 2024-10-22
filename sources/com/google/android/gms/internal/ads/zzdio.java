package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzdio implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdio(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdex((Context) this.zza.zzb(), new HashSet(), ((zzctn) this.zzb).zza());
    }
}
