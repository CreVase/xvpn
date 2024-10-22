package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ml1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzefz implements zzefa {
    private final Context zza;
    private final zzcrs zzb;
    private final Executor zzc;

    public zzefz(Context context, zzcrs zzcrsVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcrsVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, final zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds, zzeir {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && zzfcrVar.zzai) {
            zzbpg zzc = ((zzfej) zzeexVar.zzb).zzc();
            if (zzc != null) {
                try {
                    zza = (View) ObjectWrapper.unwrap(zzc.zze());
                    boolean zzf = zzc.zzf();
                    if (zza != null) {
                        if (zzf) {
                            try {
                                zza = (View) zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzefx
                                    @Override // com.google.android.gms.internal.ads.zzfza
                                    public final ml1 zza(Object obj) {
                                        return zzefz.this.zzc(zza, zzfcrVar, obj);
                                    }
                                }, zzcbg.zze).get();
                            } catch (InterruptedException | ExecutionException e) {
                                throw new zzfds(e);
                            }
                        }
                    } else {
                        throw new zzfds(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                } catch (RemoteException e2) {
                    throw new zzfds(e2);
                }
            } else {
                zzcat.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfds(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            zza = ((zzfej) zzeexVar.zzb).zza();
        }
        zzcrs zzcrsVar = this.zzb;
        zzctm zzctmVar = new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza);
        final zzfej zzfejVar = (zzfej) zzeexVar.zzb;
        zzcqw zza2 = zzcrsVar.zza(zzctmVar, new zzcrc(zza, null, new zzcsv() { // from class: com.google.android.gms.internal.ads.zzefy
            @Override // com.google.android.gms.internal.ads.zzcsv
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfej.this.zzb();
            }
        }, (zzfcs) zzfcrVar.zzw.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcol((zzfej) zzeexVar.zzb), this.zzc);
        ((zzegq) zzeexVar.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        com.google.android.gms.ads.internal.client.zzq zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = zzfdeVar.zza.zza.zze;
        if (zzqVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && zzfcrVar.zzai) {
                zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb));
            } else {
                zza = zzfdr.zza(this.zza, zzfcrVar.zzw);
            }
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && zzfcrVar.zzai) {
            Object obj = zzeexVar.zzb;
            Context context = this.zza;
            zzfdn zzfdnVar = zzfdeVar.zza.zza;
            ((zzfej) obj).zzn(context, zzqVar2, zzfdnVar.zzd, zzfcrVar.zzx.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzfcrVar.zzu), (zzbpd) zzeexVar.zzc);
            return;
        }
        Object obj2 = zzeexVar.zzb;
        Context context2 = this.zza;
        zzfdn zzfdnVar2 = zzfdeVar.zza.zza;
        ((zzfej) obj2).zzm(context2, zzqVar2, zzfdnVar2.zzd, zzfcrVar.zzx.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzfcrVar.zzu), (zzbpd) zzeexVar.zzc);
    }

    public final /* synthetic */ ml1 zzc(View view, zzfcr zzfcrVar, Object obj) throws Exception {
        return zzfzt.zzh(zzcsj.zza(this.zza, view, zzfcrVar));
    }
}
