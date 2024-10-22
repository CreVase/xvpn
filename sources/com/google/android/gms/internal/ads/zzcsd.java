package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzcsd extends zzcqv {
    private final zzbhf zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcsd(zzcsw zzcswVar, zzbhf zzbhfVar, Runnable runnable, Executor executor) {
        super(zzcswVar);
        this.zzc = zzbhfVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzfcs zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzfcs zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcsx
    public final void zzj() {
        final zzcsb zzcsbVar = new zzcsb(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsc
            @Override // java.lang.Runnable
            public final void run() {
                zzcsd.this.zzk(zzcsbVar);
            }
        });
    }

    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (!this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                zzi(((zzcsb) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzi(((zzcsb) runnable).zza);
        }
    }
}
