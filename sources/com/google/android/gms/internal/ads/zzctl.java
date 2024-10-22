package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzctl {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ml1 zzc;
    private volatile boolean zzd = true;

    public zzctl(Executor executor, ScheduledExecutorService scheduledExecutorService, ml1 ml1Var) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = ml1Var;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzctl zzctlVar, List list, final zzfzp zzfzpVar) {
        if (list != null && !list.isEmpty()) {
            ml1 zzh = zzfzt.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final ml1 ml1Var = (ml1) it.next();
                zzh = zzfzt.zzn(zzfzt.zzf(zzh, Throwable.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzcth
                    @Override // com.google.android.gms.internal.ads.zzfza
                    public final ml1 zza(Object obj) {
                        zzfzp.this.zza((Throwable) obj);
                        return zzfzt.zzh(null);
                    }
                }, zzctlVar.zza), new zzfza() { // from class: com.google.android.gms.internal.ads.zzcti
                    @Override // com.google.android.gms.internal.ads.zzfza
                    public final ml1 zza(Object obj) {
                        return zzctl.this.zza(zzfzpVar, ml1Var, (zzcsx) obj);
                    }
                }, zzctlVar.zza);
            }
            zzfzt.zzr(zzh, new zzctk(zzctlVar, zzfzpVar), zzctlVar.zza);
            return;
        }
        zzctlVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctg
            @Override // java.lang.Runnable
            public final void run() {
                zzfzp.this.zza(new zzdwm(3));
            }
        });
    }

    public final /* synthetic */ ml1 zza(zzfzp zzfzpVar, ml1 ml1Var, zzcsx zzcsxVar) throws Exception {
        if (zzcsxVar != null) {
            zzfzpVar.zzb(zzcsxVar);
        }
        return zzfzt.zzo(ml1Var, ((Long) zzbeo.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfzp zzfzpVar) {
        zzfzt.zzr(this.zzc, new zzctj(this, zzfzpVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
