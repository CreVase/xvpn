package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzehy {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcta zzc;
    private final zzeio zzd;
    private final zzfjt zze;
    private final zzgal zzf = zzgal.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzehz zzh;
    private zzfde zzi;

    public zzehy(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcta zzctaVar, zzeio zzeioVar, zzfjt zzfjtVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzctaVar;
        this.zzd = zzeioVar;
        this.zze = zzfjtVar;
    }

    private final synchronized ml1 zzd(zzfcr zzfcrVar) {
        Iterator it = zzfcrVar.zza.iterator();
        while (it.hasNext()) {
            zzeeu zza = this.zzc.zza(zzfcrVar.zzb, (String) it.next());
            if (zza != null && zza.zzb(this.zzi, zzfcrVar)) {
                return zzfzt.zzo(zza.zza(this.zzi, zzfcrVar), zzfcrVar.zzT, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzfzt.zzg(new zzdwm(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzfcr zzfcrVar) {
        if (zzfcrVar == null) {
            return;
        }
        ml1 zzd = zzd(zzfcrVar);
        this.zzd.zzf(this.zzi, zzfcrVar, zzd, this.zze);
        zzfzt.zzr(zzd, new zzehx(this, zzfcrVar), this.zza);
    }

    public final synchronized ml1 zzb(zzfde zzfdeVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfdeVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzeir(3, zzeiu.zzc(zzfdeVar)));
            } else {
                this.zzi = zzfdeVar;
                this.zzh = new zzehz(zzfdeVar, this.zzd, this.zzf);
                this.zzd.zzk(zzfdeVar.zzb.zza);
                while (this.zzh.zze()) {
                    zze(this.zzh.zza());
                }
            }
        }
        return this.zzf;
    }
}
