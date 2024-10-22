package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfmz implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfnx zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfmq zzf;
    private final long zzg;
    private final int zzh;

    public zzfmz(Context context, int i, int i2, String str, String str2, String str3, zzfmq zzfmqVar) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfmqVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfnx zzfnxVar = new zzfnx(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfnxVar;
        this.zzd = new LinkedBlockingQueue();
        zzfnxVar.checkAvailabilityAndConnect();
    }

    public static zzfoj zza() {
        return new zzfoj(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfoc zzd = zzd();
        if (zzd != null) {
            try {
                zzfoj zzf = zzd.zzf(new zzfoh(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfoj zzb(int i) {
        zzfoj zzfojVar;
        try {
            zzfojVar = (zzfoj) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(2009, this.zzg, e);
            zzfojVar = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, null);
        if (zzfojVar != null) {
            if (zzfojVar.zzc == 7) {
                zzfmq.zzg(3);
            } else {
                zzfmq.zzg(2);
            }
        }
        if (zzfojVar == null) {
            return zza();
        }
        return zzfojVar;
    }

    public final void zzc() {
        zzfnx zzfnxVar = this.zza;
        if (zzfnxVar != null) {
            if (zzfnxVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfoc zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
