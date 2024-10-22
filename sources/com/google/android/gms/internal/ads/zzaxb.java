package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaxb implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzaxd zza;

    public zzaxb(zzaxd zzaxdVar) {
        this.zza = zzaxdVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzaxg zzaxgVar;
        zzaxg zzaxgVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzaxd zzaxdVar = this.zza;
                zzaxgVar = zzaxdVar.zzd;
                if (zzaxgVar != null) {
                    zzaxgVar2 = zzaxdVar.zzd;
                    zzaxdVar.zzf = zzaxgVar2.zzq();
                }
            } catch (DeadObjectException e) {
                zzcat.zzh("Unable to obtain a cache service instance.", e);
                zzaxd.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
