package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzhx implements Runnable {
    private final /* synthetic */ zzbg zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhj zzc;

    public zzhx(zzhj zzhjVar, zzbg zzbgVar, zzo zzoVar) {
        this.zzc = zzhjVar;
        this.zza = zzbgVar;
        this.zzb = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzc(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
