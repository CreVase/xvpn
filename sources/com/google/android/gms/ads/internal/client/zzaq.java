package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaq extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    public zzaq(zzaw zzawVar, Context context) {
        this.zzb = zzawVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzg(ObjectWrapper.wrap(this.zza), 233702000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzeq zzeqVar;
        zzbua zzbuaVar;
        Object zzcmVar;
        zzbci.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                IBinder zze = ((zzcp) zzcax.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzap
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcav
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof zzcp) {
                            return (zzcp) queryLocalInterface;
                        }
                        return new zzcp(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), 233702000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                if (queryLocalInterface instanceof zzco) {
                    zzcmVar = (zzco) queryLocalInterface;
                } else {
                    zzcmVar = new zzcm(zze);
                }
                return zzcmVar;
            } catch (RemoteException | zzcaw | NullPointerException e) {
                this.zzb.zzh = zzbty.zza(this.zza);
                zzbuaVar = this.zzb.zzh;
                zzbuaVar.zzf(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzaw zzawVar = this.zzb;
        Context context = this.zza;
        zzeqVar = zzawVar.zzc;
        return zzeqVar.zza(context);
    }
}
