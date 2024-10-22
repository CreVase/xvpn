package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzky implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzkp zzc;

    public zzky(zzkp zzkpVar, AtomicReference atomicReference, zzo zzoVar) {
        this.zzc = zzkpVar;
        this.zza = atomicReference;
        this.zzb = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        synchronized (this.zza) {
            try {
                try {
                } finally {
                    this.zza.notify();
                }
            } catch (RemoteException e) {
                this.zzc.zzj().zzg().zza("Failed to get app instance id", e);
            }
            if (this.zzc.zzk().zzm().zzh()) {
                zzfkVar = this.zzc.zzb;
                if (zzfkVar == null) {
                    this.zzc.zzj().zzg().zza("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzfkVar.zzb(this.zzb));
                String str = (String) this.zza.get();
                if (str != null) {
                    this.zzc.zzm().zza(str);
                    this.zzc.zzk().zze.zza(str);
                }
                this.zzc.zzal();
                this.zza.notify();
                return;
            }
            this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
            this.zzc.zzm().zza((String) null);
            this.zzc.zzk().zze.zza(null);
            this.zza.set(null);
        }
    }
}
