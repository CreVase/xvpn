package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* loaded from: classes.dex */
public final class zzk extends RemoteCreator {
    private zzbua zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbv) {
            return (zzbv) queryLocalInterface;
        }
        return new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, zzbox zzboxVar, int i) {
        zzbu zzbsVar;
        zzbu zzbsVar2;
        zzbci.zza(context);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) zzcax.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcav
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzbv) {
                            return (zzbv) queryLocalInterface;
                        }
                        return new zzbv(obj);
                    }
                })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzboxVar, 233702000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbu) {
                    zzbsVar = (zzbu) queryLocalInterface;
                } else {
                    zzbsVar = new zzbs(zze);
                }
                return zzbsVar;
            } catch (RemoteException | zzcaw | NullPointerException e) {
                zzbua zza = zzbty.zza(context);
                this.zza = zza;
                zza.zzf(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcat.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzboxVar, 233702000, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbu) {
                zzbsVar2 = (zzbu) queryLocalInterface2;
            } else {
                zzbsVar2 = new zzbs(zze2);
            }
            return zzbsVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzcat.zzf("Could not create remote AdManager.", e2);
            return null;
        }
    }
}
