package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes.dex */
final class zzbps implements InitializationCompleteCallback {
    final /* synthetic */ zzblk zza;

    public zzbps(zzbpy zzbpyVar, zzblk zzblkVar) {
        this.zza = zzblkVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }
}
