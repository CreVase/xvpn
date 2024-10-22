package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaxq implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcbl zza;
    final /* synthetic */ zzaxr zzb;

    public zzaxq(zzaxr zzaxrVar, zzcbl zzcblVar) {
        this.zzb = zzaxrVar;
        this.zza = zzcblVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
