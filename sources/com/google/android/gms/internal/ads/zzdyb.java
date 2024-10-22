package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzdyb extends zzdxz {
    public zzdyb(Context context) {
        this.zzf = new zzbug(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdxy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyo(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzdyo(1));
                }
            }
        }
    }

    public final ml1 zzb(zzbvg zzbvgVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbvgVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdya
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyb.this.zza();
                }
            }, zzcbg.zzf);
            return this.zza;
        }
    }
}
