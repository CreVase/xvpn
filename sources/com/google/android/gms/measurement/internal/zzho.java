package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzho implements Callable<List<zzne>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzhj zzd;

    public zzho(zzhj zzhjVar, String str, String str2, String str3) {
        this.zzd = zzhjVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzne> call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.zzd.zza;
        zzmpVar.zzr();
        zzmpVar2 = this.zzd.zza;
        return zzmpVar2.zzf().zzb(this.zza, this.zzb, this.zzc);
    }
}
