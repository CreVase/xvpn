package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
final class zzege extends zzbqi {
    final /* synthetic */ zzegf zza;
    private final zzeex zzb;

    public /* synthetic */ zzege(zzegf zzegfVar, zzeex zzeexVar, zzegd zzegdVar) {
        this.zza = zzegfVar;
        this.zzb = zzeexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zze(String str) throws RemoteException {
        ((zzegq) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegq) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzegf.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzegq) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzh(zzbpg zzbpgVar) throws RemoteException {
        zzegf.zzd(this.zza, zzbpgVar);
        ((zzegq) this.zzb.zzc).zzo();
    }
}
