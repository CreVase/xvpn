package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznp;

/* loaded from: classes2.dex */
final class zzhv implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhj zzb;

    public zzhv(zzhj zzhjVar, zzo zzoVar) {
        this.zzb = zzhjVar;
        this.zza = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        int i;
        zzmpVar = this.zzb.zza;
        zzmpVar.zzr();
        zzmpVar2 = this.zzb.zza;
        zzo zzoVar = this.zza;
        zzmpVar2.zzl().zzt();
        zzmpVar2.zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        if (zznp.zza() && zzmpVar2.zze().zza(zzbi.zzcm)) {
            i = zzoVar.zzy;
        } else {
            i = 100;
        }
        zzih zza = zzih.zza(zzoVar.zzt, i);
        zzih zzb = zzmpVar2.zzb(zzoVar.zza);
        zzmpVar2.zzj().zzp().zza("Setting consent, package, consent", zzoVar.zza, zza);
        zzmpVar2.zza(zzoVar.zza, zza);
        if (zza.zzc(zzb)) {
            zzmpVar2.zzd(zzoVar);
        }
        if (zznp.zza() && zzmpVar2.zze().zza(zzbi.zzcm)) {
            zzay zza2 = zzay.zza(zzoVar.zzz);
            if (!zzay.zza.equals(zza2)) {
                zzmpVar2.zzj().zzp().zza("Setting DMA consent. package, consent", zzoVar.zza, zza2);
                zzmpVar2.zza(zzoVar.zza, zza2);
            }
        }
    }
}
