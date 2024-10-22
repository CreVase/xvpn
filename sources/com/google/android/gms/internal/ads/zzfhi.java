package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfhi {
    final /* synthetic */ zzfhj zza;
    private final Object zzb;
    private final String zzc;
    private final ml1 zzd;
    private final List zze;
    private final ml1 zzf;

    private zzfhi(zzfhj zzfhjVar, Object obj, String str, ml1 ml1Var, List list, ml1 ml1Var2) {
        this.zza = zzfhjVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = ml1Var;
        this.zze = list;
        this.zzf = ml1Var2;
    }

    public final zzfgw zza() {
        zzfhk zzfhkVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfgw zzfgwVar = new zzfgw(obj, str, this.zzf);
        zzfhkVar = this.zza.zzd;
        zzfhkVar.zza(zzfgwVar);
        ml1 ml1Var = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhf
            @Override // java.lang.Runnable
            public final void run() {
                zzfhk zzfhkVar2;
                zzfhkVar2 = zzfhi.this.zza.zzd;
                zzfhkVar2.zzc(zzfgwVar);
            }
        };
        zzgad zzgadVar = zzcbg.zzf;
        ml1Var.addListener(runnable, zzgadVar);
        zzfzt.zzr(zzfgwVar, new zzfhg(this, zzfgwVar), zzgadVar);
        return zzfgwVar;
    }

    public final zzfhi zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfhi zzc(Class cls, zzfza zzfzaVar) {
        zzgad zzgadVar;
        zzgadVar = this.zza.zzb;
        return new zzfhi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfzt.zzf(this.zzf, cls, zzfzaVar, zzgadVar));
    }

    public final zzfhi zzd(final ml1 ml1Var) {
        return zzg(new zzfza() { // from class: com.google.android.gms.internal.ads.zzfhe
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return ml1.this;
            }
        }, zzcbg.zzf);
    }

    public final zzfhi zze(final zzfgu zzfguVar) {
        return zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzfhd
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzh(zzfgu.this.zza(obj));
            }
        });
    }

    public final zzfhi zzf(zzfza zzfzaVar) {
        zzgad zzgadVar;
        zzgadVar = this.zza.zzb;
        return zzg(zzfzaVar, zzgadVar);
    }

    public final zzfhi zzg(zzfza zzfzaVar, Executor executor) {
        return new zzfhi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfzt.zzn(this.zzf, zzfzaVar, executor));
    }

    public final zzfhi zzh(String str) {
        return new zzfhi(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfhi zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfhi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfzt.zzo(this.zzf, j, timeUnit, scheduledExecutorService));
    }
}
