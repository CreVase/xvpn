package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzhs implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhj zzb;

    public zzhs(zzhj zzhjVar, zzo zzoVar) {
        this.zzb = zzhjVar;
        this.zza = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.zzb.zza;
        zzmpVar.zzr();
        zzmpVar2 = this.zzb.zza;
        zzmpVar2.zzd(this.zza);
    }
}
