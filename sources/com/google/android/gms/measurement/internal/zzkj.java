package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkj implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzki zzb;
    private final /* synthetic */ zzki zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzkh zze;

    public zzkj(zzkh zzkhVar, Bundle bundle, zzki zzkiVar, zzki zzkiVar2, long j) {
        this.zze = zzkhVar;
        this.zza = bundle;
        this.zzb = zzkiVar;
        this.zzc = zzkiVar2;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkh.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
