package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzhw implements Runnable {
    private final /* synthetic */ zzbg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhj zzc;

    public zzhw(zzhj zzhjVar, zzbg zzbgVar, String str) {
        this.zzc = zzhjVar;
        this.zza = zzbgVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.zzc.zza;
        zzmpVar.zzr();
        zzmpVar2 = this.zzc.zza;
        zzmpVar2.zza(this.zza, this.zzb);
    }
}
