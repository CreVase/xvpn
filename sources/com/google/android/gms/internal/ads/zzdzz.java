package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdzz extends zzeaf {
    private zzbuo zzh;

    public zzdzz(Context context, ScheduledExecutorService scheduledExecutorService) {
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
                    this.zzd.zzp().zze(this.zzh, new zzeae(this));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdsServiceProxyClientTask.onConnected");
                    this.zza.zzd(th);
                }
            } catch (RemoteException unused) {
                this.zza.zzd(new zzdyo(1));
            }
        }
    }

    public final synchronized ml1 zza(zzbuo zzbuoVar, long j) {
        if (this.zzb) {
            return zzfzt.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbuoVar;
        zzb();
        ml1 zzo = zzfzt.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzy
            @Override // java.lang.Runnable
            public final void run() {
                zzdzz.this.zzc();
            }
        }, zzcbg.zzf);
        return zzo;
    }
}
