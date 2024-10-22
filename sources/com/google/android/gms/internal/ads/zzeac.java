package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.ml1;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeac extends zzeaf {
    private zzbuk zzh;

    public zzeac(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (!this.zzc) {
            this.zzc = true;
            try {
                try {
                    this.zzd.zzp().zzf(this.zzh, new zzeae(this));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdsServiceSignalClientTask.onConnected");
                    this.zza.zzd(th);
                }
            } catch (RemoteException unused) {
                this.zza.zzd(new zzdyo(1));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaf, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzcat.zze(format);
        this.zza.zzd(new zzdyo(1, format));
    }

    public final synchronized ml1 zza(zzbuk zzbukVar, long j) {
        if (this.zzb) {
            return zzfzt.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbukVar;
        zzb();
        ml1 zzo = zzfzt.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // java.lang.Runnable
            public final void run() {
                zzeac.this.zzc();
            }
        }, zzcbg.zzf);
        return zzo;
    }
}
