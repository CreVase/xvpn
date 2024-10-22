package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzai extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    public zzai(zzaw zzawVar, Context context, zzbox zzboxVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzboxVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* synthetic */ Object zza() {
        return new zzbkr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 233702000, new zzbke(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbkn) zzcax.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcav
                public final Object zza(Object obj) {
                    return zzbkm.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 233702000, new zzbke(this.zzc));
        } catch (RemoteException | zzcaw | NullPointerException unused) {
            return null;
        }
    }
}
