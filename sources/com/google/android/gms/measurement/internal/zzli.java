package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzli implements Runnable {
    private final /* synthetic */ boolean zza = true;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzad zzd;
    private final /* synthetic */ zzad zze;
    private final /* synthetic */ zzkp zzf;

    public zzli(zzkp zzkpVar, boolean z, zzo zzoVar, boolean z2, zzad zzadVar, zzad zzadVar2) {
        this.zzf = zzkpVar;
        this.zzb = zzoVar;
        this.zzc = z2;
        this.zzd = zzadVar;
        this.zze = zzadVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzad zzadVar;
        zzfkVar = this.zzf.zzb;
        if (zzfkVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            zzkp zzkpVar = this.zzf;
            if (this.zzc) {
                zzadVar = null;
            } else {
                zzadVar = this.zzd;
            }
            zzkpVar.zza(zzfkVar, zzadVar, this.zzb);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze.zza)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzfkVar.zza(this.zzd, this.zzb);
                } else {
                    zzfkVar.zza(this.zzd);
                }
            } catch (RemoteException e) {
                this.zzf.zzj().zzg().zza("Failed to send conditional user property to the service", e);
            }
        }
        this.zzf.zzal();
    }
}
