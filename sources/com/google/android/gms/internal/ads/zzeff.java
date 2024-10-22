package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeff implements zzeeu {
    private final zzcqj zza;
    private final Context zzb;
    private final zzdpt zzc;
    private final zzfdn zzd;
    private final Executor zze;
    private final zzcaz zzf;
    private final zzbjl zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziE)).booleanValue();
    private final zzedz zzi;

    public zzeff(zzcqj zzcqjVar, Context context, Executor executor, zzdpt zzdptVar, zzfdn zzfdnVar, zzcaz zzcazVar, zzbjl zzbjlVar, zzedz zzedzVar) {
        this.zzb = context;
        this.zza = zzcqjVar;
        this.zze = executor;
        this.zzc = zzdptVar;
        this.zzd = zzfdnVar;
        this.zzf = zzcazVar;
        this.zzg = zzbjlVar;
        this.zzi = zzedzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final ml1 zza(final zzfde zzfdeVar, final zzfcr zzfcrVar) {
        final zzdpx zzdpxVar = new zzdpx();
        ml1 zzn = zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzefb
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzeff.this.zzc(zzfcrVar, zzfdeVar, zzdpxVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // java.lang.Runnable
            public final void run() {
                zzdpx.this.zzb();
            }
        }, this.zze);
        return zzn;
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
    public final /* synthetic */ ml1 zzc(final zzfcr zzfcrVar, zzfde zzfdeVar, zzdpx zzdpxVar, Object obj) throws Exception {
        zzbjl zzbjlVar;
        final zzcgb zza = this.zzc.zza(this.zzd.zze, zzfcrVar, zzfdeVar.zzb.zzb);
        zza.zzZ(zzfcrVar.zzY);
        zzdpxVar.zza(this.zzb, (View) zza);
        zzcbl zzcblVar = new zzcbl();
        final zzcqg zza2 = this.zza.zza(new zzctm(zzfdeVar, zzfcrVar, null), new zzdga(new zzefh(this.zzf, zzcblVar, zzfcrVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcqh(zzfcrVar.zzac));
        zzdps zzh = zza2.zzh();
        if (this.zzh) {
            zzbjlVar = this.zzg;
        } else {
            zzbjlVar = null;
        }
        zzh.zzi(zza, false, zzbjlVar);
        zzcblVar.zzc(zza2);
        zza2.zzc().zzo(new zzcyf() { // from class: com.google.android.gms.internal.ads.zzefd
            @Override // com.google.android.gms.internal.ads.zzcyf
            public final void zzq() {
                zzcgb zzcgbVar = zzcgb.this;
                if (zzcgbVar.zzN() != null) {
                    zzcgbVar.zzN().zzq();
                }
            }
        }, zzcbg.zzf);
        zza2.zzh();
        zzfcx zzfcxVar = zzfcrVar.zzu;
        return zzfzt.zzm(zzdps.zzj(zza, zzfcxVar.zzb, zzfcxVar.zza), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzefe
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj2) {
                zzcgb zzcgbVar = zza;
                if (zzfcrVar.zzO) {
                    zzcgbVar.zzae();
                }
                zzcqg zzcqgVar = zza2;
                zzcgbVar.zzY();
                zzcgbVar.onPause();
                return zzcqgVar.zza();
            }
        }, this.zze);
    }
}
