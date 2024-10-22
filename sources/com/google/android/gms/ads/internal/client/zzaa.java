package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    public zzaa(zzaw zzawVar, Activity activity) {
        this.zzb = zzawVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbua zzbuaVar;
        zzbss zzbssVar;
        zzbci.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                return zzbsu.zzI(((zzbsy) zzcax.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcav() { // from class: com.google.android.gms.ads.internal.client.zzz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcav
                    public final Object zza(Object obj) {
                        return zzbsx.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza)));
            } catch (RemoteException | zzcaw | NullPointerException e) {
                this.zzb.zzh = zzbty.zza(this.zza.getApplicationContext());
                zzbuaVar = this.zzb.zzh;
                zzbuaVar.zzf(e, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzaw zzawVar = this.zzb;
        Activity activity = this.zza;
        zzbssVar = zzawVar.zzf;
        return zzbssVar.zza(activity);
    }
}
