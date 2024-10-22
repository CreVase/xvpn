package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaxc implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzaxd zza;

    public zzaxc(zzaxd zzaxdVar) {
        this.zza = zzaxdVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzaxg zzaxgVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzaxd zzaxdVar = this.zza;
            zzaxgVar = zzaxdVar.zzd;
            if (zzaxgVar != null) {
                zzaxdVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
