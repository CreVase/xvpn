package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlg implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzkp zzb;

    public zzlg(zzkp zzkpVar, zzo zzoVar) {
        this.zzb = zzkpVar;
        this.zza = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzfkVar = this.zzb.zzb;
        if (zzfkVar == null) {
            this.zzb.zzj().zzg().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzfkVar.zze(this.zza);
            this.zzb.zzal();
        } catch (RemoteException e) {
            this.zzb.zzj().zzg().zza("Failed to send consent settings to the service", e);
        }
    }
}
