package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzag extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;

    public zzag(zzaw zzawVar, Context context, zzbox zzboxVar) {
        this.zza = context;
        this.zzb = zzboxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, 233702000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbsr) zzcax.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcav
                public final Object zza(Object obj) {
                    return zzbsq.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 233702000);
        } catch (RemoteException | zzcaw | NullPointerException unused) {
            return null;
        }
    }
}
