package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbox zzc;
    final /* synthetic */ zzaw zzd;

    public zzao(zzaw zzawVar, Context context, String str, zzbox zzboxVar) {
        this.zzd = zzawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzboxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233702000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzi zziVar;
        zzbua zzbuaVar;
        Object zzboVar;
        zzbci.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                IBinder zze = ((zzbr) zzcax.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzan
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcav
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof zzbr) {
                            return (zzbr) queryLocalInterface;
                        }
                        return new zzbr(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233702000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof zzbq) {
                    zzboVar = (zzbq) queryLocalInterface;
                } else {
                    zzboVar = new zzbo(zze);
                }
                return zzboVar;
            } catch (RemoteException | zzcaw | NullPointerException e) {
                this.zzd.zzh = zzbty.zza(this.zza);
                zzbuaVar = this.zzd.zzh;
                zzbuaVar.zzf(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zzaw zzawVar = this.zzd;
        Context context = this.zza;
        String str = this.zzb;
        zzbox zzboxVar = this.zzc;
        zziVar = zzawVar.zzb;
        return zziVar.zza(context, str, zzboxVar);
    }
}
