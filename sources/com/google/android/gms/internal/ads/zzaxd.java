package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzaxd {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzawz(this);
    private final Object zzc = new Object();
    private zzaxg zzd;
    private Context zze;
    private zzaxj zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzaxd zzaxdVar) {
        synchronized (zzaxdVar.zzc) {
            zzaxg zzaxgVar = zzaxdVar.zzd;
            if (zzaxgVar == null) {
                return;
            }
            if (zzaxgVar.isConnected() || zzaxdVar.zzd.isConnecting()) {
                zzaxdVar.zzd.disconnect();
            }
            zzaxdVar.zzd = null;
            zzaxdVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzaxg zzd = zzd(new zzaxb(this), new zzaxc(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzaxh zzaxhVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzaxhVar);
                } catch (RemoteException e) {
                    zzcat.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzaxe zzb(zzaxh zzaxhVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzaxe();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzaxhVar);
                }
                return this.zzf.zzf(zzaxhVar);
            } catch (RemoteException e) {
                zzcat.zzh("Unable to call into cache service.", e);
                return new zzaxe();
            }
        }
    }

    public final synchronized zzaxg zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzaxg(this.zze, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeb)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzea)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzaxa(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzec)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcbg.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzed)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
