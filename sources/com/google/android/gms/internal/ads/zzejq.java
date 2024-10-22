package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzejq implements zzeeu {
    private final Context zza;
    private final zzdpt zzb;
    private final zzdpc zzc;
    private final zzfdn zzd;
    private final Executor zze;
    private final zzcaz zzf;
    private final zzbjl zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziE)).booleanValue();
    private final zzedz zzi;

    public zzejq(Context context, zzcaz zzcazVar, zzfdn zzfdnVar, Executor executor, zzdpc zzdpcVar, zzdpt zzdptVar, zzbjl zzbjlVar, zzedz zzedzVar) {
        this.zza = context;
        this.zzd = zzfdnVar;
        this.zzc = zzdpcVar;
        this.zze = executor;
        this.zzf = zzcazVar;
        this.zzb = zzdptVar;
        this.zzg = zzbjlVar;
        this.zzi = zzedzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final ml1 zza(final zzfde zzfdeVar, final zzfcr zzfcrVar) {
        final zzdpx zzdpxVar = new zzdpx();
        ml1 zzn = zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzejj
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzejq.this.zzc(zzfcrVar, zzfdeVar, zzdpxVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejk
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
        final zzcgb zza = this.zzb.zza(this.zzd.zze, zzfcrVar, zzfdeVar.zzb.zzb);
        zza.zzZ(zzfcrVar.zzY);
        zzdpxVar.zza(this.zza, (View) zza);
        zzcbl zzcblVar = new zzcbl();
        final zzdoy zze = this.zzc.zze(new zzctm(zzfdeVar, zzfcrVar, null), new zzdoz(new zzejp(this.zza, this.zzb, this.zzd, this.zzf, zzfcrVar, zzcblVar, zza, this.zzg, this.zzh, this.zzi), zza));
        zzcblVar.zzc(zze);
        zzbka.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzcyf() { // from class: com.google.android.gms.internal.ads.zzejl
            @Override // com.google.android.gms.internal.ads.zzcyf
            public final void zzq() {
                zzcgb zzcgbVar = zzcgb.this;
                if (zzcgbVar.zzN() != null) {
                    zzcgbVar.zzN().zzq();
                }
            }
        }, zzcbg.zzf);
        zzdps zzl = zze.zzl();
        if (this.zzh) {
            zzbjlVar = this.zzg;
        } else {
            zzbjlVar = null;
        }
        zzl.zzi(zza, true, zzbjlVar);
        zze.zzl();
        zzfcx zzfcxVar = zzfcrVar.zzu;
        return zzfzt.zzm(zzdps.zzj(zza, zzfcxVar.zzb, zzfcxVar.zza), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzejm
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj2) {
                zzcgb zzcgbVar = zza;
                if (zzfcrVar.zzO) {
                    zzcgbVar.zzae();
                }
                zzdoy zzdoyVar = zze;
                zzcgbVar.zzY();
                zzcgbVar.onPause();
                return zzdoyVar.zzk();
            }
        }, this.zze);
    }
}
