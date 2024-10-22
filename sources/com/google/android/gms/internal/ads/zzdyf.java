package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzdyf extends zzdxz {
    private String zzg;
    private int zzh = 1;

    public zzdyf(Context context) {
        this.zzf = new zzbug(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    try {
                        int i = this.zzh;
                        if (i == 2) {
                            this.zzf.zzp().zze(this.zze, new zzdxy(this));
                        } else if (i == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzdxy(this));
                        } else {
                            this.zza.zzd(new zzdyo(1));
                        }
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzdyo(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
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

    public final ml1 zzb(zzbvg zzbvgVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzfzt.zzg(new zzdyo(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbvgVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyd
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyf.this.zza();
                }
            }, zzcbg.zzf);
            return this.zza;
        }
    }

    public final ml1 zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzfzt.zzg(new zzdyo(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdye
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyf.this.zza();
                }
            }, zzcbg.zzf);
            return this.zza;
        }
    }
}
