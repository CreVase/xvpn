package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzhz implements Callable<byte[]> {
    private final /* synthetic */ zzbg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhj zzc;

    public zzhz(zzhj zzhjVar, zzbg zzbgVar, String str) {
        this.zzc = zzhjVar;
        this.zza = zzbgVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.zzc.zza;
        zzmpVar.zzr();
        zzmpVar2 = this.zzc.zza;
        return zzmpVar2.zzm().zza(this.zza, this.zzb);
    }
}
