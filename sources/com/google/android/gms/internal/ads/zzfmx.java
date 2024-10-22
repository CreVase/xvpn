package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfmx implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfnx zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfmx(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfnx zzfnxVar = new zzfnx(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfnxVar;
        this.zzd = new LinkedBlockingQueue();
        zzfnxVar.checkAvailabilityAndConnect();
    }

    public static zzapj zza() {
        zzaom zza = zzapj.zza();
        zza.zzD(32768L);
        return (zzapj) zza.zzal();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfoc zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfny(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    zzc();
                    this.zze.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzd.put(zza());
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzapj zzb(int i) {
        zzapj zzapjVar;
        try {
            zzapjVar = (zzapj) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzapjVar = null;
        }
        if (zzapjVar == null) {
            return zza();
        }
        return zzapjVar;
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
