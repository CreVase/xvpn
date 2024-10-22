package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class zzdxx extends zzdxz {
    public zzdxx(Context context) {
        this.zzf = new zzbug(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzdxy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyo(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzdyo(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxz, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcat.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyo(1));
    }
}
