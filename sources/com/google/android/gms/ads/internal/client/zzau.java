package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    public zzau(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzawVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        HashMap hashMap = this.zzc;
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(hashMap));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbua zzbuaVar;
        zzbho zzbhoVar;
        zzbci.zza(this.zza.getContext());
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                return zzbfx.zze(((zzbgb) zzcax.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzat
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcav
                    public final Object zza(Object obj) {
                        return zzbga.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | zzcaw | NullPointerException e) {
                this.zzd.zzh = zzbty.zza(this.zza.getContext());
                zzbuaVar = this.zzd.zzh;
                zzbuaVar.zzf(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzaw zzawVar = this.zzd;
        View view = this.zza;
        HashMap hashMap = this.zzb;
        HashMap hashMap2 = this.zzc;
        zzbhoVar = zzawVar.zzg;
        return zzbhoVar.zza(view, hashMap, hashMap2);
    }
}
