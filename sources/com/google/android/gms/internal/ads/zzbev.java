package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbev {
    private final Context zza;

    public zzbev(Context context) {
        this.zza = context;
    }

    public final void zza(zzbuf zzbufVar) {
        try {
            ((zzbew) zzcax.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcav() { // from class: com.google.android.gms.internal.ads.zzbeu
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcav
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof zzbew) {
                        return (zzbew) queryLocalInterface;
                    }
                    return new zzbew(obj);
                }
            })).zze(zzbufVar);
        } catch (RemoteException e) {
            zzcat.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzcaw e2) {
            zzcat.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
