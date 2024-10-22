package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcue {
    private final zzdxu zza;
    private final zzfdn zzb;
    private final zzfhr zzc;
    private final zzcnj zzd;
    private final zzeiu zze;
    private final zzdcq zzf;
    private zzfde zzg;
    private final zzdyz zzh;
    private final zzcwp zzi;
    private final Executor zzj;
    private final zzdyl zzk;
    private final zzeez zzl;
    private final zzdzp zzm;
    private final zzdzw zzn;

    public zzcue(zzdxu zzdxuVar, zzfdn zzfdnVar, zzfhr zzfhrVar, zzcnj zzcnjVar, zzeiu zzeiuVar, zzdcq zzdcqVar, zzfde zzfdeVar, zzdyz zzdyzVar, zzcwp zzcwpVar, Executor executor, zzdyl zzdylVar, zzeez zzeezVar, zzdzp zzdzpVar, zzdzw zzdzwVar) {
        this.zza = zzdxuVar;
        this.zzb = zzfdnVar;
        this.zzc = zzfhrVar;
        this.zzd = zzcnjVar;
        this.zze = zzeiuVar;
        this.zzf = zzdcqVar;
        this.zzg = zzfdeVar;
        this.zzh = zzdyzVar;
        this.zzi = zzcwpVar;
        this.zzj = executor;
        this.zzk = zzdylVar;
        this.zzl = zzeezVar;
        this.zzm = zzdzpVar;
        this.zzn = zzdzwVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfeo.zzb(th, this.zzl);
    }

    public final zzdcq zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfde zzd(zzfde zzfdeVar) throws Exception {
        this.zzd.zza(zzfdeVar);
        return zzfdeVar;
    }

    public final ml1 zze(final zzffh zzffhVar) {
        zzfgw zza = this.zzc.zzb(zzfhl.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzcua
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzcue.this.zzf(zzffhVar, (zzbvg) obj);
            }
        }).zza();
        zzfzt.zzr(zza, new zzcuc(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ ml1 zzf(zzffh zzffhVar, zzbvg zzbvgVar) throws Exception {
        zzbvgVar.zzi = zzffhVar;
        return this.zzh.zza(zzbvgVar);
    }

    public final /* synthetic */ ml1 zzg(ml1 ml1Var, ml1 ml1Var2, ml1 ml1Var3) throws Exception {
        return this.zzn.zzc((zzbvg) ml1Var.get(), (JSONObject) ml1Var2.get(), (zzbvj) ml1Var3.get());
    }

    public final ml1 zzh(zzbvg zzbvgVar) {
        zzfgw zza = this.zzc.zzb(zzfhl.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbvgVar)).zza();
        zzfzt.zzr(zza, new zzcud(this), this.zzj);
        return zza;
    }

    public final ml1 zzi(ml1 ml1Var) {
        zzfhi zzf = this.zzc.zzb(zzfhl.RENDERER, ml1Var).zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzctv
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                zzfde zzfdeVar = (zzfde) obj;
                zzcue.this.zzd(zzfdeVar);
                return zzfdeVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfs)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final ml1 zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfhr zzfhrVar = this.zzc;
        zzdxu zzdxuVar = this.zza;
        return zzfhb.zzc(zzdxuVar.zza(), zzfhl.PRELOADED_LOADER, zzfhrVar).zza();
    }

    public final ml1 zzk(final ml1 ml1Var) {
        zzfde zzfdeVar = this.zzg;
        if (zzfdeVar != null) {
            return zzfhb.zzc(zzfzt.zzh(zzfdeVar), zzfhl.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkz)).booleanValue() && !((Boolean) zzbeh.zzc.zze()).booleanValue()) {
            final zzdzp zzdzpVar = this.zzm;
            final ml1 zzn = zzfzt.zzn(ml1Var, new zzfza() { // from class: com.google.android.gms.internal.ads.zzctw
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzdzp.this.zza((zzbvg) obj);
                }
            }, this.zzj);
            zzfhi zzb = this.zzc.zzb(zzfhl.BUILD_URL, zzn);
            final zzdyz zzdyzVar = this.zzh;
            final zzfgw zza = zzb.zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzctx
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzdyz.this.zzb((JSONObject) obj);
                }
            }).zza();
            return this.zzc.zza(zzfhl.SERVER_TRANSACTION, ml1Var, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcty
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcue.this.zzg(ml1Var, zzn, zza);
                }
            }).zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzctz
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return (ml1) obj;
                }
            }).zza();
        }
        zzfhi zzb2 = this.zzc.zzb(zzfhl.SERVER_TRANSACTION, ml1Var);
        final zzdyl zzdylVar = this.zzk;
        return zzb2.zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzcub
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdyl.this.zzb((zzbvg) obj);
            }
        }).zza();
    }

    public final void zzl(zzfde zzfdeVar) {
        this.zzg = zzfdeVar;
    }
}
