package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ml1;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzegf implements zzefa {
    private final Context zza;
    private final zzcrs zzb;
    private View zzc;
    private zzbpg zzd;

    public zzegf(Context context, zzcrs zzcrsVar) {
        this.zza = context;
        this.zzb = zzcrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, final zzfcr zzfcrVar, final zzeex zzeexVar) throws zzfds, zzeir {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && zzfcrVar.zzai) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view != null) {
                    if (zzf) {
                        try {
                            view = (View) zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzegc
                                @Override // com.google.android.gms.internal.ads.zzfza
                                public final ml1 zza(Object obj) {
                                    return zzegf.this.zzc(view, zzfcrVar, obj);
                                }
                            }, zzcbg.zze).get();
                        } catch (InterruptedException | ExecutionException e) {
                            throw new zzfds(e);
                        }
                    }
                } else {
                    throw new zzfds(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e2) {
                throw new zzfds(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcqw zza = this.zzb.zza(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzcrc(view, null, new zzcsv() { // from class: com.google.android.gms.internal.ads.zzegb
            @Override // com.google.android.gms.internal.ads.zzcsv
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbqv) zzeex.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfds(e3);
                }
            }
        }, (zzfcs) zzfcrVar.zzw.get(0)));
        zza.zzg().zza(view);
        ((zzegq) zzeexVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        try {
            ((zzbqv) zzeexVar.zzb).zzq(zzfcrVar.zzab);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhD)).booleanValue() && zzfcrVar.zzai) {
                ((zzbqv) zzeexVar.zzb).zzk(zzfcrVar.zzW, zzfcrVar.zzx.toString(), zzfdeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzege(this, zzeexVar, null), (zzbpd) zzeexVar.zzc, zzfdeVar.zza.zza.zze);
            } else {
                ((zzbqv) zzeexVar.zzb).zzj(zzfcrVar.zzW, zzfcrVar.zzx.toString(), zzfdeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzege(this, zzeexVar, null), (zzbpd) zzeexVar.zzc, zzfdeVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfds(e);
        }
    }

    public final /* synthetic */ ml1 zzc(View view, zzfcr zzfcrVar, Object obj) throws Exception {
        return zzfzt.zzh(zzcsj.zza(this.zza, view, zzfcrVar));
    }
}
