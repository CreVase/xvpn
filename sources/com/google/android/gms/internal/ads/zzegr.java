package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzegr extends zzbwg implements zzcyv {
    private zzbwh zza;
    private zzcyu zzb;
    private zzdfo zzc;

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final synchronized void zza(zzcyu zzcyuVar) {
        this.zzb = zzcyuVar;
    }

    public final synchronized void zzc(zzbwh zzbwhVar) {
        this.zza = zzbwhVar;
    }

    public final synchronized void zzd(zzdfo zzdfoVar) {
        this.zzc = zzdfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzejv) zzbwhVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            zzbwhVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcyu zzcyuVar = this.zzb;
        if (zzcyuVar != null) {
            zzcyuVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzejv) zzbwhVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcyu zzcyuVar = this.zzb;
        if (zzcyuVar != null) {
            zzcyuVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzejv) zzbwhVar).zza.zzbv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdfo zzdfoVar = this.zzc;
        if (zzdfoVar != null) {
            zzcat.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzeju) zzdfoVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdfo zzdfoVar = this.zzc;
        if (zzdfoVar != null) {
            Executor zzc = zzejw.zzc(((zzeju) zzdfoVar).zzd);
            final zzeex zzeexVar = ((zzeju) zzdfoVar).zzc;
            final zzfcr zzfcrVar = ((zzeju) zzdfoVar).zzb;
            final zzfde zzfdeVar = ((zzeju) zzdfoVar).zza;
            final zzeju zzejuVar = (zzeju) zzdfoVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejt
                @Override // java.lang.Runnable
                public final void run() {
                    zzejw zzejwVar = zzeju.this.zzd;
                    zzejw.zze(zzfdeVar, zzfcrVar, zzeexVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbwi zzbwiVar) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzejv) zzbwhVar).zzd.zza(zzbwiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzejv) zzbwhVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzejv) zzbwhVar).zzd.zzc();
        }
    }
}
