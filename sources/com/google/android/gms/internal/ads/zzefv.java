package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzefv implements zzeeu {
    private final zzcrs zza;
    private final Context zzb;
    private final zzdpt zzc;
    private final zzfdn zzd;
    private final Executor zze;
    private final zzfsk zzf;

    public zzefv(zzcrs zzcrsVar, Context context, Executor executor, zzdpt zzdptVar, zzfdn zzfdnVar, zzfsk zzfskVar) {
        this.zzb = context;
        this.zza = zzcrsVar;
        this.zze = executor;
        this.zzc = zzdptVar;
        this.zzd = zzfdnVar;
        this.zzf = zzfskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final ml1 zza(final zzfde zzfdeVar, final zzfcr zzfcrVar) {
        return zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzefv.this.zzc(zzfdeVar, zzfcrVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final boolean zzb(zzfde zzfdeVar, zzfcr zzfcrVar) {
        zzfcx zzfcxVar = zzfcrVar.zzu;
        if (zzfcxVar != null && zzfcxVar.zza != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ ml1 zzc(zzfde zzfdeVar, zzfcr zzfcrVar, Object obj) throws Exception {
        View zzdpwVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfdr.zza(this.zzb, zzfcrVar.zzw);
        final zzcgb zza2 = this.zzc.zza(zza, zzfcrVar, zzfdeVar.zzb.zzb);
        zza2.zzZ(zzfcrVar.zzY);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && zzfcrVar.zzai) {
            zzdpwVar = zzcsj.zza(this.zzb, (View) zza2, zzfcrVar);
        } else {
            zzdpwVar = new zzdpw(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzfcrVar));
        }
        final zzcqw zza3 = this.zza.zza(new zzctm(zzfdeVar, zzfcrVar, null), new zzcrc(zzdpwVar, zza2, new zzcsv() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzcsv
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcgb.this.zzq();
            }
        }, zzfdr.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zzcyd zzc = zza3.zzc();
        zzcyf zzcyfVar = new zzcyf() { // from class: com.google.android.gms.internal.ads.zzefq
            @Override // com.google.android.gms.internal.ads.zzcyf
            public final void zzq() {
                zzcgb zzcgbVar = zzcgb.this;
                if (zzcgbVar.zzN() != null) {
                    zzcgbVar.zzN().zzq();
                }
            }
        };
        zzgad zzgadVar = zzcbg.zzf;
        zzc.zzo(zzcyfVar, zzgadVar);
        zza3.zzh();
        zzfcx zzfcxVar = zzfcrVar.zzu;
        ml1 zzj = zzdps.zzj(zza2, zzfcxVar.zzb, zzfcxVar.zza);
        if (zzfcrVar.zzO) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgb.this.zzae();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // java.lang.Runnable
            public final void run() {
                zzefv.this.zzd(zza2);
            }
        }, this.zze);
        return zzfzt.zzm(zzj, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj2) {
                return zzcqw.this.zza();
            }
        }, zzgadVar);
    }

    public final /* synthetic */ void zzd(zzcgb zzcgbVar) {
        zzcgbVar.zzY();
        zzcgx zzq = zzcgbVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar != null && zzq != null) {
            zzq.zzs(zzflVar);
        }
    }
}
