package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkz implements Runnable {
    private final /* synthetic */ zzki zza;
    private final /* synthetic */ zzkp zzb;

    public zzkz(zzkp zzkpVar, zzki zzkiVar) {
        this.zzb = zzkpVar;
        this.zza = zzkiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzfkVar = this.zzb.zzb;
        if (zzfkVar == null) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzki zzkiVar = this.zza;
            if (zzkiVar == null) {
                zzfkVar.zza(0L, (String) null, (String) null, this.zzb.zza().getPackageName());
            } else {
                zzfkVar.zza(zzkiVar.zzc, zzkiVar.zza, zzkiVar.zzb, this.zzb.zza().getPackageName());
            }
            this.zzb.zzal();
        } catch (RemoteException e) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to the service", e);
        }
    }
}
