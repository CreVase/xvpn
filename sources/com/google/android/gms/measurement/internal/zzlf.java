package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlf implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbg zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzkp zzf;

    public zzlf(zzkp zzkpVar, boolean z, zzo zzoVar, boolean z2, zzbg zzbgVar, String str) {
        this.zzf = zzkpVar;
        this.zza = z;
        this.zzb = zzoVar;
        this.zzc = z2;
        this.zzd = zzbgVar;
        this.zze = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzbg zzbgVar;
        zzfkVar = this.zzf.zzb;
        if (zzfkVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            zzkp zzkpVar = this.zzf;
            if (this.zzc) {
                zzbgVar = null;
            } else {
                zzbgVar = this.zzd;
            }
            zzkpVar.zza(zzfkVar, zzbgVar, this.zzb);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzfkVar.zza(this.zzd, this.zzb);
                } else {
                    zzfkVar.zza(this.zzd, this.zze, this.zzf.zzj().zzx());
                }
            } catch (RemoteException e) {
                this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
            }
        }
        this.zzf.zzal();
    }
}
