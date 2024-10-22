package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzhu implements Callable<zzam> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhj zzb;

    public zzhu(zzhj zzhjVar, zzo zzoVar) {
        this.zzb = zzhjVar;
        this.zza = zzoVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzam call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.zzb.zza;
        zzmpVar.zzr();
        zzmpVar2 = this.zzb.zza;
        return new zzam(zzmpVar2.zza(this.zza.zza));
    }
}
