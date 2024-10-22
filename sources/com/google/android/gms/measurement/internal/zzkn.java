package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkn implements Runnable {
    private final /* synthetic */ zzki zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzkh zzc;

    public zzkn(zzkh zzkhVar, zzki zzkiVar, long j) {
        this.zzc = zzkhVar;
        this.zza = zzkiVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        zzkh zzkhVar = this.zzc;
        zzkhVar.zza = null;
        zzkhVar.zzo().zza((zzki) null);
    }
}
