package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzaya {
    final /* synthetic */ zzayb zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzaya(zzayb zzaybVar, byte[] bArr, zzaxz zzaxzVar) {
        this.zza = zzaybVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzayb zzaybVar = this.zza;
            if (zzaybVar.zzb) {
                zzaybVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzcat.zzf("Clearcut log failed", e);
        }
    }

    public final zzaya zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxy
            @Override // java.lang.Runnable
            public final void run() {
                zzaya.this.zzd();
            }
        });
    }
}
