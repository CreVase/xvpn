package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkw implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zznc zzc;
    private final /* synthetic */ zzkp zzd;

    public zzkw(zzkp zzkpVar, zzo zzoVar, boolean z, zznc zzncVar) {
        this.zzd = zzkpVar;
        this.zza = zzoVar;
        this.zzb = z;
        this.zzc = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zznc zzncVar;
        zzfkVar = this.zzd.zzb;
        if (zzfkVar == null) {
            this.zzd.zzj().zzg().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzkp zzkpVar = this.zzd;
        if (this.zzb) {
            zzncVar = null;
        } else {
            zzncVar = this.zzc;
        }
        zzkpVar.zza(zzfkVar, zzncVar, this.zza);
        this.zzd.zzal();
    }
}
