package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;

    public zzac(zzaw zzawVar, Context context, zzbox zzboxVar) {
        this.zza = context;
        this.zzb = zzboxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbci.zza(context);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzje)).booleanValue()) {
            return zzceVar.zzh(wrap, this.zzb, 233702000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbci.zza(context);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzje)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) zzcax.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcav
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    if (queryLocalInterface instanceof zzdk) {
                        return (zzdk) queryLocalInterface;
                    }
                    return new zzdk(obj);
                }
            })).zze(wrap, this.zzb, 233702000);
        } catch (RemoteException | zzcaw | NullPointerException e) {
            zzbty.zza(this.zza).zzf(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
