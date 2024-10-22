package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkl implements Runnable {
    private final /* synthetic */ zzkh zza;

    public zzkl(zzkh zzkhVar) {
        this.zza = zzkhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki zzkiVar;
        zzkh zzkhVar = this.zza;
        zzkiVar = zzkhVar.zzh;
        zzkhVar.zza = zzkiVar;
    }
}
