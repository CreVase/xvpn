package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbxb {
    public static final zzbwp zza(Context context, String str, zzbox zzboxVar) {
        zzbwp zzbwnVar;
        try {
            IBinder zze = ((zzbwt) zzcax.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcav() { // from class: com.google.android.gms.internal.ads.zzbxa
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcav
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof zzbwt) {
                        return (zzbwt) queryLocalInterface;
                    }
                    return new zzbwt(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzboxVar, 233702000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzbwp) {
                zzbwnVar = (zzbwp) queryLocalInterface;
            } else {
                zzbwnVar = new zzbwn(zze);
            }
            return zzbwnVar;
        } catch (RemoteException | zzcaw e) {
            zzcat.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
